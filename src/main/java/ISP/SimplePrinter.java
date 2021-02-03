package ISP;

public class SimplePrinter implements Printer{
  @Override
  public String print(Document document) {
    return document.getText();
  }
}
