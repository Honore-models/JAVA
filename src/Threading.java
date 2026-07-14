import java.util.Scanner;

public class Threading {

    public static void main(String[] args) {

//        A thread is a separate unit of flow of execution of a program.
//        ⚠️ Threads can be controlled by Operating system
//        Threading is allowing a program to run multiple tasks simultaneously

//        Normally when you run a program in Java , there is only one single thread i.e. One flow of execution of the program
//        from top to bottom of the program.

//        💡There are two ways of creating a thread:
//        1. Extending Thread class and Override run() method
//        2. Implementing Runnable Interface and Override run() method and they you pass instance of runnable to Thread class

//        You can extend the Thread class and create your own separate thread that will execute your separate codes you want
//        to be executed in one program

//        System.out.println("Execution Starts here");
//
//        try{
//            # Stop execution for 3 seconds
//            Thread.sleep(3000);
//        }catch(InterruptedException e){
//            System.out.println("Interrupted");
//        }
//
//        System.out.println("Execution Ends here");

//        ➡️ In this example we want to create a separate execution of the program (Thread) for timer

        Scanner scanner = new Scanner(System.in);

        MyRunnable runnable = new MyRunnable();
        Thread myThread = new Thread(runnable);
        myThread.start();

        System.out.println("You have 5 seconds to enter your name: ");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {

        for(int i=1; i<=5; i++){

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Something went wrong");
            }

            if(i==5){
                System.out.println("Time's UP!");
            }
        }
    }
}
