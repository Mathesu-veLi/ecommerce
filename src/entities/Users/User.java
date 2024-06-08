package entities.Users;

public abstract class User {
  private String id;
  // TODO: Creates a id using a java uuid generator
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

// TODO: Creates IUser with id, name, email, password and generateId()
// TODO: Creates class CommonUser implementing IUser to buyers
// TODO: Creates class AdminUser implementing IUser to administrators