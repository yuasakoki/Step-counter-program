package ex;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		System.out.println("ファイル名を入力してください");
		String fileName =new java.util.Scanner(System.in).nextLine();
		ArrayList<String> lineList =new ArrayList<String>();

//		ファイルの呼び出し
		FileLoad fileLoad = new FileLoad();
//		空白行の削除
		Empty empty =new Empty();
		int emptyLineCount = 0;
//		コメント行の削除
		Comment DelComment = new Comment();
		int oneLineCommentCount =0;
		int MultiLineCommentCount =0;

//		ファイルを１行づつリスト化
		lineList = fileLoad.FileLoadList(fileName);

//		全ステップ数
		int allLineCount = lineList.size();
		System.out.println("総ステップ数	"+allLineCount);


		lineList = empty.EmptyLine(lineList);
		emptyLineCount = allLineCount - lineList.size();
		System.out.println("空白行		"+emptyLineCount);

		lineList = DelComment.OneLineComment(lineList);
		oneLineCommentCount = allLineCount - emptyLineCount - lineList.size();
		System.out.println("/コメント	"+oneLineCommentCount);

		lineList = DelComment.MultiLineComment(lineList);
		MultiLineCommentCount =
				allLineCount - emptyLineCount - oneLineCommentCount- lineList.size();
		System.out.println("/*コメント	"+MultiLineCommentCount);

		System.out.println();
		System.out.println("ステップカウント"+lineList.size()+"行");
	}

}
