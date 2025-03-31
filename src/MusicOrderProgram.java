

public class MusicOrderProgram 
{
	private String Title;
	private String Artist;
	private double Price;
	private int Quantity;
	private String Format;
	
	
	public MusicOrderProgram (String T, String A, double P, int Q, String F)
	{
		Title = T;
		Artist = A;
		Price = P;
		Quantity = Q;
		Format = F;
	}
	public String toString()
	{
		return "Title: " + Title + "\n" +
	"Artist: " + Artist + "\n" +
							"Price: " + Price + "\n" +
	"Quantity: " + Quantity + "\n" +
		"Format: " + Format + "\n";		
		
				
	}
	
	public double Price ()
	{
		double sum = 0;
		for (int i = 1; i <=10; i++)
		{
			sum = Price;
		}
		
		
		return sum;
	}
	public int Q()
	{
		int Qty = 0;
		Qty = Quantity;
		return Qty;
	}
}
