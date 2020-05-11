package adapter.ticket;

/**
 * An outdated machine that spits out tickets
 * that are not compatible with our latest
 * controller software.
 */
public class LegacyTicketMachine {

    public LegacyTicket getTicket() {
        return new LegacyTicket();
    }

}
