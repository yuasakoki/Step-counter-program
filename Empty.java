package ex;

import java.util.ArrayList;

public class Empty {

	public ArrayList<String> EmptyLine(ArrayList<String> lineList) {
		lineList .removeIf(gyou -> gyou.length() <= 0);

		return lineList;
	}

}
