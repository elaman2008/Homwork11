//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double radius = 5.0;

        System.out.println("Айлананын аянты: " + Circle.area(radius));
        System.out.println("Айлананын узундугу: " + Circle.circumference(radius));
    }
}

//        Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferen ceти табуу учун PI * 2 * radius деген формулалар колдонулат
//

