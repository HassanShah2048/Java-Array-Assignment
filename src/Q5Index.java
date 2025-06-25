import java.util.Scanner;

public class Q5Index {
    public void checkIndex(){
        int list[]=new int[5];
        list [0]=4;
        list [1]=7;
        list [2]=3;
        list [3]=33;
        list [4]=10;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check certain value : ");
        int n=scanner.nextInt();
        boolean found=false;
        for (int i = 0; i < list.length; i++) {

            {
                if (list[i]==n){
                    System.out.println("the index of "+n+" is "+i);
                    found = true;
                    break;
                }
                }

            }
        if (!found){
            System.out.println("not matched");

        }
    }
}
