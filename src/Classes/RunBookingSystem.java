package Classes;

class RunBookingSystem{
    public static void main(String[] args) {                         //Nicolas
        String[] bandNames = {"Samuel","Muhammed","Nicolas"};
        BandContract oneDevisionContract = new BandContract("13 September 2021",bandNames,"Out of band","hello"); //Mo

        Band oneDevision = new Band(15000,"OneDevision",10000,oneDevisionContract);                         //Nicolas
        Band[] arrayBands = {oneDevision};//Nicolas

        Event rockAndRoll = new Event("To good for you","Rock & Roll", "13 September 2021", "Vestre teglgade 18", 500, arrayBands);                         //Nicolas
        System.out.println(rockAndRoll);                         //Nicolas
    }}