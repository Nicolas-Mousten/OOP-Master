package Classes;
//Kig på kontrakter
//lav det så det er mere som et bookingsystem
//husk min specielle array+1 element

class Event extends BookingSystem {//Creates the event and the date
    public String date;                             //Nicolas
    public String location;                         //Nicolas
    public int maxAmountOfAttendes;                         //Nicolas
    public Band[] bookedBand;                         //Nicolas
    public Event(String bookingSystemName, String eventName, String date, String location, int maxAmountOfAttendes, Band[] bookedBand){                         //Nicolas
        super(bookingSystemName);                         //Nicolas
        this.date = date;                         //Nicolas
        this.eventName = eventName;                         //Nicolas
        this.location = location;                         //Nicolas
        this.maxAmountOfAttendes = maxAmountOfAttendes;                         //Nicolas
        this.bookedBand = bookedBand;                         //Nicolas
    }
    public void printBands(){                         //Nicolas
        //For loop for array of bands
    }
    @Override
    public String toString() {                         //Nicolas
        return "Event{" +                         //Nicolas
                "bookingSystemName='" + bookingSystemName + '\'' +                         //Nicolas
                ", eventName='" + eventName + '\'' +                         //Nicolas
                ", date='" + date + '\'' +                         //Nicolas
                ", location='" + location + '\'' +                         //Nicolas
                ", maxAmountOfAttendes=" + maxAmountOfAttendes +                         //Nicolas
                ", bookedBand=" + bookedBand +                         //Nicolas
                '}';                         //Nicolas
    }
}