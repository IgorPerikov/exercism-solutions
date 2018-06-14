import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(localDateTime: LocalDateTime) {
    constructor(localDate: LocalDate) : this(LocalDateTime.of(localDate, LocalTime.MIDNIGHT))
    val date = localDateTime.plusSeconds(1_000_000_000)
}
