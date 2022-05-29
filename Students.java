package week3.day1;

public class Students {
	
	String ID,Name,email;
	int phNumber;
	
	//just created a constructor
	Students(String Id)
	{
		this.ID=Id;
		System.out.println("ID is "+ ID);
	}
	
	 public String getStudentInfo(String studentID)
	 {
		 return studentID;
	 }
	 
	 public void getStudentInfo(String studentID,String studentName)
	 {
		 ID=studentID;
		 Name=studentName;
		 System.out.println(ID + Name);
	 }
	 
	 public void getStudentInfo(String emailID,int phoneNumber)
	 {
		 email=emailID;
		 phNumber=phoneNumber;
		 System.out.println(email + phNumber);
		
	 }
	
	public static void main(String[] args) {
		
		Students s= new Students("9898");
		s.getStudentInfo("677");
		s.getStudentInfo("ver@gmail.com", "1234567897");
		s.getStudentInfo("677","Veer");
		
		
		
	}

}
