import java.util.Scanner;

public class TimeToSeconds {

  static int toSeconds( int hours,int minutes,int seconds ){
    int totalSeconds = ( ( hours * 3600) + ( minutes * 60 ) + seconds );

    return totalSeconds;
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "TIME TO SECONDS:\n" );
    System.out.println( "Number of hours:" );
    int hours = input.nextInt();

    System.out.println( "Number of minutes:" );
    int minutes = input.nextInt();

    System.out.println( "Number of seconds:" );
    int seconds = input.nextInt();

    int secondsPassed = toSeconds(hours,minutes,seconds);

    System.out.println( "\nSince midnigth have passed " + secondsPassed + " seconds." );
  }
}
