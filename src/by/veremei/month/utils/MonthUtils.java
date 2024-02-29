package by.veremei.month.utils;

import by.veremei.month.Month;

public class MonthUtils {
    private final static Month JAN = new Month("January", 31, 23);
    private final static Month FEB = new Month("February", 28, 20);
    private final static Month MAR =  new Month("March", 31, 23);
    private final static Month APR =  new Month("April", 30, 22);
    private final static Month MAY = new Month("May", 31, 23);
    private final static Month JUN = new Month("June", 30, 22);
    private final static Month JUL = new Month("July", 31, 23);
    private final static Month AUG = new Month("August", 31, 23);
    private final static Month SEP = new Month("September", 30, 22);
    private final static Month OCT = new Month("October", 31, 23);
    private final static Month NOV = new Month("November", 30, 22);
    private final static Month DEC = new Month("December", 31, 23);

    public final static Month[] ALL_MONTH = {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    };
    public final static Month[] SUMMER = {
        JUN, JUL, AUG
    };
    public final static Month[] AUTUMN = {
        SEP, OCT, NOV
    };
    public final static Month[] WINTER = {
        DEC, JAN, FEB
    };
    public final static Month[] SPRING = {
        MAR, APR, MAY
    };

    public final static Month[] FIRST_QUARTER = {
        JAN, FEB, MAR
    };
    public final static Month[] SECOND_QUARTER = {
        APR, MAY, JUN
    };
    public final static Month[] THIRD_QUARTER = {
        JUL, AUG, SEP
    };
    public final static Month[] FOUR_QUARTER = {
        OCT, NOV, DEC
    };
    public final static Month[] FIRST_HALF_YEAR = {
        JAN, FEB, MAR, APR, MAY, JUN
    };
    public final static Month[] SECOND_HALF_YEAR = {
        JUL, AUG, SEP, OCT, NOV, DEC
    };
}
