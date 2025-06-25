public class Average {
    public void checkAverage(){
        int list[]=new int[5];
       list [0]=4;
       list [1]=7;
       list [2]=3;
       list [3]=66;
       list [4]=74;
       int sum=0;
       double average=0;
        for (int i = 0; i < list.length; i++) {
            sum=sum+list[i];
            average=sum/5;
        }
        System.out.println("the average of this array is : "+average);
    }
}
