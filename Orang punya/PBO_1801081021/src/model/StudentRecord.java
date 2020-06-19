
package model;




public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;  //rata2 3 buah angka
    public static int studentCount;  
    
    
    //Constructor 1
    public StudentRecord(){
        this("Andi");
        studentCount++; //maka banyak siswa akan bertambah 1
    }
    //Constructor 2
    public StudentRecord(String temp){
        this.name = temp;
    }
    //Constructor 3
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
    }
    //Constructor 4
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }
    
    //Method
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    
    public String getaddress(){
        return address;
    }
    
    public void setaddress(String address){
        this.address=address;
    }
    
    public int getage(){
        return age;
    }
    
    public void setage(int age){
        this.age=age;
    }
    
    public double getmathGrade(){
        return mathGrade;
    }
    public void setmathGrade(double mathGrade){
        this.mathGrade=mathGrade;
    }
    
    public double getenglihsGrade(){
        return englishGrade;
    }
    public void setenglishGrade(double englishGrade){
        this.englishGrade=englishGrade;
    }
    
    public double getscienceGrade(){
        return scienceGrade;
    }
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade=scienceGrade;
    }
    
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }
    
    //fungsi studentcount
    public static int getStudentCount(){
        return studentCount;
    }
    
    //Overloading
    
    public void print(String temp){
        System.out.println("Nama : "+ name);
        System.out.println("Address : "+address);
        System.out.println("Age : "+age);
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name : "+name);
        System.out.println("Math Grade : "+ mGrade);
        System.out.println("English Grade : "+ eGrade);
        System.out.println("Science Grade : "+ sGrade);
    }
    
    
}
