package OCP;

import java.util.function.Predicate;

public class TagSpecification implements Specification {
  private String tag;

  public TagSpecification(String tag) {
    this.tag = tag;
  }

  @Override
  public boolean isSatisfied(Article item) {
    Predicate<String> tagPredicate = p -> p.equals(tag);
    return item.getTags().anyMatch(tagPredicate);
  }
}
