import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String IP = in.next();
			System.out.println(IP.matches(new myRegex().pattern));
		}
	}
	class MyRegex {
		String pattern= "(^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$)";
		    
		}
}
