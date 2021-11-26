public class UserService {

    public void join(String name, String password) {
        if (!PasswordValidator.validate(password)) {
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }

        User joinUser = new User(name, password);
        UserRepository.save(joinUser);

    }

    static class PasswordValidator {
        static boolean validate(String password) {
            return false;
        }
    }

    static class UserRepository {

        static void save(User user) {

        }

    }

    class User {

        private String name;
        private String password;

        public User(String name, String password) {
            this.name = name;
            this.password = password;
        }
    }

}
