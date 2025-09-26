package util;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeUtil {

    public static final DateTimeFormatter DATE_FORMATTER
            = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);

    public static final DateTimeFormatter TIME_FORMATTER
            = DateTimeFormatter.ofPattern("HH:mm");

    public static final DateTimeFormatter DATE_TIME_FORMATTER
            = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm", Locale.ENGLISH);
}
