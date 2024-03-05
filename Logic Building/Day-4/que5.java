import java.util.Scanner;
class que5{

	public static void main(String []args){
	
	int i=2,j=2,flag=0;
	int[][] matrix1 = new int[i][j];
	int[][] matrix2 = new int[i][j];

	Scanner sc = new Scanner(System.in);

	for(i=0; i<2; i++){
		for(j=0; j<2; j++){
			matrix1[i][j] = sc.nextInt();
		}
	}

	for(i=0; i<2; i++){
		for(j=0; j<2; j++){
			matrix2[i][j] = sc.nextInt();
		}
	}

	for(i=0; i<2; i++){
		for(j=0; j<2; j++){
			if(matrix1[i][j] == matrix2[i][j]){
				flag=0;
			}
			else { flag=1; }
		}
	}

	if(flag==0){
		System.out.println("Matrices are equal");
	}
	else System.out.println("Matrices are not equal");

	}

}