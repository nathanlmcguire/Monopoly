
public class Utility extends Square
	{
	private static int multiplier;
	private static int numberOfUtilities;
	
	public Utility (String o, int nU, String n)
		{
		setOwner(o);
		numberOfUtilities = nU;
		setName(n);
		}
	
	public static int rollMultiplierDice()
		{
		return multiplier;
		}
	}
