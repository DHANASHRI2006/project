
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testInsertAndFindUser() {
        User user = new User();
        user.setName("Dhanashri");
        user.setEmail("dhanashri@example.com");
        userRepository.save(user);

        assertThat(userRepository.findAll()).isNotEmpty();
    }
}

