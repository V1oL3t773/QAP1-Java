public class Date {
    //instance variables
    private int day;
    private int month;
    private int year;

    //constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //getters
   public int getDay() { return day; }
   public int getMonth() { return month; }
   public int getYear() { return year; }

   //setters
   public void setDay(int day) { this.day = day; }
   public void setMonth(int month) { this.month = month; }
   public void setYear(int year) { this.year = year; }

   //setting everything
   public void setDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   //format the output
   public String toString() {
      return String.format("%02d/%02d/%4d", day, month, year);
   }
}