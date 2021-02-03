package DIP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class People {
  private String name;
  private Long PostalCode;

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

public class PostalCodeToPeoples implements PostalCodeBrowser {
  private List<People> peoples = new ArrayList<>();
  private List<Long> postalCodes = new ArrayList<>();
  private Map<Long, List<People>> postalCodesToPeoplesMap = new HashMap<>();

  public PostalCodeToPeoples(List<People> peoples) {
    this.peoples = peoples;
    peoples.forEach(p -> postalCodes.add(p.getPostalCode()));
    postalCodes.forEach(postalCode ->
    {
      List<People> correspondentPeoples = new ArrayList<>();
      peoples.forEach(people -> {
        correspondentPeoples.add(people);
      });
      postalCodesToPeoplesMap.put(postalCode,correspondentPeoples);
    });
  }

  @Override
  public List<People> findAllResidents(Long postalCode) {
    return null;
  }
}
public interface PostalCodeBrowser {
  public List<People> findAllResidents(Long postalCode);
}
public class PostalCodeSearch{
  public static List<People> search(Long PostalCode){
    return null;
  }
}
