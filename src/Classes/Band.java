package Classes;

class Band{                         //Nicolas
    public int salary;                         //Nicolas
    public String bandName;                         //Nicolas
    public int minSalary;                         //Nicolas
    public Band(String bandName, int salary, int minSalary){                         //Nicolas
        this.salary = salary;                         //Nicolas
        this.bandName = bandName;                         //Nicolas
        this.minSalary = minSalary;                         //Nicolas
    }
    public int salary(int input, int amount, int minSalary){                         //Nicolas
        int output = input;                         //Nicolas
        if (input<=minSalary){                         //Nicolas
            output = input * amount;                         //Nicolas
        }
        return output;                         //Nicolas
    }

    @Override                         //Nicolas
    public String toString() {                         //Nicolas
        return "Band{" +                         //Nicolas
                "salary=" + salary +                         //Nicolas
                ", bandName='" + bandName + '\'' +                         //Nicolas
                ", minSalary=" + minSalary +                         //Nicolas
                '}';                         //Nicolas
    }
}