package Classes;
//Kig på kontrakter
//lav det så det er mere som et bookingsystem
//husk min specielle array+1 element

class Event extends BookingSystem {//Creates the event and the date
    public String date;                             //Nicolas
    public String location;                         //Nicolas
    public int maxAmountOfAttendes;                         //Nicolas
    public Band[] bookedBand;                         //Nicolas
    public String stringBookedBand = "";
    public Event(String bookingSystemName, String eventName, String date, String location, int maxAmountOfAttendes, Band[] bookedBand) {
        super(bookingSystemName, eventName);
        this.date = date;
        this.location = location;
        this.maxAmountOfAttendes = maxAmountOfAttendes;

        for (int i = 0; i < bookedBand.length; i++) { //Nicolas/Mo
            stringBookedBand += bookedBand[i] + ", ";
        }

    }





    @Override
    public String toString() {                         //Nicolas
        return "Event{" +                         //Nicolas
                "bookingSystemName='" + bookingSystemName + '\'' +                         //Nicolas
                ", eventName='" + eventName + '\'' +                         //Nicolas
                ", date='" + date + '\'' +                         //Nicolas
                ", location='" + location + '\'' +                         //Nicolas
                ", maxAmountOfAttendes=" + maxAmountOfAttendes +                         //Nicolas
                ", bookedBand=" + stringBookedBand +                         //Nicolas
                '}';                         //Nicolas
    }
}