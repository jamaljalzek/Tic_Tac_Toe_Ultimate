package gui.programWindow;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import programLogic.GameBoard;

public class MainWindow extends JFrame
{
	private static MainWindow mainWindow;
	
	
	/**
	 * This is the main window (JFrame) that displays the various screens (JPanels), depending on where the user
	 * navigates via clicking the specific buttons on each screen.
	 */
	public MainWindow ()
	{
		mainWindow = this;
		this.setTitle("Tic Tac Toe Ultimate");
		this.setSize(400, 400);
		this.setResizable(false);
		this.setLayout( new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS) );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	/**Removes the current screen (JPanel) that is displayed on the MainWindow.
	 * Then, it adds the passed in JPanel that is to be displayed.
	 * Finally, the MainWindow's Content Pane is updated.
	 * 
	 * @param screen
	 */
	public static void displayNewScreen(JPanel screen)
	{
		// Clear everything off of this current window:
		mainWindow.getContentPane().removeAll();
		
		mainWindow.add(screen);
		
		// Update the appearance of this window:
		mainWindow.getContentPane().validate();
		mainWindow.getContentPane().repaint();				
	}
	
	
	public static void resizeAndReCenterMainWindow()
	{
		mainWindow.setSize(GameBoard.getDimension() * 100, GameBoard.getDimension() * 100);
		mainWindow.setLocationRelativeTo(null); // Re-center the mainWindow.
	}
	
} // End of class.
