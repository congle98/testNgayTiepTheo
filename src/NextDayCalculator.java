import java.time.LocalDate;

public class NextDayCalculator {
    LocalDate nextDay(LocalDate date){
       return date.plusDays(1);
    }
}
