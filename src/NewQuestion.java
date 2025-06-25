import java.util.Scanner;

public class NewQuestion {

    public void checkArray(){
        int n[] = new int[3];
        n[0]=10;
        n[1]=20;
        n[2]=30;
        for (int i = 0; i < 3; i++) {
            System.out.println("the erray of ["+i+"] is "+n[i]);
        }
    }

    public void checkInput(){
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
    }
}
