/**
 * @Author SYZ
 * @create 2020-07-30 16:32
 */
public class SingletonDCL {
    private static volatile SingletonDCL instance;
    private SingletonDCL(){}

    public static SingletonDCL getInstance() {
        if(instance == null){
            synchronized (SingletonDCL.class){
                if(instance == null){
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}

