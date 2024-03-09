import java.util.*;

class Solution {
    int size = 750000;
    List<Integer>[] hashTable;
    Solution(){
        hashTable = new LinkedList[size];
    }
    int hashfunction(int key){
        return key % size;
    }
    public void add(int key) {
        //Complete the function
        int hashvalue = hashfunction(key);
       if(hashTable[hashvalue] == null){
       hashTable[hashvalue] = new LinkedList<>();
       }
       if(hashTable[hashvalue].indexOf(key)== -1){
        hashTable[hashvalue].add(key);
       }

    }

    public void remove(int key) {
        //Complete the function
        int hashvalue = hashfunction(key);
        if(hashTable[hashvalue] == null){
            return;
        }
        if(hashTable[hashvalue].indexOf(key) != -1){
         hashTable[hashvalue].remove(hashTable[hashvalue].indexOf(key));
        }

    }

    public boolean contains(int key) {
        //Complete the function
        int hashvalue = hashfunction(key);

        if(hashTable[hashvalue] == null){
            return false;
        }
        if(hashTable[hashvalue].indexOf(key) != -1){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}