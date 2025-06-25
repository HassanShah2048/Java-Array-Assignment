public class Q13TwoArray {
    public void checkCommonElements(){
        String [] common={"apple","mango","black","green","yellow","black","white","yellow","apple"};
        for (int i = 0; i < common.length; i++) {
//            System.out.println("the array of first String is : "+common[i]);
        }
        String [ ]s={"bat","bag","boll","mango","laptop","green","shoes"};
        for (int i = 0; i < s.length; i++) {
//            System.out.println("the array of second String is : "+s[i]);

        }
        for (int i = 0; i < common.length; i++) {
            for (int j = 0; j <s.length ; j++) {
                if (s[j].equalsIgnoreCase(common[i])){
                    System.out.println("the common String in these two arrays is : "+s[j]);
                    break;
                }
            }


        }

    }
}
