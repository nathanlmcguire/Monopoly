
public class Card extends Square
	{
	private String typeOfCard;
	private String cardContents;
	
	public Card (String n, String o, String t, String c)
		{
		setName(n);
		setOwner(o);
		typeOfCard = t;
		cardContents = c;
		}
	
	public String getTypeOfCard()
		{
		return typeOfCard;
		}

	public String getCardContents()
		{
		return cardContents;
		}

	public void setTypeOfCard(String typeOfCard)
		{
		this.typeOfCard = typeOfCard;
		}

	public void setCardContents(String cardContents)
		{
		this.cardContents = cardContents;
		}

	public static void changeLocation()
		{
		
		}
	}
