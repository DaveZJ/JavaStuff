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

/* Option Fields */

		final JTextField AIFieldOp = new JTextField(1);
		final JTextField BIFieldOp = new JTextField(1);
		final JTextField CIFieldOp = new JTextField(1);
		final JTextField DIFieldOp = new JTextField(1);
		final JTextField EIFieldOp = new JTextField(1);
		final JTextField FIFieldOp = new JTextField(1);
		final JTextField GIFieldOp = new JTextField(1);
		final JTextField HIFieldOp = new JTextField(1);
		final JTextField IIFieldOp = new JTextField(1);

		final JTextField AIIFieldOp = new JTextField(1);
		final JTextField BIIFieldOp = new JTextField(1);
		final JTextField CIIFieldOp = new JTextField(1);
		final JTextField DIIFieldOp = new JTextField(1);
		final JTextField EIIFieldOp = new JTextField(1);
		final JTextField FIIFieldOp = new JTextField(1);
		final JTextField GIIFieldOp = new JTextField(1);
		final JTextField HIIFieldOp = new JTextField(1);
		final JTextField IIIFieldOp = new JTextField(1);

		final JTextField AIIIFieldOp = new JTextField(1);
		final JTextField BIIIFieldOp = new JTextField(1);
		final JTextField CIIIFieldOp = new JTextField(1);
		final JTextField DIIIFieldOp = new JTextField(1);
		final JTextField EIIIFieldOp = new JTextField(1);
		final JTextField FIIIFieldOp = new JTextField(1);
		final JTextField GIIIFieldOp = new JTextField(1);
		final JTextField HIIIFieldOp = new JTextField(1);
		final JTextField IIIIFieldOp = new JTextField(1);

		final JTextField AIVFieldOp = new JTextField(1);
		final JTextField BIVFieldOp = new JTextField(1);
		final JTextField CIVFieldOp = new JTextField(1);
		final JTextField DIVFieldOp = new JTextField(1);
		final JTextField EIVFieldOp = new JTextField(1);
		final JTextField FIVFieldOp = new JTextField(1);
		final JTextField GIVFieldOp = new JTextField(1);
		final JTextField HIVFieldOp = new JTextField(1);
		final JTextField IIVFieldOp = new JTextField(1);

		final JTextField AVFieldOp = new JTextField(1);
		final JTextField BVFieldOp = new JTextField(1);
		final JTextField CVFieldOp = new JTextField(1);
		final JTextField DVFieldOp = new JTextField(1);
		final JTextField EVFieldOp = new JTextField(1);
		final JTextField FVFieldOp = new JTextField(1);
		final JTextField GVFieldOp = new JTextField(1);
		final JTextField HVFieldOp = new JTextField(1);
		final JTextField IVFieldOp = new JTextField(1);

		final JTextField AVIFieldOp = new JTextField(1);
		final JTextField BVIFieldOp = new JTextField(1);
		final JTextField CVIFieldOp = new JTextField(1);
		final JTextField DVIFieldOp = new JTextField(1);
		final JTextField EVIFieldOp = new JTextField(1);
		final JTextField FVIFieldOp = new JTextField(1);
		final JTextField GVIFieldOp = new JTextField(1);
		final JTextField HVIFieldOp = new JTextField(1);
		final JTextField IVIFieldOp = new JTextField(1);

		final JTextField AVIIFieldOp = new JTextField(1);
		final JTextField BVIIFieldOp = new JTextField(1);
		final JTextField CVIIFieldOp = new JTextField(1);
		final JTextField DVIIFieldOp = new JTextField(1);
		final JTextField EVIIFieldOp = new JTextField(1);
		final JTextField FVIIFieldOp = new JTextField(1);
		final JTextField GVIIFieldOp = new JTextField(1);
		final JTextField HVIIFieldOp = new JTextField(1);
		final JTextField IVIIFieldOp = new JTextField(1);

		final JTextField AVIIIFieldOp = new JTextField(1);
		final JTextField BVIIIFieldOp = new JTextField(1);
		final JTextField CVIIIFieldOp = new JTextField(1);
		final JTextField DVIIIFieldOp = new JTextField(1);
		final JTextField EVIIIFieldOp = new JTextField(1);
		final JTextField FVIIIFieldOp = new JTextField(1);
		final JTextField GVIIIFieldOp = new JTextField(1);
		final JTextField HVIIIFieldOp = new JTextField(1);
		final JTextField IVIIIFieldOp = new JTextField(1);
		
		final JTextField AIXFieldOp = new JTextField(1);
		final JTextField BIXFieldOp = new JTextField(1);
		final JTextField CIXFieldOp = new JTextField(1);
		final JTextField DIXFieldOp = new JTextField(1);
		final JTextField EIXFieldOp = new JTextField(1);
		final JTextField FIXFieldOp = new JTextField(1);
		final JTextField GIXFieldOp = new JTextField(1);
		final JTextField HIXFieldOp = new JTextField(1);
		final JTextField IIXFieldOp = new JTextField(1);
		
		JButton solveButton = new JButton("Solve");
		JButton clearButton = new JButton("Clear");
		JButton verifyButton = new JButton("Verify");
		JButton forceButton = new JButton("GA");

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

