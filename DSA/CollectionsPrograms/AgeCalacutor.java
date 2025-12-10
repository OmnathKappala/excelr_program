 
import java.time.LocalDate;
import java.time.Period;

public class AgeCalacutor {
    public static void main(String[] args) {


        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2003, 7, 30);
        System.out.println("Birth Day: " + birthDate.getDayOfWeek());

        Period period = Period.between(birthDate, currentDate);
        System.out.println(" Days: " + period.getDays());
        System.out.println(" Months: " + period.getMonths());
        System.out.println("Years: " + period.getYears());
    }
}
