import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		List<Integer> arr=new ArrayList<>();
		
	    int a=sc.nextInt();
		for(int i=0;i<a;i++) 
		;
			arr.add(sc.nextInt());
		
		      a=sc.nextInt();
			for (int i=0;i<a;i++) {
				String s = sc.next();
				if (s.equals("Insert")) {
					int x=sc.nextInt();
					int y=sc.nextInt();
					arr.add(x, y);
					
				}else if(s.equals("Delete")) {
					
					int d=sc.nextInt();
					arr.remove(d);
				}
				
		}
		
		
		for (int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		
	}
	   
}

 
	
