package design_pattern.abstract_factory;

public class Main {
    public static void main(String[] args) {
        Factory haierFactory = new HaierFactory();
        Factory hisenseFactory = new HisenseFactory();
        Client haierClient = new Client(haierFactory);
        Client hisenseClient = new Client(hisenseFactory);
        System.out.println(haierClient.getTV().getName());
        System.out.println(haierClient.getFreezer().getName());
        System.out.println(hisenseClient.getTV().getName());
        System.out.println(hisenseClient.getFreezer().getName());
    }
}
