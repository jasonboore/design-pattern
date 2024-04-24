package design_pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyManager {
    List<Strategy> strategies;
    public StrategyManager() {
        strategies = new ArrayList<>();
    }

    public StrategyManager addStrategy(Strategy strategy) {
        strategies.add(strategy);
        return this;
    }

    public Strategy getStrategy(int strategyNum) {
        return strategies.stream().filter(strategy -> strategy.support(strategyNum)).findFirst().get();
    }

}
