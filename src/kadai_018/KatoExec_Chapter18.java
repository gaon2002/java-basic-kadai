package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//インスタンス化
		KatoTaro_Chapter18   taro   = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		
		//メソッド実行
		//太郎
		taro.commonIntroduce();
		taro.setGivenName();
		taro.execIntroduce();
		
		System.out.println("");
		
		
		//一郎
		ichiro.commonIntroduce();
		ichiro.setGivenName();
		ichiro.execIntroduce();
		
		System.out.println("");
		
		
		//花子
		hanako.commonIntroduce();
		hanako.setGivenName();
		hanako.execIntroduce();

		
	}

}
