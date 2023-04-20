package model;
import java.util.ArrayList;
import java.util.Collections;

public class BST {
    public BST() {}
    public ArrayList<String> sort(ArrayList<String> alist){
        Collections.sort(alist);
        return alist;
    }
    public String binarysearch(ArrayList<String> alist,String target){
        int left = 0;
        int right = alist.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (alist.get(mid).compareTo(target)==0) {
                return String.valueOf(mid+1);
            } else if (alist.get(mid).compareTo(target)<0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "-1";
    }
}
