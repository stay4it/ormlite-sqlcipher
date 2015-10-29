package com.stay4it.sample.db;

import com.j256.ormlite.dao.Dao;
import com.stay4it.sample.model.User;

import java.sql.SQLException;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class UserDAO extends BaseDAO<User> {
    private static UserDAO instance;

    private UserDAO() {
    }

    public synchronized static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }

    @Override
    public Dao<User, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(User.class);
    }
}
