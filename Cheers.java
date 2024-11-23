public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Cheers <name> <repeatCount>");
            return;
        }

        String name = args[0];
        int repeatCount = 0;
        try {
            repeatCount = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for repeatCount. Please enter an integer.");
            return;
        }

        String upperName = name.toUpperCase();
        for (int i = 0; i < repeatCount; i++) {
            System.out.print("Give me a ");
            for (int j = 0; j < upperName.length(); j++) {
                char ch = upperName.charAt(j);
                System.out.print(ch + ": " + ch + " ");
            }
            System.out.println();
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(upperName + "!!!");
        }
    }
}