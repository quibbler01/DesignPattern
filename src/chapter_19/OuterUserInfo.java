package chapter_19;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {
	private IOuterUserBaseInfo baseInfo = null;
	private IOuterUserHomeInfo homeInfo = null;
	private IOuterUserOfficeInfo officeInfo = null;

	private Map<String, String> baseMap = null;
	private Map<String, String> homeMap = null;
	private Map<String, String> officeMap = null;

	public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
		this.baseMap = baseInfo.getUserBaseInfo();
		this.homeMap = homeInfo.getUserHomeInfo();
		this.officeMap = officeInfo.getUserOfficeInfo();
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return baseMap.get("username");
	}

	@Override
	public String getMobileNumber() {
		// TODO Auto-generated method stub
		return baseMap.get("mobileNumber");
	}

	@Override
	public String getOfficeTelNumber() {
		// TODO Auto-generated method stub
		return officeMap.get("officeTelNumber");
	}

	@Override
	public String getJobPosition() {
		// TODO Auto-generated method stub
		return officeMap.get("jobposition");
	}

	@Override
	public String getHomeTelNumber() {
		// TODO Auto-generated method stub
		return homeMap.get("homeTelNumber");
	}

	@Override
	public String getHomeAddress() {
		// TODO Auto-generated method stub
		return homeMap.get("homeAddress");
	}

}
