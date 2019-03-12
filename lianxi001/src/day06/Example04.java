package day06;
class monkey{
	 monkey(String s) {
		 System.out.print(s);
	}
	 public void sp() {
			System.out.println("咿咿呀呀。。。。。");
		}
}
class people extends monkey{
	 people(String s) {
		super(s);
		System.out.print(s);
	}
	 public void sp() {
			System.out.println("小样的不错嘛，会说话了");
		}
	public void think() {
		System.out.println("来来来，叫哥哥");
	}
}
public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  monkey mo=new monkey("卢德超也叫");
  people no=new people("小卢子");
  mo.sp();
  no.sp();
  no.think();
  
 
	}
}
