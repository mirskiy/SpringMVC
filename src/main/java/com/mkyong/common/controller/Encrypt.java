import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
  {
    //Cipher c1 = Cipher.getInstance("AES/ECB/NoPadding"); // Noncompliant
    Cipher c1 = Cipher.getInstance("AES/CBC/PKCS5Padding"); // Noncompliant
    byte[] keyBytes = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
                                   0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };

    SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
    c1.init(Cipher.ENCRYPT_MODE, key);
    byte[] iv = c1.getIV();
    System.out.println(c1.doFinal("hello".getBytes()));
  }
}
