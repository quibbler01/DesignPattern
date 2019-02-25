package chapter_7;

public class Minister {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<3;++i) {
			MutileSingleton emperor = MutileSingleton.getSingleton();
			emperor.say();
		}
	}

}
