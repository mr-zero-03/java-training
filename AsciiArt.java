import java.util.Scanner;

public class AsciiArt{

  static void owl() {
    System.out.println( " /\\ /\\" );
    System.out.println( "((ovo))" );
    System.out.println( "():::()" );
    System.out.println( "  VVV" );    
  }

  static void dog() {
    System.out.println( "                             .-." );
    System.out.println( "(___________________________()6 `-," );
    System.out.println( "(   ______________________   /'''`" );
    System.out.println( "//\\\\                      //\\\\" );
    System.out.println( "'' ''                     '' ''" );
  }

  static void origami() {
    System.out.println( "        _____                   /|" );
    System.out.println( "        |   \\      ____        / |" );
    System.out.println( "  __    |    \\    /\\   |      /  ;" );
    System.out.println( " /\\  \\  |     \\  /  \\  |     /  ;" );
    System.out.println( "/,'\\  \\ |      \\/  : \\ |    /   ;" );
    System.out.println( "~  ;   \\|      /   :  \\|   /   ;" );
    System.out.println( "   |    \\     /   :'  |   /    ;" );
    System.out.println( "   |     \\   /    :   |  /    ;" );
    System.out.println( "   |      \\ /    :'   | /     ;" );
    System.out.println( "   |       /     :    |/     ;" );
    System.out.println( "   |      /     :'    |      ;" );
    System.out.println( "    \\    /      :     |     ;" );
    System.out.println( "     \\  /      :'     |     ;" );
    System.out.println( "      \\       :'      |    ;" );
    System.out.println( "       \\______:_______|___;" );
  }

  static void cubes() {
    System.out.println( "+------+.      +------+       +------+       +------+      .+------+" );
    System.out.println( "|`.    | `.    |\\     |\\      |      |      /|     /|    .' |    .'|" );
    System.out.println( "|  `+--+---+   | +----+-+     +------+     +-+----+ |   +---+--+'  |" );
    System.out.println( "|   |  |   |   | |    | |     |      |     | |    | |   |   |  |   |" );
    System.out.println( "+---+--+.  |   +-+----+ |     +------+     | +----+-+   |  .+--+---+" );
    System.out.println( " `. |    `.|    \\|     \\|     |      |     |/     |/    |.'    | .'" );
    System.out.println( "   `+------+     +------+     +------+     +------+     +------+'" );
  }


  public static void main( String[] args ) {

    Scanner input = new Scanner( System.in );

    int opcion = 0;
    do {
      System.out.println( "**-------------------**" );
      System.out.println( "       ASCII ART!\n" );
      System.out.println( "1. Owl" );
      System.out.println( "2. Dog" );
      System.out.println( "3. Origami" );
      System.out.println( "4. Cubes" );
      System.out.println( "5. Exit" );
      System.out.println( "**-------------------**" );

      System.out.println( "\nPlease, select the painting you want to see:" );
      opcion = input.nextInt();

      switch( opcion ) {
        case 1:
          owl();
        break;
        case 2:
          dog();
        break;
        case 3:
          origami();
        break;
        case 4:
          cubes();
        break;
        case 5:
          System.out.println( "\nThanks for comming to the museum! See you the next time." );
        break;
        default:
          System.out.println( "\nThe selected option is not valid." );
      }

    System.out.println( "\n\n\n" );

    } while( opcion != 5 );

  }

}
