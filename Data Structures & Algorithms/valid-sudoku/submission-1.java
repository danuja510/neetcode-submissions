class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Integer>> buckets = new ArrayList(9);
        List<HashSet<Integer>> columns = new ArrayList(9);
        for(int i=0; i<9; i++){
            buckets.add(new HashSet());
            columns.add(new HashSet());
        }
            
        for (int i=0; i<board.length; i++){
            HashSet<Integer> row = new HashSet();
            for (int j=0; j< board[i].length; j++){
                if (board[i][j] == '.')
                    continue;
                int value = Integer.parseInt(board[i][j] + "");


                if (row.contains(value))
                    return false;
                row.add(value);

                if (columns.get(j).contains(value))
                    return false;
                columns.get(j).add(value);
                
                if (buckets.get(getBucket(i, j)).contains(value))
                    return false;
                buckets.get(getBucket(i, j)).add(value);
                
            }
        }
        return true;


    }

    private int getBucket(int row, int col){
        return ((int)((row / 3) * 3 + (col / 3)));
    }
}
