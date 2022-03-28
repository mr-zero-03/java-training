import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

  public static float[] sortArray( float array[] ) {

    int countArray = array.length;
    for( int i = 1; i < countArray; i++ ) {
      float temp = array[ i ];
      int j = i - 1;

      while( ( j >= 0 ) && ( array[ j ] > temp ) ) {
        array[ j + 1 ] = array[ j ];
        j--;
      }
      array[ j + 1 ] = temp;
    }

    return( array );
  }

  public static float[] receiveArrayValues() {

    Scanner input = new Scanner(System.in);

    //Array Size
    System.out.print( "Cantidad de números a ser ordenados: " );
    int arraySize = input.nextInt();

    float[] array = new float[ arraySize ];

    //Array Values
    System.out.println( "Valores:" );

    for( int i = 0; i < arraySize; i++ ) {
      System.out.print( "  Valor para la posición '" + i + "' del array: " );
      array[ i ] = input.nextFloat();
    }

    return( array );
  }

  public static void main( String[] args ) {

    System.out.println( "--INSERTION SORT--\n\n" );

    float[] array = receiveArrayValues();

    System.out.println( "\nEl array a ser ordenado es: " );
    System.out.println( Arrays.toString( array ) );

    array = sortArray( array );

    System.out.println( "El array ordenado es: " );
    System.out.println( Arrays.toString( array ) );

  }

}
