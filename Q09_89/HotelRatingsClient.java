/* HotelRatings client
*  Anderson, Franceschi
*/

public class HotelRatingsClient
{
  public static void main( String [] args )
  {
    HotelRatings hr1 = new HotelRatings( 4, 3 );
    HotelRatings hr2 = new HotelRatings( 4, 3 );

    if ( hr1.equals( hr2 ) )
      System.out.println( "The hotel ratings are equal" );
    else
      System.out.println( "The hotel ratings are not equal" );

    int [][] temp = hr2.getRatings( );

    hr1.setRatings( temp );

    if ( hr1.equals( hr2 ) )
      System.out.println( "After changing hr1, the hotel ratings are equal" );
    else
      System.out.println( "After changing hr1, the hotel ratings are not equal" );

    System.out.println( "The ratings were" );
    System.out.println( hr1.toString( ) );

    int [] fiveStarHotelsAtLeastOnce = hr1.fiveStarHotels( );
    System.out.print( "Indexes of hotels having earned five stars at least once: ");
    if ( fiveStarHotelsAtLeastOnce.length > 0 )
    {
      for ( int i = 0; i < fiveStarHotelsAtLeastOnce.length; i++ )
      {
        System.out.print( fiveStarHotelsAtLeastOnce[i] + " " );
      }
    }
    else
      System.out.print( "None" );
    System.out.println( );

    System.out.println( "\nAverage rating of all hotels over the years: "
                      + hr1.averageRatingForAll( ) );

    System.out.println( "\nIndexes of hotels having earned five stars every year: "
                           + hr1.consistentFiveStarHotels( ) );

    System.out.println( "\nAt least one hotel has earned one star one year: "
                        + hr1.atLeastOneFiveStar( ) );
  }
}