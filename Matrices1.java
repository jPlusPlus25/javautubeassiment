public class Matrices1{
public static boolean searchMa(int matrix[][],int key) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == key) {
                System.out.println("found at cell (" + i + "," + j + ")");
                return true;

            }
        }
    }
    System.out.println("key not found");
        return false;
            }
    public static void main(String args[]){
    int matrix[][]={{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    searchMa(matrix,6);
}

    }

