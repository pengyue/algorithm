def getVal(A, i, j, L, H):
    if (i < 0 or i >= L or j < 0 or j >= H):
        return 0
    else:
        return A[i][j]

def find_max_block(A, r, c, L, H, size):
    global maxSize
    global cntArr

    if (r > L or c > H):
        return

    cntArr[r][c] = 1
    size += 1

    if size > maxSize:
        maxSize = size

    direction = [
        [-1,  0],
        [-1, -1],
        [0,  -1],
        [1,  -1],
        [1,   0],
        [1,   1],
        [0,   1],
        [-1,  1],
    ]

    for i in range(0, 7):
        newI = r + direction[i][0]
        newJ = c + direction[i][1]
        val = getVal(A, newI, newJ, L, H)
        if (val > 0 and (cntArr[newI][newJ]) == 0):
            find_max_block(A, newI, newJ, L, H, size)

    cntArr[r][c] = 0

def get_max_ones(A, rowMax, colMax):
    global maxSize
    global size
    global cntArr

    for i in range(0, rowMax):
        for j in range(0, colMax):
            if A[i][j] == 1:
                find_max_block(A, i, j, rowMax, colMax, 0)
    return maxSize

matrix = [
    [1,1,0,0,0],
    [0,1,1,0,0],
    [0,0,1,0,1],
    [1,0,0,0,1],
    [0,1,0,1,1],
]

rowMax = 5
colMax = 5
maxSize = 0
size = 0
cntArr = rowMax*[colMax*[0]]
print("Number of maximum island are:")
print(get_max_ones(matrix, rowMax, colMax))
