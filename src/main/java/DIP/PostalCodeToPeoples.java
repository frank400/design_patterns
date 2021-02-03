package DIP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    return postalCodesToPeoplesMap.get(postalCode);
  }
}

