public class dayOfWeek {
    public static void main(String[] args) {
        System.out.println(newPrintDayOfWeek(3));
        System.out.println(oldPrintDayOfWeek(0));
        System.out.println(ifPrintDayOfWeek(-1));
    }

    public static String newPrintDayOfWeek(int day){
        switch (day) {
            case 0 -> {
                return "Sunday";
            }
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            default -> {
                return "Number only valid from 0-6";
            }
        }
    }
    public static String oldPrintDayOfWeek(int day){
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Number only valid from 0-6";
        }
    }
    public static String ifPrintDayOfWeek(int day){
        if (day == 0) {
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        }
        return "Number only valid from 0-6";
    }
}
