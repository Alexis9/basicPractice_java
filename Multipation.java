//用数组实现九九乘法表的存储和输出
public class Multipation {
	public static void main(String[] args) {
		int arr[][] = new int[9][9];
		for(int i = 1;i <= arr.length;i++) {
			for(int j = 1; j <= arr.length ;j++) {
				if(i >= j) {
					System.out.printf(i+"*"+j+"="+(i*j)+"\t");
				}
			}
			System.out.println();
		}
	}
}
