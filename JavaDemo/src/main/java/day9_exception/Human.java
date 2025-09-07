package day9_exception;

//record approximate ： class with fields,all-arguments constructor,getters,toString
public record Human(int id,String name,int age,String gender) {
    //other methods
    public void x(){
        System.out.println("hahah");
    }
}
