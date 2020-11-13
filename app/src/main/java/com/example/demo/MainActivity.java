package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] fruitNames = {"Loa karaoke va nge nhac 3 tac thung son KP","Loa Karaoke LG Xboom RN7 (500)","Loa mini","Micro LG"};
    int[] fruitImages = {R.drawable.t,R.drawable.tt,R.drawable.ttt,R.drawable.tttt};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridview1);

        CustomAdapter customAdapter=new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),fruitNames[position],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),GridItemActivity.class);
                intent.putExtra("name",fruitNames[position]);
                intent.putExtra("image",fruitImages[position]);
                startActivity(intent);
            }
        });
    }

    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return fruitNames.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1=getLayoutInflater().inflate(R.layout.row_data,null);
            TextView name=view1.findViewById(R.id.dish);
            ImageView image=view1.findViewById(R.id.image);
            name.setText(fruitNames[position]);
            image.setImageResource(fruitImages[position]);
            return view1;
        }
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menunu, menu);
            return true;
        }


}