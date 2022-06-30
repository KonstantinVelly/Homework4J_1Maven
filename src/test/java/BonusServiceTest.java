import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource (resources ="/data.csv")
   // @CsvSource({
    // "50, 5000, false",
    //     "150, 5000, true"
    //})

    public void shouldCalculateForAllCases(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();
        //long amount;
        //boolean registered;
        //long expected = 10;

        //@CsvFileSource(resources = "/data.csv")

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

