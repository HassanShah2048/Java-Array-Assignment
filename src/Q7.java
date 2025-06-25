import java.util.Scanner;

public class Q7 {
    public static void checkCopy(int [] list){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter a list of array ["+i+"] ");
            list[i]=scanner.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println("the value of list ["+i+"] is  "+list[i]);
        }
    }
}
