package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter21 fruite = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセットする
		String[] check = {"apple","banana","grape","orange"};
		
		
		//辞書を調べる
		// 辞書の内容を出力するメソッド
    	// 配列の内容をひとつずつ確認する
        for ( int i = 0; i < check.length; i++) {
        	
        	fruite.printDictionary(check[i]);
		
        }

	
	
	

}

}


