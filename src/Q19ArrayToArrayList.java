import java.util.ArrayList;
import java.util.Arrays;

public class Q19ArrayToArrayList {
    public void convertArrayToArrayList() {
        Integer[] k = {2, 23, 23, 323, 3};

        ArrayList<Integer> mainList = new ArrayList<Integer>(Arrays.asList(k));

        System.out.println("the array list is "+ mainList);
    }
}
