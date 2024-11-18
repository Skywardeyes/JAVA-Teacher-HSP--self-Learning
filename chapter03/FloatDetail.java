public class FloatDetail {
	//编写一个main方法
	public static void main(String[] args) {

		//浮点数 = 符号位 + 指数位 + 尾数位  必须有小数点
 		//Java的浮点常量默认为 double 型，声明 float 型常量须在数值后面加‘f’或‘F’ 
		//通常情况下应使用double型，更加精确 

		double n1 = 1.1 ; //对	
		//float n2 = 1,1; (错)
		float n3 = 1.1F ; //对
		double n4 = 1.1F ; //对 
		double n5 = .512 ; //小数点前为0 时可省略
		System.out.println(.512);

		//科学计数法形式：5.12e2  [5.12*10^2]  5.12E-2 [5.12*10^(-2)]
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		//浮点数使用陷阱: 2.7 和 8.1 / 3 比较
		double n6 = 2.7;
		double n7 = 8.1 / 3;//2.7
		System.out.println(n6);
		System.out.println(n7); //接近 2.7 的一个小数，而不是2.7
		//得到一个重要的使用点：当我们对小数的运算结果进行相等判断时，要小心
		//应该是以两个数的差值的绝对值，在某个精度范围内判断

		// 错误方式：
		// if(n6 == n7){
		// 	System.out.println("相等");
		// }

		//正确方式：
		if(Math.abs(n6 - n7) < 0.00001){
			System.out.println("差值非常小，到我规定的精度，认为相等"); 	
		}
		//可以通过java API来看
			System.out.println(Math.abs(n6-n7));


    }
}