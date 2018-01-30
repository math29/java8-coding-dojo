import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import static java.util.Arrays.asList;

public class LanguageUpgradeTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        LanguageUpgrade upgrade = new LanguageUpgrade();
        assertEquals(upgrade.toUpperCase(collection), expected);
    }
}
