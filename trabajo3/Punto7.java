import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punto7 {

  public static boolean verifyPasswordSecurity( String password ) {
    boolean isSecure = false;

    Pattern pattern = Pattern.compile( "(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[\\p{P}\\p{S}])" );
    Matcher matcher = pattern.matcher( password );

    if ( ( matcher.find() ) && ( password.length() >= 10 ) ) {
      isSecure = true;
    }

    return( isSecure );
  }

  public static void main( String[] args ) {

    Scanner input = new Scanner(System.in);

    System.out.println( "CONTRASEÑA SEGURA:" );
    System.out.print( "Digite su contraseña: " );
    String password = input.next();

    String isSecureTxt = "";
    if ( !verifyPasswordSecurity( password ) ) {
      isSecureTxt = "no ";
    }
    isSecureTxt += "es segura";

    System.out.println( "Tu contraseña '" + password + "' " + isSecureTxt );

  }

}
