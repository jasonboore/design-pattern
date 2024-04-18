package design_pattern.singleton;

public class Singleton {
    // volatile 防止指令重排序
    // new 看似一行代码，实际进行了三步操作
    // 1. 分配对象的内存空间
    // 2. 初始化对象
    // 3. 设置instance指向刚分配的内存地址
    // 在这里，第二步和第三步可能会发生指令重排序，从而导致线程A刚执行完第三步，还没有指定第二步时
    // ，线程B来判断instance是否为空，
    // 此时instance已经指向内存地址空间了，因此不为空，所以直接返回导致出错（因为此时对象还没有初始化）
    private static volatile Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
