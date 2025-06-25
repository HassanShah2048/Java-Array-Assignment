import java.util.Scanner;

public class Q3 {
    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    Q3(){

    }

    public Q3(int number) {
        this.number = number;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        setNumber(scanner.nextInt());
    }
    public static void calculateAverage(int [ ] list){
        int sum=0;
        int average=1;
        for (int i = 0; i <list.length ; i++) {
            sum=sum+list[i];
            average=sum/ list.length;

        }
        System.out.println("Average is : "+average);
    }

}
