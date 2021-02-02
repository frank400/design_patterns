package OCP;

import java.util.Date;

public class DateSpecification implements Specification {
  private Date date;

  public DateSpecification(Date date) {
    this.date = date;
  }

  @Override
  public boolean isSatisfied(Article item) {
    return item.getPublicationDate().equals(date);
  }
}
