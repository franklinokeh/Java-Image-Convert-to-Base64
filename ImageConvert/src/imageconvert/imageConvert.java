package imageconvert;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
//import org.apache.commons.codec.binary.Base64;
import java.util.Base64;

public class imageConvert {

	 public static void main(String[] args) throws IOException {
//			String imageString = null;
			try {

				 BufferedImage image = ImageIO.read(new File("C:\\Users\\user\\Pictures\\mm.jpg"));

				 System.out.println("File Path is Valid");

				 ByteArrayOutputStream baos = new ByteArrayOutputStream();

				 ImageIO.write(image, "png", baos);

				 byte[] res = baos.toByteArray();

				 String imageString = Base64.getEncoder().encodeToString(res);

				 System.out.println("Encoding Starts here " + "\n" + imageString + "\n" + "Ends here");

			} catch (IOException e) {
				 System.out.println("Some problem has occurred. Please try again");
			}

	 }

}
