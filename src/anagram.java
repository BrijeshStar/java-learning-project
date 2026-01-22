public class anagram {

    public boolean ana_gram(String str , String str1) {

        if (str.length() != str1.length()) {
            return false;
        }
        int s = 0;
        int m = 0;

        for (int i = 0; i < str.length(); i++) {
            s += str.charAt(i);
            m += str1.charAt(i);
        }
        return s == m;
    }

         static void main() {
        anagram st = new anagram();
        System.out.println(st.ana_gram("sicent" , "listen"));

    }
}
