 void main(String[] args) {
        String pwd;
        pwd = IO.readln("Enter your password: ");
        //check pwd
        boolean lengthOk = lengthCheck(pwd);
        boolean catOk= containCat(pwd);
        boolean specialOk =noSpecialChar(pwd);
        //boolean digitsOk=digitsCheck(pwd);
        boolean correct = lengthOk && catOk && specialOk ;
        if(!correct) {
            IO.println("Invalid password!");
        }

        }
    boolean lengthCheck(String pwd){
        int length=pwd.length();
        if(length>10&&length<15){
            return true;
        }else {
            return false;
        }
    }
    boolean containCat(String pwd){
        for(int i=0;i<pwd.length()-2;i++){
            char first=pwd.charAt(i);
            char second=pwd.charAt(i+1);
            char third=pwd.charAt(i+2);
            if(first=='c'&&second=='a'&&third=='t'){
                return true;
            }
        }
        return false;
    }
    boolean noSpecialChar(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if (Character.isLetterOrDigit(ch) == false) {
                return false;
            }
        }
        return true;
    }

