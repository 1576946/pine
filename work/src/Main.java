import java.util.*;

public class Main {
    public static void main(String args[]) {
        Main p = new Main();
        p.execute();
    }
    private void execute(){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(input.hasNext()){
            int i = input.nextInt();
            list.add(i);
        }
        solve(list);


    }
    private void solve(ArrayList<Integer> list){
        int num = list.get(list.size()-1);
        int count = 1 ;

        for(int i = 0 ; i < list.size()/2; i++){
            int jNum = list.get(i+list.size()/2);
            if(jNum == num){
                count++;
            }
            int iNum = list.get(i);
            if(iNum==num){
                count++;
            }
        }

    }

}
