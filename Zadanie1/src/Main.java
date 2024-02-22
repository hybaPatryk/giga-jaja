import java.util.Random;
public class Main {

    public static void main(String[] args){
        int liczba  = 146;
        generateTable();
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

    public int srednia(int[][] generateTable, int liczba){
    return 1;
    }
}