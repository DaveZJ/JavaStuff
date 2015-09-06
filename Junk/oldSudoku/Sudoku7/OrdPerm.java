public class OrdPerm
{
	private int mElem;
	private int pLength;
	private int current;
	private OrdPerm tailGen;

	public OrdPerm(int maxElem, int permLength, int initVal)
	{
		mElem = maxElem;
		pLength = permLength;
		current = initVal;
		if(pLength > 1)
		{
			tailGen = new OrdPerm(mElem, pLength - 1, current + 1);
		}
	}

	public String nextPerm()
	{
		if(pLength == 1)
		{
			current++;
			return "" + (current-1);
		}

		String r = "" + current + tailGen.nextPerm();

		if(!tailGen.hasMorePerm())
		{
			current++;
			if(current + pLength - 1 <= mElem)
			{
				tailGen = new OrdPerm(mElem, pLength-1, current+1);
			}
		}
		
		return r;
	}

	public boolean hasMorePerm()
	{
		return current + pLength - 1 <= mElem;
	}
}