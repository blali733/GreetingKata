package greetings;

public class Main {

    public String greet(String... names){
        if(names != null) {
            String greeting = new String("Hello, "+ names[0]);
            if(names.length == 2){
                greeting = (new StringBuilder()).append(greeting).append(" and ").append(names[1]).toString();
            }else if(names.length > 2){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(greeting);
                for(int i=1; i<names.length-1; i++) {
                    stringBuilder.append(", ").append(names[i]);
                }
                stringBuilder.append(", and ").append(names[names.length-1]);
                greeting = stringBuilder.toString();
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
