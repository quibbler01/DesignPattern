package chapter_1;

public interface IUserBiz {
	boolean changePassword(String newPaword);
	boolean deleteUser(IUserBo userBo);
	void mapUser(IUserBo userBo);
	boolean addOrg(IUserBo userBo,int orgID);
	boolean addRole(IUserBo userBo,int roleID);
}
