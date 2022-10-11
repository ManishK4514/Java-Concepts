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

public class Thread_Methods {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        /*
           Join() method In Java :

           The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.
           If t is a Thread object whose thread is currently executing, then t.join() causes the current thread to pause execution until t's thread terminates.
           Join() method puts the current thread on wait until the thread on which it is called is dead.

           Sleep() Method :

           The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
           When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.
           Sleep() method returns void.
           sleep() method can be used for any thread, including the main() thread also.

        */
        t1.start();
        try{
            t1.join(); // if we use join method then thread will start it's execution and no another thread will start until it's finishes its executions.
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();

        t1.start();
        try{
            t1.sleep(2000);
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
