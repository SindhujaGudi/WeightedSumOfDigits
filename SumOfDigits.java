/* Name:Sindhuja Gudi 
 Course:MCIS5103 Advanced Programming Concepts 
 Section:030 
 SAU ID:999992808
 */
import java.util.Scanner;
public class SumOfDigits
{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int number;
            System.out.print("Enter an integer: ");
            number = sc.nextInt();
          do{
              int numOfDigits = String.valueOf(number).length();
              int sumOfDigits = 0;
            while (number != 0) {
                   sumOfDigits += numOfDigits*(number % 10);
                   number /= 10;
                   numOfDigits = numOfDigits-1;
              }
              System.out.println("Weighed sum of digits is: " + sumOfDigits);
          }while(number>0);

     }

}

