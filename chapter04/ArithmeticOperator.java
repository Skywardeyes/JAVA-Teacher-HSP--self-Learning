//算术运算符
public class ArithmeticOperator {

	//编写一个main方法
	public static void main(String[] args) {
		// / 除
		System.out.println(10 / 4);//从数学来看2.5, java 中为2
		System.out.println(10.0 / 4);//java 中2.5，因为类型是double
		double d = 10 / 4;//java 中10 / 4 = 2，2 -> 2.0
		System.out.println(d);//是2.0
		
		// % 取模，取余
		// % 的本质可以看做一个公式：  a % b = a - a / b * b
		System.out.println(10 % 3);// 1
		System.out.println(-10 % 3);//- 1 : -10 % 3 = -10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println(10 % -3);// 1 :10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		System.out.println(-10 % -3);// 1 :-10 % -3 = -10 - (-10) / (-3) * (-3) = -10 + 9 = -1

		// ++ 自增
		
		//作为独立的语句使用时，前++和后++都完全等价于 i = i+1
		int i = 10;
		i++;
		System.out.println("i=" + i);//11
		++i;
		System.out.println("i=" + i);//12
		/*
		作为表达式使用时
		前++：++i先自增后赋值
		后++：i++先赋值后自增
		*/
		int j = 8;
		int k = ++j;//等价于： j = j + 1; k = j;
		System.out.println("k=" + k + " j=" + j);//9 9
		int m = 8;
		int n = m++;//等价于： n = m; m = m + 1;
		System.out.println("n=" + n + " m=" + m);//8 9
		//-- 自减 同上

		



    }
}