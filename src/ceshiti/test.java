package ceshiti;

public class test {
	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5};
//		int i = 0;
//		while(i < a.length){
//			if(i == 2 || i == 4)
//				a[i] = 0;
//			System.out.print(a[i] + " ");
//			i++;
//		}
//		for (int j = 0; j < a.length; j++) {
//			System.out.print(a[j] + " ");
//		}
		
//		cc(2);
		int [] a ={4,16,95,18,9,55,35,34,64};
		CountingSort(a);
	}
	
	public static void cc(int n){		
		for (int j = 0; j <= n; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print(j + "*" + (i+1) + "=" + (j * (i+1)));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
     * 计数排序
     *
     * @param array
     * @return
     */
    public static int[] CountingSort(int[] array) {
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            bucket[array[i] + bias]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
        return array;
    }
    
    
    
    
    
}
