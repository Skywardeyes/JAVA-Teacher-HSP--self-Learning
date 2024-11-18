
public class ArithmeticOperatorExercise01 {

	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 1;
		i = i++;//规则使用临时变量：(1) temp = i ;(2) i = i + 1 ;(3) i = temp ;
		System.out.println(i);//1
		int j = 1;
		j = ++j;//规则使用临时变量：(1) i = i + 1 ;(2) temp = i ;(3) i = temp ;
		System.out.println(j);//2

		int k1 = 10;
		int k2 = 20;
		int k = k1++;
		System.out.println("k=" + k);//10
		System.out.println("k1=" + k1);//11
		System.out.println("k2=" + k2);//20
		k = --k2;
		System.out.println("k=" + k);//19
		System.out.println("k2=" + k2);//19




    }
}