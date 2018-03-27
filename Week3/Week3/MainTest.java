
import java.util.Scanner;

public class MainTest {

	
		
	private static Scanner reader;

	public static void main(String[] args) {
		SimpleArrayList<WordCount> wl = new SimpleArrayList<WordCount>(1000);
		reader = new Scanner(System.in);
		// Ä‘á»�c dá»¯ liá»‡u tá»« bÃ n phÃ­m
		String text = reader.nextLine();
		// tÃ¡ch dá»¯ liá»‡u thÃ nh cÃ¡c tá»« bá»Ÿi dáº¥u cÃ¡ch " "
		String[] tokens = text.split(" ");
		
		// thÃªm cÃ¡c tá»« vÃ o danh sÃ¡ch
		for(int i = 0 ; i < tokens.length ; i++)
		{
			WordCount w = new WordCount(tokens[i]);
			int id = wl.indexOf(w);
			// náº¿u tá»« chÆ°a cÃ³ trong danh sÃ¡ch
			if(id == -1)
			{
				wl.add(w);
			}
			else
			// náº¿u tá»« Ä‘Ã£ cÃ³ trong danh sÃ¡ch
			{
				wl.get(id).upCount();
			}
		}
		
		// sáº¯p xáº¿p báº±ng thuáº­t toÃ¡n sx chá»�n
		for(int i = 0 ; i < wl.size() -1 ; i++)
			for(int j = i+1 ; j < wl.size() ; j++)
			{
				if(wl.get(i).getCount() < wl.get(j).getCount() )
				{
					WordCount wi = wl.get(i).clone();
					WordCount wj = wl.get(j).clone();
					wl.set(i, wj);
					wl.set(j, wi);
				}
			}
		// in láº¡i danh sÃ¡ch
		for(WordCount w:wl)
		{
			System.out.println(w);
		}
		
		
	}

}
