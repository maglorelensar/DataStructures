
package bagliliste;

import java.util.Objects;


public class Human {
    public String NameSurname;
    public int age;

    public Human(String NameSurname, int age) {
        this.NameSurname = NameSurname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{"  + NameSurname + "," + age + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.NameSurname);
        hash = 97 * hash + this.age;
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
        final Human other = (Human) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.NameSurname, other.NameSurname)) {
            return false;
        }
        return true;
    }

  
    
}
