public class Q16 {
    public static void secondLargestNumber(int [] list){
        int largestNum=list[0];
        int secondLargestNum=list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]>largestNum){
                largestNum=list[i];
//                secondLargestNum=largestNum;
            }if (list[i]>secondLargestNum && list[i]!=largestNum){
                secondLargestNum=list[i];
            }
        }
        System.out.println("the second largest number in this list is : "+secondLargestNum);
    }
}
