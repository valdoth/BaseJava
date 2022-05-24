package pratique.records;

public class Start {

	public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		PointOld pos = new PointOld(10, 10);
		System.out.println(pos);
		System.out.println(pos.getX());
		long end = System.currentTimeMillis();
		System.out.println("Duration: " + (end-begin) + "ms");
		
		begin = System.currentTimeMillis();
		Point pos1 = new Point(10, 20);
		System.out.println(pos1);
		System.out.println(pos1.x());
		end = System.currentTimeMillis();
		System.out.println("Duration: " + (end-begin) + "ms");
		
		
	}

}
