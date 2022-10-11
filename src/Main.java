public class Main {
    public static void main(String[] args) {
        Stop_watch stop_watch01 = new Stop_watch();
        stop_watch01.setStartTime();
        for (int i = 1; i < 1000000; i++) {
            System.out.print("");
        }
        stop_watch01.setEndTime();
        System.out.println("Elapsed time is: ");
        System.out.println(stop_watch01.getElapsedTime());


    }
}