/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
      ProblemSet5 ps = new ProblemSet5();

      ps.surroundMe("cde", "abfg");
      ps.surroundMe(null, "####");
      ps.surroundMe("abc", null);
      ps.surroundMe("abc", "123");


      ps.endsMeet("abcdefg", 2);
      ps.endsMeet(null, 2);
      ps.endsMeet("", 2);
      ps.endsMeet("abc", -1);

      ps.middleMan("abcdefg");
      ps.middleMan(null);
      ps.middleMan("12");
      ps.middleMan("a");

      ps.isCentered("abcdefg", "cde");
      ps.isCentered("abcdefg", "abc");
      ps.isCentered(null, "abc");
      ps.isCentered("abcd", "abc");
      ps.isCentered("abc", null);
      ps.isCentered("abcdefg", "cd");

      ps.countMe("I am an example sentence", 'e');
      ps.countMe(null, 'a');
      ps.countMe("abc$ def$", '$');

      ps.triplets("aaabbbccc");
      ps.triplets("aaaa");
      ps.triplets("abc");
      ps.triplets(null);

      ps.addMe("123 abc 123");
      ps.addMe("abcdefghijk");
      ps.addMe(null);

      ps.sequence("abbcccdddd");
      ps.sequence("aAabBbBb");
      ps.sequence("");
      ps.sequence(null);


      ps.intertwine("aceg", "bdfh");
      ps.intertwine("abc", "12345");
      ps.intertwine(null, "abcd");
      ps.intertwine("abcd", null);
      ps.intertwine(null, null);

      ps.isPalindrome("racecar");
      ps.isPalindrome("Madam");
      ps.isPalindrome(null);

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {

      if (out == null || in == null) {
        return in;
      }

       if (out.length() == 4) {
         in = out.substring(0, 2) + in + out.substring(2, 4);
       }

      return in;

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {

      if (text == null) {
        return text;
      }

      if (text.length()>=1 && text.length()<=10 && n <= text.length() && n >= 1) {
        text = text.substring(0, n) + text.substring(text.length()-n,text.length());
      }

      return text;

    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {

      if (text == null) {
        return text;
      }

      if (text.length() % 2 == 1 && text.length() > 2) {
        text = text.substring(0+(text.length()/2-1), 0+text.length()/2+2);
      }

      return text;

    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {

      if (text == null || target == null || text.length() % 2 == 0 || target.length() != 3) {
        return false;
      }

      if (text.length() % 2 == 1) {
        text = text.substring(0+(text.length()/2-1), 0+text.length()/2+2);
        if (text.equals(target)) {
          return true;
        }
      }
      return false;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

     public int countMe(String text, char suffix) {

         int count = 0;

         if (text != null && Character.isLetter(suffix) && ((suffix >= 'a' && suffix <= 'z')
           || (suffix >= 'A' && suffix <= 'Z'))) {

             for (int i = 0; i < text.length(); i++) {
                 if (text.charAt(i) == suffix && (i == text.length() - 1 || text.charAt(i+1) == ' ')) {
                     count++;
                 }
             }

         } else {
             count = -1;
         }


         return count;

     }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {

      int count = 0;
      int i;

      if (text == null){
        return -1;
      }
      for (i = 0; i < text.length()-2; i++) {
        if (text.substring(i, i+1).equals(text.substring(i+1, i+2)) && text.substring(i+1, i+2).equals(text.substring(i+2, i+3))) {
          count++;
        }
      }
      return count;

    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {

      int i;
      int tempValue;
      int total = 0;
      boolean isNumeric;
      char iteration;

      if (text == null){
        return -1;
      }

      for (i = 0; i < text.length(); i++) {
        iteration = text.charAt(i);
        isNumeric = Character.isDigit(iteration);
        if (isNumeric == true) {
          tempValue = Integer.parseInt(text.substring(i, i+1));
          total += tempValue;
        }
      }

      return total;

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

     public long sequence(String text) {

         long record = 1;
         long sequenceLength = 1;
         char first = ' ';
         char second = ' ';

         if (text != null) {

             for (int i = 1; i < text.length(); i++) {

                 first = text.charAt(i-1);
                 second = text.charAt(i);

                 if (first == second) {

                     sequenceLength += 1;

                     if (sequenceLength > record) {
                         record = sequenceLength;
                     }

                 } else {
                     sequenceLength = 1;
                 }

             }

             if (text.length() == 0) {
                 record = 0;
             }

         } else {
             record = -1;
         }

         return record;

     }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {

        long record = 0;
        // boolean isARecord = false;
        String intertwined = "";

        if (a != null && b != null) {

            if (a.length() > b.length()) {

                record = a.length();
                // isARecord = true;

            } else {
                record = b.length();
            }

            for (int i = 0;i < record; i++) {
                if (i < a.length() && i < b.length()) {

                    intertwined += String.valueOf(a.charAt(i));
                    intertwined += String.valueOf(b.charAt(i));

                } else if (i < a.length()) {
                    intertwined += String.valueOf(a.charAt(i));
                } else if (i < b.length()) {
                    intertwined += String.valueOf(b.charAt(i));
                }
            }

        } else {
            intertwined = null;
        }

        return intertwined;

    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
        boolean isPalindrome = false;
        String reverseString = "";

        if (text != null) {

            for (int i = text.length()-1 ; i >= 0; i--) {
                reverseString += String.valueOf(text.charAt(i));
            }

            if (text.equals(reverseString)) {
                isPalindrome = true;
            }

        } else {
            isPalindrome = false;
        }

        return isPalindrome;

    }
}
