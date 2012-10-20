import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class Item extends Entity {

public double range, speed, startUpTime, reloadTime;
public int damage; 
public String name;
public boolean dropChance;
public ArrayList<BufferedImage> pics= new ArrayList<BufferedImage>();
BufferedImage img = null;

  public Item (int x, int y, String itemImage)
  {
	  //constructs the image at coord and finds file path
	  super (x,y, itemImage);
	 
	  //Sets the hit box
	  super.setHitBox(x, y);
  }
  public void whatever(BufferedImage i, int w, int h)
	{
		// divide width of the BufferedImage by the wdth set by parameter to get number of rows. do same for height/columns. 
		int rows = i.getWidth(null) / w;
		int columns = i.getHeight(null) / h;
		for(int x = 0; x < rows; x++)
		{
			for(int y = 0; y < columns; y++)
			{
				pics.add(i.getSubimage(x*w, y*h, w, h));
			}
		}
	}
	public void imageReciever(String s)
	{
		try 
		{
			img = ImageIO.read(new File(s));
		}
		catch(IOException e)
		{
			
		}
	}
}
