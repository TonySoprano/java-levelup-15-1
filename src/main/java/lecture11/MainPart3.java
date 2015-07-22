package lecture11;

/**
 * Class {@link lecture11.MainPart3}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 22.07.2015
 */
public class MainPart3 {
    public static BadContainer container1 = new BadContainer();
    public static BadContainer container2 = new BadContainer();
    public static void main(String[] args) {
        container1.add(1);
        container1.add(1.2);
        container1.add("asdasd");
        container1.add(new User());
        User user = (User) container1.get(3);
        System.out.println(user.name);
    }



}
