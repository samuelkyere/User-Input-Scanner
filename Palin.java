import java.util.Scanner;
class Palin{
     public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("userInput  value:  ");
     String userInput =scan.nextLine();
      String reverse = "";
      int i = userInput.length() - 1;
      while (i>=0){
          reverse += userInput.charAt(i);
          System.out.print(reverse);
          i--;

      }
      if (userInput==reverse)
      {
          System.out.print(userInput + "is a palindrome");
      }
      else
      {
          System.out.print(userInput + " is not  a palindrome");
      }



    }
}