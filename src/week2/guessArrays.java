
void main(){
    int[] array = new int[]{5,20,50,100,200};
    boolean found=false;
    while(!found){
        String input =IO.readln("Guess?");
        int guess=Integer.parseInt(input);
        if(guess(array,guess)){
            found=true;
        }else {
            IO.println("Guess again");
        }
    }
    IO.println("Guess right!");
}

boolean guess(int[] array,int guess){
    for(int i=0;i<array.length;i++){
        if(array[i]==guess){
            return true;
        }
    }
    return false;
}
