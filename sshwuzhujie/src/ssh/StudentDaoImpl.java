package ssh;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDaoImpl implements StudentDao {
	//
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Student> query() {
		Session session=sessionFactory.openSession();
		String hql="from Student";
		List<Student> list=session.createQuery(hql).list();
		session.close();
		return list;
	}

}
