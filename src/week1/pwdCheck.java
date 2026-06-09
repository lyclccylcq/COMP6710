public void main(String argus[]){
    //IO.println("Please enter your pwd:");
    //String pwd=IO.readln();
    boolean correct=false;
    while(!correct) {
        IO.println("Please enter your pwd:");
        String pwd=IO.readln();
        boolean lengthOK = lengthCheck(pwd);
        boolean noSpecial = charCheck(pwd);
        boolean hasCat = catCheck(pwd);
        boolean sum=digitSumCheck(pwd);

        correct=(lengthOK&&noSpecial&&hasCat&&sum);
        if(!correct){
            IO.println("Invalid password!");
        }else {
            IO.println("Pass Check");
        }
    }

}
Boolean lengthCheck(String pwd){
    if(pwd.length()<=15&&pwd.length()>=10){
        return true;
    }
    return false;
}
Boolean charCheck(String pwd){
    for(int i=0;i<pwd.length();i++){
        char c=pwd.charAt(i);
        if(Character.isLetterOrDigit(c)){
            return true;
        }
    }
    return false;
}
Boolean catCheck(String pwd){
    for(int i=0;i<pwd.length()-2;i++){
        char c=pwd.charAt(i);
        char a=pwd.charAt(i+1);
        char t=pwd.charAt(i+2);
        if(c=='c'&&a=='a'&&t=='t'){
            return true;
        }
    }
    return false;
}
Boolean digitSumCheck(String pwd){
    int num=sumOfDigits(pwd);
    int numV=sumOfVowel(pwd);
    if(num!=numV){
        return false;
    }
    return true;
}

int sumOfDigits(String pwd){
    int sum=0;
    for(int i=0;i<pwd.length();i++){
        char ch=pwd.charAt(i);
        if(Character.isDigit(ch)){
            sum=sum+(ch-'0');
        }
    }
    return sum;
}

Boolean isVowel(char c){
    c=Character.toLowerCase(c);
    return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
}

int sumOfVowel(String pwd){
    int sumOfVowel=0;
    for(int i=0;i<pwd.length();i++){
        char c=pwd.charAt(i);
        if(isVowel(c)){
            sumOfVowel++;
        }
    }
    return sumOfVowel;
}