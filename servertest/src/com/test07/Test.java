package com.test07;

public class Test {
	public static void main(String[] args) {
		Master m = new Master();
		Stu y = new Stu("李四");
		m.biaoYang(y);
		Teacher t = new Teacher("王五");
		m.biaoYang(t);
	}

}

/*方法重写：子类的函数与父类的函数外层完全一致。 */
/*当调用父类的函数时，会直接指向子类的重写函数*/
 /*当继承时，只能继承一个父类，而不能继承多个*/
 