package creational.builder;

/**
 * Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory
 * design patterns when the Object <b> contains a lot of attributes </b>.
 * There are three major issues when the Object contains a lot of attributes.
 *
 * <ul>
 *     <li>
 *         Too Many arguments to pass from client program to the Factory class that can be
 *         error prone because most of the time, the type of arguments are same and from
 *         client side its hard to maintain the order of the argument.
 *     </li>
 *     <li>
 *         Some of the parameters might be optional but in Factory pattern,
 *         we are forced to send all the parameters and optional parameters need to send as NULL.
 *     </li>
 *     <li>
 *         If the object is heavy and its creation is complex, then all that complexity
 *         will be part of Factory classes that is confusing.
 *     </li>
 * </ul>
 */
public class User {
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // All getter, and NO setter to provide immutability
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: " + this.firstName + ", " + this.lastName
                + ", " + this.age + ", " + this.phone + ", " + this.address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // Return the finally constructed User object
        public User build() {
            return new User(this);
        }
    }
}
