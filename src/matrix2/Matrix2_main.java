package matrix2;

import java.util.Arrays;

public class Matrix2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double a[][]= {{0,1},{2,0},{0,3}};
        double b[][]= {{1,-1,2},{3,0,4}};
        double c[][] = { { 3, 1, 1, 2 },{ 5, 1, 3, 4 },{ 2, 0, 1, 0 },{ 1, 3, 2, 1 }};
        double d[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, -1 }, { 1, 1, -1, 1 }, { 1, -1, 1, 1 } };
        double e[] = { 0, 4, -4, 2 };
        

        Matrix2_lib mlib= new Matrix2_lib();
        System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct(a,b)));
        System.out.println("Cofactor = "+(mlib.getCofactor(c)));
        System.out.println("Inverse = "+ Arrays.deepToString(mlib.getInverse(d)));
        System.out.println("Solution = "+ Arrays.toString(mlib.getSolution(d, e)));
        
        
	}

}
