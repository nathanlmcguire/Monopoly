import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Square
	{
	private String name, owner;
	private int cost;
	
	static Square [] board = new Square [40];
	
	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getOwner()
		{
		return owner;
		}

	public void setOwner(String owner)
		{
		this.owner = owner;
		}
	
	public int getCost()
		{
		return cost;
		}

	public void setCost(int cost)
		{
		this.cost = cost;
		}
	
	@Override
	public String toString()
		{
		return "Square [name=" + name + "]";
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
				int c = file.nextInt();
				String n = file.nextLine();
				Square.board[i] = new Utility(o, nU, c, n);
				}
			else if (typeOfSquare.equals("railroad"))
				{
				String o = "none";
				int nRR = 0;
				int c = file.nextInt();
				String n = file.nextLine();
				Square.board[i] = new Railroad(o, nRR, c, n);
				}
			else if (typeOfSquare.equals("misc"))
				{
				String o = "null";
				String n = file.nextLine();
				Square.board[i] = new Misc(o, n);
				}
			else if (typeOfSquare.equals("card"))
				{
				String o = "null";
				String n = file.nextLine();
				Square.board[i] = new Card(o, n);
				}
			}
		}
	
	public static void offerMenu(int loc)
		{
		if (Square.board[loc].getOwner().equals("none"))
			{
			
			Scanner userInput = new Scanner(System.in);
			System.out.println("This space in unowned.  The price is $" + Square.board[loc].getCost());
			if (Player.p.getMoney() >= Square.board[loc].getCost())
				{
				System.out.println("You have $" + Player.p.getMoney() + ".  (1) Purchase it  (2) Pass");
				int choice = userInput.nextInt();
				if (choice == 1)
					{
					purchase(loc);
					}
				}
			else System.out.println("I'm sorry, but you do not have enough cash to purchase this.");
			}
		}
	
	public static void purchase(int loc)
		{
		Player.p.setMoney(Player.p.getMoney() - Square.board[loc].getCost());
		Square.board[loc].setOwner(Player.p.getPlayerName());
		System.out.println("You have purchased" + Square.board[loc].getName() + ".");
		System.out.println("You have $" + Player.p.getMoney() + " remaining.");
		Player.inventory.add(Square.board[loc].getName());
		System.out.println();
		System.out.println("You now own the following properties:");
		Player.displayInventory();
		}

	public static void transferMoney()
		{
		}
	public static void trade()
		{
		}
	public boolean isPurchaseable()
		{
		return false;
		}
	
	}
