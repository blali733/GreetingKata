package greetings;

public class Main {

    public String greet(String... names){
        if(names != null) {
            String greeting = new String("Hello, "+ names[0]);
            for(int i=1; i<names.length; i++) {
                greeting = (new StringBuilder()).append(greeting).append(" and ").append(names[i]).toString();
            }
            if(names[0].toUpperCase().equals(names[0])){
                return greeting.toUpperCase() + "!";
            }
            return greeting + ".";
        }else{
            return "Hello, my friend.";
        }
    }

}