/* Clear Option Fields */
				
				AIFieldOp.setText("");
				BIFieldOp.setText("");
				CIFieldOp.setText("");
				DIFieldOp.setText("");
				EIFieldOp.setText("");
				FIFieldOp.setText("");
				GIFieldOp.setText("");
				HIFieldOp.setText("");
				IIFieldOp.setText("");

				AIIFieldOp.setText("");
				BIIFieldOp.setText("");
				CIIFieldOp.setText("");
				DIIFieldOp.setText("");
				EIIFieldOp.setText("");
				FIIFieldOp.setText("");
				GIIFieldOp.setText("");
				HIIFieldOp.setText("");
				IIIFieldOp.setText("");

				AIIIFieldOp.setText("");
				BIIIFieldOp.setText("");
				CIIIFieldOp.setText("");
				DIIIFieldOp.setText("");
				EIIIFieldOp.setText("");
				FIIIFieldOp.setText("");
				GIIIFieldOp.setText("");
				HIIIFieldOp.setText("");
				IIIIFieldOp.setText("");

				AIVFieldOp.setText("");
				BIVFieldOp.setText("");
				CIVFieldOp.setText("");
				DIVFieldOp.setText("");
				EIVFieldOp.setText("");
				FIVFieldOp.setText("");
				GIVFieldOp.setText("");
				HIVFieldOp.setText("");
				IIVFieldOp.setText("");

				AVFieldOp.setText("");
				BVFieldOp.setText("");
				CVFieldOp.setText("");
				DVFieldOp.setText("");
				EVFieldOp.setText("");
				FVFieldOp.setText("");
				GVFieldOp.setText("");
				HVFieldOp.setText("");
				IVFieldOp.setText("");

				AVIFieldOp.setText("");
				BVIFieldOp.setText("");
				CVIFieldOp.setText("");
				DVIFieldOp.setText("");
				EVIFieldOp.setText("");
				FVIFieldOp.setText("");
				GVIFieldOp.setText("");
				HVIFieldOp.setText("");
				IVIFieldOp.setText("");

				AVIIFieldOp.setText("");
				BVIIFieldOp.setText("");
				CVIIFieldOp.setText("");
				DVIIFieldOp.setText("");
				EVIIFieldOp.setText("");
				FVIIFieldOp.setText("");
				GVIIFieldOp.setText("");
				HVIIFieldOp.setText("");
				IVIIFieldOp.setText("");

				AVIIIFieldOp.setText("");
				BVIIIFieldOp.setText("");
				CVIIIFieldOp.setText("");
				DVIIIFieldOp.setText("");
				EVIIIFieldOp.setText("");
				FVIIIFieldOp.setText("");
				GVIIIFieldOp.setText("");
				HVIIIFieldOp.setText("");
				IVIIIFieldOp.setText("");

				AIXFieldOp.setText("");
				BIXFieldOp.setText("");
				CIXFieldOp.setText("");
				DIXFieldOp.setText("");
				EIXFieldOp.setText("");
				FIXFieldOp.setText("");
				GIXFieldOp.setText("");
				HIXFieldOp.setText("");
				IIXFieldOp.setText("");
			}
		}

		class forceButtonListener implements ActionListener
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

				GARecursion myRecur = new GARecursion(0, mySudoku, mySudoku.SudokuSize(), 0);
				int recurval = 1;
				while(0 < recurval)
				{
					recurval = myRecur.nextRecursion();					
				}

				mySudoku = myRecur.ReturnSudoku();

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

				while(stepsI < stepsII)
				{
					stepsI = stepsII;
	
					if(mySudoku.HiddenSingle() == 1)
					{
						mySudoku.fillColList();
						mySudoku.fillRowList();
						mySudoku.fillSqList();
						mySudoku.Reduction();
						stepsII++;
					}
					
					if(stepsI == stepsII)
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

					if(stepsI == stepsII)
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

					if(stepsI == stepsII)
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

					if(stepsI == stepsII)
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

					if(stepsI == stepsII)
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
						}
					}

					if(stepsI == stepsII)
					{
						if(mySudoku.NakedRow() == 1)
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
						if(mySudoku.NakedSq() == 1)
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
						if(mySudoku.XCol() == 1)
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
						if(mySudoku.XRow() == 1)
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
						if(mySudoku.SwordCol() == 1)
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
						if(mySudoku.SwordRow() == 1)
						{
							mySudoku.fillColList();
							mySudoku.fillRowList();
							mySudoku.fillSqList();
							mySudoku.Reduction();
							stepsII++;
						}
					}

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

