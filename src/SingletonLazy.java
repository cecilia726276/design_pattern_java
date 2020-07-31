/**
 * @Author SYZ
 * @create 2020-07-29 16:01
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    // 构造函数私有化
    private SingletonLazy(){};
    // 加锁，影响性能，适用于getInstance不经常被调用的场景
    public static synchronized SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}