public class CalcPi {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CalcPi <name> <repeatCount>");
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

        double pi = 0.0;
        for (int i = 0; i < repeatCount; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        pi *= 4;

        System.out.println("Pi according to Java: " + Math.PI);
        System.out.println("Pi, approximated: " + pi);

        String upperName = name.toUpperCase();
        for (int i = 0; i < upperName.length(); i++) {
            char ch = upperName.charAt(i);
            if ("AEFHILMNORSX".indexOf(ch) == -1) {
                System.out.println("Give me a " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            }
        }
        
        System.out.println("What does that spell?");
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(upperName + "!!!");
        }
    }
}