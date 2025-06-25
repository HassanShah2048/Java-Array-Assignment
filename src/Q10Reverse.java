import java.util.Scanner;

public class Q10Reverse {
    public void checkReverse(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int s=scanner.nextInt();
        int [] arr= new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("give the value on index  ["+i+"]  ");
            arr[i]=scanner.nextInt();

        }
        int firstNum=0;
        int endNum= arr.length-1;
        while (firstNum<endNum){
            int fm=arr[firstNum];
            arr[firstNum]=arr[endNum];
            arr[endNum]=fm;
            firstNum++;
            endNum--;
        }
        System.out.println("the reverse array is ....");
        for (int i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
    }
}
