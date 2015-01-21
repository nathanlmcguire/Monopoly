
public class Railroad extends Square
	{
	private static int numberOfRailroads;
	
	public Railroad (String o, int nRR, int c, String n)
		{
		setOwner(o);
		numberOfRailroads = nRR;
		setCost(c);
		setName(n);
		}
	
	public static int countRRs()
		{
		return numberOfRailroads;
		}
	}
