package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Sparse_Arrays {

	 public static void main(String[] args) {
		 
		    ArrayList<String> a = new ArrayList<String>();
		    Scanner sc = new Scanner(System.in);
		    int w= sc.nextInt();
		    for(int i=0;i<w;i++){
		    	a.add(sc.next());
		    }
		    int q=sc.nextInt();
		    for(int j=0;j<q;j++){
		    	String word=sc.next();
		    	int count=0;
		    	for(String str : a) {
		    		if(str.equals(word)){
		    			count++;
		    		}
		    		
		    	}System.out.println(count);
		    }
		    }
		}
