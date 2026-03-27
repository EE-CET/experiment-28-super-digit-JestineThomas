[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/wmzS8rRg)
# Experiment 28: Super Digit

## Problem Statement

Given an integer $n$, we need to find the **super digit** of the integer created by concatenating $n$, $k$ times.

**Rules:**
* If $x$ has only 1 digit, then its super digit is $x$.
* Otherwise, the super digit of $x$ is equal to the super digit of the sum of the digits of $x$.

## Input Format

* The first line contains two space-separated integers, $n$ (the number) and $k$ (repetition factor).

## Output Format

In a new line, print the super digit of $n$ repeated $k$ times.

### Example 1

**Input:**

```text
148 3
```

**Output:**

```text
3
```

### Explanation

Here $n = 148$ and $k = 3$, so the number $P = 148148148$.
1.  Sum of digits of $P$: $1+4+8+1+4+8+1+4+8 = 39$.
2.  39 has more than 1 digit, so sum digits again: $3 + 9 = 12$.
3.  12 has more than 1 digit, so sum digits again: $1 + 2 = 3$.
4.  3 has 1 digit. Result is 3.
