public class Sudoku
{
	public String[][] SuList = new String[9][9];
	public String[][] OpList = new String[9][9];
	public int[][] SqList = new int[9][9];
	public int[][] RowList = new int[9][9];
	public int[][] ColList = new int[9][9];
	
	public Sudoku()
	{	
	}

	public void fillSudoku(String AI, String BI, String CI, String DI, String EI, String FI, String GI, 
		String HI, String II, String AII, String BII, String CII, String DII, String EII, String FII, 
		String GII, String HII, String III, String AIII, String BIII, String CIII, String DIII, String EIII, 
		String FIII, String GIII, String HIII, String IIII, String AIV, String BIV, String CIV, String DIV, 
		String EIV, String FIV, String GIV, String HIV, String IIV, String AV, String BV, String CV, 
		String DV, String EV, String FV, String GV, String HV, String IV, String AVI, String BVI, 
		String CVI, String DVI, String EVI, String FVI, String GVI, String HVI, String IVI, String AVII, 
		String BVII, String CVII, String DVII, String EVII, String FVII, String GVII, String HVII, 
		String IVII, String AVIII, String BVIII, String CVIII, String DVIII, String EVIII, String FVIII, 
		String GVIII, String HVIII, String IVIII, String AIX, String BIX, String CIX, String DIX, 
		String EIX, String FIX, String GIX, String HIX, String IIX)
	{
		SuList[0][0] = AI;
		SuList[1][0] = AII;
		SuList[2][0] = AIII;
		SuList[3][0] = AIV;
		SuList[4][0] = AV;
		SuList[5][0] = AVI;
		SuList[6][0] = AVII;
		SuList[7][0] = AVIII;
		SuList[8][0] = AIX;

		SuList[0][1] = BI;
		SuList[1][1] = BII;
		SuList[2][1] = BIII;
		SuList[3][1] = BIV;
		SuList[4][1] = BV;
		SuList[5][1] = BVI;
		SuList[6][1] = BVII;
		SuList[7][1] = BVIII;
		SuList[8][1] = BIX;

		SuList[0][2] = CI;
		SuList[1][2] = CII;
		SuList[2][2] = CIII;
		SuList[3][2] = CIV;
		SuList[4][2] = CV;
		SuList[5][2] = CVI;
		SuList[6][2] = CVII;
		SuList[7][2] = CVIII;
		SuList[8][2] = CIX;

		SuList[0][3] = DI;
		SuList[1][3] = DII;
		SuList[2][3] = DIII;
		SuList[3][3] = DIV;
		SuList[4][3] = DV;
		SuList[5][3] = DVI;
		SuList[6][3] = DVII;
		SuList[7][3] = DVIII;
		SuList[8][3] = DIX;

		SuList[0][4] = EI;
		SuList[1][4] = EII;
		SuList[2][4] = EIII;
		SuList[3][4] = EIV;
		SuList[4][4] = EV;
		SuList[5][4] = EVI;
		SuList[6][4] = EVII;
		SuList[7][4] = EVIII;
		SuList[8][4] = EIX;

		SuList[0][5] = FI;
		SuList[1][5] = FII;
		SuList[2][5] = FIII;
		SuList[3][5] = FIV;
		SuList[4][5] = FV;
		SuList[5][5] = FVI;
		SuList[6][5] = FVII;
		SuList[7][5] = FVIII;
		SuList[8][5] = FIX;

		SuList[0][6] = GI;
		SuList[1][6] = GII;
		SuList[2][6] = GIII;
		SuList[3][6] = GIV;
		SuList[4][6] = GV;
		SuList[5][6] = GVI;
		SuList[6][6] = GVII;
		SuList[7][6] = GVIII;
		SuList[8][6] = GIX;

		SuList[0][7] = HI;
		SuList[1][7] = HII;
		SuList[2][7] = HIII;
		SuList[3][7] = HIV;
		SuList[4][7] = HV;
		SuList[5][7] = HVI;
		SuList[6][7] = HVII;
		SuList[7][7] = HVIII;
		SuList[8][7] = HIX;

		SuList[0][8] = II;
		SuList[1][8] = III;
		SuList[2][8] = IIII;
		SuList[3][8] = IIV;
		SuList[4][8] = IV;
		SuList[5][8] = IVI;
		SuList[6][8] = IVII;
		SuList[7][8] = IVIII;
		SuList[8][8] = IIX;
	}

