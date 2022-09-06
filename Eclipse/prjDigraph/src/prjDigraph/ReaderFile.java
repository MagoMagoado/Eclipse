/**
 * 
 */
package prjDigraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author
 *
 */
public class ReaderFile {
	private String fileName;
	private String filePath;
	
	public ReaderFile(String fileName, String filePath) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath+"/"+fileName));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(reader.readLine());
				reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
