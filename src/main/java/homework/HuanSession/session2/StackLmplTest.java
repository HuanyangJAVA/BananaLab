package homework.session02;

public class StackLmplTest {

	public static void main(String[] args) throws Exception {
 
		Stack stack1 = new StackImpl(6);
		Stack stack2 = new StackWithLogImpl(6);
    
		stack1.push(2);
		
    stack2.push(2);
      
}
}
		/*
		 * 1.通过 Stack 类型的引用 stack1 调用 StackImpl 类型实例的 push 方法往 stack1 中添加元素 "2", 控制台无输出; 
		 * 2.通过 Stack 类型的引用 stack2 调用 StackWithLogImpl 类型实例的 push 方法往 stack2 中添加元素 "2", 控制台输出push方法的日志; 
		 * 
		 * 
		 * 表现为多态，子类的实例可以赋值给父类的引用, 通过调用在父类中定义的方法, 可以执行子类的具体方法实现.  
		 * 原因：stack1 和stack2 同为Stack的引用类，但是指向的实例并不同，调用的具体方法也不同；
		 */
