package com.example.groceriesapplicationstartng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Next_Activity extends AppCompatActivity {
    public TextView textView_item, textView_price, textView_total;
    int total, total1,total2,total3,total4,total8,total10,total11,total12;
    Button button_share;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_display);

        textView_item = findViewById(R.id.display_item);
//        textView_price = findViewById(R.id.display_price);
        button_share = (Button)findViewById(R.id.share);

        button_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Next_Activity.this,"Share", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Grocery Data";
                String shareSub = textView_item.getText().toString();
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share using"));

            }
        });


        for (int i = 0; i < 13; i++){

            String text_item = textView_item.getText().toString();
//            String text_price = textView_price.getText().toString();


            switch (i){

                case 0:
                    int count = MainActivity.modelArrayList.get(i).getNumber();
                     total = count * 500;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                             + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total + "\n"+"\n"+"\n");
                    break;
                case 1:
                case 5:
                    int count1 = MainActivity.modelArrayList.get(i).getNumber();
                    total1 = count1 * 1000;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total1 + "\n"+"\n"+"\n");

                    break;
                case 2:
                case 7:
                case 9:
                    int count2 = MainActivity.modelArrayList.get(i).getNumber();
                     total2 = count2 * 1500;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total2 + "\n"+"\n"+"\n");
                    break;
                case 3:
                    int count3 = MainActivity.modelArrayList.get(i).getNumber();
                     total3 = count3 * 800;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total3 + "\n"+"\n"+"\n");
                    break;
                case 4:
                case 6:
                    int count4 = MainActivity.modelArrayList.get(i).getNumber();
                     total4 = count4 * 2500;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total4 + "\n"+"\n"+"\n");
                    break;
                case 8:
                    int count8 = MainActivity.modelArrayList.get(i).getNumber();
                     total8 = count8 * 2000;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total8 + "\n"+"\n"+"\n");
                    break;
                case 10:
                    int count10 = MainActivity.modelArrayList.get(i).getNumber();
                     total10 = count10 * 3500;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total10 + "\n"+"\n"+"\n");
                    break;

                case 11:
                    int count11 = MainActivity.modelArrayList.get(i).getNumber();
                     total11 = count11 * 3000;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total11 + "\n"+"\n"+"\n");
                    break;

                case 12:
                    int count12 = MainActivity.modelArrayList.get(i).getNumber();
                     total12 = count12 * 400;
                    textView_item.setText(text_item + MainActivity.modelArrayList.get(i).getFruit() + "\n" + "Quantity: "
                            + MainActivity.modelArrayList.get(i).getNumber() + "\n" + "Total: " + total12 + "\n"+"\n"+"\n");
                    break;

            }
        }
    }
}
