
public class arrays {
    public static void main(String [] args){
        System.out.println("Checking!");
        int [] arr= new int[]{1,2,2,2,2,3,5};
        System.out.println("Is the Array Sorted? "+(isSortedAsc(arr)?"Yess":"No"));
        // System.out.println("Reverse Version of Given Array: "+Arrays.toString(reverseArray(arr)));
        // int k=removeDuplicates(arr);
        // System.out.println("Number Of Unique Elements: "+k);
        // for (int i=0;i<=k;i++){
        //     System.out.print(arr[i]+",");
        // }
        int [] arr2=new int [] {7,10,4,3,6,5,2};
        // System.out.println("Left Rotate by 2: "+Arrays.toString(lRotateD_v1(arr, 1)));
        // printLeaders(arr2);
        // System.out.println("Maximum Difference in An Array: "+maxDifference(arr2));

        printFrequencyArray(arr);
        int [] arr3=new int [] {1,5,3,8,13};
        System.out.println("Max Profit: "+maxProfit(new int []{30,10}));
        System.out.println("Trapping Rain Water: "+trappingRainWater(new int[]{3,0,1,2,5}));
        System.out.println("Consecutive 1's in the given array: "+maxConsecutiveOne(new int [] {0,0,1,1,1,1,1,0,1}));
        System.out.println("Maximum subArray Sum of the given array : "+subArraySum(new int [] {-5,1,-2,3,-1,2,-2}));
        
    }
    // Return True if the array is sorted in Ascending Order.
    public static boolean isSortedAsc(int [] arr){
        boolean res=true;
            for (int i=1;i<arr.length;i++){
                if (arr[i]<arr[i-1]){
                    return false;
                }
            }
        return res;
    }
    // Reverse a given Array.
    public static int [] reverseArray(int [] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;
    }
    // Remove duplicates in sorted Array.
    public static int removeDuplicates(int [] arr){
        int k=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]!=arr[i-1]){
                arr[++k]=arr[i];
            }
        }
        return k;
    }
    // Left Rotate Array by One.
    public static int [] lRotateOne(int [] arr){
        int temp=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    // Left Rotate an Array by d.
    public static int [] lRotateD_v1(int [] arr, int d){
        int [] temp=new int [d];
        for (int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for (int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        for (int i=0;i<temp.length;i++){
            arr[arr.length-d+i]=temp[i];
        }
        return arr;
    }
    // Leaders in An Array.
    public static void printLeaders(int [] arr){
        int curr_leader=arr[arr.length-1];
        System.out.print(curr_leader+" ");
        for (int i=arr.length-2;i>-1;i--){
            if(curr_leader<arr[i]){
                curr_leader=arr[i];
                System.out.print(curr_leader+" ");
            }
        }
    }
    // Maximum difference in an Array and j>i;
    public static int maxDifference(int []arr){
        int res=arr[1]-arr[0];
        int minVal=arr[0];
        for (int i=1;i<arr.length;i++){
            res=Math.max(res,arr[i]-minVal);
            minVal=Math.min(minVal,arr[i]);
        }
        return res;
    }
    // Frequency of element in Sorted Array.
    public static void printFrequencyArray(int []arr){
        int freq=1;
        int i=1;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                i++;
                freq++;
            }
            System.out.println(arr[i-1]+" : "+freq);
            i++;
            freq=1;
            if(i==arr.length){
                System.out.println(arr[i-1]+" : "+freq);
            }
        }

    }
    // Stock buy and sell (Maximize Profit)
    public static int maxProfit(int []arr){
        int profit=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
            profit+=arr[i]-arr[i-1];
            }
        }
        return profit;

    }
    // Trapping Rain Water 
    public static int trappingRainWater(int []arr){
        int [] lMax=new int [arr.length];
        int [] rMax=new int[arr.length];
        lMax[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            lMax[i]=Math.max(lMax[i-1],arr[i]);
        }
        rMax[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            rMax[i]=Math.max(rMax[i+1],arr[i]);
        }

        int res=0;
        for (int i=1;i<=arr.length-1;i++){
            res+=Math.min(rMax[i],lMax[i])-arr[i];
        }
        return res;
    }
    // Maximum consecutive 1's in a Binary Array
    public static int maxConsecutiveOne(int [] arr){
        int res=0;
        int i=0;
        int curr=0;
        while (i<arr.length){
            if (arr[i]==0){
                curr=0;
            }else {
                curr++;
                res=Math.max(curr,res);
            }
            i++;
        }
        return res;
    }
    // Maximum SubArray Sum
    public static int subArraySum(int [] arr){
        int res=0;
        int maxEnding=arr[0];
        for (int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    // Maximum Length Even - Odd SubArray
    
    // Maximum Circular SubArray Sum
}
