import com.yyl.dao.UserMapper;
import com.yyl.pojo.User;
import com.yyl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(5);

        sqlSession.close();

    }

     /*List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        User userById = mapper.getUserById(1);
        System.out.println(userById);*/

        //mapper.addUser(new User(6,"hello","123123"));

        //mapper.updateUser(new User(6,"to","21312"));
}
