
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class DisplayManager extends StateBasedGame
{
	
	public static final int MAINMENUSTATE = 0;
	public static final int GAMEPLAYSTATE = 1;
	public static final int PAUSESTATE = 2;
	
	
	public DisplayManager(String str) throws SlickException{
		super(str);
		
	}
	
	//Builds the actual display for the game.

		
	public static void start() throws SlickException{
		AppGameContainer app = 
			new AppGameContainer(new DisplayManager("Hello"));
		app.setDisplayMode(640, 480, false);
		app.setTargetFrameRate(60);
		app.start();
	}
	
	
	
	@Override
	public void initStatesList(GameContainer gc) throws SlickException
	{
		this.addState(new MainMenu(DisplayManager.MAINMENUSTATE));
		this.addState(new GameplayState(DisplayManager.GAMEPLAYSTATE));
		this.addState(new PauseState(DisplayManager.PAUSESTATE));
		
	}

	

	
}
