public class Teacher {
    String name;
    String mobilePhoneNumber;
    String branch;

    Teacher(String name, String mobilePhoneNumber, String branch){
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.branch = branch;
    }
    void print(){
        System.out.println("Name : " + this.name);
        System.out.println("Mobile Phone : " + this.mobilePhoneNumber);
        System.out.println("Branch : " + this.branch);
    }
}
