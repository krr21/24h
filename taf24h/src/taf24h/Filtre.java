package taf24h;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Filtre {
	
	private BufferedImage source=null;
	public void charger(String path) {
		  
		  try {
		   source = ImageIO.read(new File(path));
		  }
		  catch (IOException e) {
		   e.printStackTrace();
		  }
	}

	public void lissage() {
		  Kernel kernel1 = new Kernel(5, 5, new float[]{ 4/1344f, 18/1344f, 19/1344f, 18/1344f, 4/1344f, 18/1344f, 80/1344f, 132/1344f, 80/1344f, 18/1344f, 29/1344f, 132/1344f, 218/1344f, 132/1344f, 29/1344f, 18/1344f, 80/1344f, 132/1344f, 80/1344f, 18/1344f, 4/1344f, 18/1344f, 29/1344f, 18/1344f, 4/1344f});
		  ConvolveOp convolution = new ConvolveOp(kernel1);
		  BufferedImage resultat = convolution.filter(source, null);
		  
		 
	}
}
