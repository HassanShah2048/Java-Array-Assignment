import java.util.Scanner;

public class Q4 {
    //private int num;
//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//    Q4 (){
//
//    }
//    Q4(int num){
//        this.num=num;
//    }
//    private void input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        setNum(scanner.nextInt());
//    }
    public static void containValue(int[] list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = (scanner.nextInt());
        boolean certainValue = false;

        for (int i = 0; i < list.length; i++) {
            if (n == list[i]) {
                certainValue = true;
            }
        }
        if (certainValue) {
            System.out.println("this value is in list");
        } else{
            System.out.println("this value is not in this list");
        }
    }
}