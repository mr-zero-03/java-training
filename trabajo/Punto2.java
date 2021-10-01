import java.util.Scanner;

public class Punto2 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "PAR O IMPAR:\n" );
    System.out.println( "Digite su número:" );
    float value = input.nextFloat();

    String oddEven = "";
    if ( value % 2 == 0 ) {
      oddEven = "par";
    } else {
      oddEven = "impar";
    }

    System.out.println( "El valor que digitó es " + oddEven );

  }

}
