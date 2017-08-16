import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {

		 public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine();
		        // Write your code here.
		        scan.close();
		        StringTokenizer st=new StringTokenizer(s," \t\n\r,.?!_'@");
				System.out.println(st.countTokens());
				while(st.hasMoreTokens()){
					System.out.println(st.nextToken());
				}
		    }
		}


