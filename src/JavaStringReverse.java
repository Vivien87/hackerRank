import java.util.Scanner;

public class JavaStringReverse {
	static String reverse(String s) {
		return new StringBuffer(s).reverse().toString();  
	  }
	
	public static void main(String[] args) {
		

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
      
        
        System.out.println(A.equals(reverse(A))? "Yes" : "No");
        }
        
    
    
	}    
	