def path_finder(matrix, position, n):

    if position == (n-1, n-1):
        return [(n-1, n-1)]

    x, y = position

    if x+1 < n and matrix[x+1][y] == 1:
        a = path_finder(matrix, (x+1, y), n)
        if a != None:
            return [(x, y)] + a
    if y+1 < n and matrix[x][y+1] == 1:
        b = path_finder(matrix, (x, y+1), n)
        if b != None:
            return [(x, y)] + b

matrix = [
    [1,1,1,1,0],
    [0,1,0,1,0],
    [0,1,0,1,0],
    [0,1,0,0,0],
    [1,1,1,1,1],
]

print(path_finder(matrix, (0,0), 5))
