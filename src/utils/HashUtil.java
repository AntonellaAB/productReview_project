
package utils;
/**
CLASE PARA EL HASH SHA-256
 */
import java.security.MessageDigest;

public class HashUtil {
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            
            StringBuilder sb = new StringBuilder();
            
            for (byte b : hash){
               sb.append(String.format("%02x", b));
            }
            return sb.toString();
            
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
