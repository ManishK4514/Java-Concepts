class Thread1 extends Thread{
    Thread1(String name){
        super(name);
    }
    @Override
    public void run(){
        while(true){
            System.out.println("I am:  " + Thread.currentThread().getName());
        }
    }
}


public class Thread_Priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        Thread1 t1  = new Thread1("Thread1");
        Thread1 t2  = new Thread1("Thread2");
        Thread1 t3  = new Thread1("Thread3");
        Thread1 t4  = new Thread1("Thread4");
        Thread1 t5  = new Thread1("Thread5 (Most Important)");

        // Thread priorites represent the value from 1 to 10
        // MAX_PRIORITY :- 10
        // NORM_PRIORITY :- 5
        // MIN-PRIORITY :- 1
        
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
