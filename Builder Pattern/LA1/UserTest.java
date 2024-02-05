package BuilderPattern;

public class UserTest {
    public static void main(String[] args){
        User user = new User.UserBuilder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@example.com")
                .address("123 Main St")
                .phone("555-1234")
                .age(30)
                .build();

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getEmail());
        System.out.println(user.getAddress());
        System.out.println(user.getPhone());
        System.out.println(user.getAge());

    }
}
