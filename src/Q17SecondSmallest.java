public class Q17SecondSmallest {
    public void checkSecondSmallestNumber(){
        int []u={1,4,45,56,34,3,65,34,543};
        int smallestNumber=u[0];
        int secondSmallestNumber = u[1];
        int largestNumber=u[0];

        for (int i = 0; i < u.length; i++) {

            if (u[i]>largestNumber){
                largestNumber=u[i];
            }if (u[i]<smallestNumber){
                secondSmallestNumber=smallestNumber;
                smallestNumber=u[i];
            }else if (u[i]<secondSmallestNumber && u[i]!=smallestNumber){
                secondSmallestNumber=u[i];
            }
        }
        System.out.println("the second smallest number in this array is :  "+secondSmallestNumber);
        System.out.println("And the largest number in this array is    :  "+largestNumber);
        System.out.println("And the smallest number in this array is   :  "+smallestNumber);
    }
}
