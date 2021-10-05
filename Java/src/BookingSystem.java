public class BookingSystem {//Create the master class and there names
    public String bookingSystemName;
    public String eventName;
    public BookingSystem(String bookingSystemName){
        this.bookingSystemName = bookingSystemName;
    }

    @Override
    public String toString() {
        return "BookingSystem{" +
                "bookingSystemName='" + bookingSystemName + '\'' +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
class Event extends BookingSystem{//Creates the event and the date
    public String date;
    public Event(String bookingSystemName, String eventName, String date, String location, int maxAmountOfAttendes){
        super(bookingSystemName);
        this.date = date;
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Event{" +
                "bookingSystemName='" + bookingSystemName + '\'' +
                ", eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
class Band extends Event{
    public int salary;
    public Band(String bookingSystemName, String eventName, String date, String location, int maxAmountOfAttendes, String bandName, int salary, int minSalary){
        super(bookingSystemName, eventName, date, location, maxAmountOfAttendes);
        this.salary = salary;
    }
    public int salary(int input, int amount, int minSalary){
        int output = input;
        if (input<=minSalary){
            output = input * amount;
        }
        return output;
    }

    @Override
    public String toString() {
        return "Band{" +
                "bookingSystemName='" + bookingSystemName + '\'' +
                ", eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class RunBookingSystem{
    public static void main(String[] args) {
        Band oneDevision = new Band();
        oneDevision.salary = oneDevision.salary(oneDevision.salary, 100, 10000);
        System.out.println(oneDevision);
    }}
