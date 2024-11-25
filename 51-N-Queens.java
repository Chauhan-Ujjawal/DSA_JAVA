class Solution {
    static void solve(int col,char[][] board, List<List<String>> res,int leftRow[],int upperdiagonal[],int lowerdiagonal[]){
        if(col==board.length){
            //printing our list of lists that will contain all our solutions
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                solution.add(new String(board[i]));
            }
            res.add(solution);         
        }
        for(int row=0;row<board.length;row++){
            if(leftRow[row]==0 && upperdiagonal[board.length-1+col-row]==0 && lowerdiagonal[row+col]==0){
                //placing our queen
                board[row][col]='Q';
                leftRow[row]=1;
                lowerdiagonal[row+col]=1;
                upperdiagonal[board.length-1+col-row]=1;
                solve(col+1,board,res,leftRow,upperdiagonal,lowerdiagonal);
                board[row][col]='.';
                leftRow[row]=0;
                lowerdiagonal[row+col]=0;
                upperdiagonal[board.length-1+col-row]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        //n*n chessboard
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res =  new ArrayList<List<String>>();
        //res is a list of list that will store all the posssible soltuions found by the algorithm 
        int leftRow[]=new int[n]; 
        //integer array to keep a track of rows that are already occupied 
        int upperdiagonal[]=new int[2*n-1];
        int lowerdiagonal[]=new int[2*n-1];
        solve(0,board,res,leftRow,upperdiagonal,lowerdiagonal);
        return res;
             
    }
}