/**
 * 冒泡算法
 * @param {arr} 需要排序的数组
 * @param {compareFunc} 可自定义的比较函数，默认为 (x, y) => x > y
 */
function bubbleSort(arr, compareFunc = (x, y) => x > y) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length - i - 1; j++) {
            if (compareFunc(arr[j], arr[j + 1])) {
                swap(arr, j, j + 1);
            }
        }
    }
}

function swap(arr, i, j) {
    arr[i] += arr[j];
    arr[j] = arr[i] - arr[j];
    arr[i] = arr[i] - arr[j];
}

const testSet = [0, 3, 4, 1, 7, 5, 10, 2];

bubbleSort(testSet, (i, j) => j > i);

console.log(testSet);
