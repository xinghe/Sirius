package xyz.ret.sirius.dao;

import xyz.ret.sirius.model.User;

import java.util.List;

/**
 * Created by fury on 17-2-11.
 */
public interface IUserDao {
    List<User> findAll();
    User findById(int id);
}
