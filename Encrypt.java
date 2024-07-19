import java.security.MessageDigest;
import java.math.BigInteger;

public class Encrypt {
    public static String encryption(String message) throws Exception {
        // MessageDigest work with MD2, MD5, SHA-1, SHA-256, SHA-384, SHA-512
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] arr = md.digest(message.getBytes());
        BigInteger bi = new BigInteger(1, arr);
        return bi.toString(16);
    }

    public static void main(String[] args) {
        try {
            String message = "Example";
            String res = encryption(message);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
