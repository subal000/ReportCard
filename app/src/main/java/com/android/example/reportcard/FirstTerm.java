package com.android.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FirstTerm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_list);
        ArrayList<Result> firstTerm= new ArrayList<Result>();
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));
        firstTerm.add(new Result("Name: Subal Ghimire", "Physics: 50", "Chemistry: 35","Maths: 69" ));


        ResultAdapter adapter = new ResultAdapter(this, firstTerm);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
