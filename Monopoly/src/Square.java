
public class Square
	{
	private String name, owner;

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
	

	@Override
	public String toString()
		{
		return "Square [name=" + name + "]";
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
