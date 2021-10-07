package Classes;

class Band{                         //Nicolas
    public int salary;                         //Nicolas
    public String bandName;                         //Nicolas
    public int minSalary;
    public BandContract bandContract;

    public Band(int salary, String bandName, int minSalary, BandContract bandContract) {
        this.salary = salary;
        this.bandName = bandName;
        this.minSalary = minSalary;
        this.bandContract = bandContract;
    }

    public int salary(int input, int amount, int minSalary){                         //Nicolas
        int output = input;                         //Nicolas
        if (input<=minSalary){                         //Nicolas
            output = input * amount;                         //Nicolas
        }
        return output;                         //Nicolas
    }


                         //Nicolas/Mo
    @Override
    public String toString() {
        return "Band{" +
                "salary=" + salary +
                ", bandName='" + bandName + '\'' +
                ", minSalary=" + minSalary +
                ", bandContract=" + bandContract +
                '}';
    }
}