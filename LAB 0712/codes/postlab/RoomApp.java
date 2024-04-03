public class RoomApp {
    
    public static void main(String[] args) {
        // Array of superclass
        FormalRoom[] rooms = new FormalRoom[10];

        // sample data - START (no need to copy)
        rooms[0] = new ConferenceRoom("UiTM", 120, 4, "halfday", true);
        rooms[1] = new ConferenceRoom("Celcom", 45, 4, "halfday", false);
        rooms[2] = new MeetingRoom("MOH", 170, 8, 1);
        rooms[3] = new ConferenceRoom("Proton", 210, 8, "fullday", true);
        rooms[4] = new ConferenceRoom("Maybank", 90, 4, "halfday", true);
        rooms[5] = new MeetingRoom("Gardenia", 73, 4, 2);
        rooms[6] = new ConferenceRoom("Unisel", 35, 4, "halfday", false);
        rooms[7] = new MeetingRoom("Vida Beauty", 42, 8, 1);
        rooms[8] = new ConferenceRoom("KPM", 280, 8, "fullday", true);
        rooms[9] = new MeetingRoom("Maxis", 28, 4, 2);
        // sample data - END

        // i ) Calculate total payment
        double totalPayment = 0.0;
        for (int i = 0; i < rooms.length; i++) {
            FormalRoom room = rooms[i];
            if (room instanceof ConferenceRoom) {
                totalPayment += ((ConferenceRoom) room).calcConferenceRoomCost();
            } else if (room instanceof MeetingRoom) {
                totalPayment += ((MeetingRoom) room).calcMeetingRoomCost();
            }
        }

        System.out.println("Total Payment: RM" + totalPayment);

        //ii ) Count conference room bookings with food requests
        int conferenceRoomsWithFood = 0;
        for (int i = 0; i < rooms.length; i++) {
            FormalRoom room = rooms[i];
            if (room instanceof ConferenceRoom && ((ConferenceRoom) room).isFoods()) {
                conferenceRoomsWithFood++;
            }
        }

        System.out.println("Number of conference room bookings with food requests: " + conferenceRoomsWithFood);

        // iii) Print organization names that book the regular recurring meeting room
        System.out.println("Organization names that book the regular recurring meeting room:");
        for (int i = 0; i < rooms.length; i++) {
            FormalRoom room = rooms[i];
            if (room instanceof MeetingRoom && ((MeetingRoom) room).getTypeOfBooking() == 2) {
                System.out.println(((MeetingRoom) room).getOrgName());
            }
}
}

}