package by.cristina.javaFundamentals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task3 {

    public static double rnd(double min, double max)
    {
        max = max - min; //max -= min;
        return (double) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n, где n - размерность матрицы: ");
        String sizeMatrixStr = in.next();

        System.out.print("Введите число M, где [-M;M] - интервал значений элементо матрицы: ");
        String intervalStr = in.next();

        int sizeMatrix =  Integer.parseInt(sizeMatrixStr);
        double interval = Double.parseDouble(intervalStr);

        double matrix[][] = new double[sizeMatrix][sizeMatrix];

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++) {

                // 1.Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
                matrix[i][j]= rnd(10, 99);
                //matrix[i][j]= rnd(-interval, interval);
            }
        }

        PrintToConsole(matrix);

        Comparator shiftColumns0 = new ShiftColumnsInMatrix(0);

        Arrays.sort(matrix, shiftColumns0);

        PrintToConsole(matrix);


        //3. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки

/*        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++) {

                if (j >= 0){



                }

            }
        }*/

    }

    private static void PrintToConsole(double[][] matrix) {
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
