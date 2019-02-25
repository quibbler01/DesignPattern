package chapter_5;

import java.util.List;

public class GroupLeader {
	private List<Girl> girls;

	public GroupLeader(List<Girl> girls) {
		this.girls = girls;
	}
	
	public int count() {
		System.out.println(girls.size());
		return girls.size();
	}
}
