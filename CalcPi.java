public class CalcPi {
    public static void main(String[] args) {
        double pi = Math.PI;
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 1000; 
        double approximatedPi = calculatePi(n);
        System.out.printf("pi according to Java: %.15f\n", pi);
        System.out.printf("pi, approximated: %.15f\n", approximatedPi);
    }
    public static double calculatePi(int n) {
        double pi = 0.0;
        for (int i = 0; i < n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        return 4 * pi;
    }
}