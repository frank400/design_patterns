package DIP;

public class People {
  private String name;
  private Long PostalCode;

  public People(String name, Long postalCode) {
    this.name = name;
    PostalCode = postalCode;
  }

  public void setName(String name) {
    this.name = name;
  }


  public void setPostalCode(Long postalCode) {
    PostalCode = postalCode;
  }

  public String getName() {
    return name;
  }

  public Long getPostalCode() {
    return PostalCode;
  }
}
