package DataStructures;

import java.util.Scanner;

public class Left_Rotation_Array {

	static int[] leftRotation(int[] a, int d) {
        // Complete this function
		int newA[]=new int[a.length];
		int myIndex;
			for(int j=0;j<a.length;j++){
				
				myIndex=(j+d)%a.length;
				newA[j]=a[myIndex];
			System.out.println("---->"+myIndex);
		}
		return newA;
    }

    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int d = in.nextInt();
         int[] a = new int[n];
         for(int a_i = 0; a_i < n; a_i++){
             a[a_i] = in.nextInt();
         }
         int[] result = leftRotation(a, d);
         for (int i = 0; i < result.length; i++) {
             System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
         }
         System.out.println("");


         in.close();
     }
 }