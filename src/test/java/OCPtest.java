import OCP.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class OCPtest {
  public static Jornal extra;

  @BeforeEach
  public void setup() {
    List<Article> articlesList = new ArrayList<>();

    Article article1 = new Article(Stream.of("test"), new Date(2000));
    articlesList.add(article1);
    Article article2 = new Article(Stream.of("test"), new Date(2000));
    articlesList.add(article2);
    Article article3 = new Article(Stream.of("test"), new Date());
    articlesList.add(article3);

    extra = new Jornal(articlesList);
  }

  @AfterEach
  public void tearDown() {
    extra = null;
  }

  @Test
  public void testTagFilter() {
    Specification spec = new TagSpecification("test");
    ArticleFilter af = new ArticleFilter();

    Stream<Article> filteredArticles = af.filter(extra.getArticles(), spec);
    Assertions.assertEquals(filteredArticles.count(),3);
  }
  @Test
  public void testDateFilter() {
    Specification spec = new DateSpecification(new Date(2000));
    ArticleFilter af = new ArticleFilter();

    Stream<Article> filteredArticles = af.filter(extra.getArticles(), spec);
    Assertions.assertEquals(filteredArticles.count(),2);
  }
}
