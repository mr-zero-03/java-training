import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Punto6 {

  public static boolean verifyAnagram( String word1, String word2, boolean verbose ) {
    boolean isAnagram = true;

    word1 = (word1.toLowerCase()).trim();
    word2 = (word2.toLowerCase()).trim();
    char[] word1Array = word1.toCharArray();
    char[] word2Array = word2.toCharArray();

    if( word1.length() == word2.length() ) {
      int word1Size = word1.length();
      List<Integer> word2UsedLetters = new ArrayList<Integer>();

      for( int i = 0; i < word1Size; i++ ) {

        if ( verbose ) { System.out.println( "-----------------Word1[" + i + "]: " + word1Array[i] ); }

        for( int j = 0; j < word1Size; j++ ) {

          if ( verbose ) { System.out.println( "Word2[" + j + "]: " + word2Array[j] ); }

          if( word2Array[j] == word1Array[i] ) {
            boolean wasUsedLetter = false;
            for( int k = 0; k < word2UsedLetters.size(); k++ ) {
              if( j == word2UsedLetters.get(k) ) {
                System.out.println("La letra Word2[" + j + "]: '" + word2Array[j] + "' coincide pero ya fue usada, se continúa verificando");
                wasUsedLetter = true;
              }
            }
            if ( wasUsedLetter ) { continue; }
            if ( verbose ) { System.out.println( "**COINCIDE Word1[" + i + "] con Word2[" + j + "]: " + word2Array[j] + "**" ); }
            word2UsedLetters.add( j );
            j = word1Size;
            System.out.println(Arrays.toString(word2UsedLetters.toArray()));
          } else if( j == word1Size-1 ) {
            if ( verbose ) { System.out.println( "xx No se encuentra la letra '" + word2Array[j] + "' en la palabra '" + word1 + "' xx" ); }
            isAnagram = false;
            i = word1Size;
          }

        }

      }

    } else {
      System.out.println( "\nLas palabras tienen distinto tamaño" );
      isAnagram = false;
    }


    return isAnagram;

  }

  public static void main( String[] args ) {

    Scanner input = new Scanner(System.in);

    System.out.println( "ANAGRAMA:" );
    System.out.print( "Digite la primera palabra: " );
    String word1 = input.next();
    System.out.print( "Digite la segunda palabra: " );
    String word2 = input.next();

    System.out.print( "¿Desea ver el proceso completo? (S = sí, N = no): " );
    char verboseChar = input.next().charAt(0);
    boolean verbose = false;
    if ( verboseChar == 'S' || verboseChar == 's' ) { verbose = true; }

    String isAnagram = ( verifyAnagram( word1, word2, verbose ) ) ? "" : "no" ;

    System.out.println( "\nLas palabras '" + word1 + "' y '" + word2 + "' " + isAnagram + " son anagramas." );

  }

}
