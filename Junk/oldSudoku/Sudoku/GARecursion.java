public class GARecursion
{
	private int theStep;
	private int theSize;
	private int current;
	private GARecursion tailRecur;
	private Sudoku theSudoku;

	public GARecursion(int aStep, Sudoku aSudoku, int aSize, int startval)
	{
		theStep = aStep;
		theSize = aSize;
		theSudoku = aSudoku;
		current = startval;
		if(theStep < theSize-1)
		{
			tailRecur = new GARecursion(theStep+1, theSudoku, theSize, 0);
		}
	}

	public int nextRecursion()
	{
		if(theSudoku.SudokuSize() == 0)
		{
			return theSudoku.VerifySudoku();
		}
		
		int iRow = 0;
		int iCol = 0;

		while(0 < (theSudoku.ReturnEntry(iRow,iCol)).length() && iRow < 9 && iCol < 9)
		{
			if(iCol < 8)
			{
				iCol++;
			}
			else
			{
				iCol = 0;
				iRow++;
			}
		}

		Sudoku tempSudoku = theSudoku;

		tempSudoku.SetEntry(iRow, iCol, (int)(tempSudoku.ReturnOpList(iRow,iCol).charAt(current)) - 48);
		
		tempSudoku.fillAllLists();
		tempSudoku.FirstReduction();

			int stepsI = 0;
			int stepsII = 1;

				while(stepsI < stepsII)
				{
					stepsI = stepsII;
	
					if(tempSudoku.HiddenSingle() == 1)
					{
						tempSudoku.fillColList();
						tempSudoku.fillRowList();
						tempSudoku.fillSqList();
						tempSudoku.Reduction();
						stepsII++;
					}
					
					if(stepsI == stepsII)
					{
						if(tempSudoku.Single() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.LockedCandidatesCol() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.LockedCandidatesRow() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.LockedCandidatesSqCol() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.LockedCandidatesSqRow() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}
				
					if(stepsI == stepsII)
					{
						if(tempSudoku.NakedCol() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.NakedRow() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.NakedSq() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.XCol() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.XRow() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.SwordCol() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(tempSudoku.SwordRow() == 1)
						{
							tempSudoku.fillColList();
							tempSudoku.fillRowList();
							tempSudoku.fillSqList();
							tempSudoku.Reduction();
							stepsII++;
						}
					}

				}

		int recurval = 1;

		while(0 < recurval)
		{
			recurval = tailRecur.nextRecursion();
		}
		if(recurval == 0)
		{
			return 0;
		}
		current++;
		if((theSudoku.ReturnOpList(iRow,iCol)).length() <= current)
		{
			tailRecur = new GARecursion(theStep+1, theSudoku, theSize, 0);
			return -1;
		}
		theSudoku = tempSudoku;
		return 1;
	}

	public Sudoku ReturnSudoku()
	{
		return theSudoku;
	}
}