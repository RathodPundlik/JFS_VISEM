import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        String sentence;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int vowelStart = 0;
        int consonantStart = 0;
        int otherStart = 0;
        for (String word : words) {
            char ch = Character.toLowerCase(word.charAt(0));
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelStart++;
                } else {
                    consonantStart++;
                }
            } else {
                otherStart++;
            }
        }
        System.out.println("Vowel started words: " + vowelStart);
        System.out.println("Consonant started words: " + consonantStart);
        System.out.println("Other character started words: " + otherStart);
    }
}