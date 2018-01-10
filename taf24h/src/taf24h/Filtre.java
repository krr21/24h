package taf24h;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Filtre {
	
	private static final byte AverageFilter = 1;
	private static final byte BiscubicScaleFilter = 2;
	private static final byte BinaryFilter = 3;
	private static final byte BlockFilter = 4;
	private static final byte BlurFilter = 5;
	private static final byte BorderFilter = 6;
	private static final byte BoxBlurFilter = 7;
	private static final byte BrushedMetalFilter = 8;
	private static final byte BumpFilter = 9;
	private static final byte CausticsFilter = 10;
	private static final byte CellularFilter = 11;
	private static final byte ChannelMixFilter = 12;
	private static final byte CheckFilter = 13;
	private static final byte ChromaKeyFilter = 14;
	private static final byte ChromeFiler = 15;
	private static final byte CircleFilter = 16;
	private static final byte ColorHalftoneFilter = 17;
	private static final byte CompositeFilter = 18;
	private static final byte CompoundFilter = 19;
	private static final byte ContourFilter = 20;
	
	
	
	public void Filtrer(byte type, Object image) {
		
		switch (type) {
		
		case AverageFilter:
			
		case BiscubicScaleFilter:
			
		case BinaryFilter:
			
		case BlockFilter:
			
		case BlurFilter:
			
		case BorderFilter:
			
		case BoxBlurFilter:
			
		case BrushedMetalFilter:
			
		case BumpFilter:
			
		case CausticsFilter:
			
		case CellularFilter:
			
		case ChannelMixFilter:
			
		case CheckFilter:
			
		case ChromaKeyFilter:
			
		case ChromeFiler:
			
		case CircleFilter:
			
		case ColorHalftoneFilter:
			
		case CompositeFilter:
			
		case CompoundFilter:
			
		case ContourFilter:	
			
		
			
		default: 
		
		}
	}
	
	private BufferedImage source=null;
	public void charger(String path) {
		  
		  try {
		   source = ImageIO.read(new File(path));
		  }
		  catch (IOException e) {
		   e.printStackTrace();
		  }
	}

	
	
	
	
}
