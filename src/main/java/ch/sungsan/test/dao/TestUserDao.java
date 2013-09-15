package ch.sungsan.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ch.sungsan.test.model.TestUserVo;

public interface TestUserDao {

	public List<TestUserVo> getTestUserList();
	
	public TestUserVo getTestUser(int userId);
	
	public int postTestUser(@Param("userName") String userName, 
			@Param("userAddress") String userAddress, 
			@Param("userAge") int userAge);
	
	public int putTestUser(
			@Param("userId") int userId,
			@Param("userName") String userName, 
			@Param("userAddress") String userAddress, 
			@Param("userAge") int userAge);
	
	public TestUserVo deleteTestUser(int userId);

}
