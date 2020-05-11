package adapter.ticket;

import java.time.LocalDateTime;

/**
 * This is the type of ticket our garage
 * controller software expects.
 *
 * It uses the Java 8+ LocalDateTime.
 */
public interface FriendlyTicket {

    LocalDateTime getEnterTime();

    void setEnterTime(LocalDateTime enterTime);

    LocalDateTime getExitTime();

    void setExitTime(LocalDateTime exitTime);
}
