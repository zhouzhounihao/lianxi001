package day06;
 class father{
	    //����������Ϊ
	 public father(String name) {
		System.out.println("��������"+name);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
}
class son extends father {
	//���������Ϊ
	public son() {
		super("С��");
	}
}
public class Example03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*son so=*/new son();
   //so.talk();
	}

}
