public class Sudoku
{
	public String[][] SuList = new String[9][9];
	public int[][] SqList = new int[9][9];
	public int[][] RowList = new int[9][9];
	public int[][] ColList = new int[9][9];
	
	public Sudoku()
	{	
	}

	public void fillSudoku(String AI)
	{
		SuList[0][0] = AI;
	}

	public void fillColList()
	{
	}

	public String returnEntry()
	{
		String temp = "hej";
		return temp;
	}

	public void VerifySudoku()
	{
	}


	public void HiddenSingleI()
	{
	}
}