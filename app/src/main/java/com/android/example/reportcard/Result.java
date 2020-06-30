package com.android.example.reportcard;
public class Result {
    private String mName;
    private String mPhysics;
    private String mChemistry;
    private String mMaths;
    public Result(String StudentName , String PhyMarks, String ChemMarks, String MathMarks ){
        mName= StudentName;
        mPhysics = PhyMarks;
        mChemistry=ChemMarks;
        mMaths=MathMarks;
    }

    public String getmName(){
        return mName;
    }
    public String getmPhysics(){
        return mPhysics;
    }
    public String getmChemistry(){
        return mChemistry;
    }
    public String getmMaths(){
        return mMaths;
    }


}
