public class Q22Equality {
    public void checkEquality() {
        int[] ar1 = {1, 2, 3, 4, 5, 6};
        int[] ar2 = {1, 2, 3, 4, 5, 6};
        boolean isEqual=true;

        if (ar1.length!= ar2.length){
            isEqual=false;
        }
        for (int i = 0; i < ar1.length; i++) {
                if (ar1[i]!=ar2[i]) {
                    isEqual=false;
                    break;
                }
            }
        if (isEqual){
            System.out.println("these arrays are equal ");
        }else {
            System.out.println("these arrays are not equal ");
        }
        }
    }

