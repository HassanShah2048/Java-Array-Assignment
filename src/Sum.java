import java.util.Scanner;

public class Sum {
    public void input()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a size of an  array : ");
        int a = scanner.nextInt();
        int c[]=new int[a];
        int sum=0;
        for (int i = 0; i < a; i++) {
            System.out.print("Enter a number on  ["+i+"]  ");
            c[i]=scanner.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.println("["+i+"] = "+c[i]);
        }
        for (int i = 0; i < a; i++) {
            sum=sum+c[i];
        }
        System.out.println("the sum of total array is  : "+sum);
    }
}
