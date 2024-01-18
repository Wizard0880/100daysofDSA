public class LinearSearch {
  public static int Linear(int num [],int key){
    for(int i =0 ; i<num.length ; i++){
       if(key==num[i]){
        return i;
       }
    }
    return -1;
}
public static void main(String[] args ){
    int num[] = {2,4,6,8,10};
    int key = 8 ;
    int index = Linear(num, key);

    if(index==-1){
        System.out.println("key not found");
    }
    else{
        System.out.println("Key is at : "+ index);
    }
}
}
