package chapter_19;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map<String, String> getUserOfficeInfo() {
		// TODO Auto-generated method stub
		HashMap<String, String> officeInfo = new HashMap<String, String>();
		officeInfo.put("jobposition", "this man's position");
		officeInfo.put("officeTelNumber", "this employee's office tel is 0001");

		return officeInfo;
	}

}
