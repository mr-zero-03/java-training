import java.util.Scanner;

public class CompareTriangleSides {

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
        triangleType = "scalene";
      break;
      case 1:
        triangleType = "isosceles";
      break;
      case 2:
        triangleType = "equilateral";
      break;
    }

    return triangleType;
  }


  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "TRIANGLE TYPE:\n" );
    System.out.println( "Type the lengths of the sides of the triangle" );

    float sides[] = new float[ 3 ];
    for ( int i = 0; i < 3; i++ ) {
      System.out.println( "Side " + i + ": " ); sides[i] = input.nextFloat();
    }

    String triangleType = compareTriangleSides( sides );
    System.out.println( "According to the given dimensions, the triangle is " + triangleType );

  }

}
