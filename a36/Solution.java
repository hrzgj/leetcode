package a36;

import java.util.HashMap;

/**
 * @author: chenyu
 * @date: 2020/11/16 20:45
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer,Integer>[] rowMap=new HashMap[9];
        HashMap<Integer,Integer>[] columnMap=new HashMap[9];
        HashMap<Integer,Integer>[] boxMap=new HashMap[9];
        for(int i=0;i<9;i++){
            rowMap[i]=new HashMap<>();
            columnMap[i]=new HashMap<>();
            boxMap[i]=new HashMap<>();
        }
        for(int i=0;i<board.length;i++){
            char[] row=board[i];
            for(int j=0;j<row.length;j++){
                if(row[j]!='.') {
                    int num = row[j] - '0';
                    int boxNum = (i / 3) * 3 + j / 3;
                    rowMap[i].put(num, rowMap[i].getOrDefault(num, 0) + 1);
                    columnMap[j].put(num, columnMap[j].getOrDefault(num, 0) + 1);
                    boxMap[boxNum].put(num, boxMap[boxNum].getOrDefault(num, 0) + 1);
                    if (rowMap[i].get(num) > 1 || columnMap[j].get(num) > 1 || boxMap[boxNum].get(num) > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
