package day06;
class  bigpig{
	static String name;
	void xinwei() {
		System.out.println("�����");
	}
}
class pig extends bigpig{
	public void fuming() {
		System.out.print("���У�"+name);
	}
}
public class Example02 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub6
   pig ta=new pig();
   ta.name="С������";
   ta.fuming();
   ta.xinwei();
   
	}

}
