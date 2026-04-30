void main(){
    int[] arr1 =new int[]{1,2,3,4,5};
    assert (!guess(arr1,6));
    assert (guess(arr1,2));
    //assert (!guess(arr1,3));
    assert (guess(arr1,4));

}

boolean guess(int[] array,int guess){
    for(int i=0;i<array.length;i++){
        if(array[i]==guess){
            return true;
        }
    }
    return false;
}