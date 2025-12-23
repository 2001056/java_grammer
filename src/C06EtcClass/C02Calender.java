package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calender {
    public static void main(String[] args) {
//        java.utill패키지의 Calender클래스
//        Calendar mc = Calendar.getInstance();
//        System.out.println(mc.getTime());
//        System.out.println(mc.get(Calendar.YEAR));
//        System.out.println(mc.get(Calendar.MONTH)+1);
//        System.out.println(mc.get(Calendar.DAY_OF_WEEK));
//        System.out.println(mc.get(Calendar.DAY_OF_MONTH));
//        System.out.println(mc.get(Calendar.HOUR));
//        System.out.println(mc.get(Calendar.MINUTE));
//        System.out.println(mc.get(Calendar.SECOND));
//        java.time패키지의 LocalDateTime, LocalDate, LocalTime클래스
//        LocalDate myLocalDate = LocalDate.now();
//        System.out.println(myLocalDate);
//        System.out.println(myLocalDate.getYear());
//        System.out.println(myLocalDate.getMonth());
//        System.out.println(myLocalDate.getMonthValue());
//        System.out.println(myLocalDate.getDayOfMonth());
//        System.out.println(myLocalDate.getDayOfWeek());

//        LocalTime lT = LocalTime.now();
//        System.out.println(lT.getHour());
//        System.out.println(lT.getMinute());
//        System.out.println(lT.getSecond());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getYear());
        System.out.println(ldt.getHour());
//        ChronoField매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(ldt.get(ChronoField.YEAR));
        System.out.println(ldt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(ldt.get(ChronoField.AMPM_OF_DAY));//0 오전 1 오후
        System.out.println(ldt.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시체계

//        .of : 임의로 특정시간 정보고 객체를 만들어내고 싶을 때 사용
        LocalDate birthday = LocalDate.of(2000,11,12);
        System.out.println(birthday);

        LocalDateTime birthDayTime = LocalDateTime.of(2001,10,27,22,30,01);
        System.out.println(birthDayTime);



    }
}
