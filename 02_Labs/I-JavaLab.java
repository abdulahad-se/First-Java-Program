
public class  {
     int roll_no,Semester;
     double Gpa;
    Student(int roll_no,int Semester,double Gpa){
        this.roll_no=roll_no;
        this.Semester=Semester;
        this.Gpa=Gpa;
    }
    void get(){
        System.out.println(this.roll_no);
        System.out.println(this.Semester);
        System.out.println(this.Gpa);
    }
    void show(){
        System.out.println("The roll no::"+ this.roll_no);
        System.out.println("The Semester::"+ this.Semester);
        System.out.println("The Gpa::"+ this.Gpa);
    }
    
}
