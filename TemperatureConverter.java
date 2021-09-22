import java.util.Scanner;

public class TemperatureConverter {

  public static void main( String args [] ) {
    Scanner input = new Scanner( System.in );

    System.out.println( "TEMPERATURE CONVERSOR!\n" );
    System.out.println( "Enter celsius degrees to convert to other temperature measurements:" );

    double celciusDegrees = input.nextLong();

    System.out.println( "\n" + celciusDegrees + "°C in:" );
    System.out.println("-Fahrenheit: " + fahrenheit( celciusDegrees ) );
    System.out.println("-Kelvin: " + kelvin( celciusDegrees ) );
    System.out.println("-Rankine: " + rankine( celciusDegrees ) );
  }

  static double fahrenheit( double celciusDegrees ) {
    return ( ( celciusDegrees * 1.8 ) + 32 );
  }
  static double kelvin( double celciusDegrees ) {
    return ( celciusDegrees + 273.15 );
  }
  static double rankine( double celciusDegrees ) {
    return ( ( celciusDegrees * 1.8 ) + 491.67 );
  }
}
