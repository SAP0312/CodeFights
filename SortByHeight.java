/*Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
*/

int[] sortByHeight(int[] a) {
	    int j=0;
	ArrayList<Integer> arr = new ArrayList<Integer>(5);
	    for(int n:a){
	        if(n!=-1)
	            arr.add(n);
	    }
	    Collections.sort(arr);
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=-1){
	            a[i]=arr.get(j);
	            j++;
	        }
	    }
	    return a;
	    
	}

