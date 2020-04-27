class ArrayTest 
{
	public static void main(String[] args) {
		/*
		[배열]
		자바스크립트와는 달리, 대부분의 응용프로그래밍 언어에서는 배열 선언시 반드시 그 크기가 명시되있어야 한다...
		var arr = new Array(); // 크기 명시하지 않음...
		자바는 아래와 같이 크기를 명시 해야한다
		*/
		int[] arr = new int[3]; // 메모리에 int형 데이터를 3칸을 확보하되, 공간의 나란히 배치되게함...
		arr[0]=5;
		arr[1]=9;
		arr[2]=6;
		for (int i=0;i<arr.length ;i++ ){
			System.out.println(arr[i]);
		}
		
	}
}
