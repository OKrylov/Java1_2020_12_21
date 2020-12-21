package lesson2;

public class SwitchOperator {

    public static void main(String[] args) {
        String month = "June";
        int daysNumber = getNumberOfDaysInMonth(month);
        System.out.println(month + " has " + daysNumber + " days");

        int a = 3;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Ни один из case не сработал");
        }

    }

    private static int getNumberOfDaysInMonth(String month) {
        switch (month) {
            case "January":
                return 31;
            case "February":
                return 28;
            case "March":
                return 31;
            case "April": {
                int a = 5;
                System.out.println(a);
                return 30;
            }
            case "May":
                int a = 2;
                return 31;
            case "June":
                return 30;
            case "July":
            case "August":
                return 31;
            case "September":
                return 30;
            case "October":
                return 31;
            case "November":
                return 30;
            case "December":
                return 31;
            default:
                return -1;
        }

//        return switch (month) {
//            case "January" -> 31;
//            case "February" -> 28;
//            case "March" -> 31;
//            case "April" -> 30;
//            case "May" -> 31;
//            case "June" -> 30;
//            case "July" -> 31;
//            case "August" -> 31;
//            case "September" -> 30;
//            case "October" -> 31;
//            case "November" -> 30;
//            case "December" -> 31;
//            default -> -1;
//        };

//        if (month.equals("January")) {
//            return 31;
//        }
//        else if (month.equals("February")) {
//            return 28;
//        }
//        else if (month.equals("March")) {
//            return 31;
//        }
//        else if (month.equals("April")) {
//            return 30;
//        }
//        else if (month.equals("May")) {
//            return 31;
//        }
//        else if (month.equals("June")) {
//            return 30;
//        }
//        else if (month.equals("July")) {
//            return 31;
//        }
//        else if (month.equals("August")) {
//            return 31;
//        }
//        else if (month.equals("September")) {
//            return 30;
//        }
//        else if (month.equals("October")) {
//            return 31;
//        }
//        else if (month.equals("November")) {
//            return 30;
//        }
//        else if (month.equals("December")) {
//            return 31;
//        }
//        else {
//            return -1;
//        }
    }
}
