package programLogic.computerOpponentLogic.hardModeAndVeryHardMode;

import programLogic.Game;
import programLogic.computerOpponentLogic.hardModeAndVeryHardMode.subComponents.PreventPlayerFromWinning;
import programLogic.computerOpponentLogic.hardModeAndVeryHardMode.subComponents.prioritizeWinningTheGameThisTurn.PrioritizeWinningTheGameThisTurn;
import programLogic.computerOpponentLogic.mediumMode.MediumMode;

public class HardMode
{
	/**
	 * During this difficulty, the computer will use the same strategy to win as described in medium mode. However, unlike
	 * medium mode, the computer additionally will block the player from completing a row, column, or diagonal. In this game
	 * mode, the player must have a strategy that leads them to a situation where they have two different ways of
	 * winning in a single turn.
	 */
	public static void hardMode()
	{
		PrioritizeWinningTheGameThisTurn.attemptToWinTheGameThisTurn();
		orAttemptToBlockThePlayerIfTheyAreOneTurnAwayFromWinning();
		orTheComputerWillAttemptToGetCloserToWinningTheGame();
	}
	
	
	private static void orAttemptToBlockThePlayerIfTheyAreOneTurnAwayFromWinning()
	{
		if (Game.isStillComputersTurn())
		{
			PreventPlayerFromWinning.blockPlayerIfTheyXTurnsAwayFromWinning(1);
		}
	}
	
	
	private static void orTheComputerWillAttemptToGetCloserToWinningTheGame()
	{
		if (Game.isStillComputersTurn())
		{
			MediumMode.mediumMode();
		}
	}

} // End of class.
