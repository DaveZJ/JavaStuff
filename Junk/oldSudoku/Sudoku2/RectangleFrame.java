import javax.swing.JPanel;
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
		
		JButton sudokuButton = new JButton("Solve");
		JButton clearButton = new JButton("Clear");
		JButton verifyButton = new JButton("Verify");

		class clearButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				AIField.setText(null);
			}
		};

		class verifyButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
//				mySudoku.fillSudoku(AIField.getText());
				BIField.setText(mySudoku.returnEntry());
			}
		};

		ActionListener clearListener = new clearButtonListener();
		clearButton.addActionListener(clearListener);

		ActionListener verifyListener = new verifyButtonListener();
		verifyButton.addActionListener(verifyListener);

		JPanel SudokuPanel = new JPanel();
		JPanel buttonPanel = new JPanel();

		SudokuPanel.setLayout(new GridLayout(9, 9));
		buttonPanel.setLayout(new GridLayout(1, 3));

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

		buttonPanel.add(sudokuButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(verifyButton);

		getContentPane().add(SudokuPanel, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	}

}