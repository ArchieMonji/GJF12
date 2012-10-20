package gamejam.fighter;

public class Ice extends Items
{
/*
 * Damage Range Animation Speed Drop Startup, 
 * 2 		1	 0.01			 No 0.25, 0.01 
 */
	
	public Ice(int x, int y, String i)
	{
		super( x,  y,  i);
		damage = 5;
		damage = 2;
		range = 2;
		speed = .01;
		dropChance = false;
		startUpTime = .25;
		reloadTime = .01;
		
	}
}
