
public class Railroad extends Square
	{
	private static int numberOfRailroads;
	
	public Railroad (String n, String o, int nRR)
		{
		setName(n);
		setOwner(o);
		numberOfRailroads = nRR;
		}
	
	public static int countRRs()
		{
		return numberOfRailroads;
		}
	}
