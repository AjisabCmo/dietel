package chapterTwo;
import java.util.Scanner;
public class OneZero {



        public static void main(String[] args){

            Scanner input = new Scanner (System.in);

            System.out.print("Enter the number 0 or 1;");
            int number = input.nextInt();


            if (number == 0){
                System.out.println(1);
            }

            if (number == 1){
                System.out.println(0);
            }

        }

    }

