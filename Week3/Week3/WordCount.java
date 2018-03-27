
public class WordCount {
	private String word;
	private int count;
	
	public WordCount(String w)
	{
		word =w;
		count = 1;
	}
	
	public WordCount(String w, int c)
	{
		word =w;
		count = c;
	}
	
	
	public int getCount()
	{
		return count;
	}
	public String getWord()
	{
		return word;
	}
	
	public void upCount()
	{
		count++;
	}
	
	public String toString()
	{
		String s ="["+word+"; "+count+"]";
		return s;
	}
	
	public WordCount clone()
	{
		return new WordCount(word, count);
	}
	
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if( o == this)
			return true;
		if(o instanceof WordCount)
		{
			WordCount ow = (WordCount) o;
			if(ow.word.compareTo(word) == 0)
				return true;
			else
				return false;
		}
		
		return false;
	}
	
}
