/**
 * Created by rakeshprabhakaran on 4/10/2015.
 */
public class GreetingServiceImpl implements GreetingService{


    String greeting;

   public GreetingServiceImpl(){}

    public GreetingServiceImpl(String greeting){
        this.greeting=greeting;
    }
    public void sayGreeting() {
        System.out.println(greeting);

    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
