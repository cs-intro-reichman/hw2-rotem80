public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int repeatCount = Integer.parseInt(args[1]);
        String upperWord = word.toUpperCase();
        String specialChars = "AEFHILMNORSX";

        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);
            if (specialChars.indexOf(letter) == -1) {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            }
        }

        int counter = 0;
        System.out.println("What does that spell?");

        while (counter < repeatCount) {
            System.out.println(upperWord + "!!!");
            counter++;
        }
    }
}