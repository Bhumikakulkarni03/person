public class employee extends person {
    int id;
    int sal;
    employee(int id, int sal){
        this.id=id;
        this.sal=sal;
    }
    void display1(){
        System.out.println("Id:"+id);
        System.out.println("Salary:"+sal);
    }
}
