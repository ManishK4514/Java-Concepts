// Implemented Thread by Implementing the Runnable interface.

class Thread1 implements Runnable{
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

class Thread2 implements Runnable{
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

public class Creating_Thread_by_Implementing_Runnable_Interface {
    public static void main(String[] args) {
        Thread1 bullet1 = new Thread1();
        Thread gun1 = new Thread(bullet1);
        Thread2 bullet2 = new Thread2();
        Thread gun2 = new Thread(bullet2);
        
        gun1.start();
        gun2.start();
    }
}
