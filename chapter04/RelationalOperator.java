//关系运算符
public class RelationalOperator {

	//编写一个main方法
	public static void main(String[] args) {
		
		int a = 9;//开发中不可以使用 a b a1 k i n1 等变量
		int b = 8;
		//演示关系运算符的区别
		System.out.println(a > b);// true
		System.out.println(a < b);//false
		System.out.println(a >= b);//true
		System.out.println(a <= b);//false
		System.out.println(a == b);//false
		System.out.println(a != b);//true
		boolean flag = a > b ;//true 
		System.out.println("flag=" + flag);
		//关系运算符组成的表达式成为关系表达式

    }
}