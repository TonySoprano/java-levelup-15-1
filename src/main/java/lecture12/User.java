package lecture12;

/**
 * Class {@link lecture12.User}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 22.07.2015
 */
public class User {

    public String name;
    public String surname;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(!User.class.equals(obj.getClass())) {
            return false;
        }
        User user = (User) obj;
        if(!this.surname.equals(user.surname)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
