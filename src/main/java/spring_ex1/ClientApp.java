package spring_ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApp
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        final MyXMLApp app = context.getBean(MyXMLApp.class);
        System.out.println(String.format("Got my service %b", app.getService().sendMessage("a", "b")));
        context.close();
    }
}
