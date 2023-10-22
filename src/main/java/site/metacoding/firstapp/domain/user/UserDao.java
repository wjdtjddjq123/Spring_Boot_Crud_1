package site.metacoding.firstapp.domain.user;

import java.util.List;

import site.metacoding.firstapp.domain.product.Product;

public interface UserDao {

    public User findById(Integer userId);

    public List<User> findAll();
//    하나의 행을 찾을 땐 User 타입을 맞춰줘야한다.
//    여러행을 찾을떈 List로 행을 찾는다.

    public void insert(User user);

    public void update(User user);

    public void delete(Integer userId);
    //  where조건을 Id로 걸기때문에 한 번에 삭제
    //  변하는 얘들은 변수로 따로 관리를 해야함.
}