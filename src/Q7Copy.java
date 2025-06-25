import java.util.Scanner;

public class Q7Copy {
    public void makeCopy(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int a=scanner.nextInt();
        int b[]=new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter a array size on ["+i+"]  :");
            b[i]=scanner.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.println("["+i+"]  =  "+b[i]);
        }
//        copy of Array
        int []copy=new int[a];
        for (int i = 0; i < a; i++) {
            copy[i]=b[i];
        }
        System.out.println("copy ....");
        for (int i = 0; i < a; i++) {
            System.out.println("["+i+"]  =  "+copy[i]+"");
        }


    }
}
