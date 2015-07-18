/**
 * @author Esdras Cavalcanti
*/
public class BeerSong {

	int beerNum = 99;
	String word = "bottles";

	public void beerSong() {
		
		while (beerNum > 0)
		{
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println(beerNum + " Take one down. ");
			System.out.println(beerNum + " Pass it around. ");
			beerNum = beerNum - 1;
			
			if (beerNum == 1)
			{
				word = "bottle";
			}
			else if(beerNum == 0)
			{
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}
