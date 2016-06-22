package com.goit.lessons.homeWork.additionalTasks.collectionUsage;

import java.util.ArrayList;

public class FindPairsCollection implements AutoCloseable {

    @Override
    public void close() throws Exception {};

    public void findPairs(ArrayList<Integer> intArray, int target){

        int counter = 0;

        for (int i = 0; i < intArray.size(); i++) {
            for (int j = i; j < intArray.size(); j++) {

                if ((intArray.get(i) + intArray.get(j)) == target) {
                    System.out.println(intArray.get(i) + " " + intArray.get(j));
                    counter++;
                }
            }

        }
        if (counter == 0){
            System.out.println("ArrayList does not contain elements which sum is  " + target);
        }

    }

    public ArrayList<Integer> arrayFill () {

        ArrayList<Integer> arrayList= new ArrayList<>();

// Fill ArrayList in cycle
        /*for(int i = 0; i < 30; i++){
            arrayList.add(i);
            System.out.print(arrayList.get(i) + " ");
        }*/

//Fill ArrayList
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);

        if(arrayList.size() == 0 | arrayList.size() == 1)
        {throw new ArrayIndexOutOfBoundsException("ArrayList size 0 or 1, should be more than 1");}

        for(int i = 0; i < arrayList.size(); i++){

            System.out.print(" " + arrayList.get(i));
        }
        System.out.println();
        return arrayList;
    }

    public static void main (String args[]) throws Exception{

        try(
        FindPairsCollection findPairsCollection = new FindPairsCollection())
        {findPairsCollection.findPairs(findPairsCollection.arrayFill(), 13);}
        catch (NullPointerException e){
            System.err.println("[ERROR]: Some element in the ArrayList is null");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("[ERROR]: ArrayList's size is 0 or 1, goal can't be reached");
        }
    }
}
