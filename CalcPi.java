public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);
        double approximation = 0.0;
        double denominator = 1.0;

        for (int i = 0; i < terms; i++) {
            if (i % 2 == 0) {
                approximation += 1.0 / denominator;
            } else {
                approximation -= 1.0 / denominator;
            }
            denominator += 2.0;
        }
        
        System.out.println("pi according to Java: 3.141592653589793");
        System.out.println("pi, approximated: " + approximation * 4.0);
    }
}