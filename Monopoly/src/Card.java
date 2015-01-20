
public class Card extends Square
	{
	private String typeOfCard;
	private String cardContents;
	
	public Card (String n)
		{
		setName(n);
		}
	
	public String getCardContents()
		{
		return cardContents;
		}

	public void setCardContents(String cardContents)
		{
		this.cardContents = cardContents;
		}

	public static void changeLocation()
		{
		
		}
	}
