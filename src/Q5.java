import java.util.Scanner;
public class Q5 {
    private  int n;
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    Q5(){
    }
    Q5(int n){
        this.n=n;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list : ");
         setN(scanner.nextInt());
    }

    public  void findIndex(int []list){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        setN(scanner.nextInt());
        boolean check=false;

        for (int i = 0; i < list.length ; i++) {
            if (list[i]==n){
                System.out.println("the number "+n+" is found index at  "+i);
                check=true;
            }
        }
        if (!check){
            System.out.println("the number "+n+" is not found in this array ");
        }
    }
}
