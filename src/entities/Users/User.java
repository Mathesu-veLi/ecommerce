package entities.Users;

import java.util.UUID;

public abstract class User {
  protected String uuid = UUID.randomUUID().toString();
  protected String name;
  protected String email;
  protected String password;
  // TODO: Creates a hash of password

  public User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public User() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }
}