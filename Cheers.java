public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Cheers <name> <num>");
            return;
        }

        String name = args[0].toUpperCase();
        int num = Integer.parseInt(args[1]);

        String vowelsAndSpecial = "AEFHILMNORSX";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (vowelsAndSpecial.indexOf(ch) != -1) {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me a " + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < num; i++) {
            if (i > 0) {
                System.out.print(" "); 
            }
            System.out.print(name + "!!!");
        }

        System.out.println();
    }
}