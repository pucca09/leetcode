package decoration_mode;

/**
 * Created by chenqingqing on 2017/4/3.
 */
/**
 * 烤食物
 *
 */
public class SteamFood extends FoodDecoration {
    //被装饰者
    private Food food;

    public SteamFood(Food f){
        this.food = f;
    }

    @Override
    public String getName() {
        return getDecoration() + food.getName();
    }

    private String getDecoration(){
        return "蒸";
    }
}
