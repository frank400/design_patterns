package OCP;

import java.util.List;

public class Jornal{
  List<Article> articles;

  public Jornal(List<Article> articles) {
    this.articles = articles;
  }
  public void addArticle(Article article){
    articles.add(article);
  }

  public List<Article> getArticles() {
    return articles;
  }
}
