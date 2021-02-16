package a765;

/**
 * @author: chenyu
 * @date: 2021/2/15 19:26
 */
public class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int[] indexMap = new int[n]; // 索引表，row[i] = num => index[num] = i
        for (int i = 0; i < n; i++) {
            indexMap[row[i]] = i;
        }
        int count = 0;
        for (int i = 0; i < n-1; i += 2) {
            int p1 = row[i];
            int p2 = (p1 & 1) == 0 ? p1 + 1 : p1 - 1; // p1的情侣
            if (row[i+1] == p2) {
                continue; // p1和p2正好挨着，无需交换这一对
            }
            int p2Index = indexMap[p2]; // p2的位置
            swap(row, indexMap, i+1, p2Index); // 交换 p2 <=> [i+1]
            count++;
        }
        return count;
    }

    private static void swap(int[] row, int[] indexMap, int i, int j) {
        int tmp = row[i];
        row[i] = row[j];
        row[j] = tmp;
        indexMap[row[i]] = i;
        indexMap[row[j]] = j;
    }
}
