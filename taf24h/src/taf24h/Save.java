package taf24h;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Save {

	public void Sauvegarder(BufferedImage image, String imageName, String sourcepath){
		
		File fileName = new File(sourcepath + imageName +".jpg"); //pour l'enregistrer dans un autre extensions il suffit de remplacer l'extension dans le code
		try {
			ImageIO.write(image, "jpg", fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
