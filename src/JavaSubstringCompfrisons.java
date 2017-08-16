import java.util.Scanner;

public class JavaSubstringCompfrisons {


	  public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        for (int i=0;i<s.length()-k;i++){
	        	String a = s.substring(i, i+k);
	        	if (a.compareTo(smallest)<0 || smallest.isEmpty()) {
	        		smallest=a;
	        	}if (a.compareTo(largest)>0 || largest.isEmpty()) {
	        		largest=a;
	        	}
	        }
	        
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}


