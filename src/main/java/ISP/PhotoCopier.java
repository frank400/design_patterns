package ISP;

public class PhotoCopier implements Printer, Scanner {
  @Override
  public String print(Document document) {
    return document.getText();
  }

  @Override
  public void scan(Document document,String text) {
    document.setText(text);
  }
}
