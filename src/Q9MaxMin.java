public class Q9MaxMin {
    public void checkMaxMin(){
        int []list=new int[6];
        list[0]=33;
        list[1]=31;
        list[2]=43;
        list[3]=65;
        list[4]=98;
        list[5]=43;
        int maxNum=list[0];
        int minNum=list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]>maxNum){
                maxNum=list[i];
            }
            if (list[i]<minNum){
//                list[i]=minNum;
                minNum=list[i];
            }
        }
        System.out.println("the maximum number in this array is : "+maxNum);
        System.out.println("the minimum number in this array is : "+minNum);
    }
}
