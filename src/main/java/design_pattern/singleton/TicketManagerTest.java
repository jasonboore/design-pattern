package design_pattern.singleton;

public class TicketManagerTest {
    public static void main(String[] args) {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() +  ticketMaker1.getNextTicketNumber());

            new Thread(() -> System.out.println(Thread.currentThread().getName() + "," +  ticketMaker2.getNextTicketNumber())).start();
        }

    }

}
