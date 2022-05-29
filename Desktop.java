package week3.day1;

public class Desktop extends Computer {
	
	//single inheritance
	public void desktopSize()
	{
		System.out.println("desktopSize");
	}
	
	public static void main(String[] args) {
		
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
		
		
	}

}
