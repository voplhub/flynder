package org.springframework.samples.mvc.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by psekar on 10/21/17.
 */
@Service
public class FBUsersService {


    @Autowired
    private FBUsersDao fbUsersDao;

    public void save(User user) {
        fbUsersDao.addUsers(user);
    }

    public User get(String userId) {
        return fbUsersDao.getUsers(userId);
    }

    public List<User> getUsers() {
        return fbUsersDao.getUsers();
    }

}
