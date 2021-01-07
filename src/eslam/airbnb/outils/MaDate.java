package eslam.airbnb.outils;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MaDate extends Date {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public MaDate(int day, int month, int year){
        super(year - 1900,month - 1, day );

    }
    public String toString() {
        return DATE_FORMAT.format(this);
    }


}
