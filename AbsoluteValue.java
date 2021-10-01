import java.util.Scanner;

public class AbsoluteValue {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "ABSOLUTE VALUE:\n" );
    System.out.println( "Type your number:" );
    float value = input.nextFloat();

    System.out.println( "The absolute value of your number is::" );

    float absoluteValue = Math.abs( value );
    System.out.println( "|" + value + "| = " + absoluteValue );

  }

}
