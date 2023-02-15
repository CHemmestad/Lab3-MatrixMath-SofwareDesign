import java.io.IOException;

public class MatrixTester{
    public static void main(String[] args) throws IOException{
        Matrix matrixA = new Matrix(2,3);
        matrixA.setElement(1, 1, 1);
        matrixA.setElement(1, 2, 10);
        matrixA.setElement(1, 3, 5);
        matrixA.setElement(2, 1, 2);
        matrixA.setElement(2, 2, 1);
        matrixA.setElement(2, 3, 0);
        matrixA.print();
        System.out.println();

        Matrix matrixB = new Matrix(3,2);
        matrixB.setElement(1, 1, 105);
        matrixB.setElement(1, 2, 0);
        matrixB.setElement(2, 1, 2);
        matrixB.setElement(2, 2, 1);
        matrixB.setElement(3, 1, 10);
        matrixB.setElement(3, 2, 5);
        matrixB.print();
        System.out.println();

        Matrix matrixC = matrixA.addMatrix(matrixB);
        matrixC.print();
        System.out.println();

        Matrix matrixD = matrixA.multipyMatrix(matrixB);
        matrixD.print();
        System.out.println();

        Matrix matrixE = new Matrix(4, 4);
        matrixE.fillElements();
        matrixE.print();
        System.out.println();

        Matrix matrixF = new Matrix(4,4);
        matrixF.fillElements();
        matrixF.print();
        System.out.println();

        matrixC = matrixE.addMatrix(matrixF);
        matrixC.print();
        System.out.println();

        matrixC = matrixE.subMatrix(matrixC);
        matrixC.print();
        System.out.println();

        Matrix matrixManualA = new Matrix(2,2);
        matrixManualA.manualFill();
        matrixManualA.print();
        System.out.println();

        Matrix matrixManualB = new Matrix(2,2);
        matrixManualB.manualFill();
        matrixManualB.print();
        System.out.println();

        matrixManualA = matrixManualA.addMatrix(matrixManualB);
        matrixManualA.print();
        System.out.println();

        System.out.println(matrixA.getElement(1, 3));
        System.out.println(matrixA.getElement(3, 3));
    }
}