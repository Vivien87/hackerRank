import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMapPhoneBook {
	public static void main(String[] args) {
		
		Map arr=new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		for (int i=0;i<a;i++) {
	        String name = sc.nextLine();
				String phone = sc.nextLine();
	        arr.put(name, phone);
		
	    }
		while(sc.hasNextLine()) {
			String st=sc.nextLine();
			if(arr.containsKey(st)) {
				System.out.println(st+"="+arr.get(st));
			}else {
				System.out.println("Not found");
			}
	    }
		sc.close();
		}
		 
		
	    	
	    	
		
	}
