import java.util.ArrayList;

public class Player
	{
	private String playerName;
	private int money;
	static private int currentLocation;
	
	static ArrayList <String> inventory = new ArrayList<String>();
	
	public Player (String n, int m, int cl)
		{
		playerName = n;
		money = m;
		currentLocation = cl;
		}
	
	static Player p = new Player("Mike", 1500, 0);
	
	public String getPlayerName()
		{
		return playerName;
		}

	public int getMoney()
		{
		return money;
		}

	public int getCurrentLocation()
		{
		return currentLocation;
		}

	public void setPlayerName(String playerName)
		{
		this.playerName = playerName;
		}

	public void setMoney(int money)
		{
		this.money = money;
		}

	public void setCurrentLocation(int currentLocation)
		{
		Player.currentLocation = currentLocation;
		}

	public static int rollDice()
		{
		int die1 = (int) (Math.random() * 6) + 1;
		int die2 = (int) (Math.random() * 6) + 1;
		return die1 + die2;
		}
	
	public static int move(int cl)
		{
		int dieRoll = rollDice();
		if (p.getCurrentLocation() + dieRoll < 40)
			{
			System.out.println("Your current location is on" + Square.board[p.getCurrentLocation()].getName());
			p.setCurrentLocation(p.getCurrentLocation() + dieRoll);
			System.out.println("You rolled a " + dieRoll + " and landed on" + Square.board[p.getCurrentLocation()].getName());
			System.out.println();
			return p.getCurrentLocation();
			}
		else
			{
			System.out.println("Your current location is on " + Square.board[p.getCurrentLocation()]);
			p.setCurrentLocation(p.getCurrentLocation() + dieRoll - 40);
			System.out.println("You rolled a " + dieRoll + " and landed on" + Square.board[p.getCurrentLocation()]);
			System.out.println();
			System.out.println("You collect $200 for getting to Go.");
			p.setMoney(p.getMoney() + 200);
			System.out.println("Your new cash balance is $" + p.getMoney());
			return p.getCurrentLocation();
			}
		}
	
	public static void displayInventory()
		{
		System.out.println();
		for(String s : inventory)
			System.out.println(s);
		System.out.println();
		}

	}
