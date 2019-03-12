package day06;
 class father{
	    //定义它的行为
	 public father(String name) {
		System.out.println("他儿子是"+name);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
}
class son extends father {
	//定义儿子行为
	public son() {
		super("小明");
	}
}
public class Example03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*son so=*/new son();
   //so.talk();
	}

}
