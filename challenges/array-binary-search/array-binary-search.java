class Main {
    public static int binary_Search(int intArray[], int left, int right, int key){  
        if (right>=left){  
            int mid = left + (right - left)/2;  
            if (intArray[mid] == key){  
            return mid;  
            }
            if (intArray[mid] > key){  
            return binary_Search(intArray, left, mid-1, key);  
            }else{  
            return binary_Search(intArray, mid+1, right, key);
            }  
        }  
        return -1;  
    }
  public static void main(String[] args) {
 int intArray[] = {-131, -82, 0, 27, 42, 68, 179}; 
        int key = 42;  
        int right=intArray.length-1;
        int result = binary_Search(intArray,0,right,key);  
        if (result == -1)  
            System.out.println("-1");  
        else 
            System.out.println(result);
             }
}