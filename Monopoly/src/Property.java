
public class Property extends Square
	{
	private int location, cost, rent, costOfHouse, numberOfHouses, rentPerHouse, costOfHotel, hotelRent;
	private boolean hotel = false;
	private String colorGroup;
	
	public Property(String n, int l, String o, String cG, int c, int r, int cH, int nH, int rH, int cHot, int hr, boolean h)
		{
		setName(n);
		location = l;
		setOwner(o);
		colorGroup = cG;
		cost = c;
		rent = r;
		costOfHouse = cH;
		numberOfHouses = nH;
		rentPerHouse = rH;
		costOfHotel = cHot;
		hotelRent = hr;
		}

	public int getCost()
		{
		return cost;
		}

	public int getRent()
		{
		return rent;
		}

	public int getCostOfHouse()
		{
		return costOfHouse;
		}

	public int getNumberOfHouses()
		{
		return numberOfHouses;
		}

	public int getRentPerHouse()
		{
		return rentPerHouse;
		}

	public int getCostOfHotel()
		{
		return costOfHotel;
		}

	public int getHotelRent()
		{
		return hotelRent;
		}

	public boolean isHotel()
		{
		return hotel;
		}

	public String getColorGroup()
		{
		return colorGroup;
		}

	public void setCost(int cost)
		{
		this.cost = cost;
		}

	public void setRent(int rent)
		{
		this.rent = rent;
		}

	public void setCostOfHouse(int costOfHouse)
		{
		this.costOfHouse = costOfHouse;
		}

	public void setNumberOfHouses(int numberOfHouses)
		{
		this.numberOfHouses = numberOfHouses;
		}

	public void setRentPerHouse(int rentPerHouse)
		{
		this.rentPerHouse = rentPerHouse;
		}

	public void setCostOfHotel(int costOfHotel)
		{
		this.costOfHotel = costOfHotel;
		}

	public void setHotelRent(int hotelRent)
		{
		this.hotelRent = hotelRent;
		}

	public void setHotel(boolean hotel)
		{
		this.hotel = hotel;
		}

	public void setColorGroup(String colorGroup)
		{
		this.colorGroup = colorGroup;
		}
	
	
	}
