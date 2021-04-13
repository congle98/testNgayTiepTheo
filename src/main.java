import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        LocalDate date = LocalDate.now();
        System.out.println(nextDayCalculator.nextDay(date));
    }
}
