package kadai_015;

//Java基礎　15章課題：車クラスを作って速度を出力

public class Car_Chapter15 {
	
	//フィールド設定：　メンバー変数設定
	private int gear  = 1;
	private int speed = 10;

	//メソッド作成
	//ギアの値により速度を変える
	public void gearCange(int afterGear) {
		gear = afterGear;
	}
		
	//ギアチェンジ後の速度を表示する
	public void run(){
		
		switch(gear){
			case 1  -> speed = 10;
			case 2  -> speed = 20;
			case 3  -> speed = 30;
			case 4  -> speed = 40;
			case 5  -> speed = 50;
			default -> speed = 10;
		}
		
		System.out.println("現在のギアは" + gear + "速で、スピードは" + speed + "です。");
	}
		
}
