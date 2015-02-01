import java.util.Scanner;
import java.io.*;

public class MonopolyRunner
	{
	public static void main(String[] args) throws IOException
		{
		Square.readData();
		while (Player.p.getMoney() > 0)
			{
			Player.move(Player.p.getCurrentLocation());
			Square.offerMenu(Player.p.getCurrentLocation());
			}

		}
	}


