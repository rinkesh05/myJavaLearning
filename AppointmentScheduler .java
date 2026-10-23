 class AppointmentScheduler {
    public static void main(String[] args) {
        int existingStart = 900;
        int existingEnd = 1130;
        int newStart = 1030;
        int newEnd = 1200;
        boolean isVipRequest = true;

        if (newStart < 0 || newStart >= 2400 || newEnd < 0 || newEnd >= 2400 || newStart >= newEnd) {
            System.out.println("Booking Rejected: Invalid clock times provided.");
        } else {
            if (newEnd <= existingStart || newStart >= existingEnd) {
                System.out.println("Booking Confirmed: Timeslot is fully available.");
            } else {
                if (isVipRequest) {
                    System.out.println("Booking Confirmed: Schedule collision resolved by VIP priority override.");
                } else {
                    System.out.println("Booking Rejected: Overlaps with an existing reservation.");
                }
            }
        }
    }
}
