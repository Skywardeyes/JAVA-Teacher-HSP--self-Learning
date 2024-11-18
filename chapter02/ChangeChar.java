


//演示转义字符的使用
public class ChangeChar{

    //编写一个main方法
	public static void main(String[] args) {

        // \t  :一个制表位，实现对齐的功能
        System.out.println("北京\t天津\t上海");
        // \n  :换行符
        System.out.println("jack\nsmith\nmarry");  
        // \\  :一个\
        System.out.println("C:\\Users\\yyfdf\\Desktop\\JAVA\\Javacode");
        // \"  :一个"
        System.out.println("老韩说：\"好好学习java，有前途\"");
        // \'  :一个'
        System.out.println("老韩说：\'好好学习java，有前途\'");
        // \r  :一个回车
        System.out.println("姚壬爔\r上海");

    }
}


class Exer01{

    public static void main(String[] args){

        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
    


    }
}