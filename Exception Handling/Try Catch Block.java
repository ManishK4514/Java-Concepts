Q. What will be the output of the Program.

public class Try_Catch {
    public static void main(String[] args) {
        try{
            // No matter how many exception are there it will only execute the first exception and will exit from try catch.
            int[] c = {1};
            System.out.println(c.length);
            c[1] = 142;
            System.out.println("c + " + c[1]);
            int a = args.length;
            System.out.println("a + " + a);
            int b = 8 / a;
        }
        catch(ArithmeticException e){
            System.out.println("Devide by 0: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks");
    }
}

Output:
1
Array index oob: java.lang.ArrayIndexOutOfBoundsException: Index 1 out of 
bounds for length 1
After try/catch blocks
