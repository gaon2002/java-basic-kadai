package kadai_026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	//機械が出すじゃんけんの手（配列）を作る：匿名クラス
	private ArrayList<String> machineChoice = new ArrayList<String>() { //machineChoice：フィールド変数（必ずカプセル化を行う）
		{
		add("r");
		add("s");
		add("p");
		}
	};
	
	//自分と対戦相手のじゃんけんの手を出力する処理：匿名クラス
	private HashMap<String,String> jankenKey = new HashMap<String,String>();{ //jankenKey：フィールド変数
		{
		jankenKey.put("r","グー");
		jankenKey.put("s","チョキ");
		jankenKey.put("p","パー");
		}
	}
	
	
	//メソッド
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		//自分のじゃんけんの手を入力できるように、Scannerクラスのオブジェクトを生成
		Scanner scanner = new Scanner(System.in);
		
		//自分のじゃんけんの手を入力し、値を取得する
		String myChoice = scanner.next(); //
		
		//入力した文字の確認
		System.out.println("入力した文字は" + myChoice);
		
		//自分のじゃんけんの値が正しい手であるかを判定
				
		if((myChoice.equals("r")) || (myChoice.equals("s")) || (myChoice.equals("p"))) {
			
		}else {
			System.out.println("正しい値ではありません、再入力してください");
			myChoice = scanner.next();	//値の再代入を行う
		}
		//Scannerクラスのオブジェクトを終了する
		scanner.close();

		//正しければmyChoiceに値を代入して戻り値を設定
		return myChoice;
		
		
	}

	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		// machineResultに機械で選んだ結果を代入する
		String machineResult = machineChoice.get((int) Math.floor(Math.random() * 3));
		return machineResult;
			
		}

	
	public void playGame(String myChoice, String machineResult) {
		
		System.out.println("");
		System.out.println("自分の手は" + jankenKey.get(myChoice) + "、" + "相手の手は" + jankenKey.get(machineResult));
		
		System.out.println("---じゃんけん結果---");
		if((myChoice.equals("r")) && (machineResult.equals("r"))) {
			System.out.println("あいこです");
		}else if((myChoice.equals("r")) && (machineResult.equals("s"))) {
			System.out.println("自分の勝ちです");
		}else if((myChoice.equals("r")) && (machineResult.equals("p"))) {
			System.out.println("自分の負けです");
		}else if((myChoice.equals("s")) && (machineResult.equals("s"))) {
			System.out.println("あいこです");
		}else if((myChoice.equals("s")) && (machineResult.equals("p"))) {
			System.out.println("自分の勝ちです");
		}else if((myChoice.equals("s")) && (machineResult.equals("r"))) {
			System.out.println("自分の負けです");
		}else if((myChoice.equals("p")) && (machineResult.equals("p"))) {
			System.out.println("あいこです");
		}else if((myChoice.equals("p")) && (machineResult.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else if((myChoice.equals("p")) && (machineResult.equals("s"))) {
			System.out.println("自分の負けです");
		}
		
	}

}
