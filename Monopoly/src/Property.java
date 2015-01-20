
public class Property extends Square
	{
	private int numberOfProperties, cost, rent, costOfHouse, numberOfHouses, rent1H, rent2H, rent3H, rent4H, costOfHotel, hotelRent;
	private boolean hotel = false;
	private String colorGroup;
	
	public Property(String o, String cG, int nP, int c, int r, int cH, int nH, int r1H, int r2H, int r3H, int r4H, int hr, boolean h, String n)
		{
		setOwner(o);
		colorGroup = cG;
		numberOfProperties = nP;
		cost = c;
		rent = r;
		costOfHouse = cH;
		numberOfHouses = nH;
		rent1H = r1H;
		rent2H = r2H;
		rent3H = r3H;
		rent4H = r4H;
		hotelRent = hr;
		setName(n);
		}

	public boolean isPurchaseable()
		{
		return getOwner() == null;
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
