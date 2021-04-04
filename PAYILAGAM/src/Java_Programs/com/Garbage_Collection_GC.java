package Java_Programs.com;

public class Garbage_Collection_GC {
	 
	Garbage_Collection_GC num;
	
	public static void main(String[] args) {
		
		Garbage_Collection_GC demo = new Garbage_Collection_GC();
		
		Garbage_Collection_GC demo1 = new Garbage_Collection_GC();
		
		demo=null;
				
	   demo = demo1;
		
		System.out.println(demo);
		
		System.out.println(demo1);
		
	   System.gc();
	   
	   Runtime rt = Runtime.getRuntime();
	   
	   rt.gc();
	   
	   System.out.println(rt.freeMemory());
	   
	   System.out.println(rt.totalMemory());
		
		
	}

	
	
	
}
