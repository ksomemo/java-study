package ksomemo.b1.ch19;

import java.util.Calendar;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<String, String> labeledStr = (String str) -> "\n--------" + str + "--------\n";
        Consumer<Object> print = System.out::println;
        BiConsumer<Object, Object> printResult = (obj, ret) -> print.accept(obj);


        print.accept(labeledStr.apply("String"));

        String str = " ABCDEFG  ";
        print.accept(str.charAt(2));
        print.accept(str.length());
        print.accept(str.concat("HIJKLMN"));
        print.accept(str.substring(3));
        print.accept(str.substring(3, 6));
        print.accept(str.indexOf("B"));
        print.accept(str.indexOf("CD"));
        print.accept(str.toLowerCase());
        print.accept(str.toLowerCase().toUpperCase().equals(str));
        print.accept(str.toLowerCase().equalsIgnoreCase(str));
        print.accept(str.trim());
        print.accept(String.valueOf('c').length());
        print.accept(String.valueOf(12345).length());


        print.accept(labeledStr.apply("StringBuffer"));
        StringBuffer sb = new StringBuffer(str.trim());

        sb.setCharAt(1, 'b');
        print.accept(sb);

        sb.setLength(100);
        print.accept(sb.toString() + "!");

        sb.setLength(6);
        print.accept(sb);

        printResult.accept(sb, sb.append("123"));
        printResult.accept(sb, sb.delete(sb.length() - 3, sb.length()));
        printResult.accept(sb, sb.deleteCharAt(0));
        printResult.accept(sb, sb.replace(0, 2, "bcd"));
        print.accept(sb.substring(3));
        print.accept(sb.substring(3, 6));


        print.accept(labeledStr.apply("Wrapper"));

        print.accept(Character.isAlphabetic('1'));
        print.accept(Boolean.logicalXor(true, false));
        print.accept(Byte.parseByte("127"));
        print.accept(Short.valueOf("123"));
        print.accept(Integer.parseInt("10", 16));
        print.accept(Long.lowestOneBit(1));
        print.accept(Float.MAX_VALUE);
        print.accept(Double.MAX_VALUE);


        print.accept(labeledStr.apply("Math"));

        print.accept(Math.sin(30));
        print.accept(Math.sin(30 * Math.PI / 180.0));
        print.accept(Math.sin(Math.toRadians(30)));
        print.accept(Math.cos(Math.toRadians(30)));
        print.accept(Math.tan(Math.toRadians(30)));
        print.accept(Math.toDegrees(Math.toRadians(30)));
        print.accept(Math.abs(-10));
        print.accept(Math.log(Math.E));
        print.accept(Math.exp(2.0));
        print.accept(Math.pow(2, 3));
        print.accept(Math.sqrt(2.0));
        print.accept(Math.ceil(2.1));
        print.accept(Math.floor(2.1));
        print.accept(Math.rint(1.49));
        print.accept(Math.rint(1.50));
        print.accept(Math.round(12345.67));
        print.accept(Math.IEEEremainder(55.55, 22.22));
        print.accept(Math.max(1, 2));
        print.accept(Math.min(1, 2));
        print.accept(Math.random());


        print.accept(labeledStr.apply("Date and Calender"));
        Date now = new Date();
        Calendar cal = Calendar.getInstance();

        print.accept(System.currentTimeMillis());
        print.accept(now);
        print.accept(now.getTime());

        print.accept(cal);
        print.accept(cal.getTime());
        print.accept(String.format("%s-%s-%s", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE)));
        print.accept(String.format(
            "%s:%s:%s.%s",
            cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND), cal.get(Calendar.MILLISECOND))
        );
        print.accept(cal.get(Calendar.AM));
        print.accept(cal.get(Calendar.AM_PM));
        print.accept(cal.get(Calendar.HOUR_OF_DAY));
        print.accept(cal.get(Calendar.DAY_OF_YEAR));
        print.accept(cal.get(Calendar.DAY_OF_WEEK));
        print.accept(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        print.accept(cal.get(Calendar.WEEK_OF_YEAR));
        print.accept(cal.get(Calendar.WEEK_OF_MONTH));
        print.accept(cal.get(Calendar.PM));
        print.accept(cal.get(Calendar.ZONE_OFFSET));


        print.accept(labeledStr.apply("System"));
        print.accept(System.getenv());
        print.accept(System.getProperties());
        print.accept(System.lineSeparator());
        print.accept(System.nanoTime());

        System.gc();
        System.exit(0);
    }
}
