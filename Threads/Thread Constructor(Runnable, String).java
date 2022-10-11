class Thread1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Watching Avenger Endgame Movie");
    }
}

public class Runnable_String_Thread_Constructor {
    public static void main(String[] args) {
        Thread1 bullet1 = new Thread1();
        Thread gun1 = new Thread(bullet1, "Manish");
        gun1.start();
        System.out.println("The id of the thread gun1 is: " + gun1.getId());
        System.out.println("The name of the thread gun1 is: " + gun1.getName());
    }
}
