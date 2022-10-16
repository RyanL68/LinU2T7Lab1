import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Asks for a word
        System.out.println("What is your first word? ");
        String word = scan.nextLine();

        //Finds length of word
        int length1 = word.length();
        System.out.println("First String length: " + length1);

        //finds half of word
        int wordhalf = length1 / 2;

        //finds the halves of word
        String first = word.substring(0, wordhalf);
        String second = word.substring(wordhalf);
        System.out.println("the first half of word one is: " + first);
        System.out.println("The second half of word one is: " + second);

        //second word
        System.out.println("What is your second word: ");
        String word2 = scan.nextLine();

        //compares the two lengths
        int length2 = word2.length();
        if (length1 > length2) {
            System.out.println(word + " is longer then word 2");
        } else if (length1 < length2) {
            System.out.println(word2 + " is longer then word 1");
        } else {
            System.out.println("they are the same length");

        }

        if (word.equals(word2)) {
            System.out.println("they both have the same characters");
        } else {
            int compare = word.compareTo(word2);
            if (compare < 0) {
                System.out.println(word + " is first alphabetically ");
            } else {
                System.out.println(word2 + " is first alphabetically");
            }

            int Index = word.indexOf(word2);
            if (Index == -1) {
                System.out.println(word2 + " is not found in " + word);
            } else {

                System.out.println(word2 + " is found in " + word + " at " + Index);
            }
        }
    }
}