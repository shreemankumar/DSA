class Solution {
    class pair {
        int row;
        int col;
    
        pair(int r, int c){
            row=r;
            col=c;
        }
    }
        public int orangesRotting(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            Queue<pair> que=new ArrayDeque<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==2){
                        que.add(new pair(i,j));
                    }
                }
            }
            int time=0;
            while(que.size()>0){
                int size = que.size();
                while(size>0){
                    pair rnode= que.remove();
    
                    int cr = rnode.row ;
                    int cc = rnode.col ;
    
                    if(cr-1 >= 0 && grid[cr-1][cc]==1){
                        grid[cr-1][cc]=2;
                        que.add(new pair(cr-1,cc));
                    }
                     if(cr+1 < n && grid[cr+1][cc]==1){
                        grid[cr+1][cc]=2;
                        que.add(new pair(cr+1,cc));
                    }          
                     if(cc-1 >= 0 && grid[cr][cc-1]==1){
                        grid[cr][cc-1]=2;
                        que.add(new pair(cr,cc-1));
                    }          
                     if(cc+1 < m && grid[cr][cc+1]==1){
                        grid[cr][cc+1]=2;
                        que.add(new pair(cr,cc+1));
                    }         
                    size--;           
                }
                time++;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==1){
                        return -1;
                }
             }
        }
        if(time==0){
            return 0;
        }
        return time-1;
        }
    }
    
