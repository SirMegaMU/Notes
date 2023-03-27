package tutorial_1;

public class t1Q1 {
    public static class Telephone {
        String areaCode;
        int number;
        static int numberOfTelephoneObject;

        public Telephone(String code, int number) {
            this.areaCode = code;
            this.number = number;
        }

        public String getNumberOfTelephoneObject() {
            return makeFullNumber();
        }

        public String makeFullNumber() {
            return this.areaCode + "-" + this.number;
        }
    }

    public static void main(String[] args) {

    }
}
