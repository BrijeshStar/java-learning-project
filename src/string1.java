public class string1 {

    public String concatenate(String str, String str1){
        return str + "-" + str1;
    }

    public static void main() {
        string1 str = new string1();
        System.out.println(str.concatenate("abc" , "xyz"));
    }
}
