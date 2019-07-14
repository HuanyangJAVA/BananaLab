package session1;

public class SessionWatermelon {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int arr []= {-5,0,6,4};
		sell(arr);
		
		
	}

	public static int[] sell(int[] buyNum){
		
		if(buyNum==null) 
			return  new int [0]; 
		
		if(buyNum.length ==0)
			return   new int [0];	
		
	
		int totalBuyNum=0;
		
		for(int i=0;i<buyNum.length;i++)
		{
			int  currentbuyNum=buyNum [i];
			int sellNum=0;
			
			
			try
			{
				sellNum=sell0(currentbuyNum);
			
			}
				catch (Exception e) 
			{
				
					sellNum=0; //出现负数或者0 相当于没卖出
			     
			     	 
			}
			
			totalBuyNum+=sellNum;
		}
		
		System.out.println("Huanyang一共卖了"+totalBuyNum+"个西瓜");
		
		
		return buyNum;
	}
	
	
	private static int sell0(int buyNum) throws Exception {
		
		if(buyNum<0)
		{
			throw new  Exception("不卖（卖0）") ;
		}
		
		if(buyNum>50)
		{
			return 50;
		}
	
		
		return buyNum;
	}
}
