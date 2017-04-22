package decoration_mode;

/**
 * Created by chenqingqing on 2017/4/3.
 */
public class test {
    public static void main(String[] args) {
        // 测试单纯的食物
        Food f1 = new Chicken();
        System.out.println(f1.getName());

        System.out.println("----------------------");
        // 测试单重修饰的食物
        RoastFood rf = new RoastFood(f1);
        System.out.println(rf.getName());

        System.out.println("----------------------");
        // 测试多重修饰的食物
        SteamFood sf = new SteamFood(rf);
        System.out.println(sf.getName());
    }
}
