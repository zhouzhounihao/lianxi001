package day06;
class huihui{
	static String name;
	void xinwei() {
		System.out.println("����˧��");
	}
}
class jiajia extends huihui{
	public void fuming() {
		System.out.println("���У�"+name);
	}
}
public class Example01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub6
   jiajia ta=new jiajia();
   ta.name="����";
   ta.fuming();
   ta.xinwei();
   
	}

}
