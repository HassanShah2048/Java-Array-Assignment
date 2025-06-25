import java.util.Scanner;
public class Q6 {
    public static void removeSpecificElement(int[] list){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to remove  :  ");
        int n= scanner.nextInt();
        int count=0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]!=n){
                count++;
            }
        }
        System.out.println();
        int index=0;
        int list2[]=new int[count];
        for (int i = 0; i < list.length; i++) {
            if (list[i]!=n){
                list2[index++]=list[i];
            }
        }
        System.out.println("print array after removing  "+n);
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2+" ");
        }
        System.out.println();
    }
}
