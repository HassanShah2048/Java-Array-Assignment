import java.util.Scanner;

public class Q2 {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    Q2 (){

    }
    Q2(int num){
        this.num=num;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        setNum(scanner.nextInt());
    }
    public static void CheckSum(int [] list){
        int sum=0;
        for (int i = 0; i < list.length; i++) {
            sum=sum+list[i];
        }
        System.out.println("the sum of numbers is : "+sum);
    }


}
