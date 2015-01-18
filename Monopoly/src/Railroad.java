
public class Railroad extends Square
	{
	private static int numberOfRailroads;
	
	public Railroad (String n, int l, String o, int nRR)
		{
		setName(n);
		location = l;
		setOwner(o);
		numberOfRailroads = nRR;
		}
	
	public static int countRRs()
		{
		return numberOfRailroads;
		}
	}
