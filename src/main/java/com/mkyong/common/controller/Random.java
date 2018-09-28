import java.security.SecureRandom;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    SecureRandom sr = new SecureRandom();
    sr.setSeed(123456L); // Noncompliant
    System.out.println(sr.nextInt(32));
  }
}
