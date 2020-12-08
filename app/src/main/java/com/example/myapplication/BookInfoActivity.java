package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BookInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_info);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", -1);
        String title = intent.getStringExtra("title");
        String author = intent.getStringExtra("author");
        String publisher = intent.getStringExtra("publisher");
        int price = intent.getIntExtra("price", 100);
        String isbn = intent.getStringExtra("isbn");

        // ユーザインタフェースコンポーネントへの参照の取得
        TextView titleView =  findViewById(R.id.titleView);
        TextView authorView = findViewById(R.id.authorView);
        TextView publisherView =  findViewById(R.id.publisherView);
        TextView priceView = findViewById(R.id.priceView);
        TextView isbnView = findViewById(R.id.isbnView);

        // 書籍情報の表示
        titleView.setText(title);
        authorView.setText(author);
        publisherView.setText(publisher);
        priceView.setText(new Integer(price).toString());
        isbnView.setText(isbn);

    }
}