import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLoder {
	public FileLoder() {
	}

	public void getFile(String filename) {

		try {
			Path path = Paths.get(filename);
			byte[] fileBytes = Files.readAllBytes(path);
			/*
			 * for (byte b : fileBytes) {
			 * System.out.print(b + " ");
			 * }
			 * System.out.println();
			 */
			  
			  for (byte b : fileBytes) {
			  System.out.printf("%02X ", b);
			  }
			  System.out.println();
			String str = new String(fileBytes, StandardCharsets.UTF_8);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
