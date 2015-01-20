
public class Railroad extends Square
	{
	private static int numberOfRailroads;
	
	public Railroad (String o, int nRR, String n)
		{
		setOwner(o);
		numberOfRailroads = nRR;
		setName(n);
		}
	
	public static int countRRs()
		{
		return numberOfRailroads;
		}
	}
