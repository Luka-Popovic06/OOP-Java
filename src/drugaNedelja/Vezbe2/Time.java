package drugaNedelja.Vezbe2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalTime time  = LocalTime.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        System.out.println(today);
        System.out.println(time);
        System.out.println(dayOfWeek);
    }
}
