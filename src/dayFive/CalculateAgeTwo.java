package dayFive;

import java.time.LocalDate;

public class CalculateAgeTwo {
    public static int calculateAge(String date){
        LocalDate localDate = LocalDate.now();
        String[] splitDate = date.split("-");
        int birthdate = Integer.parseInt(splitDate[2]);
        int currentYear = localDate.getYear();
        return currentYear - birthdate;
    }
    public static void main(String[] args) {
        System.out.println(calculateAge("05-29-2010"));
    }
}
