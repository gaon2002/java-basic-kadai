package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		
		//インスタンス化
		Jyanken_Chapter26 myC = new Jyanken_Chapter26();
		
	
	    //MyChoiceメソッドの実行
		String myChoice = myC.getMyChoice();
		
			
		//機械のじゃんけんの手を選ぶgetRandom()メソッドの実行
		String machineResult = myC.getRandom();
		
				
		//じゃんけん結果を表示
		myC.playGame(myChoice, machineResult);
		
	}

}
