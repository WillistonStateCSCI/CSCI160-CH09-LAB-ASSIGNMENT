/* HotelRatings class
*  Anderson, Franceschi
*/

import java.text.DecimalFormat;
import java.util.Random;

public class HotelRatings
{
  private int [][] ratings;

  /**
  * Constructor:
  * Allows client to set beginning dimensions for ratings
  * This constructor takes two parameters
  * Generates random values for ratings between 1 and 5
  * @param numberHotels the number of hotels
  * @param numberYears  the number of years
  */
  public HotelRatings( int numberHotels, int numberYears )
  {
    //Add code here to randomly generate the hotel ratings
  }

  /** getRatings method
  * @return the ratings array representing the hotel ratings
  */
  public int [][] getRatings( )
  {
    //Modify this code to return the hotel ratings
    return new int[0][0];
  }

  /**
  * Mutator method:
  * Allows client to set values of ratings
  *   setRatings sets the values
  *   in ratings to the values in newRatings
  * @param ratings the new array for ratings
  */
  public void setRatings( int [][] ratings )
  {
    //Modify this code to setRatings
  }

  /** toString
  * @return elements of ratings one row per line
  *   elements within a row are separated by a tab
  */
  public String toString( )
  {
    String returnString = "Hotel\\Year\n\t";
    for ( int j = 0; j < ratings[0].length; j++ )
    {
      returnString += ( "\t" + j );
    }
    returnString += "\n";

    for ( int i = 0; i < ratings.length; i++ )
    {
      returnString += ( i + "\t\t" );
      for ( int j = 0; j < ratings[i].length; j++ )
      {
        returnString += ( ratings[i][j] + "\t" );
      }
      returnString += "\n";
    }

    return returnString;
  }

  /** equals
  * @param o    HotelRatings object
  * @return     returns true if elements of array in hr are equal to
  *             corresponding elements in this object
  *             and arrays are the same length
  */
  public boolean equals( Object o )
  {
	if ( ! ( o instanceof HotelRatings ) )
	   return false;
	else
	{
	  HotelRatings hr = (HotelRatings) o;
      if ( ratings.length != hr.ratings.length )
        return false;

      for ( int i = 0; i < ratings.length; i++ )
      {
        if ( ratings[i].length != ( hr.ratings )[i].length )
          return false;
        for ( int j = 0; j < ratings[i].length; j++ )
        {
          if ( ratings[i][j] != hr.ratings[i][j] )
            return false;
        }
      }
      return true;
    }
  }

  /**
  * fiveStarHotels method
  * Searches for the hotels that have at least one 5 star rating over the years
  * @return an array of ints, containing the indexes of the hotels
  *   that have at least one 5-star rating over the years
  */
  public int[] fiveStarHotels( )
  {
    //modify this code to return hotels that have at least one five start rating

    return new int[0];
  }

  /**
  * averageRatingForAll method
  * Computes the average rating for all hotels over the years
  * @return a double, the average rating for all hotels over the years
  */
  public double averageRatingForAll( )
  {
  //modify this code to return the average rating for all hotels over the year
  return 0.0;
  }

  /**
  * consistentFiveStarHotels method
  * returns the indexes of the hotels that have earned a five-star rating every year
  */
  public String consistentFiveStarHotels( ){
  //Modify this code to return the indices of hotels that have earned five stars every year
  return "";
  }

  /**
  * atLeastOneFiveStar method
  * Checks if at least one hotel has had a five star rating over the years
  * @return  true if at least one hotel has had at least
  *   one five-star rating over the years, false otherwise
  */
  public boolean atLeastOneFiveStar( )
  {
    //Modify this code to return true if at least one hotel has had at least one five star rating over the years.
    return false;
  }
}