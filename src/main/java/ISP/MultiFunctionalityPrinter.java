package ISP;

public class MultiFunctionalityPrinter implements Printer, Scanner, Faxer {
  @Override
  public void send(Document document) {
    document.setText(null);
  }

  @Override
  public String print(Document document) {
    return document.getText();
  }

  @Override
  public void scan(Document document,String text) {
    document.setText(text);
  }
}
