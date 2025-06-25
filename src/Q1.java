import java.util.Scanner;

public class Q1 {
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of an  array : ");
        int a = scanner.nextInt();
        int c[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter a number on  [" + i + "]  ");
            c[i] = scanner.nextInt();

        }
        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < a-1-i; j++) {
                if (c[j]>c[j+1]){
                    int big=c[j];
                    c[j]=c[j+1];
                    c[j+1]=big;
                }
            }
        }
        System.out.println("sorted Array : ");
        for (int i = 0; i < a; i++) {
            System.out.print(c[i] + " ");
//
        }
        System.out.println();
    }

//    NOW WE CREATE A FUNCTION FOR STRING SORTING
      public void stringSorting(){
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a length of string Array : ");
          int a=scanner.nextInt();
          String list[]=new String[a];
          for (int i = 0; i < a; i++) {
              System.out.print("Enter a number on index ["+i+"]  ");
              list[i]=scanner.next();
          }
          for (int i = 0; i < a-1; i++) {
              for (int j = 0; j < a-1-i; j++) {
                  if (list[j].compareToIgnoreCase(list[j+1])>0){
                      String nw=list[j];
                      list[j]=list[j+1];
                      list[j+1]=nw;
                  }
              }
          }
          System.out.println(" the sorted string array is : ");
          for (int i = 0; i < a; i++) {
              System.out.print(list[i]+ " ");
          }

      }
}