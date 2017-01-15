public class search {

	public static int mid_search(int k , int[] a){
		int l =0;
		int r = a.length;
		int ret =-1;
		while(l != r ){
			int m = (l+r)/2;
			if(a[m]==k){
				ret = m;
				break;
			}else if(a[m]> k){
				r=m-1;
			}else{
				l=m+1;
			}
		}
		if (a[l] ==k)
			ret =l;
		return ret;
	}
	
	public static void main(String[] args) {
		int[] a={1,2,5,7,8,9,14,36,57,68,123};
		System.out.println(mid_search(36,a));
	}

}
