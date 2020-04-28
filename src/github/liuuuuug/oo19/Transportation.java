package github.liuuuuug.oo19;

/**
 * @ClassName: Transportation
 * @Description: TODO
 * @author: liuuuuug
 * @date: 2020/4/12  19:19
 * 交通工具类
 */
public abstract class Transportation {
    private String number;
    private String model;
    private String admin;

    public Transportation() {
        super();
    }
    public Transportation(String number,String model,String admin){
        this.number=number;
        this.model=model;
        this.admin=admin;
    }
    public abstract void transport();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
