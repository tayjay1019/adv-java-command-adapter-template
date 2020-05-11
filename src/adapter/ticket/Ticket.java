package adapter.ticket;

import java.time.LocalDateTime;

/**
 * An implementation of a ticket. This is what
 * is issued by our up-to-date ticket machines,
 * and what our garage controller software expects
 * to receive.
 *
 * It stores check-in and check-out times as
 * LocalDateTimes.
 */
public class Ticket implements FriendlyTicket {

    private LocalDateTime enterTime;

    private LocalDateTime exitTime;

    @Override
    public LocalDateTime getEnterTime() {
        return enterTime;
    }

    @Override
    public void setEnterTime(LocalDateTime enterTime) {
        this.enterTime = enterTime;
    }

    @Override
    public LocalDateTime getExitTime() {
        return exitTime;
    }

    @Override
    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

}
