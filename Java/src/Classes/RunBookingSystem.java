package Classes;

class RunBookingSystem{
    public static void main(String[] args) {                         //Nicolas
        Band oneDevision = new Band("OneDevision",15000,10000);                         //Nicolas
        Band[] arrayBands = {oneDevision};                         //Nicolas
        Event rockAndRoll = new Event("To good for you","Rock & Roll", "13 September 2021", "Vestre teglgade 18", 500, arrayBands);                         //Nicolas
        System.out.println(rockAndRoll);                         //Nicolas
    }}