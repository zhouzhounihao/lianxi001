package day06;
class student{
	static String schoolname="�ȷ�";
	private String name;
	private String sex;
	private int age;
	/*public student() {
		
	}*/
	public student(String name,String sex,int age) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
		public void Setname(String name){
			this.name=name;
			//name="zhouzhou";
		}
		public void Setage(int age){
			this.age=age;
			//age=18;
		}
		public int Getage(int age){
			return this.age;
		}
		public void Outlnfo(){
			System.out.println("����"+this.name+"�Ա�"+this.sex+"����"+this.age);
		}
		public int getage() {
			// TODO Auto-generated method stub
			return 0;
		}
}
class graduatestudent extends student{
	String speciallity,teacher;
	  graduatestudent(String name,String sex,int age,String speciallity,String teacher) {
		super(name,sex,age);
	}
	public  void Outlnfo(){
		super.Outlnfo();
			System.out.println("רҵ"+this.speciallity+"��ʦ"+this.teacher);
		}
}
public class Example05 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     student s=new student("����","��",18);
     student s1=new student("����","��",18);
     //graduatestudent g=new graduatestudent("  ����  ","  ��  ",18,"  IT  ","  �ƾ�  ");
     s.Setage(s.getage()+1);
     s1.Setage(s1.getage()+1);
     if(s.getage()<20) {
    	 s.Outlnfo();
     }
     if(s1.getage()<20) {
    	 s1.Outlnfo();
     }
     System.out.println(s.schoolname);
     System.out.println(s1.schoolname);
	}

}
/*1.����һ��ѧ����student��������3�����ԣ�name��sex��age��һ�����췽����
 *  �����������Ĺ��췽�������ڶ�name��sex��age��ʼ����4��������Setname��setage��getage.
Outlnfo()���ѧ����Ϣ
2.����һ��graduatestudent��̳�student�࣬Ҫ��Ϊ����ӣ��������ԣ�רҵspeciallity�͵�ʦteacher��
һ�����췽����������������Ĺ��췽����Ȼ����дstudent���еķ���outlnfo����������о������Ϣ
3.���������࣬��������ѧ������ÿ��ѧ�������1���ж������Ƿ�С��20�������ӡ�����Ϣ��
����һ��ѧУ��schoolname��һ��setschool��������У���������.
*/