package Classes;

import java.util.Arrays; //Mo


    public class BandContract {
        public String dateOfContract;
        public String[] namesOfMembers;
        public String ifBreakOfContract;
        public String signed;

        public BandContract(String dateOfContract, String[] namesOfMembers, String ifBreakOfContract, String signed) {
            this.dateOfContract = dateOfContract;
            this.namesOfMembers = namesOfMembers;
            this.ifBreakOfContract = ifBreakOfContract;
            this.signed = signed;
        }

        @Override
        public String toString() {
            return "Classes.BandContract{" +
                    "dateOfContract='" + dateOfContract + '\'' +
                    ", namesOfMembers=" + Arrays.toString(namesOfMembers) +
                    ", ifBreakOfContract='" + ifBreakOfContract + '\'' +
                    ", signed='" + signed + '\'' +
                    '}';
        }

    }

