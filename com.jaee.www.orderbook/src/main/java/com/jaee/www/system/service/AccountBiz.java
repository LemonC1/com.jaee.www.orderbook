package com.jaee.www.system.service;

import com.jaee.www.entity.User;

/**
 * Created by c0de8ug on 16-2-14.
 */
public interface AccountBiz {

    public User findByIdAndPassword(String username, String password);

    public void updatePassword(String id, String password);
}
