package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ArrayList<HashMap<String, String>> listData = new ArrayList<>();
        listData.add(new HashMap() {
            {put("title", "Androidの基本");}
            {put("author", "立命太郎");}
        });
        listData.add(new HashMap() {
            {put("title", "Androidの応用");}
            {put("author", "立命次郎");}
        });
        listData.add(new HashMap() {
            {put("title", "Androidのススメ");}
            {put("author", "立命三郎");}
        });

        SimpleAdapter adapter = new SimpleAdapter(this,
                listData,   // ListViewに表示するデータ
                android.R.layout.simple_list_item_2, // ListViewで使用するレイアウト（2つのテキスト）
                new String[]{"title","author"},     // 表示するHashMapのキー
                new int[]{android.R.id.text1, android.R.id.text2} // データを表示するID
        );
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Intent intent = new Intent(ResultActivity.this, BookInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}