public class Q14 {
    public void checkCommonIntegers(){
        int [] n={21,3,5,65,3,245,345,54,};
        int [] m={34,334,43,3,5,54,54,45};
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (n[i]==m[j]){
                    System.out.println("the common integers in these two arrays are  :  "+m[j]);
                }
            }
        }
    }
}