	public String ReturnOpList(int a, int b)
	{
		return OpList[a][b];
	}

	public void TestRun()
	{	
		OpList[0][0] = "" + 123;
	}

	public String ReturnEntry(int a, int b)
	{
		return SuList[a][b];
	}

	public void fillAllLists()
	{
		for(int i = 0; i<= 8; i++)
		{
			for(int k = 1; k<= 9; k++)
			{	
				ColList[i][k-1] = 1;
				int j = 0;
				while(j <= 8 && ColList[i][k-1] == 1)
				{
					if(SuList[j][i].length() == 1)
					{
						if(Integer.parseInt(SuList[j][i]) == k)
						{
							ColList[i][k-1] = 0;
						}
					}

					j++;
				}
				
				RowList[i][k-1] = 1;
				j = 0;
				while(j <= 8 && RowList[i][k-1] == 1)
				{
					if(SuList[i][j].length() == 1)
					{
						if(Integer.parseInt(SuList[i][j]) == k)
						{
							RowList[i][k-1] = 0;
						}
					}
					j++;
				}
				
				SqList[i][k-1] = 1;
				j = 0;
				while(j <= 8 && SqList[i][k-1] == 1)
				{
					int TheRow = 3*(int)(Math.floor(i/3))+(int)(Math.floor(j/3));
					int TheCol = 3*(i%3)+j%3;
					if(SuList[TheRow][TheCol].length() == 1)
					{
						if(Integer.parseInt(SuList[TheRow][TheCol]) == k)
						{
							SqList[i][k-1] = 0;
						}
					}
				j++;
				}
			}
		}
	}

	public void FirstReduction()
	{
		for(int i = 0; i <= 8; i++)
		{
			for(int j = 0; j <= 8; j++)
			{
				OpList[i][j] = "";
				for(int k = 1; k <= 9; k++)
				{
					if(SuList[i][j].length() == 0 && RowList[i][k-1] != 0 && ColList[j][k-1] != 0 && SqList[3*(int)(Math.floor(i/3))+(int)(Math.floor(j/3))][k-1] !=0)
					{
						OpList[i][j] = OpList[i][j] + k;
					}
				}
			}
		}
	}

	public void fillColList()
	{
		for(int i = 0; i<= 8; i++)
		{
			for(int k = 1; k<= 9; k++)
			{	
				int j = 0;
				while(j <= 8 && ColList[i][k-1] == 1)
				{
					if(SuList[j][i].length() == 1)
					{
						if(Integer.parseInt(SuList[j][i]) == k)
						{
							ColList[i][k-1] = 0;
						}
					}
					j++;
				}
			}
		}
	}

	public void fillRowList()
	{
		for(int i = 0; i<= 8; i++)
		{
			for(int k = 1; k<= 9; k++)
			{	
				int j = 0;
				while(j <= 8 && RowList[i][k-1] == 1)
				{
					if(SuList[i][j].length() == 1)
					{
						if(Integer.parseInt(SuList[i][j]) == k)
						{
							RowList[i][k-1] = 0;
						}
					}
					j++;
				}
			}
		}
	}

	public void fillSqList()
	{
		for(int i = 0; i<= 8; i++)
		{
			for(int k = 1; k<= 9; k++)
			{	
				int j = 0;
				while(j <= 8 && SqList[i][k-1] == 1)
				{
					int TheRow = 3*(int)(Math.floor(i/3))+(int)(Math.floor(j/3));
					int TheCol = 3*(i%3)+j%3;
					if(SuList[TheRow][TheCol].length() == 1)
					{
						if(Integer.parseInt(SuList[TheRow][TheCol]) == k)
						{
							SqList[i][k-1] = 0;
						}
					}
				j++;
				}
			}
		}
	}

