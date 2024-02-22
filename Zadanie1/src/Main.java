import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
import java.util.*;
public class Main {

    public static void main(String[] args){
        int liczba  = 14676;
        //generateTable();
        cyfry(liczba);
    }
    public static int[][] generateTable(){
        int rows = 100;
        int columns = 10;

        int[][] randomArray = new int[rows][columns];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int randomNumber = random.nextInt(99) + 1;
                randomArray[i][j] = randomNumber;
            }
        }

       for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(randomArray[i][j] + "\t");
            }
            System.out.println();
        }

        return randomArray;
    }

    public static ArrayList<Integer> cyfry(int liczba) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = String.valueOf(liczba).length()-1; i > -1; i-- ){
            int tmp = (int) Math.pow(10, i);
            int reszta = liczba % tmp;
            int digit = (liczba - reszta) / tmp;
            liczba = reszta;
            liczby.add(digit);
        }
        for (Integer integer : liczby) {
            System.out.print(integer);
        }
        return liczby;
    }
   public int srednia(int[][] generateTable, int liczba){
    return 1;
    }
}