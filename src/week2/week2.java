/*void foo(int[] arr) {
    arr[0] = 100;
}
void bar(int[] arr) {
    arr = new int[]{0,0,0,0,0};
}
void baz(int x) {
    x = x + 1;
}
void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5};
    foo(arr);
    IO.println(arr[0]);//100
    bar(arr);
    IO.println(arr[0]);//0
    baz(arr[0]);
    IO.println(arr[0]);//1
}*/


//ArrayList
/*void main(){
    int [] arr=new int[50];
    int [] arr1=new int[]{0,1,2,3,5};
   // arr1[0]=arr+1;
    IO.println(arr1[0]);
}*/

//Assert
boolean contains(int[] haystack, int needle) {
    int i = 0;
    while (i < haystack.length) {
        if (haystack[i] == needle) {
            return true;
        }
        i = i + 1;
    }
    return false;
}

void main(String[] args) {
    int[] arr = new int[]
            {101,5,-8,8000000,0,1,-8000000};
    boolean found = false;
    while (!found) {
        String input = IO.readln("Guess? ");
        int guess = Integer.parseInt(input);
        if (contains(arr, guess)) {
            found = true;
        } else {
            IO.println("Guess again.");
        }
    }
    IO.println("Congrats!");
}

void main() {
    assert (1 == 2);
}
