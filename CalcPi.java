public class CalcPi {
    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("נא לספק מספר מונחים כקלט.");
            return;
        }

       
        int terms = Integer.parseInt(args[0]);

       
        double piApprox = 0.0;

       
        for (int i = 0; i < terms; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 1) {
                piApprox -= term; 
            } else {
                piApprox += term; 
            }
        }

       
        piApprox *= 4;

      
        System.out.println("pi according to Java: " + Math.PI);
        System.out.printf("pi, approximated: %.15f\n", piApprox); // הצגה עם דיוק של 15 ספרות
    }
}