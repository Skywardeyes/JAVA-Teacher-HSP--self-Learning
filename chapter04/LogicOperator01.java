
public class LogicOperator01 {

	//编写一个main方法
	public static void main(String[] args) {
		
		//短路与： &&  两个条件都为true，结果为true,否则false
		int age = 50;
		if(age > 18 && age < 70){
			System.out.println("ok1");//true
		}

		//逻辑与： &   两个条件都为true，结果为true,否则false
		if(age > 18 & age < 70){
			System.out.println("ok2");//true
		}

		/*二者区别：
		短路与：如果第一个条件为false 则第二个条件不再被判断，
		       其代码也不再被执行，直接输出false，效率更高
		逻辑与：不管第一个条件是否正确，都要判断第二个条件，效率低
		*/
		//演示短路与和逻辑与的区别
		int a = 4;
		int b = 9;
		if(a < 1 && ++b < 50){
			System.out.println("ok3");//false
		}
		System.out.println("a=" + a + " b=" + b);

		int c = 4;
		int d = 9;
		if(c < 1 & ++d < 50){
			System.out.println("ok4");//false
		}
		System.out.println("c=" + c + " d=" + d);

    }
}