class Solution {
    // 0, 0 / 0, 3 / 0, 6
    // 3, 0 / 3, 3 / 3, 6
    // 6, 0 / 6, 3 / 6, 6 
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> rowMap = new HashMap<>();
        Map<Integer, Set<Integer>> colMap = new HashMap<>();
        Map<Integer, Set<Integer>> squareMap = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                int squareIndex = (i / 3) * 3 + (j / 3);
                Set<Integer> rowSet = rowMap.computeIfAbsent(i, key -> new HashSet<>());
                Set<Integer> colSet = colMap.computeIfAbsent(j, key -> new HashSet<>());
                Set<Integer> squareSet = squareMap.computeIfAbsent(squareIndex, key -> new HashSet<>());
                if (rowSet.contains(num) || colSet.contains(num) || squareSet.contains(num)) {
                    return false;
                }
                rowMap.get(i).add(num);
                colMap.get(j).add(num);
                squareMap.get(squareIndex).add(num);
            }
        }
        return true;
    }
}
