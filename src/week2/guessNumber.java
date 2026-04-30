void main(){
    int ans=randomNumber();
    boolean found=false;

    while(!found){
        String str =IO.readln("Guess？");

        int n=Integer.parseInt(str);
        if(n<ans){
            IO.println("too low");
        }else if(n>ans){
            IO.println("too high");
        }else {
            found=true;
        }
    IO.println("You are right!");
    }

}

int randomNumber(){
    Random random = new Random();
    int n= random.nextInt(100);
    return n;
}

