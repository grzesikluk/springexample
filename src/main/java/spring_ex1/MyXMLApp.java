package spring_ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyXMLApp
{
    private Service service;

    @Autowired()
    public void setService(Service service)
    {
        this.service = service;
    }

    public Service getService(){
        return this.service;
    }

    public boolean processMessage(String a, String b) {
        return this.service.sendMessage(a, b);
    }
}