/* Option Return */

				AIFieldOp.setText(mySudoku.ReturnOpList(0,0));
				BIFieldOp.setText(mySudoku.ReturnOpList(0,1));
				CIFieldOp.setText(mySudoku.ReturnOpList(0,2));
				DIFieldOp.setText(mySudoku.ReturnOpList(0,3));
				EIFieldOp.setText(mySudoku.ReturnOpList(0,4));
				FIFieldOp.setText(mySudoku.ReturnOpList(0,5));
				GIFieldOp.setText(mySudoku.ReturnOpList(0,6));
				HIFieldOp.setText(mySudoku.ReturnOpList(0,7));
				IIFieldOp.setText(mySudoku.ReturnOpList(0,8));

				AIIFieldOp.setText(mySudoku.ReturnOpList(1,0));
				BIIFieldOp.setText(mySudoku.ReturnOpList(1,1));
				CIIFieldOp.setText(mySudoku.ReturnOpList(1,2));
				DIIFieldOp.setText(mySudoku.ReturnOpList(1,3));
				EIIFieldOp.setText(mySudoku.ReturnOpList(1,4));
				FIIFieldOp.setText(mySudoku.ReturnOpList(1,5));
				GIIFieldOp.setText(mySudoku.ReturnOpList(1,6));
				HIIFieldOp.setText(mySudoku.ReturnOpList(1,7));
				IIIFieldOp.setText(mySudoku.ReturnOpList(1,8));

				AIIIFieldOp.setText(mySudoku.ReturnOpList(2,0));
				BIIIFieldOp.setText(mySudoku.ReturnOpList(2,1));
				CIIIFieldOp.setText(mySudoku.ReturnOpList(2,2));
				DIIIFieldOp.setText(mySudoku.ReturnOpList(2,3));
				EIIIFieldOp.setText(mySudoku.ReturnOpList(2,4));
				FIIIFieldOp.setText(mySudoku.ReturnOpList(2,5));
				GIIIFieldOp.setText(mySudoku.ReturnOpList(2,6));
				HIIIFieldOp.setText(mySudoku.ReturnOpList(2,7));
				IIIIFieldOp.setText(mySudoku.ReturnOpList(2,8));

				AIVFieldOp.setText(mySudoku.ReturnOpList(3,0));
				BIVFieldOp.setText(mySudoku.ReturnOpList(3,1));
				CIVFieldOp.setText(mySudoku.ReturnOpList(3,2));
				DIVFieldOp.setText(mySudoku.ReturnOpList(3,3));
				EIVFieldOp.setText(mySudoku.ReturnOpList(3,4));
				FIVFieldOp.setText(mySudoku.ReturnOpList(3,5));
				GIVFieldOp.setText(mySudoku.ReturnOpList(3,6));
				HIVFieldOp.setText(mySudoku.ReturnOpList(3,7));
				IIVFieldOp.setText(mySudoku.ReturnOpList(3,8));

				AVFieldOp.setText(mySudoku.ReturnOpList(4,0));
				BVFieldOp.setText(mySudoku.ReturnOpList(4,1));
				CVFieldOp.setText(mySudoku.ReturnOpList(4,2));
				DVFieldOp.setText(mySudoku.ReturnOpList(4,3));
				EVFieldOp.setText(mySudoku.ReturnOpList(4,4));
				FVFieldOp.setText(mySudoku.ReturnOpList(4,5));
				GVFieldOp.setText(mySudoku.ReturnOpList(4,6));
				HVFieldOp.setText(mySudoku.ReturnOpList(4,7));
				IVFieldOp.setText(mySudoku.ReturnOpList(4,8));

				AVIFieldOp.setText(mySudoku.ReturnOpList(5,0));
				BVIFieldOp.setText(mySudoku.ReturnOpList(5,1));
				CVIFieldOp.setText(mySudoku.ReturnOpList(5,2));
				DVIFieldOp.setText(mySudoku.ReturnOpList(5,3));
				EVIFieldOp.setText(mySudoku.ReturnOpList(5,4));
				FVIFieldOp.setText(mySudoku.ReturnOpList(5,5));
				GVIFieldOp.setText(mySudoku.ReturnOpList(5,6));
				HVIFieldOp.setText(mySudoku.ReturnOpList(5,7));
				IVIFieldOp.setText(mySudoku.ReturnOpList(5,8));

				AVIIFieldOp.setText(mySudoku.ReturnOpList(6,0));
				BVIIFieldOp.setText(mySudoku.ReturnOpList(6,1));
				CVIIFieldOp.setText(mySudoku.ReturnOpList(6,2));
				DVIIFieldOp.setText(mySudoku.ReturnOpList(6,3));
				EVIIFieldOp.setText(mySudoku.ReturnOpList(6,4));
				FVIIFieldOp.setText(mySudoku.ReturnOpList(6,5));
				GVIIFieldOp.setText(mySudoku.ReturnOpList(6,6));
				HVIIFieldOp.setText(mySudoku.ReturnOpList(6,7));
				IVIIFieldOp.setText(mySudoku.ReturnOpList(6,8));

				AVIIIFieldOp.setText(mySudoku.ReturnOpList(7,0));
				BVIIIFieldOp.setText(mySudoku.ReturnOpList(7,1));
				CVIIIFieldOp.setText(mySudoku.ReturnOpList(7,2));
				DVIIIFieldOp.setText(mySudoku.ReturnOpList(7,3));
				EVIIIFieldOp.setText(mySudoku.ReturnOpList(7,4));
				FVIIIFieldOp.setText(mySudoku.ReturnOpList(7,5));
				GVIIIFieldOp.setText(mySudoku.ReturnOpList(7,6));
				HVIIIFieldOp.setText(mySudoku.ReturnOpList(7,7));
				IVIIIFieldOp.setText(mySudoku.ReturnOpList(7,8));

				AIXFieldOp.setText(mySudoku.ReturnOpList(8,0));
				BIXFieldOp.setText(mySudoku.ReturnOpList(8,1));
				CIXFieldOp.setText(mySudoku.ReturnOpList(8,2));
				DIXFieldOp.setText(mySudoku.ReturnOpList(8,3));
				EIXFieldOp.setText(mySudoku.ReturnOpList(8,4));
				FIXFieldOp.setText(mySudoku.ReturnOpList(8,5));
				GIXFieldOp.setText(mySudoku.ReturnOpList(8,6));
				HIXFieldOp.setText(mySudoku.ReturnOpList(8,7));
				IIXFieldOp.setText(mySudoku.ReturnOpList(8,8));

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


				JFrame frame = new JFrame();
				JLabel textLabel = new JLabel("" + mySudoku.TestSq());
				JPanel apanel = new JPanel();
				JButton okButton = new JButton("Ok");
				apanel.add(textLabel);
				frame.setContentPane(apanel);
				frame.pack();
				frame.show();
				
