package ISP;

public class MultiFunctionalityPrinter implements Printer, Scanner, Faxer {
  @Override
  public void send(Document document) {

  }

  @Override
  public String print(Document document) {
    return null;
  }

  @Override
  public void scan(Document document) {

  }
}
