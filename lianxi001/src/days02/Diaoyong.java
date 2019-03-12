package days02;

public class Diaoyong {
	public static void  printRect() {//无参数，无返回值
		System.out.println("********");
	}
	public static void  printRest(int width,int height) {//有参数，无返值
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("世界，你好.....");System.out.print("你");System.out.print("好");System.out.print("帅     ");
			}System.out.println();
		}
	}
	public static int add(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		          // printRect();
		          // printRest(5,20);
		           System.out.println(add(6,9));
	}
}
