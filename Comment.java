package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comment {

	public ArrayList<String> OneLineComment(ArrayList<String> lineList) {

		for(int i = 0 ; i < lineList.size() ; i++) {
			if(lineList.get(i).contains("//")) {
				List<String> wordList =Arrays.asList(lineList.get(i).split(""));

				int start = wordList.indexOf("/");

				if ((start == 0 )&&(wordList.get(1).equals("/"))) {
					lineList.remove(i);
					i--;

				}else {
					int total =start;
					int nullCount =0;
					for(int j = 0 ; j < start ; j++) {
						if(wordList.get(j).equals("	")
								||wordList.get(j).equals(" ")) {
							nullCount++;
						}
					}
					if(total == nullCount) {
						lineList.remove(i);
						i--;
					}
				}
			}
		}
		return lineList;
	}

	public ArrayList<String> MultiLineComment(ArrayList<String> lineList){
		for(int i = 0 ; i < lineList.size() ; i++) {
			if(lineList.get(i).contains("/*")) {
				boolean delEnd = false;
				int cStart = i;

				for(int j = i; j < lineList.size() ; j++) {
					if(lineList.get(j).contains("*/")) {
						if(lineList.get(j).endsWith("*/")) {
							int cEnd = j;
							for(;cStart <= cEnd ; cStart++) {
								lineList.remove(i);
								delEnd = true;
							}
						}else {
							int cEnd = j;
							cEnd--;
							for(;cStart <= cEnd ; cStart++) {
								lineList.remove(i);
								delEnd = true;
							}
						}
					}
					if(delEnd) {
						break;
					}
				}
			}
		}
		return lineList;
	}


}
