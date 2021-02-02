package OCP;

import java.util.List;
import java.util.stream.Stream;

public class ArticleFilter implements Filter<Article> {


  @Override
  public Stream<Article> filter(List<Article> items, Specification<Article> spec) {
    return items.stream().filter(i -> spec.isSatisfied(i));
  }
}
