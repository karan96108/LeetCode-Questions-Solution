class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> lst = new ArrayList<>();

       int l = 0;
       int r = matrix[0].length-1;
       int ul =0;
       int ll = matrix.length-1;

       while(l<=r && ul<= ll){
            for(int i = l ;i<=r;i++){
                lst.add(matrix[ul][i]);
            }
            ul++;
            for(int i = ul ;i<=ll;i++){
                lst.add(matrix[i][r]);
            }
            r--;
            if(ul<= ll){
            for(int i = r ;i>=l;i--){
                lst.add(matrix[ll][i]);
            }
            ll--;
            }
            if(l<=r){
            for(int i = ll ;i>=ul;i--){
                lst.add(matrix[i][l]);
            }
            l++;
            }


            
       } 

       return lst;
    }
}