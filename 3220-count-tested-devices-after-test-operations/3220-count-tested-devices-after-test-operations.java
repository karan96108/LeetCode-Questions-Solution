class Solution {
    public int countTestedDevices(int[] p) {
        int n = p.length;
        int dev =0;
        for(int i =0;i<n-1;i++){
            if(p[i] == 0){
                continue;
            }else{
                dev++;
            }
            for(int j =i+1;j<n;j++){
                // if(p[i] == 0){
                //     break;
                // }
                if(p[i]>0){
                    p[j] = Math.max(0,p[j]-1);
                    // dev++;
                }


            }
            
        }
        if(p[n-1] > 0) dev++;

        return dev;
    }
}