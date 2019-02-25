package chapter_5;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		List<Girl> girls = new ArrayList<Girl>();
		for (int i = 0; i < 20; i++) {
			girls.add(new Girl());
		}
		Teacher teacher = new Teacher();
		teacher.commond(new GroupLeader(girls));
		new InstallSoftware().install(new Wizard());
	}

}
