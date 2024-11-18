// 自动类型转换细节
public class AutoConvertDetail {
	
	//编写一个main方法
	public static void main(String[] args) {

		//有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换为容量最大的那种数据类型，然后再进行计算
			int n1 = 10;
			//float d1 = n1 + 1.1;(错误，因为1.1默认为 double 类型)
			float f1 = n1 + 1.1F;//正确
			double d1 = n1 + 1.1;//正确
		//一定遵循：自动类型转换的路径
		// 路径一 : char -> int -> long -> float -> double
		// 路径二 : byte -> short -> int -> long -> float -> double	
		//注意： (byte short) 和 char 之间不能自动互相转换	

				//细节4: byte , short , char 三者可以计算，在计算时首先转换为 int 类型
			byte b1 = 1;
			byte b2 = 1;
			char c1 = 1;
			int n2 = b1 + c1;	
			System.out.println(n2);
			// byte b3 = b1 + b2;(错) 因为只要byte , short , char 三者参与计算就会转为 int 类型
			// boolean 不参与 自动类型转换 




	}
}