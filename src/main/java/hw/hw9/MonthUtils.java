package hw.hw9;

public class MonthUtils {

    public static Month january = new Month("January", 31, 18);
    public static Month february = new Month("February", 29, 21);
    public static Month march = new Month("March", 31, 20);
    public static Month april = new Month("April", 30, 20);
    public static Month may = new Month("May", 31, 21);
    public static Month june = new Month("June", 30, 23);
    public static Month july = new Month("July", 31, 22);
    public static Month august = new Month("August", 31, 20);
    public static Month september = new Month("September", 30, 22);
    public static Month october = new Month("October", 31, 23);
    public static Month november = new Month("November", 30, 21);
    public static Month december = new Month("December", 31, 22);

    public static Month[] allMonth = {january, february, march, april, may,
                                        june, july, august, september, october,
                                        november, december};
    public static Month[] summerMonth = {june, july, august};
}
