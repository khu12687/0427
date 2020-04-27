class TypeConvert{
	public static void main(String[] args) {
	//	byte b = 5; //1byte
		//short s = 7; //2byte
		
		//b=s; // 에러남 2바아트를 1바이트로 못담음


		//정수형은 대부분 int로 처리한다!!
		//int 형 연산이 가장 빠르게 처리됨 
		//주의 데이터 연산에 있어서는 int가 가장 빠르지만, 그렇다고 해서 나머지 자료형이 필요없다는건 아니다...
		//즉 연산을 수행하는 것이 아니라, 메모리에 데이터을 보관할때는 다른 자료형이 중요하게 사용됨...
		short s1=3; 
		short s2=4; 
		
		int a1 = 3;
		int a2 = 4;
		
		short sum = s1+s2; 
		int result = a1+a2;	
	}
}
