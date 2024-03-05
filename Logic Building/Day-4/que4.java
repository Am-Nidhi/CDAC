import java.util.Scanner;

class que4{

	public static void main(String []args){

		int i=3,j=3;
		int[][] array1 = new int[i][j];
		int[][] array2 = new int[i][j];
		Scanner sc = new Scanner(System.in);

		System.out.println("Elements for 1st array");
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
		 		array1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements for 2nd array");
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
		 		array2[i][j] = sc.nextInt();
			}
		}

		int[][] result = new int[i][j];
		
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
		 		result[i][j] = array1[i][j]+array2[i][j];
			}
		}

		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
		 		System.out.print(result[i][j]+" ");
			}
			System.out.print('\n');
		}

	}
}