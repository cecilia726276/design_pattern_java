/**
 * @Author SYZ
 * @create 2020-07-30 16:23
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager(){}

    public static SingletonEager getInstance() {
        return instance;
    }
}
