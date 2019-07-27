package homework.session02;

import java.util.ArrayList;
import java.util.List;

public class StackWithLogImpl extends StackImpl {

	public StackWithLogImpl(int size) {
		super(size); 
	}

	@Override 
	 public int size() {
		 
		System.out.println("start is size"); 
		 System.out.println("end is size"); 
		 return super.size();
	 }
	 
	 @Override //判断栈是否为空
	 public boolean isEmpty() {
		 System.out.println("start isEmpty"); 
		 System.out.println("end isEmpty"); 
		 
 return super.isEmpty();
	 }
	 
	 
		@Override //添加栈顶元素
		public boolean push(int value) throws Exception {
			System.out.println("start push"); 
			boolean flag=false;
			if(topStack <stack.length)
			{
			stack[topStack++]=value;
			System.out.println("push--->"+value+"成功");
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
				System.out.println("start increase stack"); 
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
				System.out.println("end increase stack"); 
			}
			return flag;
		}
		
		

		@Override //弹出栈顶元素值
		public int pop() throws Exception {
			System.out.println("start pop"); 
			 if(topStack <1)
				  throw new Exception("空栈,pop异常");
			 else 
			 {
				 System.out.println("end pop"); 				 
				 return   stack[--topStack];
			 }
			 
		}

		@Override //返回栈顶元素 
		public int peak() throws Exception {
			
			System.out.println("start peak"); 
			 if (topStack <1)
			 {
				 throw new Exception("空栈,peak异常");
			 }
			 
			 System.out.println("end peak"); 
			return stack[topStack-1];
		}
	
	
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		StackWithLogImpl stackwith=new StackWithLogImpl(5);
		for (int i=0;i<10;i++)
		{
			stackwith.push(i);
		}
		
		System.out.println("打印出当前栈的大小"+stackwith.size());
	 	System.out.println("打印出当前数组的长度"+stackwith.topStack);
	 	System.out.println("打印出当前栈数组的长度"+stackwith.stack.length);
		
	 	for (int i=0;i<stackwith.topStack;i++)
		{
			System.out.println("打印出当前栈顶元素"+stackwith.peak());
			System.out.println("弹出前栈顶的元素"+stackwith.pop());
			System.out.println("当前栈的大小"+stackwith.topStack);
			
		}
	}

}
