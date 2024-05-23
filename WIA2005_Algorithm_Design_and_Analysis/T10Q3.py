def subsetSumDP(set, n, sum):
    dp = [[False] * (sum + 1) for _ in range(n + 1)]

    # Base case: If sum is 0, there's always an empty subset
    for i in range(n + 1):
        dp[i][0] = True

    for i in range(1, n + 1):
        for j in range(1, sum + 1):
            if set[i - 1] <= j:
                dp[i][j] = dp[i - 1][j] or dp[i - 1][j - set[i - 1]]
            else:
                dp[i][j] = dp[i - 1][j]

    return dp[n][sum]

# Example usage
set = [2, 6, 1, 3]
sum = 9
n = len(set)
if subsetSumDP(set, n, sum):
    print("Found a subset with the given sum")
else:
    print("No subset with the given sum")
