import java.util.TimerTask;
import java.util.Timer;


public class TimeOut {

    public static void main(String[] args) {

//        Timer: This is a Java class that is used to create schedules for running a task after a certain delay or
//        periodically
//
//        TimerTask: This is the actual task that should be executed
//        ⚠️ TimerTask is an abstract class and has an abstract method called run() that must be Overridden


        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = 5;
            @Override
            public void run() {
                System.out.println("The task has been executed");
                count--;

                if(count == 0){
                    System.out.println("THE TASK ENDED !");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 2000, 1000);
    }
}
