
public class InverseOperator {

	//编写一个main方法
	public static void main(String[] args) {

		//取反: !
		System.out.println(60 > 20);//T
		System.out.println(!(60 > 20));//F

		//a^b : 逻辑异或,当 a 和 b 不同时,则结果为true,否则为false
		boolean b = (10 > 1)^(10 < 1);
		System.out.println("b=" + b);

		



    }
}