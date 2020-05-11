package adapter.ticket;

import java.util.Date;

/**
 * This is an older style of ticket used by pre-Java 8
 * machines. It uses the older Date class instead of
 * LocalDateTime, so is incompatible with our newer
 * garage software.
 */
public class LegacyTicket {

    private Date checkIn;
    private Date checkOut;

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
