package Java;

public class TimeConversion {
    public static String timeConversion(String s) {
        s = s.toLowerCase();
        int hour = Integer.parseInt(s.substring(0,2));
        String trimmed = s.substring(2, 8);
        String time = "";
        if (s.contains("am") && hour == 12){
            time = "00" + trimmed;
        } else if (s.contains("am") && hour < 10){
            time = "0" + hour + trimmed;
        }
        if (s.contains("pm")){
            if (hour != 12) {
                hour += 12;
            }
            time = hour + trimmed;
        }
        return time;
    }

    public static void main(String[] args) {
        String time = "05:00:00AM";
        System.out.println(timeConversion(time));
    }
}
