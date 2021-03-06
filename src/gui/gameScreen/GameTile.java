package gui.gameScreen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import programLogic.CheckGameStatus;
import programLogic.Game;
import programLogic.GameBoard;
import programLogic.computerOpponentLogic.EasyMode;
import programLogic.computerOpponentLogic.hardModeAndVeryHardMode.HardMode;
import programLogic.computerOpponentLogic.hardModeAndVeryHardMode.VeryHardMode;
import programLogic.computerOpponentLogic.mediumMode.MediumMode;

public class GameTile extends JButton
{
	private final int row, column;
	
	
	public GameTile(int row, int column)
	{
		this.row = row;
		this.column = column;
		this.addActionListener(new ButtonListener());
		setGameTileTextFont();
	}
	
	
	private void setGameTileTextFont()
	{
		Font textFont = new Font(Font.DIALOG, Font.BOLD, 48);
		this.setFont(textFont);
	}
	
	
	public int getRowLocation()
	{
		return this.row;
	}
	
	
	public int getColumnLocation()
	{
		return this.column;
	}
	
	
	private class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			GameTile clickedTile = (GameTile) event.getSource();
			GameBoard.letPlayerClaimSpotOnGameBoard(clickedTile);
			CheckGameStatus.checkGameStatus(clickedTile);
			letTheComputerMakeACounterMove();
		}
		
		
		private void letTheComputerMakeACounterMove()
		{
			if (Game.hasEnded())
			{
				return;
			}
			if (Game.getDifficulty().equals("EASY"))
			{
				EasyMode.easyMode();
			}
			else if (Game.getDifficulty().equals("MEDIUM"))
			{
				MediumMode.mediumMode();
			}
			else if (Game.getDifficulty().equals("HARD"))
			{
				HardMode.hardMode();
			}
			else // Game.getDifficulty().equals("VERY HARD")
			{
				VeryHardMode.veryHardMode();
			}
		}

	} // End of nested class.

} // End of class.
