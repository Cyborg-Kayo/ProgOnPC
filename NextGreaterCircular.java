class NextGreaterCircular{
    public static long[] nextLargerElement(long[] arr, int n) {
        
        long[] out=new long[n];
        Stack<Long> a=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!a.isEmpty() && a.peek()<=arr[i%n]){
                a.pop();
            }
            if(i<n){
                out[i]=a.isEmpty()?-1:a.peek();
            }
            a.push(arr[i%n]);
        }
        return out;
        
        long[] out=new long[n];
        Arrays.fill(out,-1);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<i+n;j++){
                int index=j%n;
                if(arr[i]<arr[index]){
                    out[i]=arr[index];
                    break;
                }
            }
        }
        return out;
        
        long[] out =new long[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    out[i]=arr[j];
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                for(int j=0;j<i-1;j++){
                    if(arr[i]<arr[j]){
                        out[i]=arr[j];
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    out[i]=-1;
                }
            }
        }
        return out;
        
    } 
}