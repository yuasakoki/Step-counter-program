package ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoad{
	public ArrayList<String> FileLoadList(String fileName) {

		String filePath = fileName;
		ArrayList<String> gyouList =new ArrayList<String>();

		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			while(line != null) {

				gyouList.add(line);
				line = br.readLine();
			}

			br.close();

		}catch(IOException e) {
			e.printStackTrace();
		}
		return gyouList;
	}

}
