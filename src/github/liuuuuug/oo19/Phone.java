package github.liuuuuug.oo19;

/**
 * @ClassName: Phone
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  19:51
 */
public class Phone implements GPS{
    public Phone() {
    }

    @Override
    public String showCoordinate() {
        String locartion="100,333";
        return locartion;
    }
}

