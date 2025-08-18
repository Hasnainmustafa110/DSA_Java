
public class LinearSearchString {
    public static void main(String[] args) {

        String name = "Hasnain";
        String ans = linearSearch(name, 'n');
        System.out.println(ans);
    }

    static String linearSearch(String str,char target) {

        if(str.length() == 0) {
            return "Empty";
        }

        for(char ch : str.toCharArray()) {
            if(ch == target) {
                return "Target Found!!!";
            }
        }
        return "Not found";
    }
}
