package chapter_22;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		HanFei hanFei = new HanFei();
		hanFei.addObserver(new LiSiSi());
		hanFei.addObserver(new ZhangSiSi());
		ZhangSiSi zhangSiSi = new ZhangSiSi();
		hanFei.addObserver(zhangSiSi);
		hanFei.haveBreakfast();
		System.out.println();
		hanFei.deleteObserver(zhangSiSi);
		hanFei.haveFun();
	}

}
