package DIP;

import java.util.List;

public interface PostalCodeBrowser {
  public List<People> findAllResidents(Long postalCode);
}
