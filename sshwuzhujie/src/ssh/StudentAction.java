package ssh;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {
	private StudentDao studentDao;
	private List<Student> list;
	public List<Student> getList() {
		return list;
	}
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String execute() throws Exception {
		list=studentDao.query();
		return "success";
	}

}
