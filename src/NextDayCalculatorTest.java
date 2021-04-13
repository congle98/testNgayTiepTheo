import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void nextDay() {
        LocalDate test = LocalDate.now().plusDays(1);
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        LocalDate result = nextDayCalculator.nextDay(LocalDate.now());
        assertEquals(test,result);
    }
}