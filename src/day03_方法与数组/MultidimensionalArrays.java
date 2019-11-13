package day03_方法与数组;

public class MultidimensionalArrays {
	public static void main(String[] args) {
		int[][] scores = {{78, 88, 98}, {87, 93, 99}, {67, 87, 54}};
		int classLen = scores.length;
		for (int i = 0; i < classLen; i++) {
			int sum = 0;
			int count = scores[i].length;
			for (int j = 0; j < count; j++) {
				sum += scores[i][j];
			}
			int avg = sum / count;
			System.out.println("这是第" + (i + 1) + "班的平均成绩：" + avg);
		}
	}
}
