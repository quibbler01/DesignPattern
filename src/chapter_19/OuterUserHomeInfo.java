package chapter_19;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map<String, String> getUserHomeInfo() {
		// TODO Auto-generated method stub
		HashMap<String, String> homeinfo = new HashMap<String, String>();
		homeinfo.put("homeTelNumber", "this employee's home telNumber is 010");
		homeinfo.put("homeAddress", "this employee's home address is BeiJing");
		return homeinfo;
	}

}
