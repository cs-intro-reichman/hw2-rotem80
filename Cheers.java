// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String input = args[0].toUpperCase();
                int repetitions = Integer.parseInt(args[1]);
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    String article = (isVowel(ch)) ? "an" : "a"; 
                    System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
                }
        
                System.out.println("What does that spell?");
                for (int i = 0; i < repetitions; i++) {
                    System.out.println(input + "!!!");
                }
            }
        
            private static boolean isVowel(char ch) {
                String vowels = "AEIOU";
                return vowels.indexOf(ch) >= 0;
            }
        }
        