package test;

import java.util.Calendar;

/**
 * description: String 测试类
 *
 * @author xiaosaguo
 * @date 2020/10/14
 */
public class StringTest {
    public static void main(String[] args) {
        // String str = "aaa";
        // System.out.println(str);
        // System.out.println(str.getClass());
        // Class<? extends String> aClass = str.getClass();
        // System.out.println(aClass);
        // String string = aClass.toString();
        // System.out.println(string);
        // String name = aClass.getName();
        // System.out.println(name);
        //
        // Number n = 0;
        // Class<? extends Number> c = n.getClass();
        // String string1 = c.toString();
        // System.out.println(string1);

        // String bankName = "交通银行借记卡2409";
        // String bankName2 = "支付用户的零钱";
        // System.out.println(getBankName(bankName));
        // System.out.println(getBankName(bankName2));

        long zeroTime = getZeroTime();
        long tomorrowZeroTime = zeroTime + 24 * 60 * 60 * 1000L;
        System.out.println(zeroTime);
        System.out.println(tomorrowZeroTime);

    }

    public static String getBankName(String bankInfo) {
        if (bankInfo != null) {
            // 交通银行借记卡2409
            if (bankInfo.contains("银行") && bankInfo.matches("^.*\\d{4}$")) {
                return bankInfo.substring(0, bankInfo.indexOf("银行") + 2);
            }
            // 支付用户的零钱
            if (bankInfo.contains("微信") || bankInfo.contains("零钱")) {
                return "微信";
            }
        }
        return null;
    }

    public static long getZeroTime(){
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime().getTime();
    }
}
