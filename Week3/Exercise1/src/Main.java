import java.util.Scanner;

public class Main {
    public static Scanner cs = new Scanner(System.in);

    public static void main(String[] args) {

        int function;

        System.out.print("Please enter your sentence: ");
        String sentence = enterSentence();

        outerloop:
        while(true) {
            System.out.println("Current sentence: '" + sentence + "'");

            System.out.println(" ");

            System.out.println("* Options *");
            System.out.println("1) Make sentence in camel case");
            System.out.println("2) Make sentence in pascal case");
            System.out.println("3) Make sentence in snake case");
            System.out.println("4) Make sentence in upper snake case");
            System.out.println("5) Make sentence in kebab case");
            System.out.println("6) Make sentence in L33t case");
            System.out.println("7) Enter new sentence");
            System.out.println("0) Exit");

            System.out.println(" ");

            System.out.print("Choose an option: ");
            function = cs.nextInt();

            switch (function) {
                case 1:
                    System.out.println(StringUtils.toCamelCase(sentence));
                    break;

                case 2:
                    System.out.println(StringUtils.toPascalCase(sentence));
                    break;

                case 3:
                    System.out.println(StringUtils.toSnakeCase(sentence));
                    break;

                case 4:
                    System.out.println(StringUtils.toUpperSnakeCase(sentence));
                    break;

                case 5:
                    System.out.println(StringUtils.toKebabCase(sentence));
                    break;

                case 6:
                    System.out.println(StringUtils.toL33t(sentence));
                    break;

                case 7:
                    sentence = enterSentence();
                    break;

                case 0:
                    break outerloop;

                default:
                    System.out.println("Please enter a valid option!");
                    break;
            }

            System.out.println(" ");
        }


    }

    public static String enterSentence(){
        return cs.nextLine();
    }
}