package com.example.stringarray_passing_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listv;
    String [] res_get_stringArray;
    String [] str_arr ={"john","chris","ahmad","evan",
            "george","hanabi","jason","miles","john","chris","ahmad","evan","george",
            "hanabi","jason","miles","john","chris","ahmad","evan","george","hanabi","jason","miles"};
    ArrayAdapter<String> adapter_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listv = findViewById(R.id.listview_1);
        // Method -1  passing the str_arr (string array) to the  ListView with ArrayAdapter
        //  process in the below ---->

        adapter_pass = new ArrayAdapter<>
                (MainActivity.this, android.R.layout.simple_list_item_1,str_arr);
        listv.setAdapter(adapter_pass);



        // Method -2  passing the string array in resource folder (values) and storing the data inside a string array and passing it to ListView with ArrayAdapter
        //  process in the below ---->


        //getting access of resource
        Resources res_var = getResources();
        //storing resources inside res_get_stringArray(string array)
        res_get_stringArray= res_var.getStringArray(R.array.res_str_array);

        adapter_pass= new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,res_get_stringArray);
        listv.setAdapter(adapter_pass);



    }
}