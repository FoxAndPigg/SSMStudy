package org.gosky.ssmstudy.service;

import org.gosky.ssmstudy.domain.User;

/**
 * Created by guozhong on 17/3/3.
 */
public interface UserService extends BaseService<User> {
    void add(User user);
}
