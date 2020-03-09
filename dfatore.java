import java.util.*;

class dfatore{

	/*Function to print string with newline as System.out.println is too long*/
	static void print(String s){
		System.out.println(s);
	}

	/*Function to print string without newline as System.out.print is too long*/
	static void printh(String s){
		System.out.print(s);
	}

	/*Function to return max of 2 numbers*/
	static int max(int a,int b){
		if(a>b)
		return a;
		else 
		return b;
	}


	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n,f;

	    /*Here we take DFA input through user input*/	
	    print("Enter the number of states in DFA");
	    n=in.nextInt();
	    String[][] pda=new String[n][n];
	    print("Enter the number of final states in DFA excluding start state. Also this should always be greater than or equal to 1.\n That is if start state is also an accepting state don't count it...");
	    f=in.nextInt();
	    in.nextLine();
	    for(int i=0;i<n;i++){
			if(i<n-f){
				for(int j=0;j<n;j++){
					if(j<n-f){
						print("label for path from node "+i+" to node "+j+":");
						pda[i][j]=in.nextLine();
					}else{
						print("label for path from node "+i+" to final state "+j+":");
						pda[i][j]=in.nextLine();
					}
				}
			}else{
				for(int j=0;j<n;j++){
					if(j<n-f){
						print("label for path from final state "+i+" to node "+j+":");
						pda[i][j]=in.nextLine();
					}else{
						print("label for path from final state "+i+" to final state "+j+":");
						pda[i][j]=in.nextLine();
					}
				}
			}
		}

		/*This is to print the initial DFA. We are using a matrix to represent a DFA. Blanck(ENTER) is used to denote no transitions. The path is denoted as i to j where i is a row number and j is a column number. Both i and j denote state numbers. 0 is by default always the start state. The final states are always taken from last. That is if there are 2 final states and start state is not an accepting state and 5 is the total number of states then 3 and 4 are the final states.*/
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				printh(pda[i][j]+"| ");
			}
			print(" ");
		}



		/*Here is where the elimination starts. In the first loop i represents the state to be eliminated. All the states except start state and final state will be eliminated. So finally we are left with start state and final states. We are still working on getting the final expression. We hope to show it tomorrow.*/
		for(int i=1;i<n-f;i++){
			for(int l=0;l<n;l++){
				if(l!=i && pda[l][i].equals("")==false && pda[i][l].equals("")==false){
					if(pda[i][i].equals("")==false){
						if(pda[l][l].equals("")==false){
						pda[l][l]+=("+"+pda[l][i]+"("+pda[i][i]+")*"+pda[i][l]);
						}else{
						pda[l][l]=pda[l][i]+"("+pda[i][i]+")*"+pda[i][l];
						}
					}else{
						if(pda[l][l].equals("")==false){
							pda[l][l]+=("+"+pda[l][i]+pda[i][l]);
						}else{
							pda[l][l]=pda[l][i]+pda[i][l];
						}
					}
				}

		for(int m=max(l+1,i+1);m<n;m++){
		if(l!=i && m!=i){
		if(pda[i][i].equals("")==false){
			if(pda[l][i].equals("")==false && pda[i][m].equals("")==false){
				if(pda[l][m].equals("")==false)
					pda[l][m]+=("+"+pda[l][i]+"("+pda[i][i]+")*"+pda[i][m]);
				else
					pda[l][m]=pda[l][i]+"("+pda[i][i]+")*"+pda[i][m];
			}

			if(pda[m][i].equals("")==false && pda[i][l].equals("")==false){
				if(pda[m][l].equals("")==false)
					pda[m][l]+=("+"+pda[m][i]+"("+pda[i][i]+")*"+pda[i][l]);
				else
					pda[m][l]=pda[m][i]+"("+pda[i][i]+")*"+pda[i][l];
			}
		}else{
		if(pda[l][i].equals("")==false && pda[i][m].equals("")==false){
			if(pda[l][m].equals("")==false)
				pda[l][m]+=("+"+pda[l][i]+pda[i][m]);
			else
				pda[l][m]=(pda[l][i]+pda[i][m]);
		}

		if(pda[m][i].equals("")==false && pda[i][l].equals("")==false){
			if(pda[m][l].equals("")==false)
				pda[m][l]+=("+"+pda[m][i]+pda[i][l]);
			else
				pda[m][l]=(pda[m][i]+pda[i][l]);
		}
		}
		}
		}
		if(l==0)
			l=i;
		}
		for(int k=0;k<n;k++){
			pda[k][i]="";
			pda[i][k]="";
		}

		print(" ");
		for(int x=0;x<n;x++){
		for(int y=0;y<n;y++){
			printh(pda[x][y]+"| ");
		}
		print(" ");
		}


		}    




	    }
} 	

