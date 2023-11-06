package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//TODO  Write a code for digital live clock!
public class _01_DigitalLiveClock {
    public static void main(String[] args) {
        DateTimeFormatter fdate=DateTimeFormatter.ofPattern("MM:dd:yy");
        DateTimeFormatter fTime=DateTimeFormatter.ofPattern("kk:mm:ss");
        LocalDate date=LocalDate.now();
        System.out.println("date= "+ date);

        while (true){
            LocalTime time=LocalTime.now();
            System.out.println(time.format(fTime));
            try {
                Thread.sleep(1000L);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

