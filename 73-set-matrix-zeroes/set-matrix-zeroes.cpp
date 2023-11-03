class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();

        int col0 = 0;
        int row0 = 0;

        for(int i = 0; i < matrix.size(); i++) {
                        cout << i;
            for(int j = 0; j < matrix[0].size(); j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                    if(i == 0) {
                        col0 = 1;
                    }
                    if(j == 0) row0 = 1;
                }
            }
        }

        for(int i =  1 ; i < matrix.size(); i++) {
            for(int j = 1; j < matrix[0].size(); j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }
        cout << col0 << row0;
        if(matrix[0][0] == 0) {
            if(row0)
                for(int i = 0; i < n; i++) matrix[i][0] = 0;
            if(col0)
                for(int i = 0; i < m; i++) matrix[0][i] = 0;
        }
    }
};