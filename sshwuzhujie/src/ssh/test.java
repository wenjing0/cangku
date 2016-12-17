package ssh;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class test {
	public void test1(){
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao stuDao=(StudentDao)app.getBean("studentDao");
		List<Student> list=stuDao.query();
		for(Student s:list){
			System.out.println(s.getId() + "--" + s.getName()+"--"+s.getAddress());
		}
		
	}
	public static void main(String[] args)
	{
		test t = new test() ;
		t.test1();
	}

}
