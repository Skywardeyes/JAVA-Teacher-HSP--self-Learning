//字符类型(char)
//字符常量应使用''而非"",因为""一定表示字符串哪怕是"1"。

public class CharDetail {
	//编写一个main方法
	public static void main(String[] args) {
		
		//在Java中，char的本质就是一个整数，在输出时，是unicode码对应的字符
		char c1 = 97 ;
		System.out.println(c1);//a
		char c2 = 'a' ;
		System.out.println((int)c2);//强制类型转换
		char c3 = '姚' ;
		System.out.println((int)c3);//23002
		char c4 = 23002 ;
		System.out.println(c4);//姚


		//char类型是可以进行运算的，相当于一个整数，因为它都有对应的unicode码
		System.out.println('a' + 10);//107

		char c5 = 'b' + 1;
		System.out.println((int)c5);//98
		System.out.println(c5);//c -> 对应的字符 ->编码表ASCII(规定好的)

    }
}