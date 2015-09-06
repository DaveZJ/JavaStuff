public class OrdSet
{
	public String SetList;
		
	public OrdSet()
	{	
	}

	public void fillSet(String set)
	{
		SetList = set;
	}

	public String getSet()
	{
		return SetList;
	}

	public int size()
	{
		return SetList.length();
	}

	public int isSubset(String aString)
	{
		int state = 1;
		if(aString.length() == 0)
		{
			return state;
		}
		if(aString.length() <= SetList.length())
		{		
			int k = 0;
			for(int j = 0; j < aString.length(); j++)
			{
				while(k < SetList.length() && (int)(SetList.charAt(k)) < (int)(aString.charAt(j)) && state == 1)
				{
					k++;
				}
				if(k == SetList.length())
				{
					state = 0;
					return state;
				}
				else
				{
					if(aString.charAt(j) != SetList.charAt(k))
					{
						state = 0;
						return state;
					}
				}
			}
		}
		else
		{
			state = 0;
		}
		return state;
	}

	public int isSuperset(String aString)
	{
		int state = 1;
		if(SetList.length() == 0)
		{
			return state;
		}
		if(SetList.length() <= aString.length())
		{
			int k = 0;
			for(int j = 0; j < SetList.length(); j++)
			{
				while(k < aString.length() && (int)(aString.charAt(k)) < (int)(SetList.charAt(j)) && state == 1)
				{
					k++;
				}
				if(k == aString.length())
				{
					state = 0;
					return state;
				}
				else
				{
					if(SetList.charAt(j) != aString.charAt(k))
					{
						state = 0;
						return state;
					}
				}
			}
		}
		else
		{
			state = 0;
		}
		return state;
	}

	public int isEqual(String aString)
	{
		int state = 1;
		if(aString.length() != SetList.length())
		{
			state = 0;
			return state;
		}
		if(aString.length() != 0)
		{
			for(int j = 0; j < SetList.length(); j++)
			{
				if(SetList.charAt(j) != aString.charAt(j))
				{
					state = 0;
					return state;
				}
			}
		}
		return state;
	}

	public String union(String aString)
	{
		String tempString = "";
		if(aString.length() == 0)
		{
			return SetList;
		}
		
		if(SetList.length() == 0)
		{
			return aString;
		}

		int k = 0;
		int j = 0;
		for(int i = 0; i <= 9; i++)
		{
			int count = 0;
			if((int)(aString.charAt(k)) == i + 48)
			{
				count = 1;
				if(k < aString.length()-1)
				{
					k++;
				}
			}
			if((int)(SetList.charAt(j)) == i + 48)
			{
				count = 1;
				if(j < SetList.length()-1)
				{
					j++;
				}
			}
			if(count == 1)
			{
				tempString = tempString + i;
			}
		}
		return tempString;
	}

	public String intersect(String aString)
	{
		String tempString = "";
		
		if(aString.length() == 0 || SetList.length() == 0)
		{
			return tempString;
		}

		int k = 0;
		int j = 0;
		if(aString.length() == 0)
		{
			return tempString;
		}
		else
		{		
			for(int i = 0; i <= 9; i++)
			{
				int count = 0;
					if((int)(aString.charAt(k)) == i + 48)
					{
						count++;
						if(k < aString.length()-1)
						{
							k++;
						}
					}
				if((int)(SetList.charAt(j)) == i + 48)
				{
					count++;
					if(j < SetList.length()-1)
					{
						j++;
					}
				}
				if(count == 2)
				{
					tempString = tempString + i;
				}
			}
		}
		return tempString;
	}

	public String StringMinusSet(String aString)
	{
		String tempString = "";
		
		if(aString.length() == 0)
		{
			return tempString;
		}
		
		if(SetList.length() == 0)
		{
			return aString;
		}

		int k = 0;
		int j = 0;
		for(int i = 0; i <= 9; i++)
		{
			int count = 0;
			if((int)(aString.charAt(k)) == i + 48)
			{
				count = count + 1;
				if(k < aString.length()-1)
				{
					k++;
				}
			}
			if((int)(SetList.charAt(j)) == i + 48)
			{
				count = count + 2;
				if(j < SetList.length()-1)
				{
					j++;
				}
			}
			if(count == 1)
			{
				tempString = tempString + i;
			}
		}
		return tempString;
	}

	public String SetMinusString(String aString)
	{
		String tempString = "";

		if(aString.length() == 0)
		{
			return SetList;
		}
		
		if(SetList.length() == 0)
		{
			return tempString;
		}

		int k = 0;
		int j = 0;
		for(int i = 0; i <= 9; i++)
		{
			int count = 0;
			if((int)(aString.charAt(k)) == i + 48)
			{
				count = count + 2;
				if(k < aString.length()-1)
				{
					k++;
				}
			}
			if((int)(SetList.charAt(j)) == i + 48)
			{
				count = count + 1;
				if(j < SetList.length()-1)
				{
					j++;
				}
			}
			if(count == 1)
			{
				tempString = tempString + i;
			}
		}
		return tempString;
	}

	public String PermSet(int a)
	{
		String perm = "";
		OrdPerm generator = new OrdPerm(SetList.length()-1,a,0);
		while(generator.hasMorePerm())
		{
			String permString = generator.nextPerm();
			for(int j = 0; j < a; j++)
			{
				int theChar = (int)(permString.charAt(j))-48;
				perm = perm + ((int)(SetList.charAt(theChar))-48);
			}
		}		
		return perm;
	}
}