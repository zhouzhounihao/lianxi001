package day06;
class monkey{
	 monkey(String s) {
		 System.out.print(s);
	}
	 public void sp() {
			System.out.println("����ѽѽ����������");
		}
}
class people extends monkey{
	 people(String s) {
		super(s);
		System.out.print(s);
	}
	 public void sp() {
			System.out.println("С���Ĳ������˵����");
		}
	public void think() {
		System.out.println("���������и��");
	}
}
public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  monkey mo=new monkey("¬�³�Ҳ��");
  people no=new people("С¬��");
  mo.sp();
  no.sp();
  no.think();
  
 
	}
}
