package enums;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println(WeekDays.MONDAY.name());
        System.out.println(WeekDays.TUESDAY.ordinal());

        System.out.println(WeekDays.valueOf("MONDAY"));

        for(WeekDays weekDays:WeekDays.values()){
            System.out.println(weekDays+" "+weekDays.ordinal());
        }

//        EnumMain m=new EnumMain();
//        System.out.println(m.toString());
    }
}