	public int VerifySudoku()
	{
		int checksum = 0;
		int i = 0;
		while(i <= 8 && checksum == 0)
		{
			int j = 0;
			while(j <= 8 && checksum == 0)
			{
				checksum = checksum + RowList[i][j] + ColList[i][j] + SqList[i][j];
				j++;
			}
			i++;
		}
		return checksum;
	}

	public void Reduction()
	{
		for(int i = 0; i <= 8; i++)
		{
			for(int j = 0; j <= 8; j++)
			{
				if(SuList[i][j].length() == 1)
				{
					OpList[i][j] = "";
				}
				else
				{
					String tempString = "";
					for(int k = 1; k <= 9; k++)
					{
						int l = 0;
						while(l < OpList[i][j].length() && (int)(OpList[i][j].charAt(l)) <= k+48)
						{
							if((int)(OpList[i][j].charAt(l)) == k+48 && RowList[i][k-1] != 0 && ColList[j][k-1] != 0 && SqList[3*(int)(Math.floor(i/3))+(int)(Math.floor(j/3))][k-1] !=0)
							{
								tempString = tempString + k;
							}
						l++;
						}
					}
					OpList[i][j] = tempString;
				}
			}
		}
	}

	public int HiddenSingle()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			for(int k = 1; k <= 9; k++)
			{
				if(ColList[i][k-1] != 0)
				{
					int opt = 0;
					int jtemp = 0;
					for(int j = 0; j <= 8; j++)
					{
						int l = 0;
						while(l < OpList[j][i].length() && (int)(OpList[j][i].charAt(l)) <= k+48)
						{
							if((int)(OpList[j][i].charAt(l)) == k+48)
							{
								opt = opt + 1;
								jtemp = j;
							}
							l++;
						}
					}
					if(opt == 1)
					{
							SuList[jtemp][i] = "" + k;
							stepcount = 1;
							return stepcount;
					}
				}
				if(RowList[i][k-1] != 0)
				{
					int opt = 0;
					int jtemp = 0;
					for(int j = 0; j <= 8; j++)
					{
						int l = 0;
						while(l < OpList[i][j].length() && (int)(OpList[i][j].charAt(l)) <= k+48)
						{
							if((int)(OpList[i][j].charAt(l)) == k+48)
							{
								opt = opt + 1;
								jtemp = j;
							}
							l++;
						}
					}
					if(opt == 1)
					{
						SuList[i][jtemp] = "" + k;
						stepcount = 1;
						return stepcount;
					}
				}
				if(SqList[i][k-1] != 0)
				{
					int opt = 0;
					int jtemp = 0;
					for(int j = 0; j <= 8; j++)
					{
						int l = 0;
						int TheRow = 3*(int)(Math.floor(i/3))+(int)(Math.floor(j/3));
						int TheCol = 3*(i%3)+j%3;
						while(l < OpList[TheRow][TheCol].length() && (int)(OpList[TheRow][TheCol].charAt(l)) <= k+48)
						{
							if((int)(OpList[TheRow][TheCol].charAt(l)) == k+48)
							{
								opt = opt + 1;
								jtemp = j;
							}
							l++;
						}
					}
					if(opt == 1)
					{
						int TheRow = 3*(int)(Math.floor(i/3))+(int)(Math.floor(jtemp/3));
						int TheCol = 3*(i%3)+jtemp%3;
						SuList[TheRow][TheCol] = "" + k;
						stepcount = 1;
						return stepcount;
					}
				}
			}
		}
		return stepcount;
	}

	public int Single()
	{	
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			for(int j = 0; j <= 8; j++)
			{
				if(OpList[i][j].length() == 1)
				{
					SuList[i][j] = OpList[i][j];
					OpList[i][j] = "";
					stepcount = 1;
				}
			}
		}
		return stepcount;
	}

	public int LockedCandidatesCol()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			int RowZero = 3*(int)(Math.floor(i/3));
			int ColZero = 3*(i%3);
			for(int k = 1; k <=9 ; k++)
			{
				if(SqList[i][k-1] != 0)
				{
					int colcount = 0;
					int jcol = 0;
					for(int j = 0; j<= 2; j++)
					{
						int colcountTemp = colcount;
						int p = 0;
						while(p <= 2 && colcountTemp == colcount)
						{
							int l = 0;
							while(l < OpList[RowZero + p][ColZero + j].length() && (int)(OpList[RowZero + p][ColZero + j].charAt(l)) <= k+48 && colcount < 2)
							{
								if((int)(OpList[RowZero + p][ColZero + j].charAt(l)) == k+48)
								{
									colcount++;
									jcol = j;
								}
								l++;
							}
							p++;
						}
					}
					if(colcount == 1)
					{
						for(int q = 0; q <= 8; q++)
						{
							if(q < RowZero || RowZero + 2 < q)
							{
								int l = 0;
								while(l < OpList[q][ColZero + jcol].length() && (int)(OpList[q][ColZero + jcol].charAt(l)) <= k+48)
								{
									if((int)(OpList[q][ColZero + jcol].charAt(l)) == k+48)
									{
										String tempString = "";
										for(int m = 0; m < OpList[q][ColZero + jcol].length(); m++)
										{
											if(m != l)
											{
												int kvalue = (int)(OpList[q][ColZero + jcol].charAt(m))-48;
												tempString = tempString + kvalue;
											}
										}
										OpList[q][ColZero + jcol] = tempString;
										stepcount = 1;
									}
									l++;
								}
							}
						}
					}
				}				
			}
		}		
		return stepcount;
	}

	public int LockedCandidatesRow()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			int RowZero = 3*(int)(Math.floor(i/3));
			int ColZero = 3*(i%3);
			for(int k = 1; k <=9 ; k++)
			{
				if(SqList[i][k-1] != 0)
				{
					int rowcount = 0;
					int jrow = 0;
					for(int j = 0; j<= 2; j++)
					{
						int rowcountTemp = rowcount;
						int p = 0;
						while(p <= 2 && rowcountTemp == rowcount)
						{
							int l = 0;
							while(l < OpList[RowZero + j][ColZero + p].length() && (int)(OpList[RowZero + j][ColZero + p].charAt(l)) <= k+48 && rowcount < 2)
							{
								if((int)(OpList[RowZero + j][ColZero + p].charAt(l)) == k+48)
								{
									rowcount++;
									jrow = j;
								}
								l++;
							}
							p++;
						}
					}
					if(rowcount == 1)
					{
						for(int q = 0; q <= 8; q++)
						{
							if(q < ColZero || ColZero + 2 < q)
							{
								int l = 0;
								while(l < OpList[RowZero + jrow][q].length() && (int)(OpList[RowZero + jrow][q].charAt(l)) <= k+48)
								{
									if((int)(OpList[RowZero + jrow][q].charAt(l)) == k+48)
									{
										String tempString = "";
										for(int m = 0; m < OpList[RowZero + jrow][q].length(); m++)
										{
											if(m != l)
											{
												int kvalue = (int)(OpList[RowZero + jrow][q].charAt(m))-48;
												tempString = tempString + kvalue;
											}
										}
										OpList[RowZero + jrow][q] = tempString;
										stepcount = 1;
									}
									l++;
								}
							}
						}
					}
				}				
			}
		}		
		return stepcount;
	}

	public int LockedCandidatesSqCol()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			for(int k = 1; k <=9 ; k++)
			{
				if(ColList[i][k-1] != 0)
				{
					int sqcount = 0;
					int jsq = 0;
					for(int j = 0; j<= 2; j++)
					{
						int sqcountTemp = sqcount;
						int p = 0;
						while(p <= 2 && sqcountTemp == sqcount)
						{
							int l = 0;
							while(l < OpList[3*j+p][i].length() && (int)(OpList[3*j + p][i].charAt(l)) <= k+48 && sqcount < 2)
							{
								if((int)(OpList[3*j + p][i].charAt(l)) == k+48)
								{
									sqcount++;
									jsq = j;
								}
								l++;
							}
							p++;
						}
					}
					if(sqcount == 1)
					{
						for(int q = 0; q <= 8; q++)
						{
							int TheRow = 3*jsq+(int)(Math.floor(q/3));
							int TheCol = 3*(int)(Math.floor(i/3))+q%3;
							if(TheCol != i)
							{
								int l = 0;
								while(l < OpList[TheRow][TheCol].length() && (int)(OpList[TheRow][TheCol].charAt(l)) <= k+48)
								{
									if((int)(OpList[TheRow][TheCol].charAt(l)) == k+48)
									{
										String tempString = "";
										for(int m = 0; m < OpList[TheRow][TheCol].length(); m++)
										{
											if(m != l)
											{
												int kvalue = (int)(OpList[TheRow][TheCol].charAt(m))-48;
												tempString = tempString + kvalue;
											}
										}
										OpList[TheRow][TheCol] = tempString;
										stepcount = 1;
									}
									l++;
								}
							}
						}
					}
				}				
			}
		}		
		return stepcount;
	}

	public int LockedCandidatesSqRow()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			for(int k = 1; k <=9 ; k++)
			{
				if(RowList[i][k-1] != 0)
				{
					int sqcount = 0;
					int jsq = 0;
					for(int j = 0; j<= 2; j++)
					{
						int sqcountTemp = sqcount;
						int p = 0;
						while(p <= 2 && sqcountTemp == sqcount)
						{
							int l = 0;
							while(l < OpList[i][3*j+p].length() && (int)(OpList[i][3*j+p].charAt(l)) <= k+48 && sqcount < 2)
							{
								if((int)(OpList[i][3*j+p].charAt(l)) == k+48)
								{
									sqcount++;
									jsq = j;
								}
								l++;
							}
							p++;
						}
					}
					if(sqcount == 1)
					{
						for(int q = 0; q <= 8; q++)
						{
							int TheRow = 3*(int)(Math.floor(i/3))+(int)(Math.floor(q/3));
							int TheCol = 3*jsq + q%3;
							if(TheRow != i)
							{
								int l = 0;
								while(l < OpList[TheRow][TheCol].length() && (int)(OpList[TheRow][TheCol].charAt(l)) <= k+48)
								{
									if((int)(OpList[TheRow][TheCol].charAt(l)) == k+48)
									{
										String tempString = "";
										for(int m = 0; m < OpList[TheRow][TheCol].length(); m++)
										{
											if(m != l)
											{
												int kvalue = (int)(OpList[TheRow][TheCol].charAt(m))-48;
												tempString = tempString + kvalue;
											}
										}
										OpList[TheRow][TheCol] = tempString;
										stepcount = 1;
									}
									l++;
								}
							}
						}
					}
				}				
			}
		}		
		return stepcount;
	}
	
	public int NakedCol()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			String[] lList = new String[10];
			String[] llList = new String[7];

			for(int a = 0; a <= 9; a++)
			{
				lList[a] = "";
			}
			
			for(int b = 0; b <= 6; b++)
			{
				llList[b] = "";
			}

			for(int j = 0; j<=8; j++)
			{
				lList[OpList[j][i].length()] = lList[OpList[j][i].length()]+j;
				for(int m = 2; m <= 8; m++)
				{
					if(OpList[j][i].length() <= m)
					{
						llList[m-2] = llList[m-2]+j;
					}		
				}
			}
			for(int n = 3; n <= 3; n++)
			{
				if(lList[n].length() > 0)
				{
					for(int p = 0; p < lList[n].length(); p++)
					{
						String cellString = "";
						OrdSet mySet = new OrdSet();
						mySet.fillSet(OpList[(int)(lList[n].charAt(p))-48][i]);
						for(int q = 0; q < llList[n-2].length(); q++)
						{
							if(mySet.isSubset(OpList[(int)(llList[n-2].charAt(q))-48][i]) == 1)
							{
								cellString = cellString + ((int)(llList[n-2].charAt(q))-48);
							}
						}
						if(cellString.length() == n)
						{
							for(int s = 0; s <= 8; s++)
							{
								OrdSet sSet = new OrdSet();
								sSet.fillSet("" + s);
								if((mySet.intersect(OpList[s][i])).length() > 0 && (sSet.intersect(cellString)).length() == 0)
								{
									OpList[s][i] = mySet.StringMinusSet(OpList[s][i]);
									stepcount = 1;
								}
							}
						}
					}
					if(stepcount == 1)
					{
						return stepcount;
					}
				}
			}
		}
		return stepcount;
	}

