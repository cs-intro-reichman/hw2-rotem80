public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Cheers <word> <repeatCount>");
            return;
        }

        String inputWord = args[0];
        int repeatCount = Integer.parseInt(args[1]);
        String upperCaseWord = inputWord.toUpperCase();
        String specialChars = "AEFHILMNORSX";

        int charIndex;
        for (charIndex = 0; charIndex < upperCaseWord.length(); ++charIndex) {
            char currentChar = upperCaseWord.charAt(charIndex);
            if (specialChars.indexOf(currentChar) == -1) {
                System.out.println("Give me a " + currentChar + ": " + currentChar + "!");
            } else {
                System.out.println("Give me an " + currentChar + ": " + currentChar + "!");
            }
        }

        charIndex = 0;
        System.out.println("What does that spell?");

        while (charIndex < repeatCount) {
            System.out.println(upperCaseWord + "!!!");
            ++charIndex;
        }
    }
}