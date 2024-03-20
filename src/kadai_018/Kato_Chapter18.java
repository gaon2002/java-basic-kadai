package kadai_018;

abstract class Kato_Chapter18 {
	
	//フィールド(メンバ変数)設定
	public String familyName;
	public String address;
	public String givenName;
	
	
	//共通の紹介
	public void commonIntroduce() {
		
		familyName = "加藤";
		address    = "東京都中野区〇×";
		
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		
	}
	
	//個別の紹介を出力
	abstract void eachIntroduce();
	
	//紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	

}
