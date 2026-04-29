void main(String[] args){
    String input;
    input = IO.readln("Am i a sentient?");
    //IO.print("You said:"+input+",I'm not a sentient.");
    if(input.equals("yes")){
        IO.println("You are wrong!");
    }else if(input.equals("no")){
        IO.println("You are right!");
    }else{
        IO.println("Sorry,can't understand");
    }
    IO.println("I'm not a sentient");
}