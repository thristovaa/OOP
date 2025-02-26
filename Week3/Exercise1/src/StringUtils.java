import java.util.Arrays;

public class StringUtils {
    public static String toCamelCase(String sentence){
        String[] sentenceArr = sentence.split(" ");
        String output = "";

        sentenceArr[0] = sentenceArr[0].toLowerCase();

        output += sentenceArr[0];

        for (int i = 1; i < sentenceArr.length; i++) {
            output += toUpperFirstLetter(sentenceArr[i]);
        }

        return output;
    }

    public static String toPascalCase(String sentence){
        String output = "";

        String[] sentenceArr = sentence.split(" ");

        for(String s : sentenceArr){
            output += toUpperFirstLetter(s);
        }

        return output;
    }

    public static String toSnakeCase(String sentence){
        String output = "";

        String[] sentenceArr = sentence.split(" ");

        for(String s : sentenceArr) {
            s = s.toLowerCase();
            output += s + "_";
        }

        return output.substring(0, output.length() - 1);
    }

    public static String toUpperSnakeCase(String sentence){
        String output = "";

        String[] sentenceArr = sentence.split(" ");

        for(String s : sentenceArr) {
            s = s.toUpperCase();
            output += s + "_";
        }

        return output.substring(0, output.length() - 1);
    }

    public static String toKebabCase(String sentence){
        String output = "";

        String[] sentenceArr = sentence.split(" ");

        for(String s : sentenceArr) {
            s = s.toLowerCase();
            output += s + "-";
        }

        return output.substring(0, output.length() - 1);
    }

    public static String toL33t(String sentence){
        String output = "";

        String[] sentenceArr = sentence.split(" ");

        for (String s : sentenceArr) {
            s = s.replace('a', '4');
            s = s.replace('i', '1');
            s = s.replace('e', '3');

            output += s + " ";
        }

        return output;
    }

    public static String toUpperFirstLetter(String word){
        char[] wordArr = word.toCharArray();

        wordArr[0] = Character.toUpperCase(wordArr[0]);

        return String.valueOf(wordArr);
    }
}
