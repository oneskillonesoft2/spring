import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        System.out.println(bean == beanTwo);

        Cat cat = (Cat) applicationContext.getBean("catName");
        System.out.println(cat.getName());

        Cat catTwo = (Cat) applicationContext.getBean("catName");
        System.out.println(cat.getName());

        System.out.println(cat == catTwo );



    }
}