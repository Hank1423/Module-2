public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int lastDayOfMonth = getLastDayOfMonth(month, year);

        if (day == lastDayOfMonth) {
            if (month == 12) {
                return "1/1/" + (year + 1);
            } else {
                return "1/" + (month + 1) + "/" + year;
            }
        } else {
            return (day + 1) + "/" + month + "/" + year;
        }
    }

    private static int getLastDayOfMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 0;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}