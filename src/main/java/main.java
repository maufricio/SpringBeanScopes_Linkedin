import SingletonPattern.CarService;
import SingletonPattern.ConfigClass;
import SingletonPattern.ToyotaImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigClass.class);
        CarService toyotaCar = context.getBean(CarService.class);
        CarService toyotaCar2 = context.getBean("toyotaCar", CarService.class);

        System.out.println(
                "Are the two beans the same? " + (toyotaCar == toyotaCar2)
        );

        context.close();
    }
}
