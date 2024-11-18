
public class ArithmeticOperatorExercise02 {

	//编写一个main方法
	public static void main(String[] args) {
		
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天 合" + weeks + "星期零" + leftdays + "天" );

		//需求
		//定义一个变量保存华氏温度，华氏温度再转化为摄氏温度
		//5/9*(华氏温度-100)
		double huashi = 234.5;
		double sheshi = 5.0 / 9 * (huashi - 100);//考虑数学公式和java语言的特性
		System.out.println("华氏温度" + huashi + "对应的摄氏温度为" + sheshi );


    }
}