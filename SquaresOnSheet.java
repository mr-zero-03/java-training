import java.util.Scanner;

public class SquaresOnSheet {

  static Double TOP_MARGIN = 1.0;
  static Double BOTTOM_MARGIN = 1.0;
  static Double LEFT_MARGIN = 0.5;
  static Double RIGHT_MARGIN = 0.5;
  static Double SQUARE_AREA = 0.25;


  public static int calculateSquares( double high, double width ){
    double highWithoutMargin = high - TOP_MARGIN - BOTTOM_MARGIN;
    double widthWithoutMargin = width - LEFT_MARGIN - RIGHT_MARGIN;

    double totalArea = highWithoutMargin * widthWithoutMargin;
    double squaresNumber = totalArea / SQUARE_AREA;
    int intSquaresNumber = (int)squaresNumber;

    return intSquaresNumber;
  }


  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "SQUARES ON THE SHEET\n" );
    System.out.println( "Calculate the amount of squares in a sheet having:" );
    System.out.println( "Top margin: " + TOP_MARGIN + "\nBottom margin: " + BOTTOM_MARGIN + "\nLeft margin: " + LEFT_MARGIN + "\nRight margin: " + RIGHT_MARGIN + "\nSquare area: " + SQUARE_AREA  + "\n");

    System.out.println( "Type the height of the sheet in cm:" );
    double high = input.nextDouble();
    System.out.println( "Type the width of the sheet in cm:" );
    double width = input.nextDouble();

    int squaresNumber = calculateSquares( high, width );

    System.out.println("\nThe amount of squares in a " + high + "x" + width + " sheet are " + squaresNumber );
  }
}
