public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments: a word and a number.");
            return; // יציאה מהתוכנית אם לא הוזנו מספיק ארגומנטים
        }

        String word = args[0];  // המילה (למשל "RUNI", "WOOL", "YAY")
        int times = Integer.parseInt(args[1]);  // מספר הפעמים להדפיס את המילה בסוף

        // עבור כל אות במילה
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (isVowel(letter)) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        // הדפסת "What does that spell?" אחרי כל אות
        System.out.println("What does that spell?");
        System.out.println(word.toUpperCase() + "!!!");

        // הדפסת המילה בסוף מספר הפעמים שנדרש
        for (int i = 0; i < times; i++) {
            System.out.println(word.toUpperCase() + "!!!");
        }
    }

    // פונקציה לזהות אם האות היא תו תנועה (vowel)
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}