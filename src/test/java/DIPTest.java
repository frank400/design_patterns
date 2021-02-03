import DIP.People;
import DIP.PostalCodeSearch;
import DIP.PostalCodeToPeoples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DIPTest {
  public List<People> peoples = new ArrayList<>();
  public PostalCodeToPeoples postalCodeToPeoples;

  @BeforeEach
  public void setup() {
    People people1 = new People("joao", 28640000L);
    People people2 = new People("joao1", 28640000L);
    People people3 = new People("joao2", 28640000L);

    peoples.add(people1);
    peoples.add(people2);
    peoples.add(people3);

    postalCodeToPeoples = new PostalCodeToPeoples(peoples);
  }

  @Test
  public void testSearchPeoples(){
    assertEquals(3,PostalCodeSearch.search(28640000L,postalCodeToPeoples).size());
  }
}
