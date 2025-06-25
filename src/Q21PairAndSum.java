public class Q21PairAndSum {
    public void checkSpacificNumSum(){
        int []p={1, 4, 6, 3, 5, 2};
        int num=7;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i]+p[j]==num){
                    System.out.println("{"+p[i]+"  "+p[j]+"}");
                }
            }
        }
        System.out.println();
    }
}
