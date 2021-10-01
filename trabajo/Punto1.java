import java.util.Scanner;

public class Punto1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "VALOR ABSOLUTO:\n" );
    System.out.println( "Digite su número:" );
    float value = input.nextFloat();

    System.out.println( "El valor absoluto del número que digitó es:" );

    float absoluteValue = Math.abs( value );

    System.out.println( "|" + value + "| = " + absoluteValue );

  }

}