/*	public int NakedCol()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			String[] lList = new String[10];
			String[] llList = new String[7];

			for(int a = 0; a <= 9; a++)
			{
				lList[a] = "";
			}
			
			for(int b = 0; b <= 6; b++)
			{
				llList[b] = "";
			}

			for(int j = 0; j<=8; j++)
			{
				lList[OpList[j][i].length()] = lList[OpList[j][i].length()]+j;
				for(int m = 2; m <= 8; m++)
				{
					if(OpList[j][i].length() <= m)
					{
						llList[m-2] = llList[m-2]+j;
					}		
				}
			}

			for(int n = 2; n <= 8; n++)
			{
				if(lList[n].length() > 0)
				{
					for(int p = 0; p < lList[n].length(); p++)
					{
						String cellString = "";
						OrdSet mySet = new OrdSet();
						mySet.fillSet(OpList[(int)(lList[n].charAt(p))-48][i]);
						for(int q = 0; q < llList[n-2].length(); q++)
						{
							if(mySet.isSubset(OpList[(int)(llList[n-2].charAt(q))-48][i]) == 1)
							{
								cellString = cellString + ((int)(llList[n-2].charAt(q))-48);
							}
						}
						if(cellString.length() == n)
						{
							for(int s = 0; s <= 8; s++)
							{
								OrdSet sSet = new OrdSet();
								sSet.fillSet(""+s);
								if((mySet.intersect(OpList[s][i])).length() > 0 && (sSet.intersect(cellString)).length() == 0)
								{
									OpList[s][i] = mySet.StringMinusSet(OpList[s][i]);
									stepcount = 1;							
								}
							}
						}
					}
				}
			}			
		}
		return stepcount;
	}*/

	public int NakedRow()
	{
		int stepcount = 0;
		for(int i = 0; i <= 8; i++)
		{
			String[] lList = new String[10];
			String[] llList = new String[7];

			for(int a = 0; a <= 9; a++)
			{
				lList[a] = "";
			}
			
			for(int b = 0; b <= 6; b++)
			{
				llList[b] = "";
			}

			for(int j = 0; j<=8; j++)
			{
				lList[OpList[i][j].length()] = lList[OpList[i][j].length()]+j;
				for(int m = 2; m <= 8; m++)
				{	
					if(OpList[i][j].length() <= m)
					{
						llList[m-2] = llList[m-2]+j;
					}				
				}
			}

			for(int n = 2; n <= 8; n++)
			{
				if(lList[n].length() > 0)
				{
					for(int p = 0; p < lList[n].length(); p++)
					{
						String cellString = "";
						OrdSet mySet = new OrdSet();
						mySet.fillSet(OpList[i][(int)(lList[n].charAt(p))-48]);
						for(int q = 0; q < llList[n-2].length(); q++)
						{
							if(mySet.isSubset(OpList[i][(int)(lList[n].charAt(p))-48]) == 1)
							{
								cellString = cellString + ((int)(llList[n-2].charAt(q))-48);
							}
						}
						if(cellString.length() == n)
						{
							for(int s = 0; s <= 8; s++)
							{
								OrdSet sSet = new OrdSet();
								sSet.fillSet(""+s);
								if((mySet.intersect(OpList[i][s])).length() > 0 && (sSet.intersect(cellString)).length() == 0)
								{
									OpList[i][s] = mySet.StringMinusSet(OpList[i][s]);
									stepcount = 1;
								}
							}
						}
					}
				}
			}			
		}
		return stepcount;
	}

}