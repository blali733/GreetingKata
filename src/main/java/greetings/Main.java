package greetings;

public class Main {

    public String greet(String... names){
        if(names != null) {
            String greeting = new String("Hello, ");
            for(String name : names) {
                greeting = (new StringBuilder()).append(greeting).append(name).append(" and ").toString();
            }
            greeting = greeting.substring(0, greeting.length()-5);
            if(names[0].toUpperCase().equals(names[0])){
                return greeting.toUpperCase() + "!";
            }
            return greeting + ".";
        }else{
            return "Hello, my friend.";
        }
    }

}
