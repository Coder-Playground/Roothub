package cn.roothub.service;

import java.util.List;
import java.util.Map;
import cn.roothub.dto.PageDataBody;
import cn.roothub.entity.AdminUser;
import cn.roothub.entity.Role;

/**
 * @author miansen.wang
 * @date 2019年2月26日 下午22:21:57
 */
public interface AdminUserService {

	// 根据用户名获取后台用户
	AdminUser getByName(String name);
	
	// 根据ID获取后台用户
	AdminUser getById(Integer id);
	
	// 获取所有的后台用户
	PageDataBody<AdminUser> page(Integer pageNumber, Integer pageSize);
	
	// 获取所有的后台用户以及对应的角色列表
	PageDataBody<AdminUser> pageRoles(Integer pageNumber, Integer pageSize);
	
	/**
	 * 新增后台用户
	 * @param username: 用户名
	 * @param password: 密码
	 * @param roleIds: 角色ID数组
	 */
	void save(String username,String password,Integer[] roleIds);
	
	/**
	 * 更新后台用户
	 * @param id: 后台用户ID
	 * @param username: 用户名
	 * @param password: 密码
	 * @param roleIds: 角色ID数组
	 */
	void update(Integer id,String username,String password,Integer[] roleIds);
	
	// 删除后台用户
	void removeById(Integer id);
	
	// 统计所有后台用户
	int countAll();
}
