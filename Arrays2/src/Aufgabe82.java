
public class Aufgabe82 {
	
	
	//bubble sort 
		
	public static void bubblesort(int []werte) {
		
		int wechs=0;
		for(int i=werte.length-2;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				
				if(werte[j]>werte[j+1])
				{	wechs=werte[j+1];
				werte[j+1]=werte[j];
				werte[j]=wechs;
				}
				
				
			}
			
			
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		
		int [] werte= {3,4,5,2,1,5,7,9,0,4,5,6,7,8};
		bubblesort(werte);
		
		for(int i=0;i<werte.length;i++) {
			
			
			System.out.print("\t"+werte[i]);
			
		}

		  
}


}
