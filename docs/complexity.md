# Complexity

Big Oh notation is representation of the worst case performance of a given algorithm.

The growth rate of complexity from low to higher:

```$xslt
1 < log(n) < n < n*log(n) < n^2 < n^3 < 2^n < n!
```

### Logarithmic Complexity
When the loop variable is divided/multiply by a constant amount. 
For example, Binary Search Tree divides the array into half on every iteration (constant amount = 2).
Hence the complexity is log of n to the base of 2.

### Recursive Complexity

Consider following example: 
```$xslt
private int sum(int n) {
    if n == 1 {
        return 1;
    }
    return n + sum(n-1);
}

Complexity:
T(n) = O(n)
1 + T(n-1) = O(n) 
1 + (1 + T(n-2)) = 2 + T(n-2) = O(n) 
k + T(n-k) = … 
n - 1 + T(1) = (*) 
n - 1 + 1= Θ(n)
```

