import java.util.Scanner;

public class OddOrEven {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "ODD OR EVEN:\n" );
    System.out.println( "Type your number:" );
    float value = input.nextFloat();

    String oddEven = "";
    if ( value % 2 == 0 ) {
      oddEven = "odd";
    } else {
      oddEven = "even";
    }

    System.out.println( "Your number is " + oddEven );

  }

}
