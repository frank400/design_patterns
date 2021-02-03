import ISP.Document;
import ISP.MultiFunctionalityPrinter;
import ISP.PhotoCopier;
import ISP.SimplePrinter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ICPTest {
  public Document document = new Document();
  @BeforeEach
  public void setup(){
    document.setText("Test");
  }
  @AfterEach
  public void tearDown(){
    document = null;
  }
  @Test
  public void testSimplePrinter(){
    SimplePrinter printer = new SimplePrinter();
    assertEquals(document.getText(),printer.print(document));
  }
  @Test
  public void testPhotoCopier(){
    PhotoCopier printer = new PhotoCopier();
    assertEquals(document.getText(),printer.print(document));
    printer.scan(document,"Test1");
    assertEquals(document.getText(),printer.print(document));
  }
  @Test
  public void testMultiFunctionalityPrinter(){
    MultiFunctionalityPrinter printer = new MultiFunctionalityPrinter();
    assertEquals(document.getText(),printer.print(document));
    printer.scan(document,"Test1");
    assertEquals(document.getText(),printer.print(document));
    printer.send(document);
    assertNull(document.getText());
  }
}
