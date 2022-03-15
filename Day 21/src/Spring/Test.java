package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
	Resource resource=new ClassPathResource("SpringConfig.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	Book book= (Book) factory.getBean("Anjali");
	System.out.println(book);
	
}
}
