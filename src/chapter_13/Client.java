package chapter_13;

import java.util.Random;

public class Client {

	private static int count = 6;
	Object object;
	public static void main_(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
//		Mail mail = new Mail(new AdvTemplate());
//		mail.setTail("XX Bank All Rights Reserves");
//		while (i < count) {
//			Mail cloneMail = mail.clone();
//			cloneMail.setAppellation(getRandString(5) + "Mr.(Ms.)");
//			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
//			sendMail(cloneMail);
//			++i;
//		}
		
		TestDeepClone testDeepClone = new TestDeepClone();
		testDeepClone.setValue("Zhao");
		TestDeepClone testDeepClone2 = testDeepClone.clone();
		testDeepClone2.setValue("Peng");
		System.out.println(testDeepClone2.getValue());
		System.out.println(testDeepClone.getValue());
		
	}

	public static void sendMail(Mail mail) {
		System.out.println("Title:" + mail.getSubject() + "\tReceiver:" + mail.getReceiver() + "\t...Send Success");
	}

	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyz";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < maxLength; ++i) {
			sb.append(source.charAt(random.nextInt(maxLength)));
		}
		return sb.toString();
	}
}
