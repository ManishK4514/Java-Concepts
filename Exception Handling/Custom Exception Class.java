import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125";
    }
    @Override
    public String getMessage(){
        return "Make sure to input correct age";
    }
}

public class Custom_Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        try{
            if(a > 125){
                // throw new MyException();
                throw new ArithmeticException("throw an exception");
            }else{
                System.out.println("Your age is: " + a);
            }
        }
        catch(Exception e){
            System.out.println(e); // This will print the toString() by default
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace(); // this line shows the expception occur in which line
        }
    }
}
