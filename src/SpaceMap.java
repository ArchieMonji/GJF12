public class SpaceMap extends Map
{
	String backgroundFileLocation;
	
	public SpaceMap(GameWorld gW)
	{
		super(gW);
		backgroundFileLocation = "";
	}
	
	public void buildMap()
	{
		//addBlock( X-Coordinate, Y-Coordinate, blockFileLocation, blockType );
		//"arg" is a placeholder fileLocation
		//addBlock(0,3, "arg", BlockType.Impassable);
		/*
		 * addSpawn(0,2,"arg", BlockType.CrateSpawn);
		 * addSpawn(15,2, "arg", BlockType.CrateSpawn);
		 * etc
		 */
		
		
		//addBlock(0,0,"/assets/Space/block.png", BlockType.Impassable); 
		//addBlock(0,0,"/assets/Space/laser.png",BlockType.Lethal);
		//addBlock(0,0,"/assets/Space/platform.png",BlockType.Passable);
		//addBlock(0,0,"/assets/Space/crate.png",BlockType.Crate);
		
		addBlock(0,0,"/assets/Space/block.png", BlockType.Impassable); 
		addBlock(0,1,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(0,2,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(0,3,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(0,4,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(0,5,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(0,6,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(0,7,"/assets/Space/block.png", BlockType.Impassable); 
		
		addBlock(1,3,"/assets/Space/platform.png",BlockType.Passable);
		addBlock(1,7,"/assets/Space/laser-hori.png",BlockType.Lethal);
		
		addBlock(2,3,"/assets/Space/platform.png",BlockType.Passable);
		addBlock(2,7,"/assets/Space/laser-hori.png",BlockType.Lethal);
		
		addBlock(3,7,"/assets/Space/block.png", BlockType.Impassable); 
		
		addBlock(4,0,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(4,4,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(4,7,"/assets/Space/block.png", BlockType.Impassable);
		
		addBlock(5,0,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(5,4,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(5,7,"/assets/Space/lase-hori.png",BlockType.Lethal);
		
		addBlock(6,0,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(6,4,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(6,7,"/assets/Space/lase-hori.png",BlockType.Lethal);
		
		addBlock(7,0,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(7,4,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(7,7,"/assets/Space/lase-hori.png",BlockType.Lethal);
		
		addBlock(8,0,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(8,4,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(8,7,"/assets/Space/lase-hori.png",BlockType.Lethal);
		
		addBlock(9,0,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(9,4,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(9,7,"/assets/Space/lase-hori.png",BlockType.Lethal);
		
		addBlock(10,0,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(10,4,"/assets/Space/block.png", BlockType.Impassable);
		addBlock(10,7,"/assets/Space/lase-hori.png",BlockType.Lethal);
		
		addBlock(11,7,"/assets/Space/block.png", BlockType.Impassable); 
		
		addBlock(12,3,"/assets/Space/platform.png",BlockType.Passable);
		addBlock(12,7,"/assets/Space/laser-hori.png",BlockType.Lethal);
		
		addBlock(13,3,"/assets/Space/platform.png",BlockType.Passable);
		addBlock(13,7,"/assets/Space/laser-hori.png",BlockType.Lethal);
		
		addBlock(14,0,"/assets/Space/block.png", BlockType.Impassable); 
		addBlock(14,1,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(14,2,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(14,3,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(14,4,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(14,5,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(14,6,"/assets/Space/laser-vert.png",BlockType.Lethal);
		addBlock(14,7,"/assets/Space/block.png", BlockType.Impassable); 
		
		
	}
	
}