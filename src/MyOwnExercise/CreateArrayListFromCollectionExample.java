package MyOwnExercise;

import java.awt.*;
import java.util.ArrayList;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> firstFivePrimeNumber = new ArrayList<>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);


     ArrayList<Integer> firstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber);

        ArrayList<Integer> nextFivePrimeNumber = new ArrayList<>();

          nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);

        firstTenPrimeNumber.addAll(nextFivePrimeNumber);

        System.out.println(firstTenPrimeNumber);

    }
}
