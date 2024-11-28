package dto;

public class UserBuilder {
    private String username;
    private String password;

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserDTO build() {
        return new UserDTO(username, password);
    }
}
