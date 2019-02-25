package chapter_19;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
//		Target target = new ConcreteTarget();
//		target.request();
//
//		Target target2 = new Adapters();
//		target2.request();
		IUserInfo userInfo = new OuterUserInfo(new OuterUserBaseInfo(), new OuterUserHomeInfo(),
				new OuterUserOfficeInfo());
		System.out.println(userInfo.getUserName());
		System.out.println(userInfo.getMobileNumber());
		System.out.println(userInfo.getHomeAddress());
		System.out.println(userInfo.getHomeTelNumber());
		System.out.println(userInfo.getOfficeTelNumber());
		System.out.println(userInfo.getJobPosition());
	}

}
