package SolvedProblems.Recursion;

public class SkipAChar {

    // Skipping a char using StringBuilder
    static StringBuilder sb = new StringBuilder();
    static void skipAChar(String str, char character, int i){
        if(i == str.length()){
            return;
        }


        if(str.charAt(i) != character){
            sb.append(str.charAt(i));
        }

        skipAChar(str, character, i + 1);
    }

    // Skipping a char by taking substrings
    static void skipAChar(String str, String result){
        if(str.isEmpty()){
            System.out.println(result);
            return;
        }

        if(str.charAt(0) == 'a'){
            skipAChar(str.substring(1), result);
        } else {
            skipAChar(str.substring(1), result + str.charAt(0));
        }
    }

    // Skipping a word from a string
    static void skipAWord(String str, String word, String result){
        if(str.isEmpty()){
            System.out.println(result);
            return;
        }

        if(str.startsWith(word)){
            skipAWord(str.substring(word.length() - 1), word, result);
        } else{
            skipAWord(str.substring(1), word, result + str.charAt(0));
        }
    }

    // Skipping 'word' if it there is no 'condition'
    static void skipWordIfNot(String str, String word, String condition, String result){
        if(str.isEmpty()){
            System.out.println(result);
            return;
        }

        if(str.startsWith(word) && !str.startsWith(condition)){
            skipWordIfNot(str.substring(word.length()), word, condition, result);
        } else {
            skipWordIfNot(str.substring(1), word, condition, result + str.charAt(0));
        }
    }

    public static void main(String[] args) {
        String str = "abcapplecaba";
        char character = 'a';
        // output = bcpplecb and remove 'a'

        skipAChar(str, character, 0);
        System.out.println(sb.toString());

        skipAChar(str, "");

        String word = "apple";
        skipAWord(str, word, "");

        // Skip app if there is no apple
        // Expected result : 34 bdfh appledvd
        str = "app34 bdfh appledvd";
        word = "app";
        String condition = "apple";
        skipWordIfNot(str, word, condition, "");
    }
}
