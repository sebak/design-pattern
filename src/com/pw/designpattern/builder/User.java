package com.pw.designpattern.builder;

public class User {
    private String name; // required field
    private String email; //  required field
    private String phone; // optional field
    private String city; // optional field

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.getName();
        this.email = userBuilder.getEmail();
        this.phone = userBuilder.getPhone();
        this.city = userBuilder.getCity();
    }

    public static UserBuilder builder(String name, String email) {
        return new UserBuilder(name, email);
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User = " +
                "{ name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", phone: '" + phone + '\'' +
                ", city: '" + city + '\'' +
                " }";
    }

    // builder class
    public static class UserBuilder {
        private String name; // required field
        private String email; //  required field
        private String phone = "unknown"; // optional field
        private String city = "unknown"; // optional field

        public UserBuilder(){}

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }

        // getters
        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        User user1 = User
                .builder("John", "john@abc@gmail.com") // have to be a static method to use ClassName.method()
                .build();

        System.out.println(user1); // User = { name: 'John', email: 'john@abc@gmail.com', phone: 'unknown', city: 'unknown' }

        User user2 = User
                .builder("Mary", "mary@abc@gmail.com")
                .city("Colombo")
                .build();

        System.out.println(user2); // User = { name: 'Mary', email: 'mary@abc@gmail.com', phone: 'unknown', city: 'Colombo' }

        User user3 = User
                .builder()
                .name("Peter")
                .email("peter@abc@gmail.com")
                .city("Colombo")
                .build();

        System.out.println(user3); // User = { name: 'Peter', email: 'peter@abc@gmail.com', phone: 'unknown', city: 'Colombo' }
    }
}
