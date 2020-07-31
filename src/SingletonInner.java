/**
 * @Author SYZ
 * @create 2020-07-30 23:13
 */
public class SingletonInner {
    private static class SingletonHolder{
        private static final SingletonInner INSTANCE = new SingletonInner();
    }
    private SingletonInner(){}
    public static final SingletonInner getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
