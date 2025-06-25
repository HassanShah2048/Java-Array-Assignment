public class Q12DuplicateString {
    public void checkString(){
        String []arr={"apple","mango","black","green","yellow","black","white","yellow","apple"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])){
                    System.out.println("the duplicate string is : "+arr[i]);
                    break;
                }
            }

        }
    }
}
