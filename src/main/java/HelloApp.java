import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


/**
 * Created by rakeshprabhakaran on 5/10/2015.
 */
public class HelloApp {
    public static void main(String[] args){
         int  count=0;
    //while(true){
        count++;
        BeanFactory factory= new XmlBeanFactory(new FileSystemResource("/Users/rakeshprabhakaran/Documents/workspace/SpringGreeting/src/main/java/hello.xml"));
        GreetingService greetingService=
                (GreetingService) factory.getBean("greetingService");
        greetingService.sayGreeting();
        System.out.println("Count ="+ count);
    //}
}
}
