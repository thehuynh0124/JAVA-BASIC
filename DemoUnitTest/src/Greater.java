public class Greater {
    private String name;
    public Greater( String name){
        this.name = name;
    }
    public  String hello(){
        return "HELLO " + name;
    }
    public String hello(String other){

        return "HELLO" + other;
    }
}
