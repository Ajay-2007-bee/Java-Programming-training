package encapsulation;
import java.util.*;

class StudentReportCard{
	private int rollNo;
	private String name;
	private int uid;
	private int pass;
	private int engMark;
	private int mathMark;
	private int csMark;
	private int scienceMark;
	private int ssMark;
	private int totalMark;
	private float avgMark;
	private String grade;
	static private String clgName = "SREC";
	

	public StudentReportCard(int rollNo, String name, int uid, int pass, int engMark, int mathMark, int csMark,
			int scienceMark, int ssMark) {

		this.rollNo = rollNo;
		this.name = name;
		this.uid = uid;
		this.pass = pass;
		this.engMark = engMark;
		this.mathMark = mathMark;
		this.csMark = csMark;
		this.scienceMark = scienceMark;
		this.ssMark = ssMark;
	}

	void modify() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter uid : ");
		int tmpuid = sc.nextInt();
		System.out.println("enter pass : ");
		int tmppass = sc.nextInt();
		if (uid == tmpuid && pass == tmppass) {

		        while (true) {
		            System.out.println("\n1.RollNo 2.Name 3.Eng 4.Math 5.CS 6.Sci 7.SS 8.Exit");
		            System.out.print("Enter choice: ");
		            String ch = sc.next();

		            switch (ch) {
		            case "1":
		                this.rollNo = sc.nextInt();
		                break;
		            case "2":
		                name = sc.next();
		                break;
		            case "3":
		                engMark = sc.nextInt();
		                break;
		            case "4":
		                mathMark = sc.nextInt();
		                break;
		            case "5":
		                csMark = sc.nextInt();
		                break;
		            case "6":
		                scienceMark = sc.nextInt();
		                break;
		            case  "7":
		                ssMark = sc.nextInt();
		                break;
		            case   "8":
		                return;
		            default:
		                System.out.println("sooryy ..no choice like that...");
		            }
		        }

		    } else {
		        System.out.println("Wrong uid and pass");
		    }
		}
	
	void calreport() {
		this.totalMark = this.engMark+this.mathMark + this.csMark+this.scienceMark+this.ssMark;
		this.avgMark = this.totalMark/5;
		if(this.totalMark>490) this.grade = "O";
		else if(this.totalMark>450) this.grade = "A+";
		else if(this.totalMark>420) this.grade = "A";
		else if(this.totalMark>400) this.grade = "B+";
		else if(this.totalMark>370) this.grade = "B";
		else if(this.totalMark>300) this.grade = "C";
		else this.grade = "U-FAIL - lol";
	}
	void printrep() {
		System.out.println("ROLL NO : " + this.rollNo + "\n" + "NAME : " + this.name + "\n" + "COLLEGE NAME : " + this.clgName + "\n" + "TOTAL MARK (out of 500) : " + this.totalMark + "\n" + "AVG : " +  this.avgMark + "\n" + "GRADE : "+ this.grade);
	}
	
}	


public class reportgen {

	public static void main(String[] args) {
		StudentReportCard s1 = new StudentReportCard( 101, "Ajay", 1234, 9999, 90, 95, 92, 88, 90);
		s1.calreport();
		s1.printrep();
		s1.modify();
		s1.calreport();
		s1.printrep();
		}

}
