public class ForceConvertDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		//强转符号只针对最近的操作数有效，往往会使用小括号提升优先级
		//int n1 = (int)10*3.5 + 6 * 1.5 ; (错误)： double -> int 
		int n1 = (int)(10*3.5 + 6 * 1.5);//正确：(int)44.0 -> 44
		System.out.println("n1=" + n1);//44
		//System.out.println("n2=" + n2);
    }
} 