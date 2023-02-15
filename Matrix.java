import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class Matrix {

    private Scanner input = new Scanner(System.in);

    private int rows;
    private int columns;
    private int[][] array;

    public Matrix(int rows_, int columns_){
        rows = rows_;
        columns = columns_;
        setArray(rows_, columns_);
    }

    public void setElement(int row_, int column_, int element_){
        if ((row_ <= rows)&&(column_ <= columns)){
            if ((row_ > 0)&&(column_ > 0)){
                array[column_-1][row_-1] = element_;
            }
        }
    }

    public int getElement(int row_, int column_) {
        if (((row_ <= rows)&&(column_ <= columns))&&((row_ > 0)&&(column_ > 0))){
            int element = array[column_-1][row_-1];
            return element;
        }
        return 999999999;
    }

    public Matrix addMatrix(Matrix B) {
        if ((rows == B.rows)&&(columns == B.columns)){
            Matrix C = new Matrix(rows, columns);
            for (int x = 0; x < columns; x++){
                for (int y = 0; y < rows; y++){
                    C.array[x][y] = array[x][y] + B.array[x][y];
                }
            }
            return C;
        }
        System.out.println("Invalid. Original matrix returned");
        return this;
    }

    public Matrix subMatrix(Matrix B) {
        if ((rows == B.rows)&&(columns == B.columns)){
            Matrix C = new Matrix(rows, columns);
            for (int x = 0; x < columns; x++){
                for (int y = 0; y < rows; y++){
                    C.array[x][y] = array[x][y] - B.array[x][y];
                }
            }
            return C;
        }
        System.out.println("Invalid. Original matrix returned");
        return this;
    }

    public Matrix multipyMatrix(Matrix B){
        if (columns == B.rows){
            int steps = columns;
            Matrix C = new Matrix(rows, B.columns);
            for (int y = 0; y < rows; y++){
                for (int x = 0; x < B.columns; x++){
                    int num = 0;
                    for (int n = 0; n < steps; n++){
                        num += (array[n][y]*B.array[x][n]);
                    }
                    C.array[x][y] = num;
                }
            }
            return C;
        }
        System.out.println("Invalid. Original matrix returned");
        return this;
    }

    /*
    public Matrix divideMatrix(Matrix B){
        if (columns == B.rows){
            int steps = columns;
            Matrix C = new Matrix(rows, B.columns);
            for (int y = 0; y < rows; y++){
                for (int x = 0; x < B.columns; x++){
                    int num = 0;
                    for (int n = 0; n < steps; n++){
                        num += (array[n][y]/B.array[x][n]);
                    }
                    C.array[x][y] = num;
                }
            }
            return C;
        }
        System.out.println("Invalid. Original matrix returned");
        return this;
    }
    */

    public void manualFill() throws IOException{
        for (int y = 0; y < rows; y++){
            for (int x = 0; x < columns; x++){
                System.out.println("Element for row " + (y+1) + " and column " + (x+1) + " : ");
                array[x][y] = input.nextInt();
            }
        }
    }

    public void fillElements(){
        Random rand = new Random();
        for (int y = 0; y < rows; y++){
            for (int x = 0; x < columns; x++){
                array[x][y] = rand.nextInt(10);
            }
        }
    }

    public void print(){
        for (int y = 0; y < rows; y++){
            for (int x = 0; x < columns; x++){
                if ((array[x][y] < 100)&&(array[x][y] > -10)){
                    System.out.print(" ");
                    if ((array[x][y] < 10)&&(array[x][y] >= 0)) {
                        System.out.print(" ");
                    }
                }
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }

    private void setArray(int rows_, int columns_){
        array = new int[columns_][rows_];
        for (int y = 0; y < rows_; y++){
            for (int x = 0; x < columns_; x++){
                array[x][y] = 0;
            }
        }
    }
}
