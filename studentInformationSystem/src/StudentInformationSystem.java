public class StudentInformationSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ilber Ortayli", "555","HST");
        Teacher t2 = new Teacher("Graham Bell", "222","PHY");
        Teacher t3 = new Teacher("Pasteur","333","BIO");

        Course history = new Course("History","101","HST");
        history.addTeacher(t1);

        Course physics = new Course("Physics","102","PHY");
        physics.addTeacher(t2);

        Course biology = new Course("Biology","101","BIO");
        biology.addTeacher(t3);

        Student student1 = new Student("IS","123","4",history,physics,biology);
        student1.addBulkExamNote(100,78,50);
        student1.addBulkVerbalNote(90,80,60);
        student1.isPass();

        Student student2 = new Student("GN","444","4",history,physics,biology);
        student2.addBulkExamNote(50,30,67);
        student2.addBulkVerbalNote(60,40,70);
        student2.isPass();
    }
}