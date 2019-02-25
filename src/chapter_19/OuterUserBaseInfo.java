package chapter_19;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {

	@Override
	public Map<String, String> getUserBaseInfo() {
		// TODO Auto-generated method stub
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put("username", "this employee named ZhangSan");
		baseInfoMap.put("mobileNumber", "this employee's tel is 010-23**343");

		return baseInfoMap;
	}

}
