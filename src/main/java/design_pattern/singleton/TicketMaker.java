package design_pattern.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketMaker {
    private AtomicInteger ticket = new AtomicInteger(1000);
    public int getNextTicketNumber() {
        return ticket.getAndAdd(1);
    }

    private TicketMaker() {}

    private static final class TicketMakerHolder {
        static TicketMaker ticketMaker = new TicketMaker();
    }

    public static TicketMaker getInstance() {
        return TicketMakerHolder.ticketMaker;
    }
}
