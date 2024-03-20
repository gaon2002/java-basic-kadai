package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//インスタンス化
		KatoTaro_Chapter18   taro   = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		
		//メソッド実行
		//太郎
		taro.setGivenName();
		taro.execIntroduce();
		
				
		//一郎
		ichiro.setGivenName();
		ichiro.execIntroduce();
		
				
		//花子
		hanako.setGivenName();
		hanako.execIntroduce();

		
	}

}
