public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int repeatCount = Integer.parseInt(args[1]);
        String upperWord = word.toUpperCase();
        String vowels = "AEIOU";

        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);
            if (vowels.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < repeatCount; i++) {
            System.out.println(upperWord + "!!!");
        }
    }
}