package oops;

class StudentReportCard{
	int rollNo;
	String name;
	int engMark;
	int mathMark;
	int csMark;
	int scienceMark;
	int ssMark;
	int totalMark;
	float avgMark;
	String grade;
	
	StudentReportCard(int rollNo,String name,int engMark,int mathMark,int csMark,int scienceMark,int ssMark) { 
		 this.rollNo = rollNo;
		 this.name = name;
		 this.engMark = engMark;
		 this.mathMark = mathMark;
		 this.csMark = csMark;
		 this.scienceMark = scienceMark;
		 this.ssMark = ssMark;
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
		System.out.println("TOTAL MARK (out of 500) : " + this.totalMark + "\n" + "AVG : " +  this.avgMark + "\n" + "GRADE : "+ this.grade);
	}
}





public class StudentReportCardSystem {

	public static void main(String[] args) {
		StudentReportCard s1 = new StudentReportCard(1007, "ajay", 50, 29, 48, 12,66);
		s1.calreport();
		s1.grade = "A++";
		s1.printrep();
	}

}
