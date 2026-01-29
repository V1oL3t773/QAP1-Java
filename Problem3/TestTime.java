public class TestTime {
    public static void main(String[] args) {
        //created two time objects
        Time t1 = new Time(0, 0, 0); //initialized to midnight
        Time t2 = new Time(0, 0, 0);

        //set times
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        t2.setTime(10, 20, 25);

        //display time before change
        System.out.println("Original t1: " + t1.toString());
        System.out.println("Original t2: " + t2.toString());

        //calling nextSecond() and previousSecond()
        t1.nextSecond();
        t2.previousSecond();

        //displaying final times
        System.out.println("After modification:");
        System.out.println("t1 (next second): " + t1.toString());
        System.out.println("t2 (prev second): " + t2.toString());
    }
}