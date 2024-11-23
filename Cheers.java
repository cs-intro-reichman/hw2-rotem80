public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Cheers <word> <repeatCount>");
            return;
        }

        String inputWord = args[0];
        int repeatCount = Integer.parseInt(args[1]);
        String upperCaseWord = inputWord.toUpperCase();
        String vowels = "AEIOU";

        // Print "Give me" statements
        for (int charIndex = 0; charIndex < upperCaseWord.length(); ++charIndex) {
            char currentChar = upperCaseWord.charAt(charIndex);
            if (vowels.indexOf(currentChar) != -1) {
                System.out.println("Give me an " + currentChar + ": " + currentChar + "!");
            } else {
                System.out.println("Give me a " + currentChar + ": " + currentChar + "!");
            }
        }

        System.out.println("What does that spell?");

        // Repeat the word
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(upperCaseWord + "!!!");
        }
    }
}