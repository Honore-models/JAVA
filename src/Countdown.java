import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many seconds do you want to countdown?: ");

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int seconds = scanner.nextInt();

            @Override
            public void run(){

                System.out.printf("00:00:%02d\n", seconds);
                seconds--;

                if(seconds < 0){
                    System.out.println("** TIMEOUT **");
                    timer.cancel();
                }

            }
        };

        timer.schedule(task,0,1000);
    }
}
