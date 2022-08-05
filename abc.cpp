int collectGold(vector<vector<int>> gold, int x, int y, int n, int m, vector<vector<int>> &dp) {

    if ((x < 0) || (x == n) || (y == m)) {
        return 0;
    }

    if(dp[x][y] != -1){
        return dp[x][y] ;
    }
    int rightUpperDiagonal = collectGold(gold, x - 1, y + 1, n, m, dp);
    int right = collectGold(gold, x, y + 1, n, m, dp);
    int rightLowerDiagonal = collectGold(gold, x + 1, y + 1, n, m, dp);
    return dp[x][y] = gold[x][y] + max(max(rightUpperDiagonal, rightLowerDiagonal), right);
}

int collectMax(vector<vector<int>> mat, int n, int m)
{

    int maxGold = 0;
    vector<vector<int>> dp(n, vector<int>(m, -1)) ;
    for (int i = 0; i < n; i++) {
        int goldCollected = collectGold(mat, i, 0, n, m, dp);
        maxGold = max(maxGold, goldCollected);
    }
    return maxGold;
}