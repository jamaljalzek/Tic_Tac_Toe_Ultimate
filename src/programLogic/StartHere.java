package programLogic;

import gui.menuScreen.StartNewGameScreen;
import gui.programWindow.MainWindow;

/**
 * @author Jamal Alzek
 * 
 * This the main class that is referenced when the program executes.
 * Specifically, a new MainWindow is created, which then immediately displays the StartNewGameScreen.
 */
public class StartHere
{
	public static void main (String [] args)
	{
		MainWindow mainWindow = new MainWindow();
		StartNewGameScreen startNewGameScreen = new StartNewGameScreen();
		mainWindow.add(startNewGameScreen);
	}
	
} // End of class.
