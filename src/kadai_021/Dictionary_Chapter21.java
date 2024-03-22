package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
		//クラスのフィールドとしてHashMapをインスタンス化
		//辞書として機能するHashMapを宣言
		private HashMap<String,String> dictionary = new HashMap<String,String>();
		
			//コンストラクタ内で辞書に要素を追加
			//Mapを宣言すると同時に値を追加して初期化する
			//辞書に10通りの英単語と意味を追加
			public Dictionary_Chapter21() {
				dictionary.put("apple", "りんご");
				dictionary.put("peach", "桃");
				dictionary.put("banana", "バナナ");
				dictionary.put("lemon", "レモン");
				dictionary.put("pear", "梨");
				dictionary.put("kiwi", "キウイ");
				dictionary.put("strawberry", "いちご");
				dictionary.put("grape", "ぶどう");
				dictionary.put("muscat", "マスカット");
				dictionary.put("cherry", "さくらんぼ");
			}
			
			//辞書を調べるメソッド。引数keyを設定して、DictionaryExec_Chapter21から内容を受け取る。
		    public void printDictionary(String key) {
		        
		        //dictionaryの中にkeyが含まれていたら、意味を合わせて出力
		    	//含まれていなければ、存在しないと出力
		    	//containsKey()メソッドはjava.util.HashMapクラスに定義されている
		        if (dictionary.containsKey(key)) {
		           	System.out.println(key + "の意味は " + dictionary.get(key));
		        }else{
		        	System.out.println(key + "は辞書に存在しません");
		        }
		        	
		            
		        
		    
		    }

}
