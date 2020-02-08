
import java.io.*;

public class MonopolyRunner
	{
	public static void main(String[] args) throws IOException
		{
		//THE ONE TRUE MCGUIRE
		//Still needs a little help
		int uselessVariable = 0;
		Square.chooseTheme();
		Square.readData();
		while (Player.p.getMoney() > 0)
			{
			Player.move(Player.p.getCurrentLocation());
			Square.offerMenu(Player.p.getCurrentLocation());
			}
		}
	}


