public class D51Ensyu {
    public static void main(String[] args) {
        D51Student student = new D51Student(args[0],args[1]);
        student.display();
    }
}
class D51Student{
    private String id;
    private String name;
    public D51Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("学生番号:"+id);
        System.out.println("氏名:"+name);
    }
}


