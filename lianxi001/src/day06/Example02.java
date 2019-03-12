package day06;
class  bigpig{
	static String name;
	void xinwei() {
		System.out.println("他会飞");
	}
}
class pig extends bigpig{
	public void fuming() {
		System.out.print("他叫："+name);
	}
}
public class Example02 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub6
   pig ta=new pig();
   ta.name="小猪佩奇";
   ta.fuming();
   ta.xinwei();
   
	}

}
