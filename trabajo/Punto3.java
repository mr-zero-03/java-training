import java.util.Scanner;

public class Punto3 {

  public static String compareTriangleSides( float sides[] ) {
    int sideArraySize = sides.length;
    int countEqualSides = 0;
    int j = 1;
    for ( int i = 0; i < sideArraySize; i++ ) {

      if ( j == sideArraySize ) { j = 0; }

      if ( sides[ i ] == sides[ j ] && countEqualSides != 2 ) {
        countEqualSides++;
      }
      j++;
    }

    String triangleType = "";
    switch ( countEqualSides ) {
      case 0:
        triangleType = "escaleno";
      break;
      case 1:
        triangleType = "isósceles";
      break;
      case 2:
        triangleType = "equilátero";
      break;
    }

    return triangleType;
  }


  public static void main( String[] args ) {

    Scanner input = new Scanner(System.in);

    System.out.println( "TIPO DE TRIÁNGULO:\n" );
    System.out.println( "Digite las longitudes de los lados del tríangulo" );

    float sides[] = new float[ 3 ];
    for ( int i = 0; i < 3; i++ ) {
      System.out.println( "Lado " + i + ": " );
      sides[i] = input.nextFloat();
    }

    String triangleType = compareTriangleSides( sides );
    System.out.println( "Según las dimensiones dadas el triángulo es " + triangleType );

  }

}
