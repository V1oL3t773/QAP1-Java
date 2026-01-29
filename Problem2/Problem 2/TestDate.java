import java.util.Date;

public class TestDate {
   public static void main(String[] args) {
      //date object
        Date d1 = new Date(29, 1, 2026);

      //printed
      System.out.println("The date is: " + d1.toString());

      //test
      d1.setMonth(12);
      System.out.println("Updated date: " + d1);
   }
}