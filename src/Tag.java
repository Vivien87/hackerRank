import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	     int n=sc.nextInt();

	    System.out.println("Tag word");
	        String tagWord =sc.nextLine();
	        
			String tagStart="</"+tagWord+">";
			
			String tagEnd ="</"+tagWord+">";
			System.out.println("Word or Setence");
			String words =sc.nextLine();
			String CounWords =tagStart +words +tagEnd;
			
			Pattern pattern = Pattern.compile(tagStart+ "(.*)" + tagEnd);
			Matcher matcher = pattern.matcher(CounWords);
			
			if (matcher.find()) {
				String cd = matcher.group(1);
				
			System.out.println(cd);
				
			}
			
			

			
			}
			
		}
