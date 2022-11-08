

// Interface
interface Grade {

	// Define variables and methods
	int x = 95;
	void getGrade();


// Class 1
// class implements method of Grade Interface
class MyClass implements Grade {

	// Override getGrade() method
	@Override public void getGrade()
	{	
}
}
// Class 2
// Main class
class anon {
	
	public static void main(String[] args)
	{
		// Lambda  expression
		Grade d2=()->{  
            System.out.println("Grade is " + x);  
        };  
		d2.getGrade();
	}
}
}