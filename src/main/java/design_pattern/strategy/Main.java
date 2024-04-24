package design_pattern.strategy;

public class Main {
    public static void main(String[] args) {
//        if (args.length != 2) {
//            System.out.println("Usage: java Main randomseed1 randomseed2");
//            System.out.println("Example: java Main 314 15");
//            System.exit(0);
//        }
        int seed1 = 314;
        int seed2 = 15;
        StrategyManager strategyManager = new StrategyManager()
                .addStrategy(new WinnerStrategy(seed1))
                .addStrategy(new ProbStrategy(seed2))
                .addStrategy(new RandomStrategy(seed1));
        Player p1 = new Player("Taro", strategyManager.getStrategy(0));
        Player p2 = new Player("Hana", strategyManager.getStrategy(2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + p1);
                p1.win();
                p2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner:" + p2);
                p2.win();
                p1.lose();
            } else {
                System.out.println("Even...");
                p1.even();
                p2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(p1);
        System.out.println(p2);
    }
}
