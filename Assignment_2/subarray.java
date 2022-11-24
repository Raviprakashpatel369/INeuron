class Main {
	private static boolean dup(HashMap<Integer, Integer> m, int[] arr2) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr2.length;i++) {
			if(!m.containsValue(arr2[i])) {
				return false;
			}
		}
		
		return true;
	}		
		
	public static void main(String args[]) {
		int arr1[] = { 9,8,7,6,5,4,3,2,1 };
		int arr2[] = {1,2,3};
		int arr3[] = {12,23,19};
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(!m.containsValue(arr1[i])) {
				m.put(i,arr1[i]);
			}
		}
		System.out.println(dup(m, arr2));
		System.out.println(dup(m, arr3));
	}
}