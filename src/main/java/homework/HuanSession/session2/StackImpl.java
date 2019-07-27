package homework.session02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 目标：实现一个栈，和实现一个带日志输出的栈
要求:
*1、使用int[] 存储
*2、如果栈满了，扩容2倍。
*3、如果栈为空 pop 和 peak 抛异常。
* ps: 带日志输出的栈：在所有操作的前面打出日志，以push为例子，开始push之前 System.out.println("start push"); push 结束的时候 System.out.println("end push");
* 
 */
 
public class StackImpl implements Stack {
//栈的实现
protected  int topStack=0;
protected  int [] stack;

 public StackImpl (int size)
 {
	 stack =new int [size];
 
 }
 
 @Override 
 public int size() {
	 
	 return topStack;
 }
 
 @Override //判断栈是否为空
 public boolean isEmpty() {
	 
	 if(topStack==0)
		 return true;
	 
	 else
		 return false;
 }
 
 
	@Override //添加栈顶元素
	public boolean push(int value) throws Exception {
		boolean flag=false;
		if(topStack <stack.length)
		{
		stack[topStack++]=value;
		flag=true;
		}
		else 
		{
			System.out.println("end push"); 
			throw new Exception("栈满了，push失败！"); 
		}
		//栈满了，扩容2倍。
		  if(topStack>=stack.length)
		{
			List <Integer > list=new ArrayList <Integer> ();
			for (int i=0; i<stack.length;i++)
			{
				list.add(stack [i]);
			}
			
			stack=new int [stack.length*2];
			for (int i=0; i<list.size();i++)
			{
			stack [i]=(int )list.get(i);
			}
		}
		return flag;
	}
	
	

	@Override //弹出栈顶元素值
	public int pop() throws Exception {
		 if(topStack <1)
			  throw new Exception("空栈,pop异常");
		 else 
		 
		return   stack[--topStack];
	}

	@Override //返回栈顶元素 
	public int peak() throws Exception {
		 if (topStack <1)
			  throw new Exception("空栈,peak异常");
		 
		 
		return stack[topStack-1];
	}

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		StackImpl stacklmpl=new StackImpl(6);
		
		for (int i=0;i<10;i++)
		{
			
			stacklmpl.push(i);
		}
 	System.out.println("打印出当前栈的大小"+stacklmpl.size());
 	System.out.println("打印出当前数组的长度"+stacklmpl.topStack);
 	System.out.println("打印出当前栈数组的长度"+stacklmpl.stack.length);

		
		for (int i=0;i<stacklmpl.topStack;i++)
		{
			System.out.println("打印出当前栈顶元素"+stacklmpl.peak());
			System.out.println("弹出前栈顶的元素"+stacklmpl.pop());
			System.out.println("当前栈的大小"+stacklmpl.topStack);
			
		}

		
}

}
