package DIP;

import java.util.List;

public class PostalCodeSearch {
  public static List<People> search(Long PostalCode, PostalCodeBrowser browser) {
    return browser.findAllResidents(PostalCode);
  }
}
