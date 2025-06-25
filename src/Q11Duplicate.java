import java.util.Scanner;

public class Q11Duplicate {
    public void checkDuplicate(){
        int [] arr=new int[8];
        arr[0]=43;
        arr[1]=76;
        arr[2]=65;
        arr[3]=43;
        arr[4]=88;
        arr[5]=76;
        arr[6]=32;
        arr[7]=32;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]==arr[i]){
                    System.out.println("the duplicate number is : "+arr[j]);
                    break;
                }
            }
        }

    }
}
