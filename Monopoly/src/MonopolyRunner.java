import java.util.Scanner;
import java.io.*;

public class MonopolyRunner
	{

	public static void main(String[] args) throws IOException
		{
		readData();
		//Player.move(Player.p.getCurrentLocation());
		}
	public static void readData() throws IOException
		{
		Scanner file = new Scanner(new File("standard.txt"));
		for (int i = 0; i < 40; i++)
			{
			String typeOfSquare = file.next();

			if (typeOfSquare.equals("property"))
				{
				String o = "none";
				String cG = file.next();
				int nP = file.nextInt();
				int c = file.nextInt();
				int r = file.nextInt();
				int cH = file.nextInt();
				int nH = 0;
				int r1H = file.nextInt();
				int r2H = file.nextInt();
				int r3H = file.nextInt();
				int r4H = file.nextInt();
				int hr = file.nextInt();
				boolean h = false;
				String n = file.nextLine();
				Square.board[i] = new Property(o, cG, nP, c, r, cH, nH, r1H, r2H, r3H, r4H, hr, h, n);
				}
			else if (typeOfSquare.equals("utility"))
				{
				String o = "none";
				int nU = 0;
				String n = file.nextLine();
				Square.board[i] = new Utility(o, nU, n);
				}
			else if (typeOfSquare.equals("railroad"))
				{
				String o = "none";
				int nRR = 0;
				String n = file.nextLine();
				Square.board[i] = new Railroad(o, nRR, n);
				}
			else if (typeOfSquare.equals("misc"))
				{
				String n = file.nextLine();
				Square.board[i] = new Misc(n);
				}
			else if (typeOfSquare.equals("card"))
				{
				String n = file.nextLine();
				Square.board[i] = new Card(n);
				}
			}
		for (Square s : Square.board)
			System.out.println(s);
		}
	}


