package Classes;

public class BookingSystem {//Create the master class and there names
    public String bookingSystemName;                         //Nicolas
    public String eventName;                         //Nicolas
    public BookingSystem(String bookingSystemName, String eventName){                         //Nicolas
        this.bookingSystemName = bookingSystemName;
        this.eventName = eventName;                     //Mo
    }

    @Override
    public String toString() {                         //Nicolas
        return "Classes.BookingSystem{" +                         //Nicolas
                "bookingSystemName='" + bookingSystemName + '\'' +                         //Nicolas
                ", eventName='" + eventName + '\'' +                         //Nicolas
                '}';                         //Nicolas
    }                         //Nicolas
}




