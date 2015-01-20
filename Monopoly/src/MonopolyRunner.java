
public class MonopolyRunner
	{

	public static void main(String[] args)
		{
		Player.move(Player.p.getCurrentLocation());
		}
	public static void readData()
		{
		for (int i = 0; i < 40; i++)
			{
			String typeOfSquare = file.next()
			if (typeOfSquare == "property")
				{
				String n = file.next();
				String o = "none";
				String cG = file.next();
				int c = file.nextInt();
				int r = file.nextInt();
				int cH = file.nextInt();
				int nH = file.nextInt();
				int rH = file.nextInt();
				int cHot = file.nextInt();
				int hr = file.nextInt();
				boolean h = false;
				Square.board[i] = new Property(n, o, cG, c, r, cH, nH, rH, cHot, hr, h);
				}
			else if (typeOfSquare == "utility")
				{
			
				}
			else if (typeOfSquare == "railroad")
				{
			
				}
			else if (typeOfSquare == "misc")
				{
			
				}
			}
		}
	}


