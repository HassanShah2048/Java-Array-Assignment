public class Q17 {
    public static void secondSmallestNo(int [] list){
        int smallestNum=list[0];
        int secondSmallestNum=list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]<smallestNum){
                smallestNum=list[i];
//                secondSmallestNum=smallestNum;
            } if (list[i]<secondSmallestNum  &&  list[i]!=smallestNum) {
                secondSmallestNum=list[i];
            }
        }
        System.out.println("the second smallest number is  :  "+secondSmallestNum);
    }
}