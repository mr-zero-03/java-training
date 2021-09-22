import java.util.Scanner;

public class MeasurementConversion {

  static double centimeters( double meters ){
    return( meters*100 );
  }

  static double milimeters( double meters ){
    return( meters*1000 );
  }

  static double feet( double meters ){
    return( meters*3.2808 );
  }

  static double inch( double meters ){
    return( meters*39.370 );
  }

  static double yards( double meters ){
    return( meters*1.0936 );
  }

  static double lightYears( double meters ){
    return( meters*0.00000000000000010570 );
  }

  static double angstrom( double meters ){
    return( meters / Math.pow( 10,-10 ) );
  }


  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese Metros:");
    double meters = input.nextInt();

    System.out.println( "Meters to Centimeters:" + centimeters( meters ) );
    System.out.println( "Meters to Milimeters:" + milimeters( meters ) );
    System.out.println( "Meters to Feet:" + feet( meters ) );
    System.out.println( "Meters to Inch:" + inch( meters ) );
    System.out.println( "Meters to Yards:" + yards( meters ) );
    System.out.println( "Meters to Light Years:" + lightYears( meters ) );
    System.out.println( "Meters to Angstrom:" + angstrom( meters ) );
  }
}
