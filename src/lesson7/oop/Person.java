package lesson7.oop;

public class Person {

    public static void main(String[] args) {
        new Person.PassportData("4568", "478962");
//        new Person.PhoneDetails();
    }

    private final String firstName;
    private final String lastName;
    private PhoneDetails phoneDetails;

    class PhoneDetails {
        public String workPhone;
        public String homePhone;
        public String emergencyPhone;
        public String privatePhone = Person.this.firstName;
    }

    public static class PassportData {
        private String serial;
        private String number;

        public PassportData(String serial, String number) {
            this.serial = serial;
            this.number = number;
        }
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PhoneDetails getPhoneDetails() {
        return phoneDetails;
    }

    public PassportData getPassportSerialAndNumber() {
        return new PassportData("6666", "789135");

    }
}
