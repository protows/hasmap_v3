package lesson_8.hash4;

import java.util.Objects;

public class User {
    Long id;
    String name;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}
