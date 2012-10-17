package GameJam;


import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;
import static org.lwjgl.opengl.GL11.*;

public class DisplayManager
{
	Texture texture;
	List<Box> boxes = new ArrayList<Box>(2);
	Random r = new Random();
	
	public void addsBoxes(){
		boxes.add(new Box(r.nextInt(590), r.nextInt(430)));
		boxes.add(new Box(r.nextInt(590), r.nextInt(430)));
	}
	
	public void start(){
		try{
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("MouseX: " + Mouse.getX() + " MouseY: " + (480 - Mouse.getY() - 1));
			Display.create();
		}
		catch(Exception ex){
			System.exit(0);
		}
		
		init();
		addsBoxes();
		//float red = r.nextFloat();
		//float blue = r.nextFloat();
		//float green = r.nextFloat();
		
		int index = 0;
		
		while(!Display.isCloseRequested()){
			
			renderBack();
			
			for(Box box : boxes){
				box.draw();
				box.checkSelected();
				if(box.selected){
					Display.setTitle("Something selected");
					index = boxes.indexOf(box);
				}
			}
			
			boxes.get(index).move();
			
			
			glPopMatrix();
			Display.update();
			Display.sync(60);
		}
		
		Display.destroy();
	}
	
	public void init(){
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}
	
	public void renderBack(){
		try{
			texture = TextureLoader.getTexture("JPG", 
				ResourceLoader.getResourceAsStream("/res/randomTex.jpg"));
			
		}
		catch(Exception e){
			//Do nothing, you bastard.
			System.out.println("I just don't know what went wrong!");
		}
		texture.bind();
		glBegin(GL_QUADS);
			glTexCoord2f(0, 0);
			glVertex2f(0, 1);
			glTexCoord2f(1, 0);
			glVertex2f(640 + 640, 1);
			glTexCoord2f(1, 1);
			glVertex2f(640 + 640, 480 + (480 / 16) + 1);
			glTexCoord2f(0, 1);
			glVertex2f(0, 480 + (480 / 16) + 1);
		glEnd();
	}
	
	public class Box{
		int x, y;
		boolean selected = false;
		public Box(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public void draw(){
			
			glBegin(GL_QUADS);
				glVertex2i(x, y);
				glVertex2i(x + 50, y);
				glVertex2i(x + 50, y + 50);
				glVertex2i(x, y + 50);
			glEnd();
		}
		
		public void move(){
			if(selected){
				if(Keyboard.isKeyDown(Keyboard.KEY_W)){
					y-= 5;
				}
				if(Keyboard.isKeyDown(Keyboard.KEY_S)){
					y += 5;
				}
				if(Keyboard.isKeyDown(Keyboard.KEY_A)){
					x -= 5;
				}
				if(Keyboard.isKeyDown(Keyboard.KEY_D)){
					x += 5;
				}
			}
		}
		public void checkSelected(){
			if(Mouse.isButtonDown(0)){
				Rectangle rectMouse = new Rectangle(Mouse.getX(),
					480 - Mouse.getY() - 1, 1, 1);
				if(rectMouse.intersects(new Rectangle(x, y, 50, 50))){
					selected = true;
				}
				else{
					selected = false;
				}
			}
			
		}
		
	}
	
	
}
