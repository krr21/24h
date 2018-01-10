package taf24h;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Save {

	public Save(BufferedImage image, String imageName, String sourcepath) throws IOException{
		
		File fileName = new File(sourcepath + imageName +".jpg"); //pour l'enregistrer dans un autre extensions il suffit de remplacer l'extension dans le code
		ImageIO.write(image, "jpg", fileName);
	}

}
