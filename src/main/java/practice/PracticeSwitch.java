package practice;

public class PracticeSwitch {
	public static void displayJob() {
		int[] number = {1,1,2,2,3,3,4,4,5,5};

		for(int i = 0; i < number.length; i++) {
			switch(number[i]) {
			 	case 1:
			 		System.out.println(number[i] + "：勇者" );
			 		break;
			 	case 2:
			 		System.out.println(number[i] + "：バトルマスター" );
			 		break;
			 	case 3:
			 		System.out.println(number[i] + "：パラディン" );
			 		break;
			 	case 4:
			 		System.out.println(number[i] + "：海賊" );
			 		break;
			 	case 5:
			 		System.out.println(number[i] + "：魔法剣士" );
			 		break;
			}
		}
	}
}
