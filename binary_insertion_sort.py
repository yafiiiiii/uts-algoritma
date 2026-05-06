def binary_search(arr, val, start, end):
    while start < end:
        mid = (start + end) // 2
        if arr[mid] < val:
            start = mid + 1
        else:
            end = mid
    return start


def binary_insertion_sort(arr):
    for i in range(1, len(arr)):
        val = arr[i]
        pos = binary_search(arr, val, 0, i)

        j = i
        while j > pos:
            arr[j] = arr[j - 1]
            j -= 1
        arr[pos] = val

    return arr


if __name__ == "__main__":
    data = [5, 2, 9, 1, 5, 6]
    print("Sebelum:", data)
    print("Sesudah:", binary_insertion_sort(data))