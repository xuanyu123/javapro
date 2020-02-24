package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * @author xuanyu
 * @date 2020-02-23 11:56 下午
 */
public interface UserDao {
    /**
    * 根据用户名查询用户信息
     * @param username
     * @return
    * */
    public User findByUsername(String username);

    /**
    * 用户保存
     * @param user
    * */
    public void save(User user);
}
