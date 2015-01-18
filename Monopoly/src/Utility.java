
public class Utility extends Square
	{
	private static int multiplier;
	private static int numberOfUtilities;
	
	public Utility (String n, int l, String o, int nU)
		{
		setName(n);
		location = l;
		setOwner(o);
		numberOfUtilities = nU;
		}
	
	public static int rollMultiplierDice()
		{
		return multiplier;
		}
	}
