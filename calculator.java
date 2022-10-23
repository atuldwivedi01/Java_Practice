import java.util.ArrayList;

public class calculator{
    public static void main(String [] args){
        ArrayList<Integer> arrt=new ArrayList<>();
        arrt.add(1);
        arrt.add(2);
        arrt.add(3);
        arrt.add(4);
        arrt.forEach(n-> {if (n%2==0) System.out.println(n);});

        // double area=(0.5)*A.get(0);
        // for (int i=1;i<A.size();i++){
        //     area+=(0.5)*(A.get(i-1)+A.get(i));
        // }
        // area+=(0.5)*A.get(A.size()-1);
        // System.out.println(area);
        // return ""+(long)area;
        int count=0;
        for (int i=135;i<=246;i++){
            count+=1;
        }
        System.out.println(count);

    }
}