// Implemented Thread by Extending the Thread Class.

class Thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 400){
            System.out.println("Watching Avenger Endgame Movie");
            System.out.println("It's very fun to Watch!");
            i++;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 400){
            System.out.println("Cooking Food for the lunch");
            System.out.println("I am Hungry!");
            i++;
        }
        
    }
}

public class Creating_Thread_by_Extending_Thread_Class {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
