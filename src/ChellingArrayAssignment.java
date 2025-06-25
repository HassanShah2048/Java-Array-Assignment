import java.util.Scanner;
public class ChellingArrayAssignment {
    int num;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    ChellingArrayAssignment(){
    }
    public ChellingArrayAssignment(int num) {
        this.num = num;
    }
    public void checkInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number :  ");
        setNum(scanner.nextInt());
    }

    public static void printEvenOddNumbers(int [] list){
        int evenCount=0;
        int oddCount=0;
        for (int i = 0; i < list.length; i++) {
            if (list [i] %2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }

        }
        System.out.println("total even numbers are : "+evenCount);
        System.out.println("total odd number are : "+oddCount);
    }
    public static void printPrimeNumber(int [] list){
        int prime=0;
        int primeCount=0;
        int nonPrime=0;
        for (int i = 0; i <list.length; i++) {
            for (int j = 1; j <=list[i]/2 ; j++) {
                if (list[i]%j == 0){
                primeCount++;
                }
            }
            if (primeCount==1){
                prime++;
            }else {
                nonPrime++;
            }
            primeCount=0;
        }
        System.out.println("the total prime numbers are : "+prime);
    }
    public static void findMaxAndSecondMax(int [] list){
        double maxNum =0;
        double secondMax=0;
//        int maxNum;
//        int secondMax;
//        if (list[0]>list[1]){
//            maxNum=list[0];
//            secondMax=list[1];
//        } else{
//            maxNum=list[1];
//            secondMax=list[0];
//        }
        for (int i = 0; i < list.length; i++) {
            if (list[i]>maxNum){
                secondMax=maxNum;
                maxNum=list[i];
            } if (list[i]>secondMax && list[i]!=maxNum ){
                secondMax=list[i];
            }
        }
        System.out.println("the maximum number is : "+maxNum);
        System.out.println("the second max number is : "+secondMax);
    }
}
