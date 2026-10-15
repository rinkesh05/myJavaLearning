 class LeapYearCalendar {
    public static void main(String[] args) {
        int year = 1900;
        int month = 2;
        int days = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }

        if (month >= 1 && month <= 12 && year > 0 && days > 0) {
            System.out.println("Year: " + year + ", Month: " + month + " has " + days + " days.");
        } else {
            System.out.println("Invalid date parameters.");
        }
    }
}
