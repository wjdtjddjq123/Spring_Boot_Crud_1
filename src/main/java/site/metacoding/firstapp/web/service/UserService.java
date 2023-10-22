package site.metacoding.firstapp.web.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.user.User;
import site.metacoding.firstapp.domain.user.UserDao;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserDao userDao;

    public User findById(Integer userId) {
        User userPS = userDao.findById(userId);
        return userPS;
    }

}