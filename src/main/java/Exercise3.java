import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
        String regex = "(https://|http://)[(a-z)._-]*[^\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        String regex = "[\\w.-_\\d]+@[\\w.-_]+.[com|org|ir][^\\s]+";
//        String regex = "[\\w.-_\\d]+@[\\w.-_].[com|org|ir]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        String regex = "\\w*(\\w)\\w*\\1+\\w*";
        // the \1 refers to the letter which is in \\w

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            wordsWithRepeatLetters.add(matcher.group());
        }

        return wordsWithRepeatLetters;


    }
    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

        public static List<String> findReapetdWords (String input){
            List<String> repeatedWords = new ArrayList<>();

            return repeatedWords;

        }

        public static void main (String[]args){
            // test your code here!

            }
        }

