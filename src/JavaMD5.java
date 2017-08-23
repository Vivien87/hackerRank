import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
	 public static void main(String[] args) throws NoSuchAlgorithmException {
	       
		 Scanner sc = new  Scanner(System.in);
		 String st=sc.nextLine();
		 
		 MessageDigest md = MessageDigest.getInstance("MD5");
		md.reset();
		md.update(st.getBytes());
		
		byte byteData[]=md.digest();
		
		StringBuffer sb = new StringBuffer();
		for(byte aByte:byteData) {
			sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
		}
		System.out.println( sb.toString());
	    }
	}
