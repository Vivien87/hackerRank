import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Java_SHA256 {
	 public static void main(String[] args) throws NoSuchAlgorithmException {
	       
		 Scanner sc = new  Scanner(System.in);
		 String st=sc.nextLine();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(st.getBytes());
    byte[] digest = md.digest();
    
    /* Print the encoded value in hexadecimal */
    for (byte b : digest) {
        System.out.format("%02x", b);
    }
}
}