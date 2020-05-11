package adapter.ticket;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * This adapter implements FriendlyTicket, so it will be
 * accepted by our garage controller software. Inside,
 * it contains a LegacyTicket object which has been issued
 * by one of the out-of-date ticket machines.
 *
 * The adapter's job is to translate the data stored by
 * the old ticket into new-ticket-looking data. (In other
 * words, convert a java.util.Date to a java.time.LocalDateTime)
 */
public class FriendlyTicketAdapter implements FriendlyTicket {

    private LegacyTicket legacyTicket;

    public FriendlyTicketAdapter(LegacyTicket legacyTicket) {
        this.legacyTicket = legacyTicket;
    }

    @Override
    public LocalDateTime getEnterTime() {
        return translate(legacyTicket.getCheckIn());
    }

    @Override
    public void setEnterTime(LocalDateTime enterTime) {
        legacyTicket.setCheckIn(translate(enterTime));
    }

    @Override
    public LocalDateTime getExitTime() {
        return translate(legacyTicket.getCheckOut());
    }

    @Override
    public void setExitTime(LocalDateTime exitTime) {
        legacyTicket.setCheckOut(translate(exitTime));
    }

    /**
     * I had to Google this method
     * @param date A legacy date
     * @return A modern date
     */
    private LocalDateTime translate(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * And this one too ;)
     * @param ldt A modern date
     * @return A legacy date
     */
    private Date translate(LocalDateTime ldt) {
        ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
        return Date.from(zdt.toInstant());
    }
}
