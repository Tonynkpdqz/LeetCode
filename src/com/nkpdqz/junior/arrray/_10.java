package com.nkpdqz.junior.arrray;

import java.util.HashSet;
import java.util.Set;

public class _10 {

    public static void main(String[] args) {
        char[][] board = new char[9][9];
        //System.out.println(board[0].length);
        int i = 3,j = 3;
        int r = i;
        System.out.println(r);
    }

    public static boolean isValidSudoku(char[][] board) {
        if(null == board || board.length < 9){
            return false;
        }

        Set<Character> rowSet = new HashSet<Character>();
        Set<Character> colSet = new HashSet<Character>();
        Set<Character> cardSet = new HashSet<Character>();

        for(int i=0;i<9;i++){
            rowSet.clear();
            colSet.clear();
            cardSet.clear();
            for(int j=0;j<9;j++){

                if(rowSet.contains(board[i][j])){
                    return false;
                }else{
                    if(board[i][j] != '.'){
                        rowSet.add(board[i][j]);
                    }
                }

                if(colSet.contains(board[j][i])){
                    return false;
                }else{
                    if(board[j][i] != '.'){
                        colSet.add(board[j][i]);
                    }
                }

                int r = j/3+i/3*3;
                int c = (j%3+i*3) % 9;
                if(cardSet.contains(board[r][(c)])){
                    return false;
                }else{
                    if(board[r][c] != '.'){
                        cardSet.add(board[r][c]);
                    }
                }
            }
        }
        return true;
    }
}
