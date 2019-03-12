package day06;
class student{
	static String schoolname="先锋";
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
			System.out.println("姓名"+this.name+"性别"+this.sex+"年龄"+this.age);
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
			System.out.println("专业"+this.speciallity+"导师"+this.teacher);
		}
}
public class Example05 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     student s=new student("周周","男",18);
     student s1=new student("周周","男",18);
     //graduatestudent g=new graduatestudent("  周周  ","  男  ",18,"  IT  ","  黄娟  ");
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
/*1.创建一个学生类student，包含了3个属性，name，sex，age，一个构造方法：
 *  有三个参数的构造方法，用于对name，sex，age初始化，4个方法：Setname，setage，getage.
Outlnfo()输出学生信息
2.创建一个graduatestudent类继承student类，要求为其添加，两个属性，专业speciallity和导师teacher，
一个构造方法，带有五个参数的构造方法，然后重写student类中的方法outlnfo（），输出研究相关信息
3.创建测试类，创建两个学生对象，每个学生年龄加1，判断年龄是否小于20，是则打印相关信息，
增加一个学校名schoolname，一个setschool方法设置校名，并输出.
*/