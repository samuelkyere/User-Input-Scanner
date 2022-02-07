import java.util.Scanner;
class Fibo{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("userInput  value:  ");
        int userInput =scan.nextInt();
        int num1=0; int num2=1;
        for ( int i=0; i<=userInput; i++)
        {
            System.out.print(num1+ " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2  = sumOfPrevTwo;
        }
        
    }
}