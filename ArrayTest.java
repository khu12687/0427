class ArrayTest 
{
	public static void main(String[] args) {
		/*
		[�迭]
		�ڹٽ�ũ��Ʈ�ʹ� �޸�, ��κ��� �������α׷��� ������ �迭 ����� �ݵ�� �� ũ�Ⱑ ��õ��־�� �Ѵ�...
		var arr = new Array(); // ũ�� ������� ����...
		�ڹٴ� �Ʒ��� ���� ũ�⸦ ��� �ؾ��Ѵ�
		*/
		int[] arr = new int[3]; // �޸𸮿� int�� �����͸� 3ĭ�� Ȯ���ϵ�, ������ ������ ��ġ�ǰ���...
		arr[0]=5;
		arr[1]=9;
		arr[2]=6;
		for (int i=0;i<arr.length ;i++ ){
			System.out.println(arr[i]);
		}
		
	}
}
