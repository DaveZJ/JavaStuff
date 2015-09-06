import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Rectangle;

public class RectangleFrame extends JFrame
{
	public Sudoku mySudoku = new Sudoku();

	public RectangleFrame()
	{	
		createControlPanel();
	}

	private void createControlPanel()
	{
		final JTextField AIField = new JTextField(1);
		final JTextField BIField = new JTextField(1);
		final JTextField CIField = new JTextField(1);
		final JTextField DIField = new JTextField(1);
		final JTextField EIField = new JTextField(1);
		final JTextField FIField = new JTextField(1);
		final JTextField GIField = new JTextField(1);
		final JTextField HIField = new JTextField(1);
		final JTextField IIField = new JTextField(1);

		final JTextField AIIField = new JTextField(1);
		final JTextField BIIField = new JTextField(1);
		final JTextField CIIField = new JTextField(1);
		final JTextField DIIField = new JTextField(1);
		final JTextField EIIField = new JTextField(1);
		final JTextField FIIField = new JTextField(1);
		final JTextField GIIField = new JTextField(1);
		final JTextField HIIField = new JTextField(1);
		final JTextField IIIField = new JTextField(1);

		final JTextField AIIIField = new JTextField(1);
		final JTextField BIIIField = new JTextField(1);
		final JTextField CIIIField = new JTextField(1);
		final JTextField DIIIField = new JTextField(1);
		final JTextField EIIIField = new JTextField(1);
		final JTextField FIIIField = new JTextField(1);
		final JTextField GIIIField = new JTextField(1);
		final JTextField HIIIField = new JTextField(1);
		final JTextField IIIIField = new JTextField(1);

		final JTextField AIVField = new JTextField(1);
		final JTextField BIVField = new JTextField(1);
		final JTextField CIVField = new JTextField(1);
		final JTextField DIVField = new JTextField(1);
		final JTextField EIVField = new JTextField(1);
		final JTextField FIVField = new JTextField(1);
		final JTextField GIVField = new JTextField(1);
		final JTextField HIVField = new JTextField(1);
		final JTextField IIVField = new JTextField(1);

		final JTextField AVField = new JTextField(1);
		final JTextField BVField = new JTextField(1);
		final JTextField CVField = new JTextField(1);
		final JTextField DVField = new JTextField(1);
		final JTextField EVField = new JTextField(1);
		final JTextField FVField = new JTextField(1);
		final JTextField GVField = new JTextField(1);
		final JTextField HVField = new JTextField(1);
		final JTextField IVField = new JTextField(1);

		final JTextField AVIField = new JTextField(1);
		final JTextField BVIField = new JTextField(1);
		final JTextField CVIField = new JTextField(1);
		final JTextField DVIField = new JTextField(1);
		final JTextField EVIField = new JTextField(1);
		final JTextField FVIField = new JTextField(1);
		final JTextField GVIField = new JTextField(1);
		final JTextField HVIField = new JTextField(1);
		final JTextField IVIField = new JTextField(1);

		final JTextField AVIIField = new JTextField(1);
		final JTextField BVIIField = new JTextField(1);
		final JTextField CVIIField = new JTextField(1);
		final JTextField DVIIField = new JTextField(1);
		final JTextField EVIIField = new JTextField(1);
		final JTextField FVIIField = new JTextField(1);
		final JTextField GVIIField = new JTextField(1);
		final JTextField HVIIField = new JTextField(1);
		final JTextField IVIIField = new JTextField(1);

		final JTextField AVIIIField = new JTextField(1);
		final JTextField BVIIIField = new JTextField(1);
		final JTextField CVIIIField = new JTextField(1);
		final JTextField DVIIIField = new JTextField(1);
		final JTextField EVIIIField = new JTextField(1);
		final JTextField FVIIIField = new JTextField(1);
		final JTextField GVIIIField = new JTextField(1);
		final JTextField HVIIIField = new JTextField(1);
		final JTextField IVIIIField = new JTextField(1);
		
		final JTextField AIXField = new JTextField(1);
		final JTextField BIXField = new JTextField(1);
		final JTextField CIXField = new JTextField(1);
		final JTextField DIXField = new JTextField(1);
		final JTextField EIXField = new JTextField(1);
		final JTextField FIXField = new JTextField(1);
		final JTextField GIXField = new JTextField(1);
		final JTextField HIXField = new JTextField(1);
		final JTextField IIXField = new JTextField(1);
		
		JButton solveButton = new JButton("Solve");
		JButton clearButton = new JButton("Clear");
		JButton verifyButton = new JButton("Verify");
		JButton forceButton = new JButton("Brute force");

		class clearButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				AIField.setText("");
				BIField.setText("");
				CIField.setText("");
				DIField.setText("");
				EIField.setText("");
				FIField.setText("");
				GIField.setText("");
				HIField.setText("");
				IIField.setText("");

				AIIField.setText("");
				BIIField.setText("");
				CIIField.setText("");
				DIIField.setText("");
				EIIField.setText("");
				FIIField.setText("");
				GIIField.setText("");
				HIIField.setText("");
				IIIField.setText("");

				AIIIField.setText("");
				BIIIField.setText("");
				CIIIField.setText("");
				DIIIField.setText("");
				EIIIField.setText("");
				FIIIField.setText("");
				GIIIField.setText("");
				HIIIField.setText("");
				IIIIField.setText("");

				AIVField.setText("");
				BIVField.setText("");
				CIVField.setText("");
				DIVField.setText("");
				EIVField.setText("");
				FIVField.setText("");
				GIVField.setText("");
				HIVField.setText("");
				IIVField.setText("");

				AVField.setText("");
				BVField.setText("");
				CVField.setText("");
				DVField.setText("");
				EVField.setText("");
				FVField.setText("");
				GVField.setText("");
				HVField.setText("");
				IVField.setText("");

				AVIField.setText("");
				BVIField.setText("");
				CVIField.setText("");
				DVIField.setText("");
				EVIField.setText("");
				FVIField.setText("");
				GVIField.setText("");
				HVIField.setText("");
				IVIField.setText("");

				AVIIField.setText("");
				BVIIField.setText("");
				CVIIField.setText("");
				DVIIField.setText("");
				EVIIField.setText("");
				FVIIField.setText("");
				GVIIField.setText("");
				HVIIField.setText("");
				IVIIField.setText("");

				AVIIIField.setText("");
				BVIIIField.setText("");
				CVIIIField.setText("");
				DVIIIField.setText("");
				EVIIIField.setText("");
				FVIIIField.setText("");
				GVIIIField.setText("");
				HVIIIField.setText("");
				IVIIIField.setText("");

				AIXField.setText("");
				BIXField.setText("");
				CIXField.setText("");
				DIXField.setText("");
				EIXField.setText("");
				FIXField.setText("");
				GIXField.setText("");
				HIXField.setText("");
				IIXField.setText("");
			}
		}

		class forceButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				/*
				IIField.setText(mySudoku.ReturnOpList(Integer.parseInt(HIXField.getText()),Integer.parseInt(IIXField.getText())));
				
				OrdSet TheSet = new OrdSet();
				TheSet.fillSet(AIField.getText());
				IIField.setText(TheSet.StringMinusSet(BIField.getText()));
				*/
			}
		}

		class solveButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				int stepsI = 0;
				int stepsII = 1;
				mySudoku.fillSudoku(AIField.getText(), BIField.getText(),
					CIField.getText(), DIField.getText(),
					EIField.getText(), FIField.getText(),
					GIField.getText(), HIField.getText(),
					IIField.getText(), AIIField.getText(),
					BIIField.getText(), CIIField.getText(),
					DIIField.getText(), EIIField.getText(),
					FIIField.getText(), GIIField.getText(),
					HIIField.getText(), IIIField.getText(),
					AIIIField.getText(), BIIIField.getText(),
					CIIIField.getText(), DIIIField.getText(),
					EIIIField.getText(), FIIIField.getText(),
					GIIIField.getText(), HIIIField.getText(),
					IIIIField.getText(), AIVField.getText(),
					BIVField.getText(), CIVField.getText(),
					DIVField.getText(), EIVField.getText(),
					FIVField.getText(), GIVField.getText(),
					HIVField.getText(), IIVField.getText(),
					AVField.getText(), BVField.getText(),
					CVField.getText(), DVField.getText(),
					EVField.getText(), FVField.getText(),
					GVField.getText(), HVField.getText(),
					IVField.getText(), AVIField.getText(),
					BVIField.getText(), CVIField.getText(),
					DVIField.getText(), EVIField.getText(),
					FVIField.getText(), GVIField.getText(),
					HVIField.getText(), IVIField.getText(),
					AVIIField.getText(), BVIIField.getText(),
					CVIIField.getText(), DVIIField.getText(),
					EVIIField.getText(), FVIIField.getText(),
					GVIIField.getText(), HVIIField.getText(),
					IVIIField.getText(), AVIIIField.getText(),
					BVIIIField.getText(), CVIIIField.getText(),
					DVIIIField.getText(), EVIIIField.getText(),
					FVIIIField.getText(), GVIIIField.getText(),
					HVIIIField.getText(), IVIIIField.getText(),
					AIXField.getText(), BIXField.getText(),
					CIXField.getText(), DIXField.getText(),
					EIXField.getText(), FIXField.getText(),
					GIXField.getText(), HIXField.getText(),
					IIXField.getText());
				mySudoku.fillAllLists();
				mySudoku.FirstReduction();

				int hcount = 0;
				while(stepsI < stepsII)
				{
					stepsI = stepsII;
/*
					mySudoku.NakedCol(0,0);
					mySudoku.fillColList();
					mySudoku.fillRowList();
					mySudoku.fillSqList();
					mySudoku.Reduction();
*/				
					if(mySudoku.HiddenSingle() == 1 && hcount == 0)
					{
						mySudoku.fillColList();
						mySudoku.fillRowList();
						mySudoku.fillSqList();
						mySudoku.Reduction();
						stepsII++;
					}
					
					if(stepsI == stepsII && hcount == 0)
					{
						if(mySudoku.Single() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII && hcount == 0)
					{
						if(mySudoku.LockedCandidatesCol() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII && hcount == 0)
					{
						if(mySudoku.LockedCandidatesRow() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII && hcount == 0)
					{
						if(mySudoku.LockedCandidatesSqCol() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII && hcount == 0)
					{
						if(mySudoku.LockedCandidatesSqRow() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
						}
					}

					if(stepsI == stepsII)
					{
						if(mySudoku.NakedCol() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
							hcount = 1;
						}
					}

/*					if(stepsI == stepsII)
					{
						if(mySudoku.NakedRow() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
						}
					}*/
				}

				AIField.setText(mySudoku.ReturnEntry(0,0));
				BIField.setText(mySudoku.ReturnEntry(0,1));
				CIField.setText(mySudoku.ReturnEntry(0,2));
				DIField.setText(mySudoku.ReturnEntry(0,3));
				EIField.setText(mySudoku.ReturnEntry(0,4));
				FIField.setText(mySudoku.ReturnEntry(0,5));
				GIField.setText(mySudoku.ReturnEntry(0,6));
				HIField.setText(mySudoku.ReturnEntry(0,7));
				IIField.setText(mySudoku.ReturnEntry(0,8));

				AIIField.setText(mySudoku.ReturnEntry(1,0));
				BIIField.setText(mySudoku.ReturnEntry(1,1));
				CIIField.setText(mySudoku.ReturnEntry(1,2));
				DIIField.setText(mySudoku.ReturnEntry(1,3));
				EIIField.setText(mySudoku.ReturnEntry(1,4));
				FIIField.setText(mySudoku.ReturnEntry(1,5));
				GIIField.setText(mySudoku.ReturnEntry(1,6));
				HIIField.setText(mySudoku.ReturnEntry(1,7));
				IIIField.setText(mySudoku.ReturnEntry(1,8));

				AIIIField.setText(mySudoku.ReturnEntry(2,0));
				BIIIField.setText(mySudoku.ReturnEntry(2,1));
				CIIIField.setText(mySudoku.ReturnEntry(2,2));
				DIIIField.setText(mySudoku.ReturnEntry(2,3));
				EIIIField.setText(mySudoku.ReturnEntry(2,4));
				FIIIField.setText(mySudoku.ReturnEntry(2,5));
				GIIIField.setText(mySudoku.ReturnEntry(2,6));
				HIIIField.setText(mySudoku.ReturnEntry(2,7));
				IIIIField.setText(mySudoku.ReturnEntry(2,8));

				AIVField.setText(mySudoku.ReturnEntry(3,0));
				BIVField.setText(mySudoku.ReturnEntry(3,1));
				CIVField.setText(mySudoku.ReturnEntry(3,2));
				DIVField.setText(mySudoku.ReturnEntry(3,3));
				EIVField.setText(mySudoku.ReturnEntry(3,4));
				FIVField.setText(mySudoku.ReturnEntry(3,5));
				GIVField.setText(mySudoku.ReturnEntry(3,6));
				HIVField.setText(mySudoku.ReturnEntry(3,7));
				IIVField.setText(mySudoku.ReturnEntry(3,8));

				AVField.setText(mySudoku.ReturnEntry(4,0));
				BVField.setText(mySudoku.ReturnEntry(4,1));
				CVField.setText(mySudoku.ReturnEntry(4,2));
				DVField.setText(mySudoku.ReturnEntry(4,3));
				EVField.setText(mySudoku.ReturnEntry(4,4));
				FVField.setText(mySudoku.ReturnEntry(4,5));
				GVField.setText(mySudoku.ReturnEntry(4,6));
				HVField.setText(mySudoku.ReturnEntry(4,7));
				IVField.setText(mySudoku.ReturnEntry(4,8));

				AVIField.setText(mySudoku.ReturnEntry(5,0));
				BVIField.setText(mySudoku.ReturnEntry(5,1));
				CVIField.setText(mySudoku.ReturnEntry(5,2));
				DVIField.setText(mySudoku.ReturnEntry(5,3));
				EVIField.setText(mySudoku.ReturnEntry(5,4));
				FVIField.setText(mySudoku.ReturnEntry(5,5));
				GVIField.setText(mySudoku.ReturnEntry(5,6));
				HVIField.setText(mySudoku.ReturnEntry(5,7));
				IVIField.setText(mySudoku.ReturnEntry(5,8));

				AVIIField.setText(mySudoku.ReturnEntry(6,0));
				BVIIField.setText(mySudoku.ReturnEntry(6,1));
				CVIIField.setText(mySudoku.ReturnEntry(6,2));
				DVIIField.setText(mySudoku.ReturnEntry(6,3));
				EVIIField.setText(mySudoku.ReturnEntry(6,4));
				FVIIField.setText(mySudoku.ReturnEntry(6,5));
				GVIIField.setText(mySudoku.ReturnEntry(6,6));
				HVIIField.setText(mySudoku.ReturnEntry(6,7));
				IVIIField.setText(mySudoku.ReturnEntry(6,8));

				AVIIIField.setText(mySudoku.ReturnEntry(7,0));
				BVIIIField.setText(mySudoku.ReturnEntry(7,1));
				CVIIIField.setText(mySudoku.ReturnEntry(7,2));
				DVIIIField.setText(mySudoku.ReturnEntry(7,3));
				EVIIIField.setText(mySudoku.ReturnEntry(7,4));
				FVIIIField.setText(mySudoku.ReturnEntry(7,5));
				GVIIIField.setText(mySudoku.ReturnEntry(7,6));
				HVIIIField.setText(mySudoku.ReturnEntry(7,7));
				IVIIIField.setText(mySudoku.ReturnEntry(7,8));

				AIXField.setText(mySudoku.ReturnEntry(8,0));
				BIXField.setText(mySudoku.ReturnEntry(8,1));
				CIXField.setText(mySudoku.ReturnEntry(8,2));
				DIXField.setText(mySudoku.ReturnEntry(8,3));
				EIXField.setText(mySudoku.ReturnEntry(8,4));
				FIXField.setText(mySudoku.ReturnEntry(8,5));
				GIXField.setText(mySudoku.ReturnEntry(8,6));
				HIXField.setText(mySudoku.ReturnEntry(8,7));
				IIXField.setText(mySudoku.ReturnEntry(8,8));

				JFrame frame = new JFrame();
				JLabel textLabel = new JLabel("Done!");
				JPanel apanel = new JPanel();
				apanel.add(textLabel);
				frame.setContentPane(apanel);
				frame.pack();
				frame.show();
			}
		}

		class verifyButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				mySudoku.fillSudoku(AIField.getText(), BIField.getText(),
					CIField.getText(), DIField.getText(),
					EIField.getText(), FIField.getText(),
					GIField.getText(), HIField.getText(),
					IIField.getText(), AIIField.getText(),
					BIIField.getText(), CIIField.getText(),
					DIIField.getText(), EIIField.getText(),
					FIIField.getText(), GIIField.getText(),
					HIIField.getText(), IIIField.getText(),
					AIIIField.getText(), BIIIField.getText(),
					CIIIField.getText(), DIIIField.getText(),
					EIIIField.getText(), FIIIField.getText(),
					GIIIField.getText(), HIIIField.getText(),
					IIIIField.getText(), AIVField.getText(),
					BIVField.getText(), CIVField.getText(),
					DIVField.getText(), EIVField.getText(),
					FIVField.getText(), GIVField.getText(),
					HIVField.getText(), IIVField.getText(),
					AVField.getText(), BVField.getText(),
					CVField.getText(), DVField.getText(),
					EVField.getText(), FVField.getText(),
					GVField.getText(), HVField.getText(),
					IVField.getText(), AVIField.getText(),
					BVIField.getText(), CVIField.getText(),
					DVIField.getText(), EVIField.getText(),
					FVIField.getText(), GVIField.getText(),
					HVIField.getText(), IVIField.getText(),
					AVIIField.getText(), BVIIField.getText(),
					CVIIField.getText(), DVIIField.getText(),
					EVIIField.getText(), FVIIField.getText(),
					GVIIField.getText(), HVIIField.getText(),
					IVIIField.getText(), AVIIIField.getText(),
					BVIIIField.getText(), CVIIIField.getText(),
					DVIIIField.getText(), EVIIIField.getText(),
					FVIIIField.getText(), GVIIIField.getText(),
					HVIIIField.getText(), IVIIIField.getText(),
					AIXField.getText(), BIXField.getText(),
					CIXField.getText(), DIXField.getText(),
					EIXField.getText(), FIXField.getText(),
					GIXField.getText(), HIXField.getText(),
					IIXField.getText());
				mySudoku.fillColList();
				mySudoku.fillRowList();
				mySudoku.fillSqList();

				int csum = mySudoku.VerifySudoku();
				if(csum == 0)
				{
					JFrame frame = new JFrame();
					JLabel textLabel = new JLabel("Sudoku verified!");
					JPanel apanel = new JPanel();
					apanel.add(textLabel);
					frame.setContentPane(apanel);
					frame.pack();
					frame.show();
				}
				else
				{
					JFrame frame = new JFrame();
					JLabel textLabel = new JLabel("Bad sudoku!");
					JPanel apanel = new JPanel();
					JButton okButton = new JButton("Ok");
					apanel.add(textLabel);
					frame.setContentPane(apanel);
					frame.pack();
					frame.show();
				}
			}
		}

		ActionListener clearListener = new clearButtonListener();
		clearButton.addActionListener(clearListener);

		ActionListener forceListener = new forceButtonListener();
		forceButton.addActionListener(forceListener);

		ActionListener solveListener = new solveButtonListener();
		solveButton.addActionListener(solveListener);

		ActionListener verifyListener = new verifyButtonListener();
		verifyButton.addActionListener(verifyListener);

		JPanel SudokuPanel = new JPanel();
		JPanel buttonPanel = new JPanel();

		SudokuPanel.setLayout(new GridLayout(9, 9));
		buttonPanel.setLayout(new GridLayout(2, 2));

		SudokuPanel.add(AIField);
		SudokuPanel.add(BIField);
		SudokuPanel.add(CIField);
		SudokuPanel.add(DIField);
		SudokuPanel.add(EIField);
		SudokuPanel.add(FIField);
		SudokuPanel.add(GIField);
		SudokuPanel.add(HIField);
		SudokuPanel.add(IIField);

		SudokuPanel.add(AIIField);
		SudokuPanel.add(BIIField);
		SudokuPanel.add(CIIField);
		SudokuPanel.add(DIIField);
		SudokuPanel.add(EIIField);
		SudokuPanel.add(FIIField);
		SudokuPanel.add(GIIField);
		SudokuPanel.add(HIIField);
		SudokuPanel.add(IIIField);

		SudokuPanel.add(AIIIField);
		SudokuPanel.add(BIIIField);
		SudokuPanel.add(CIIIField);
		SudokuPanel.add(DIIIField);
		SudokuPanel.add(EIIIField);
		SudokuPanel.add(FIIIField);
		SudokuPanel.add(GIIIField);
		SudokuPanel.add(HIIIField);
		SudokuPanel.add(IIIIField);

		SudokuPanel.add(AIVField);
		SudokuPanel.add(BIVField);
		SudokuPanel.add(CIVField);
		SudokuPanel.add(DIVField);
		SudokuPanel.add(EIVField);
		SudokuPanel.add(FIVField);
		SudokuPanel.add(GIVField);
		SudokuPanel.add(HIVField);
		SudokuPanel.add(IIVField);

		SudokuPanel.add(AVField);
		SudokuPanel.add(BVField);
		SudokuPanel.add(CVField);
		SudokuPanel.add(DVField);
		SudokuPanel.add(EVField);
		SudokuPanel.add(FVField);
		SudokuPanel.add(GVField);
		SudokuPanel.add(HVField);
		SudokuPanel.add(IVField);

		SudokuPanel.add(AVIField);
		SudokuPanel.add(BVIField);
		SudokuPanel.add(CVIField);
		SudokuPanel.add(DVIField);
		SudokuPanel.add(EVIField);
		SudokuPanel.add(FVIField);
		SudokuPanel.add(GVIField);
		SudokuPanel.add(HVIField);
		SudokuPanel.add(IVIField);

		SudokuPanel.add(AVIIField);
		SudokuPanel.add(BVIIField);
		SudokuPanel.add(CVIIField);
		SudokuPanel.add(DVIIField);
		SudokuPanel.add(EVIIField);
		SudokuPanel.add(FVIIField);
		SudokuPanel.add(GVIIField);
		SudokuPanel.add(HVIIField);
		SudokuPanel.add(IVIIField);

		SudokuPanel.add(AVIIIField);
		SudokuPanel.add(BVIIIField);
		SudokuPanel.add(CVIIIField);
		SudokuPanel.add(DVIIIField);
		SudokuPanel.add(EVIIIField);
		SudokuPanel.add(FVIIIField);
		SudokuPanel.add(GVIIIField);
		SudokuPanel.add(HVIIIField);
		SudokuPanel.add(IVIIIField);

		SudokuPanel.add(AIXField);
		SudokuPanel.add(BIXField);
		SudokuPanel.add(CIXField);
		SudokuPanel.add(DIXField);
		SudokuPanel.add(EIXField);
		SudokuPanel.add(FIXField);
		SudokuPanel.add(GIXField);
		SudokuPanel.add(HIXField);
		SudokuPanel.add(IIXField);

		buttonPanel.add(solveButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(verifyButton);
		buttonPanel.add(forceButton);

		getContentPane().add(SudokuPanel, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	}
}