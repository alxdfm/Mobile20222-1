package br.edu.uniritter.mobile.mobile20222_1.model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
  private List<User> users;

  public UserList() {
    this.users = new ArrayList<>();
    users.add( new User(1, "Chris Brown", "cbrown", "chris1234"));
    users.add( new User(2, "Johnny White", "johnninho", "white4321"));
    users.add( new User(3, "Michael Gray", "michaelg", "mg1234567"));
    users.add( new User(4, "Anna Yellow", "annallow", "aninhadoida0102"));
  }

  public List<User> getUsers() {
    return users;
  }
}
