package OSproject;

public class Measurement {
	
	public static void main(String[] args) {
		
		double start, end;
		    
		start = System.nanoTime();	
		end = System.nanoTime();
			
		System.out.println("Reading time is " + (end - start));
		System.out.println("Loop number    Loop time");
		int loop_num = 1;
		for (int measure_num = 0; measure_num < 10 ; measure_num ++){
			double diff = 0.0;
			for (int k = 0 ; k < 100 ; k++){
				start = System.nanoTime();		
				for (int i = 0; i < loop_num; i++) {}
				end = System.nanoTime();
			
				diff += (end - start); 
			}
			System.out.println( loop_num + "                " + diff/100);
			loop_num *= 2;
		}
			return;
		

	}

}
