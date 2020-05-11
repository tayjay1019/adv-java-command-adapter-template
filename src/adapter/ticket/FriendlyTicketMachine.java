package adapter.ticket;

/**
 * Our modern ticket machines that are fully
 * compatible with our garage controller
 * software.
 */
public class FriendlyTicketMachine {

    public FriendlyTicket getTicket() {
        return new Ticket();
    }

}
