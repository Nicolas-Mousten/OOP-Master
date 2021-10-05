public class BookingSystem {//Create the master class and there names
    public String bookingSystemName;
    public String eventName;
    public BookingSystem(String bookingSystemName, String eventName){
        this.bookingSystemName = bookingSystemName;
        this.eventName = eventName;
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
    public Event(String bookingSystemName, String eventName, String date){
        super(bookingSystemName, eventName);
        this.date = date;
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
    public Band(String bookingSystemName, String eventName, String date, int salary){
        super(bookingSystemName, eventName, date);
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
    }}

class RunBookingSystem{
    public static void main(String[] args) {
        Band oneDevision = new Band("To Fast For You", "Rock And Roll","13 September 2021",25000);
        oneDevision.salary = oneDevision.salary(oneDevision.salary, 100, );
        System.out.println(oneDevision);
    }}
