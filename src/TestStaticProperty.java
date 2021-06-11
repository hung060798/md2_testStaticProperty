import com.company.Car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyativ 3");
        System.out.println(Car.numberOfCars);

        Car car2 =new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