/*				int csum = mySudoku.VerifySudoku();
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

*/

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
		JPanel SudokuOpPanel = new JPanel();

		SudokuPanel.setLayout(new GridLayout(9, 9));
		buttonPanel.setLayout(new GridLayout(2, 2));
		SudokuOpPanel.setLayout(new GridLayout(9, 9));

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

/* Add Option Fields */
		
		SudokuOpPanel.add(AIFieldOp);
		SudokuOpPanel.add(BIFieldOp);
		SudokuOpPanel.add(CIFieldOp);
		SudokuOpPanel.add(DIFieldOp);
		SudokuOpPanel.add(EIFieldOp);
		SudokuOpPanel.add(FIFieldOp);
		SudokuOpPanel.add(GIFieldOp);
		SudokuOpPanel.add(HIFieldOp);
		SudokuOpPanel.add(IIFieldOp);

		SudokuOpPanel.add(AIIFieldOp);
		SudokuOpPanel.add(BIIFieldOp);
		SudokuOpPanel.add(CIIFieldOp);
		SudokuOpPanel.add(DIIFieldOp);
		SudokuOpPanel.add(EIIFieldOp);
		SudokuOpPanel.add(FIIFieldOp);
		SudokuOpPanel.add(GIIFieldOp);
		SudokuOpPanel.add(HIIFieldOp);
		SudokuOpPanel.add(IIIFieldOp);

		SudokuOpPanel.add(AIIIFieldOp);
		SudokuOpPanel.add(BIIIFieldOp);
		SudokuOpPanel.add(CIIIFieldOp);
		SudokuOpPanel.add(DIIIFieldOp);
		SudokuOpPanel.add(EIIIFieldOp);
		SudokuOpPanel.add(FIIIFieldOp);
		SudokuOpPanel.add(GIIIFieldOp);
		SudokuOpPanel.add(HIIIFieldOp);
		SudokuOpPanel.add(IIIIFieldOp);

		SudokuOpPanel.add(AIVFieldOp);
		SudokuOpPanel.add(BIVFieldOp);
		SudokuOpPanel.add(CIVFieldOp);
		SudokuOpPanel.add(DIVFieldOp);
		SudokuOpPanel.add(EIVFieldOp);
		SudokuOpPanel.add(FIVFieldOp);
		SudokuOpPanel.add(GIVFieldOp);
		SudokuOpPanel.add(HIVFieldOp);
		SudokuOpPanel.add(IIVFieldOp);

		SudokuOpPanel.add(AVFieldOp);
		SudokuOpPanel.add(BVFieldOp);
		SudokuOpPanel.add(CVFieldOp);
		SudokuOpPanel.add(DVFieldOp);
		SudokuOpPanel.add(EVFieldOp);
		SudokuOpPanel.add(FVFieldOp);
		SudokuOpPanel.add(GVFieldOp);
		SudokuOpPanel.add(HVFieldOp);
		SudokuOpPanel.add(IVFieldOp);

		SudokuOpPanel.add(AVIFieldOp);
		SudokuOpPanel.add(BVIFieldOp);
		SudokuOpPanel.add(CVIFieldOp);
		SudokuOpPanel.add(DVIFieldOp);
		SudokuOpPanel.add(EVIFieldOp);
		SudokuOpPanel.add(FVIFieldOp);
		SudokuOpPanel.add(GVIFieldOp);
		SudokuOpPanel.add(HVIFieldOp);
		SudokuOpPanel.add(IVIFieldOp);

		SudokuOpPanel.add(AVIIFieldOp);
		SudokuOpPanel.add(BVIIFieldOp);
		SudokuOpPanel.add(CVIIFieldOp);
		SudokuOpPanel.add(DVIIFieldOp);
		SudokuOpPanel.add(EVIIFieldOp);
		SudokuOpPanel.add(FVIIFieldOp);
		SudokuOpPanel.add(GVIIFieldOp);
		SudokuOpPanel.add(HVIIFieldOp);
		SudokuOpPanel.add(IVIIFieldOp);

		SudokuOpPanel.add(AVIIIFieldOp);
		SudokuOpPanel.add(BVIIIFieldOp);
		SudokuOpPanel.add(CVIIIFieldOp);
		SudokuOpPanel.add(DVIIIFieldOp);
		SudokuOpPanel.add(EVIIIFieldOp);
		SudokuOpPanel.add(FVIIIFieldOp);
		SudokuOpPanel.add(GVIIIFieldOp);
		SudokuOpPanel.add(HVIIIFieldOp);
		SudokuOpPanel.add(IVIIIFieldOp);

		SudokuOpPanel.add(AIXFieldOp);
		SudokuOpPanel.add(BIXFieldOp);
		SudokuOpPanel.add(CIXFieldOp);
		SudokuOpPanel.add(DIXFieldOp);
		SudokuOpPanel.add(EIXFieldOp);
		SudokuOpPanel.add(FIXFieldOp);
		SudokuOpPanel.add(GIXFieldOp);
		SudokuOpPanel.add(HIXFieldOp);
		SudokuOpPanel.add(IIXFieldOp);
		
		buttonPanel.add(solveButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(verifyButton);
		buttonPanel.add(forceButton);

		getContentPane().add(SudokuPanel, BorderLayout.NORTH);
		getContentPane().add(buttonPanel, BorderLayout.CENTER);
		getContentPane().add(SudokuOpPanel, BorderLayout.SOUTH);
	}
}