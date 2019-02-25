package chapter_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clent {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		HummerH1Model hummerModel = new HummerH1Model();
		try {
			System.out.println("«Î ‰»Î «∑Ò∆Ù”√¿Æ∞»£ø0/1");
			String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			System.out.println(type);
			if (type.equals("0")) {
				hummerModel.setAlarmFlag(false);
			}
			hummerModel.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
