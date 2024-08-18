class Solution {

    // static int ans;

    // public void swap(int a[], int i, int j)
    // {
    //     int t=a[i];
    //     a[i]=a[j];
    //     a[j]=t;
    // }

    // public int partition(int a[], int l, int h)
    // {
    //     int mid = (l+h)/2;

    //     int pivot=a[mid], pivotIdx = mid;
    //     int smallerCount = 0;

    //     for(int i=l;i<=h;i++)
    //     {
    //         if(i==mid) continue;
    //         if(a[i]<=pivot) smallerCount++;
    //     }

    //     int correctIdx = l+smallerCount;

    //     // swap a[pIdx] & a[correctIdx]
    //     swap(a,pivotIdx,correctIdx);

    //     //partition
    //     int i=l, j=h;

    //     while(i<correctIdx && j>correctIdx)
    //     {
    //         if(a[i]<=pivot) i++;

    //         else if(a[j]>pivot) j--;

    //         else if(a[i]>pivot && a[j]<=pivot)
    //         {
    //             swap(a,i,j);
    //         }
    //     }

    //     return correctIdx;
    // }

    // public void quickSelect(int a[], int l, int h, int k)
    // {
    //     // pivot
    //     // left part <= a[l]

    //     if(l>h) return;

    //     if(l==h)
    //     {
    //         if(l==k-1) ans=a[l];
    //         return;
    //     }

    //     int idx = partition(a,l,h);

    //     if(idx==k-1)
    //     {
    //         ans = a[idx];
    //         return;
    //     }

    //     if(k-1< idx) quickSelect(a,l,idx-1,k);

    //     else quickSelect(a,idx+1,h,k);
    // }
    
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        System.gc();
        return nums[nums.length-k];

        // int n=a.length;

        // ans=-1;
        // quickSelect(a,0,n-1,n-k+1);

        // return ans;
    }
}