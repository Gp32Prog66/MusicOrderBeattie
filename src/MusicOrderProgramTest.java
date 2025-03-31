

public class MusicOrderProgramTest {

	public static void main(String[] args) {
		//MusicOrderProgram c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
		MusicOrderProgram c[] = new MusicOrderProgram [11];
		
	
		c[1]= new MusicOrderProgram ("Evil Empire", "Rage Against The Machine",199.99,1,"MiniDisc");
		c[2] = new MusicOrderProgram("Bonded by Blood", "Exodus",8.79,2,"Compact Disc");
		c[3] = new MusicOrderProgram("Houses of the Holy", "Led Zeppelin", 16.88,1, "Vinyl");
		c[4] = new MusicOrderProgram("Master of Puppets", "Metallica", 15.00,1,"Compact Cassette");
		c[5] = new MusicOrderProgram("Green River", "Creedence Clearwater Revival", 77.00,1,"4 Track");
		c[6] = new MusicOrderProgram("Alive III", "KISS", 29.00, 1, "Digital Compact Cassette");
		c[7] = new MusicOrderProgram("Aqualung", "Jethro Tull", 1.99, 1, "8 Track");
		c[8] = new MusicOrderProgram("Hell Awaits", "Slayer", 24.99, 2, "Vinyl");
		c[9] = new MusicOrderProgram("Revolver", "The Beatles", 18.85, 1, "Vinyl");
		c[10] = new MusicOrderProgram("Waiting For The Sun", "The Doors", 59.99, 1, "Reel to Reel");
		
		double sumPrice = 0;
		for (int i = 1; i < c.length; i++)
		{
			System.out.print(c[i]);
			System.out.println("Prices " + c[i].Price());
			sumPrice = sumPrice + (c[i].Price() * c[i].Q());
		}
		System.out.printf("sum of prices: %1.2f", sumPrice  );
	}

}
