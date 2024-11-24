public class Cheers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Cheers <word> <count>");
            return;
        }

        // קבלת הקלט והפיכתו לאותיות רישיות
        String word = args[0].toUpperCase(); 
        int count = Integer.parseInt(args[1]);

        // קבוצת התנועות שמצריכות "an" במקום "a"
        String vowels = "AEFHILMNORSX"; 

        // לולאת הדפסת האותיות
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            // בדיקה אם האות היא אחת מהתנועות (A, E, F, וכו')
            if (vowels.indexOf(letter) == -1) {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            }
        }
        
        // הדפסת המילה "What does that spell?"
        System.out.println("What does that spell?");

        // לולאת הדפסת המילה עם "!!!"
        for (int i = 0; i < count; i++) {
            System.out.println(word + "!!!");
        }
    }
}