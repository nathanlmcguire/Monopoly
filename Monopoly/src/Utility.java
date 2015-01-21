
public class Utility extends Square
	{
	private static int multiplier;
	private static int numberOfUtilities;
	
	public Utility (String o, int nU, int c, String n)
		{
		setOwner(o);
		numberOfUtilities = nU;
		setCost(c);
		setName(n);
		}
	
	public static int rollMultiplierDice()
		{
		return multiplier;
		}
	}
