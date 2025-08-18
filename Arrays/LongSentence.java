
public class LongSentence {

    public static void main(String[] args) {
        String sen = "Java is the Ugly language";
        String ans = search(sen);
        System.out.println(ans);
    }

    static String search(String sentence) {
        String[] words = sentence.split(" ");

        String longest = words[0];

        for(int i = 0; i<words.length; i++) {
            if(words[i].length()>longest.length()) {
                longest = words[i];
            }
        }
        return "The longest Word is: "+longest;
    }

}
