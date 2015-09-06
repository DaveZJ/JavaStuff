public class GARecursion
{
	private int theStep;
	private int theSize;
	private int current;
	private GARecursion tailRecur;
	private Sudoku theSudoku;
	private int[] colArray;
	private int[] rowArray;

	public GARecursion(int aStep, Sudoku aSudoku, int aSize, int[] aColArray, int[] aRowArray, int startval)
	{
		theStep = aStep;
		theSize = aSize;
		theSudoku = aSudoku;
		colArray = aColArray;
		rowArray = aRowArray;
		current = startval;
		if(theStep < theSize-1)
		{
			tailRecur = new GARecursion(theStep+1, theSudoku, theSize, colArray, rowArray, 0);
		}
	}

	public int nextRecursion()
	{
		if(theSudoku.SudokuSize() == 0)
		{
			return theSudoku.VerifySudoku();
		}

		if(0 < theSudoku.ReturnEntry(rowArray[theStep], colArray[theStep]).length())
		{
			return tailRecur.nextRecursion();
		}

		theSudoku.SetEntry(rowArray[theStep], colArray[theStep], (int)(theSudoku.ReturnOpList(rowArray[theStep],colArray[theStep]).charAt(current)) - 48);
		
		theSudoku.fillAllLists();
		theSudoku.FirstReduction();

			int stepsI = 0;
			int stepsII = 1;

				while(stepsI < stepsII)
				{
					stepsI = stepsII;
	
					if(theSudoku.HiddenSingle() == 1)
					{
						theSudoku.fillColList();
						theSudoku.fillRowList();
						theSudoku.fillSqList();
						theSudoku.Reduction();
						stepsII++;
					}
					
					if(stepsI == stepsII)
					{
						if(theSudoku.Single() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.LockedCandidatesCol() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.LockedCandidatesRow() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.LockedCandidatesSqCol() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.LockedCandidatesSqRow() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}
				
					if(stepsI == stepsII)
					{
						if(theSudoku.NakedCol() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.NakedRow() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.NakedSq() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.XCol() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.XRow() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.SwordCol() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(theSudoku.SwordRow() == 1)
						{
							theSudoku.fillColList();
							theSudoku.fillRowList();
							theSudoku.fillSqList();
							theSudoku.Reduction();
							stepsII++;
						}
					}

				}

		int recurval = 1;

		while(tailRecur.hasMoreConf() && 0 < recurval)
		{
			recurval = tailRecur.nextRecursion();
		}
		if(0 == recurval)
		{
			return 0;
		}
		current++;
		return 1;
	}

	public Sudoku ReturnSudoku()
	{
		return theSudoku;
	}

	public boolean hasMoreConf()
	{
		return current < (theSudoku.ReturnOpList(rowArray[theStep],colArray[theStep])).length();
	}
}