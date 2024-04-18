package design_pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Triple {
    static volatile Map<Integer, Triple> instanceMap = new ConcurrentHashMap<>();

    private Triple(){}

    public static Triple getInstance(int id) {
        if (id >= 0 && id < 3) {
            if (!instanceMap.containsKey(id)) {
                synchronized (Triple.class) {
                    if (!instanceMap.containsKey(id)) {
                        instanceMap.put(id, TripleHolder.instance);
                    }
                }
            }
            return instanceMap.get(id);
        }
        System.out.println("id出错！");
        return null;
    }

    private static final class TripleHolder {
        public static Triple instance = new Triple();
    }



}
