package ChibuzorTask;//package ChibuzorTask;
//
//import java.util.Scanner;
//
//public class Assignment1{
//    public static int largestElement( int number) {
//
//
//    Scanner scanner =new Scanner(System.in);
//
//    int [] array=new int [5];
//
//       for ( int count = 0; count < 5; count++) {
//
//           System.out.println("enter number");
//           number= scanner.nextInt();
//           array[count]=number;
//
//
//
//
//
//       }
//       int largest =array[0];
//
//       for (int index=0; index<array.length;index++){
//           if (array[index] > largest){
//               largest = array[index];
//           }
//       }
//       return largest;
//    }
//
//    public static void main(String[] args) {
//        int result = largestElement(5);
//        System.out.println(result);
//    }
//}

public class AllAssignment {
//
//    public static int largest( int arr, int arr1, int arr2){
//        int[] array ={1,2,9};
//
//        int largest=array[0];
//        for (int count =0;count < array.length;count++){
//
//                if(array[count] > largest){
//                    largest=array[count];
//                }
//            }
//
//        return largest;
//    }
//
//
//
//    }


    public static int largestNumber(int [] array) {
//        int[] array = {10, 40, 30, 20, 11, 200, 812};
        int largest = array[0];
        for (int count = 0; count < array.length; count++) {

                if (array[count] > largest )
                largest = array[count];

        }


        return largest;
    }

    public int[] reverse(int[] array) {
        int length = array.length;
        int [] reverse= new int [length];

        for(int count =0;count< array.length;count++){
            reverse[count] = array[length-1-count];
        }

        return reverse;
    }
}

//public static void main(String[] args) {
//       int result = largestNumber();
//    System.out.println(result);
//        }


