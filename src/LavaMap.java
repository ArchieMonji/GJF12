
public class LavaMap extends Map
{
	String backgroundFileLocation;
	
	public LavaMap(GameWorld gW)
	{
		super(gW);
		backgroundFileLocation = "";
	}
	
	public void buildMap()
	{
		//addBlock( X-Coordinate, Y-Coordinate, blockFileLocation, blockType );
		//"arg" is a placeholder fileLocation
		//addBlock(0,3, "arg", BlockType.Impassible);
		/*
		 * addSpawn(0,2,"arg", BlockType.CrateSpawn);
		 * addSpawn(15,2, "arg", BlockType.CrateSpawn);
		 * etc
		 */
		addBlock(0,9,"/assets/Art/Stages/Volcano/block.png", BlockType.Impassible);
		addBlock(1,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(2,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(3,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(3,8,"/assets/Art/Stages/Volcano/platform.png",BlockType.Passible);
		addBlock(4,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(5,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Impassible);
		addBlock(6,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Impassible);
		addBlock(7,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Impassible);
		addBlock(8,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Impassible);
		addBlock(5,4,"/assets/Art/Stages/Volcano/crate.png",BlockType.Crate);
		addBlock(5,5,"/assets/Art/Stages/Volcano/block.png",BlockType.Impassible);
		addBlock(6,5,"/assets/Art/Stages/Volcano/block.png",BlockType.Impassible);
		addBlock(5,0,"/assets/Art/Stages/Volcano/stalactites-leftedge.png",BlockType.Lethal);
		addBlock(6,0,"/assets/Art/Stages/Volcano/stalactites.png",BlockType.Lethal);
		addBlock(7,0,"/assets/Art/Stages/Volcano/stalactites.png",BlockType.Lethal);
		addBlock(8,0,"/assets/Art/Stages/Volcano/stalactites.png",BlockType.Lethal);
		addBlock(9,0,"/assets/Art/Stages/Volcano/stalactites.png",BlockType.Lethal);
		addBlock(10,0,"/assets/Art/Stages/Volcano/stalactites.png",BlockType.Lethal);
		addBlock(11,0,"/assets/Art/Stages/Volcano/stalactites-rightedge.png",BlockType.Lethal);
		addBlock(7,4,"/assets/Art/Stages/Volcano/platform.png",BlockType.Passible);
		addBlock(8,4,"/assets/Art/Stages/Volcano/platform.png",BlockType.Passible);
		addBlock(9,4,"/assets/Art/Stages/Volcano/platform.png",BlockType.Passible);
		addBlock(10,5,"/assets/Art/Stages/Volcano/block.png",BlockType.Impassible);
		addBlock(11,5,"/assets/Art/Stages/Volcano/block.png",BlockType.Impassible);
		addBlock(11,4,"/assets/Art/Stages/Volcano/crate.png",BlockType.Crate);
		addBlock(8,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(9,9,"/assets/Art/Stages/Volcano/block.png",BlockType.Impassible);
		addBlock(10,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Impassible);
		addBlock(11,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Impassible);
		addBlock(12,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(13,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(14,9,"/assets/Art/Stages/Volcano/lava.png",BlockType.Lethal);
		addBlock(15,9,"/assets/Art/Stages/Volcano/block.png",BlockType.Impassible);
		addBlock(15,3, "/assets/Art/Stages/Volcano/block.png",BlockType.Impassible);


	}
	
}
