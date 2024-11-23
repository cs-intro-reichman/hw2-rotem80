// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String input = args[0].toUpperCase();
                int repetitions = Integer.parseInt(args[1]);
                String vowels = "AEFHI LMNORSX";
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    String article = (vowels.indexOf(ch) >= 0) ? "an" : "a";  // "an" if vowel
                    System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
                }
                for (int i = 0; i < repetitions; i++) {
                    System.out.println(input + "!!!");
                }
            }
        }
        