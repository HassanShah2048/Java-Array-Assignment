import java.util.Scanner;

public class Q4CertainValue {
    public void checkValue(){
        int list[]=new int[5];
        list [0]=4;
        list [1]=7;
        list [2]=3;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check certain value : ");
        int n=scanner.nextInt();
            if (n==4 || n==7 || n==3){
                System.out.println("This number is in list ");

            }else {
                System.out.println("This number is not in this list ");


        }
    }

//    public void input(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter a number you want to check in list : ");
//        int s=scanner.nextInt();
//        System.out.println("enter a size of index : ");
//        int n=scanner.nextInt();
//        int d[]=new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter a value of index ["+i+"]  ");
//            d[i]=scanner.nextInt();
//
//        }
//        for (int i = 0; i <  n; i++) {
//            if (n==d[i]){
//                System.out.println("the number is in list  ");
//                break;
//            }else {
//                System.out.println("the number is not in list  ");
//                break;
//            }
//        }
//
//    }
}
