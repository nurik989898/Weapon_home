package com.company;

public class Skeleton extends Boss{
    private int count;
    private String TypeOfSkeleton;


    public String getTypeOfSkeleton() {
        return TypeOfSkeleton;
    }

    public void setTypeOfSkeleton(String typeOfSkeleton) {
        TypeOfSkeleton = typeOfSkeleton;
    }

    @Override
    public String printInfoForSkeleton() {
        return super.printInfoForSkeleton() + " kolvo strel: " + getCount() + " ," + "Tip skeleta :" + getTypeOfSkeleton();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
