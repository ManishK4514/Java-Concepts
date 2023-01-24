class Thread1 extends Thread{
    Thread1(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Welcome to the run method of therea!");
    }           
}

public class Thread_Constructors {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Manish");
        Thread1 t2 = new Thread1("Ritik");
        t1.start();
        System.out.println("The id of the thread t1 is: " + t1.getId());
        System.out.println("The name of the thread t1 is: " + t1.getName());
        t2.start();
        System.out.println("The id of the thread t2 is: " + t2.getId());
        System.out.println("The name of the thread t2 is: " + t2.getName());
    }
}
