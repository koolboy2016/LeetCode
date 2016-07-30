public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        List<Set<Character>> row = new ArrayList<Set<Character>>();
		List<Set<Character>> col = new ArrayList<Set<Character>>();
		List<Set<Character>> sub = new ArrayList<Set<Character>>();
        
        for (int i = 0; i < 9; i++) {
			row.add(new HashSet<Character>());
			col.add(new HashSet<Character>());
			sub.add(new HashSet<Character>());
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;
				if (row.get(i).contains(board[i][j]) || col.get(j).contains(board[i][j])
						|| sub.get(i / 3 + (j / 3) * 3).contains(board[i][j]))
					return false;
				else {
					row.get(i).add(board[i][j]);
					col.get(j).add(board[i][j]);
					sub.get(i / 3 + (j / 3) * 3).add(board[i][j]);
				}

			}
		}

		return true;
    }
}