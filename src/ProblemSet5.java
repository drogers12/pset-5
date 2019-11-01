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

      //ps.surroundMe(null, null);
      //ps.endsMeet("qwe    rty", 4);
      //ps.middleMan("qwertyuio");
      //ps.isCentered("qwertyuio", "rty");
      //ps.countMe("ffff ff ff", 'f');
      //ps.triplets("hhHhllliooo");
      //ps.addMe("123ffffffff7ff");
      //ps.sequence("aaaabbb");
      ps.intertwine("aaa", "bbbb");
      //ps.isPalindrome();

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {

      if (in == null || out == null) {
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

      if (text.length() % 2 == 1) {
        text = text.substring(0+(text.length()/2-1), 0+text.length()/2+2);
        System.out.printf(text);
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

      int i;
      int count = 0;

      if (text == null) {
        return -1;
      }

      Character.toString(suffix);

        for (i = 0; i < text.length(); i++) {
          if (Character.isSpaceChar(text.charAt(i))) {
            if (text.substring(i-1,i).equals(suffix)) {
              System.out.print("hi");
            }
          }
        }
      return -1;
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
      System.out.print(count);
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

      int count = 0;
      int i;
      text = text + " ";

      if (text == null){
        return -1;
      }

      for (i = 0; i < text.length()-1; i++) {

        if (text.substring(i, i+1).equals(text.substring(i+1, i+2))) {
          count += 1;
        }else{
          count = 0;
        }

      }

      System.out.print(count);

      return count;

    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {

      String combinedLength = a+b;
      String combinedString = "";
      int i;

      if (a.length>b.length){

      }


      //THIS WORKS FOR IF THEY'RE THE SAME LENGTH. MAKE IT WORK IF THEY'RE DIFFERENT LENGTHS
      for (i = 0; i < a.length(); i++) {
        combinedString = combinedString + a.substring(i, i+1);
        combinedString = combinedString + b.substring(i, i+1);
      }

      System.out.print(combinedString);


      return combinedString;

    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {

      return true;

    }
}
