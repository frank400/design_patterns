package OCP;

public interface Specification<T> {
  boolean isSatisfied(Article item);
}
