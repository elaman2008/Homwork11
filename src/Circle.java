public class Circle {
    public static final double PI = 3.14159;

    public static double area(double radius) {
        return PI * (radius * radius);
    }


    public static double circumference(double radius) {
        return PI * 2 * radius;
    }
}
//Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferen ceти табуу учун PI * 2 * radius деген формулалар колдонулат

