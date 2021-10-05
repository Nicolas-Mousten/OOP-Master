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
    public String location;
    public int maxAmountOfAttendes;
    public Event(String bookingSystemName, String eventName, String date, String location, int maxAmountOfAttendes){
        super(bookingSystemName);
        this.date = date;
        this.eventName = eventName;
        this.location = location;
        this.maxAmountOfAttendes = maxAmountOfAttendes;
    }

    @Override
    public String toString() {
        return "Event{" +
                "bookingSystemName='" + bookingSystemName + '\'' +
                ", eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                ", maxAmountOfAttendes=" + maxAmountOfAttendes +
                '}';
    }
}
class Band extends Event{
    public int salary;
    public String bandName;
    public int minSalary;
    public Band(String bookingSystemName, String eventName, String date, String location, int maxAmountOfAttendes, String bandName, int salary, int minSalary){
        super(bookingSystemName, eventName, date, location, maxAmountOfAttendes);
        this.salary = salary;
        this.bandName = bandName;
        this.minSalary = minSalary;
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
                ", location='" + location + '\'' +
                ", maxAmountOfAttendes=" + maxAmountOfAttendes +
                ", salary=" + salary +
                ", bandName='" + bandName + '\'' +
                ", minSalary=" + minSalary +
                '}';
    }
}

class RunBookingSystem{
    public static void main(String[] args) {
        Band oneDevision = new Band("Kretin","Rock Fredag","13 September","Vestre Teglgade 18",260,"OneDevision",100,10000);
        oneDevision.salary = oneDevision.salary(oneDevision.salary, 100, 10000);
        Band heist = new Band("Kretin","Rock Fredag","13 September","Vestre Teglgade 18",260,"Heist",200,12000);
        heist.salary = oneDevision.salary(oneDevision.salary, 100, 10000);
        Band organic = new Band("Kretin","Rock Lørdag","14 September","Vestre Teglgade 18",290,"Organic",120,14000);
        organic.salary = oneDevision.salary(oneDevision.salary, 100, 10000);
        Band slither = new Band("Kretin","Rock Lørdag","14 September","Vestre Teglgade 18",290,"Slither",130,11000);
        slither.salary = oneDevision.salary(oneDevision.salary, 100, 10000);
        Band rouge = new Band("Kretin","Rock Lørdag","14 September","Vestre Teglgade 18",290,"Rouge",160,10500);
        rouge.salary = oneDevision.salary(oneDevision.salary, 100, 10000);
    }}
