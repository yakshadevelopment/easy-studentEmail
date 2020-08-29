package java8.easy.studentEmail;
import java.util.Scanner;

public class Main {
	public static String createEmailAccount(String studentName)
	{
		studentName=studentName.toLowerCase();
		String nameArray[]=studentName.split("\\s");
		String mail=null;
		for(String str:nameArray)
		{
			if(mail==null)
				mail=str;
			else
			 mail=mail+"."+str;
		}
		mail=mail+"@tsr.edu";
     return mail;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String studentName=scanner.nextLine();
		System.out.println("The Mail Id:"+createEmailAccount(studentName));
	}
}
