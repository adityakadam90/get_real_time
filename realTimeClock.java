import java.text.SimpleDateFormat;
import java.util.Date;

public class realTimeClock {

    public static void main(String[] args) {
        while (true) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            String currentTime = dateFormat.format(new Date());

            // Print the current time
            System.out.println("Current Time: " + currentTime);

            // Wait for one second before updating the time
            try {
                System.out.println("Hiiiii");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("hiiiii");
                e.printStackTrace();
            }
            // for(int i=0;i<22;i++){
            //         System.out.println(i);
            // }

            // Clear the console
            clearConsole();
        }
    }
    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
