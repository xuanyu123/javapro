package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author xuanyu
 * @date 2020-02-23 11:52 下午
 */
public interface UserService {

    /**
     * 注册用户
     * @param user
     * @return
     * */
    boolean regist(User user);
}
