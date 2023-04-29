package dayFive;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static int calculateAge(String date){
        String[] splitDate = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(splitDate[2]), Integer.parseInt(splitDate[1])
                , Integer.parseInt(splitDate[0]));
        LocalDate todayDate = LocalDate.now();
        Period calculatedAge = Period.between(localDate, todayDate);
        return calculatedAge.getYears();
    }
    public static void main(String[] args) {
        System.out.println(calculateAge("29/05/2000"));
    }
}
