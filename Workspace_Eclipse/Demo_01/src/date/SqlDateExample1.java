package date;

public class SqlDateExample1 {

	public static void main(String[] args) {
		
		long milis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(milis);
		System.out.println(date);
	}
}
