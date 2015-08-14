package lecture11;

/**
 * Class {@link lecture11.User}
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
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
