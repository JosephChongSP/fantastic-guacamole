


/*
Class: DIT/FT/1B/23
Admission no.: P1829048
Name: Joseph Chong Teik Yun
 */
public class Students {
    private static String name, course;
    private int mobile, studentID;
    private char gender;

    public Students(int studentID, String name, char gender, String course, int mobile){
        this.studentID=studentID;
        this.name=name;
        this.gender=gender;
        this.course=course;
        this.mobile=mobile;

    }//setter
    public int getID(){
        return this.studentID;
    }//setter
    public String getName(){
        return this.name;
    }//setter
    public char getGender(){
        return this.gender;
    }//settter
    public String getCourse(){
        return this.course;
    }//setter
    public int getMobile(){
        return this.mobile;
    }//setter
    public String toString(){
        return(studentID+"    "+name+"   "+gender+"     "+course+"     "+mobile);
    }
    

   
    

}


