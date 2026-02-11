/* Garage class
*  Anderson, Franceschi
*/

import java.util.ArrayList;

public class Garage
{
  private ArrayList<Auto> cars;

  /**
  * Default constructor:<BR>
  * This constructor takes no parameter<BR>
  * Instantiates the ArrayList cars
  */
  public Garage( )
  {
    cars = new ArrayList<Auto>( );
  }

  /** getCars method
  * @return the cars array representing the summer job cars
  */
  public ArrayList<Auto> getCars( )
  {
    //modify this method to return the array representing the summer job cars
    return new ArrayList<Auto>( );
  }

  /**
  * Mutator method:<BR>
  * Allows client to set values of cars
  * <B>setCars</B> sets the values
  *   in <B>cars</B> to the values in newCars
  * @param newCars the new ArrayList of cars
  */
  public void setCars( ArrayList<Auto> newCars )
  {
    //modify this code to allow the client to set the value of the cars
  }

  /** toString
  * @return elements of cars one line per car
  *   elements within a line are separated by a space
  */
  public String toString( )
  {
    String returnString = "Cars in Garage\n";
    for ( Auto a : cars )
    {
      returnString += a + "\n";
    }

    return returnString;
  }

  /** equals
  * @param o    Garage object
  * @return     return true if elements of ArrayList in g are equal to
  *             corresponding elements in this object
  *             and ArrayLists have the same size
  */
  public boolean equals( Object o )
  {
    if ( ! ( o instanceof Garage ) )
      return false;
    else
    {
	   Garage g = (Garage) o;
      if ( cars.size( ) != g.cars.size( ) )
        return false;

      for ( int i = 0; i < cars.size( ); i++ )
      {
        if ( !cars.get( i ).equals( g.cars.get( i ) ) )
         return false;
      }

      return true;
    }
  }

  /**
  * occupancy method
  * Computes a description of the occupancy of the garage
  * @return a String, full if the number of cars is 100 or more,
  *   minimum if it is less than 25, normal load otherwise
  */
  public String occupancy( ){
    //Modify this code to return an occupancy statement for the garage.
    return "null";
  }

  /**
  * averageMiles method
  * Computes the average number of miles driven for all cars
  * @return a double, the average number of miles driven for all cars
  */
  public double averageMiles( )
  {
    //Modify this code to return the average number of miles driven for all cars
      return 0.0;
  }

  /**
  * totalGallons method
  * Computes the sum of all the gallons of gas for all cars in the garage
  * @return a double, the sum of all the gallons of gas for all cars in the garage
  */
  public double totalGallons( )
  {
    //modify this code to return the sum of all the galons of gas for all cars in the garage
    return 0;
  }

  /**
  * addCar method
  * Adds a Car object to the list of cars representing the garage
  */
  public void addCar( Auto car )
  {
    //modify this code to add a car to the list of cars
  }
}