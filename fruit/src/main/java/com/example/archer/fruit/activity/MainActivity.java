package com.example.archer.fruit.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.archer.fruit.R;
import com.example.archer.fruit.adapter.FruitAdapter;
import com.example.archer.fruit.fruitcell.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * adapter的三个参数，
         *
         */

        initFruits();
        ListView listView= (ListView) findViewById(R.id.list_view);

        FruitAdapter mAdapter=new FruitAdapter(this,R.layout.fruit_item,fruitList);
       listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void initFruits() {

        Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
        fruitList.add(apple);
        Fruit Banana=new Fruit("Banana",R.drawable.banana_pic);
        fruitList.add(Banana);
        Fruit cherry=new Fruit("Cherry",R.drawable.cherry_pic);
        fruitList.add(cherry);
        Fruit orange=new Fruit("Orange",R.drawable.orange_pic);
        fruitList.add(orange);
        Fruit watermelon=new Fruit("watermelon",R.drawable.watermelon_pic);
        fruitList.add(watermelon);
        Fruit mango=new Fruit("Mango",R.drawable.mango_pic);
        fruitList.add(mango);
        Fruit pear=new Fruit("Pear",R.drawable.pear_pic);
        fruitList.add(pear);
        Fruit  grape=new Fruit("Grape",R.drawable.grape_pic);
        fruitList.add(grape);
        Fruit pineapple=new Fruit("Pineapple",R.drawable.pineapple_pic);
        fruitList.add(pineapple);
        Fruit  strawberry=new Fruit("Strawberry",R.drawable.strawberry_pic);
        fruitList.add(strawberry);


    }
}
