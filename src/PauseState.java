
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class PauseState extends BasicGameState
{
	
	Image pauseMenu = null;
	private final String ST_CONTINUE = "CONTINUE";
	int stateID = -1;
	private ControllerManager controllerManager;
	
	public PauseState(int stateID, ControllerManager controllerManager){
		this.stateID = stateID;
		this.controllerManager = controllerManager;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
		throws SlickException
	{
		pauseMenu = new Image("assets/pause.png");
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
		throws SlickException
	{
		pauseMenu.draw(0,0);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
		throws SlickException
	{
		Input input = new Input(delta);
		
		if(input.isKeyDown(Input.KEY_ESCAPE)){
			sbg.enterState(DisplayManager.GAMEPLAYSTATE);
		}
		
	}

	@Override
	public int getID()
	{
		// TODO Auto-generated method stub
		return stateID;
	}

}
