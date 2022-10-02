public class Student {
     Course course1;
     Course course2;
     Course course3;
     String name;
     String studentNo;
     String classes;
     double average;
     boolean isPass;

     Student(String name, String studentNo, String classes, Course course1, Course course2, Course course3) {
          this.name = name;
          this.studentNo = studentNo;
          this.classes = classes;
          this.course1 = course1;
          this.course2 = course2;
          this.course3 = course3;
          this.average = 0.0;
          this.isPass = false;
     }
     void addBulkExamNote(int note1, int note2, int note3) {
          if (note1 >= 0 && note1 <= 100) {
               this.course1.note = note1;
          }
          if (note2 >= 0 && note2 <= 100) {
               this.course2.note = note2;
          }
          if (note3 >= 0 && note3 <= 100) {
               this.course3.note = note3;
          }
     }

     void addBulkVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3) {
          if (verbalNote1 >= 0 && verbalNote1 <= 100) {
               this.course1.verbalNote = verbalNote1;
          }
          if (verbalNote2 >= 0 && verbalNote2 <= 100) {
               this.course2.verbalNote = verbalNote2;
          }
          if (verbalNote3 >= 0 && verbalNote3 <= 100) {
               this.course3.verbalNote = verbalNote3;
          }
     }

     void calculateAverage() {
          double courseAverage1 = this.course1.note * 0.8 + this.course1.verbalNote * 0.2;
          double courseAverage2 = this.course2.note * 0.7 + this.course2.verbalNote * 0.3;
          double courseAverage3 = this.course3.note * 0.6 + this.course3.verbalNote * 0.4;
          this.average = (courseAverage1 + courseAverage2 + courseAverage3) / 3.0;
     }
     void isPass() {
          System.out.println("===========");
          calculateAverage();
          if (this.average > 55) {
               System.out.println("Congratulations! You passed the class successfully");
               this.isPass = true;
          } else {
               System.out.println("Unfortunately! You failed the class ");
               this.isPass = false;
          }
          printNote();
     }
     void printNote() {
          System.out.println("Student : " + this.name);
          System.out.println(this.course1.name + " -> Exam Note : " + this.course1.note + " & Verbal Note : " + this.course1.verbalNote + " --> Percentages - Exam Note: %80 & Verbal Note : %20");
          System.out.println(this.course2.name + " -> Exam Note : " + this.course2.note + " & Verbal Note : " + this.course2.verbalNote + " --> Percentages - Exam Note: %70 & Verbal Note : %30");
          System.out.println(this.course3.name + " -> Exam Note : " + this.course3.note + " & Verbal Note : " + this.course3.verbalNote + " --> Percentages - Exam Note: %60 & Verbal Note : %40");
          System.out.println("Average of the classes : " + this.average);
     }
}
