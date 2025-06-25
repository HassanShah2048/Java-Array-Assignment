public class Q16SecondLargest {
    public void checkSecondLargestNumber(){
        int [] j={12,34,54,56,78,89,96,54,34};
        int largestNumber =j[0];
        int secondLargestNumber=j[0];
        int smallestNumber=j[0];
        for (int i = 0; i < j.length; i++) {
            if (j[i]>largestNumber){
                secondLargestNumber=largestNumber;
                largestNumber=j[i];
            }if (j[i]<smallestNumber){
                smallestNumber=j[i];
            }if (j[i]>secondLargestNumber && j[i]!=largestNumber){
                secondLargestNumber=j[i];
            }
        }
        System.out.println("the second largest number in this array is :  "+secondLargestNumber);
        System.out.println("And the largest number in this array is    :  "+largestNumber);
        System.out.println("And the smallest number in this array is   :  "+smallestNumber);
    }
}
