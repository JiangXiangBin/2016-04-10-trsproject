package service;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.springframework.stereotype.Component;
import dao.Daoimpl;
import entity.Student;
import entity.Studentsecurity;


@Component
// ͨ��ע�ͣ��൱��һ��bean
public class Serviceimpl implements Service {

	
	@Resource
	// �൱��һ��setterע��
	private Daoimpl daoimpl;

	/** ��½ */
	public Student login(String username, String pwd) {
		// TODO Auto-generated method stub
		return daoimpl.findNameAndPwd(username, pwd);
	}

	/** �ж��û����Ƿ���� */
	public Student findName(String name) {
		// TODO Auto-generated method stub
		return daoimpl.findName(name);
	}

	/** ���� */
	public void save(Student student) {
		// TODO Auto-generated method stub

		daoimpl.addAll(student);
	}

	/** �һ����� */
	public Student findpwd(String email) {
		// TODO Auto-generated method stub
		return daoimpl.findpwd(email);
	}

	/** �޸����� */
	public void updatepwd(String pwd) {
		// TODO Auto-generated method stub

		daoimpl.updatepwd(pwd);

	}

	/** ��ѯ������Ϣ */
	public List<Student> find(String name, String pwd) {
		// TODO Auto-generated method stub
		return daoimpl.find(name, pwd);
	}

	/** ��ѯID��ֵ */
	public Student findid(int id) {
		// TODO Auto-generated method stub
		return daoimpl.findid(id);
	}

	/** �޸����Ƹ�����Ϣ */
	public void update(Student student) {
		// TODO Auto-generated method stub
		daoimpl.update(student);
	}

	public void zhuanzhang(String from, String to, double money) {
		// TODO Auto-generated method stub
		daoimpl.zhuanzhang(from, to, money);
	}
	public Student findfrom(String from) {
		// TODO Auto-generated method stub
		return daoimpl.findfrom(from);
	}

	public Student findto(String to) {
		// TODO Auto-generated method stub
		return daoimpl.findto(to);
	}

	public Student findmoney(Double qian) {
		// TODO Auto-generated method stub
		return daoimpl.findmoney(qian);
	}

	public void addson(int numble1, int id,int numble2) {
		// TODO Auto-generated method stub
		daoimpl.addson( numble1 ,id,numble2);	
		//throw new RuntimeException();
	}

	public List<Student> students(int id) {
		// TODO Auto-generated method stub
		return daoimpl.students(id);
	}
	public void DeleteNumble(int id) {
		// TODO Auto-generated method stub
		daoimpl.DeleteNumble(id);
	}


	

}
