public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Cheers <word> <count>");
            return;
        }

        String word = args[0].toUpperCase(); 
        int count = Integer.parseInt(args[1]); 

        String vowels = "AEFHILMNORSX"; 

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (vowels.indexOf(letter) == -1) {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            }
        }
        
        System.out.println("What does that spell?");

        for (int i = 0; i < count; i++) {
            System.out.println(word + "!!!");
        }
    }
}