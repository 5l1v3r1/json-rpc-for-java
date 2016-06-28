package test;

import java.io.Serializable;

public class TestDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	private String myName = "����";
	private String sex = "��";
	private int age = 10000;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toXml()
	{
		return new StringBuffer()
		.append("<name>").append(getMyName()).append("</name>")
		.append("<sex>").append(getSex()).append("</sex>")
		.append("<age>").append(getAge()).append("</age>")
		.toString();
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	/***
	 * �����쳣�ÿ���Զ�ץȡ
	 * @throws Exception
	 */
	public void makeException() throws Exception
	{
		throw new Exception("�ÿ���Զ����������Ϣ");
	}

}
