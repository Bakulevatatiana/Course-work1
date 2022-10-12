public class Employee {

    private  String fullName;
    public int department;
    public int    salary;
    private final int id;
    private static int counter =0;

    public Employee (String fullName, int department,int    salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }
        public int getSalary(){
            return this.salary;}
        public int getId(){
            return this.id;}
        public   String getFullName(){
            return this.fullName;}
        public int getDepartment (){
            return this.department=department;}
        public void setSalary (int salary){
                this.salary=salary;}

        public void setDepartment (int department){
                this.department=department;
        }
    public void   settFullName(String FullName){
         this.fullName= fullName;}
    @Override
    public  String toString() {
        return this.fullName + " " + this.department+ " " + this.salary;

    }

}

