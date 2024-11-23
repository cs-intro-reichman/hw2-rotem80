public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Cheers <word> <repeatCount>");
            return;
        }

        String word = args[0];
        int repeatCount = Integer.parseInt(args[1]);
        String upperWord = word.toUpperCase();
        String specialChars = "AEFHILMNORSX";
        String vowels = "AEIOU";

        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);
            if (specialChars.indexOf(letter) == -1) {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            } else {
                if (vowels.indexOf(letter) != -1) {
                    System.out.println("Give me an " + letter + ": " + letter + "!");
                } else {
                    System.out.println("Give me a " + letter + ": " + letter + "!");
                }
            }
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < repeatCount; i++) {
            System.out.println(upperWord + "!!!");
        }
    }
}