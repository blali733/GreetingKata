package greetings;

public class Main {

    public String greet(String name){
        if(name != null) {
            return "Hello, " + name + ".";
        }else{
            return "Hello, my friend.";
        }
    }

}
