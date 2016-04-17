package OSproject;

public class Measurement {
	
	private final static int MEASURE_NUM = 1000;
	public static void main(String[] args) {
		
		double start, end;
		double diff = 0.0;  
		for (int i = 0 ; i < MEASURE_NUM ; i++){
			start = System.nanoTime();	
			end = System.nanoTime();
			diff += end - start;
		}
			
		System.out.println("Reading time is " + diff / MEASURE_NUM);
		System.out.println("Loop number    Loop time");
		int loop_num = 1;
		for (int i = 0; i < 10 ; i ++){
			diff = 0.0;
			for (int j = 0 ; j < MEASURE_NUM ; j++){
				start = System.nanoTime();		
				for (int k = 0; k < loop_num; k++) {}
				end = System.nanoTime();
			
				diff += (end - start); 
			}
			System.out.println( loop_num + "                " + diff / MEASURE_NUM);
			loop_num *= 2;
		}
			return;
		

	}

}
