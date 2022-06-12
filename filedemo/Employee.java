package filedemo;

import java.util.Arrays;

public class Employee {
    public int id;
    public String name;
    public String email;
    public String[] roles;
    public boolean manager;

    public Employee(int id, String name, String email, String[] roles, boolean manager) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String[] getRoles() {
        return roles;
    }

    public boolean isManager() {
        return manager;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role=" + Arrays.toString(roles) +", manager="+manager+
                '}';
    }
}
