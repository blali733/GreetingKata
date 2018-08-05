package greetings;

public class Main {

    public String greet(String name){
        if(name != null) {
            if(name.toUpperCase().equals(name)){
                return "HELLO, " + name + "!";
            }
            return "Hello, " + name + ".";
        }else{
            return "Hello, my friend.";
        }
    }

}
