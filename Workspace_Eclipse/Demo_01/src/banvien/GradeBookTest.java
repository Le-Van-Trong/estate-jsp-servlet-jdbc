package banvien;



public class GradeBookTest
{
	// main method begins program execution
	public static void main( String[] args )
	{

		// create a GradeBook object and assign it to myGradeBook
		GradeBook gradeBook = new GradeBook("CS101 Introduction to Java Programming");
		gradeBook.displayMessage();
		gradeBook.determineClassAverage();
	} // end main
} // end class GradeBookTest