import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime DATE;
    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.DATE = moment;
    }

    public LocalDateTime getDateTime() {
        return DATE.plusSeconds(1_000_000_000);
    }
}
