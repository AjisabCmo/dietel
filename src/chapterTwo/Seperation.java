package chapterTwo;
import java.util.Scanner;
public class Seperation {




        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter number of five digits:");
            int number = input.nextInt();

            int digit1 = number / 10000;
            int digit2 = number / 1000 %10;
            int digit3 = number /100 % 10;
            int digit4 = number / 10 % 10;
            int digit5 = number % 10;



            System.out.printf("%d\t%d\t%d\t%d\t%d%n " , digit1 , digit2 ,digit3 ,digit4 ,digit5);

            System.out.println("i will make it till the end");

        }
    }

