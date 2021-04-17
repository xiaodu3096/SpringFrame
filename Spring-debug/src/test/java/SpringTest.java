import com.bj.Dao.PersonDao;
import com.bj.daoImpl.Hello;
import com.bj.daoImpl.PersonDaoImpl;
import org.graalvm.compiler.asm.amd64.AMD64Assembler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonDaoImpl.class);
		Hello hello = applicationContext.getBean(Hello.class);
		hello.hello();

	}
}
