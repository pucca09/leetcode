package decoration_mode;


/**
 * 鸡肉
 * @author xinye
 *
 */
public class Chicken extends Food {
    //构造器
    public Chicken(){
        name = "鸡肉";
    }
    @Override
    public String getName() {
        return name;
    }

}