
public class Utility extends Square
	{
	private static int multiplier;
	private static int numberOfUtilities;
	
	public Utility (String n, String o, int nU)
		{
		setName(n);
		setOwner(o);
		numberOfUtilities = nU;
		}
	
	public static int rollMultiplierDice()
		{
		return multiplier;
		}
	}
