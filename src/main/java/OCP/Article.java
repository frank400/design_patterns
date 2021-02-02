package OCP;

import java.util.Date;
import java.util.stream.Stream;

public class Article {
  private Stream<String> tags;
  private Date publicationDate;

  public Article(Stream<String> tags, Date publicationDate) {
    this.tags = tags;
    this.publicationDate = publicationDate;
  }

  public Stream<String> getTags() {
    return tags;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  @Override
  public String toString() {
    return "Article{" +
            "tags=" + tags +
            ", publicationDate=" + publicationDate +
            '}';
  }
}
