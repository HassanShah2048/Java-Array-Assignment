public class Q9 {
    public static void maxAndMinNum(int [] list){
        int max=list[0];
        int min=list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]>max){
                max=list[i];
            }if (list[i]<min){
                min=list[i];
            }
        }
        System.out.println("the maximum number in this array is  : "+max);
        System.out.println("the minimum number in this array is  : "+min);
    }
}
