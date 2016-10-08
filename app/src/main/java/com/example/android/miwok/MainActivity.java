/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Number
        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Numbers app",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,NumbersActivity.class);
               startActivity(intent);
            }
        });

        //Colors
        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Colors app",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intent);
            }
        });

        //Members of a family
        TextView familyMembers = (TextView)findViewById(R.id.family);
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Family members app",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(intent);
            }
        });

        //Phrases
        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Phrases app",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }


//    public void openNumbersList(View view)
//    {
//        Intent intent = new Intent(this,NumbersActivity.class);
//        startActivity(intent);
//    }
//    public void openFamilyMembersList(View view)
//    {
//        Intent intent = new Intent(this,FamilyMembersActivity.class);
//        startActivity(intent);
//    }
//    public void openPhrasesList(View view)
//    {
//        Intent intent = new Intent(this,PhrasesActivity.class);
//        startActivity(intent);
//    }
//    public void openColorsList(View view)
//    {
//        Intent intent = new Intent(this,ColorsActivity.class);
//        startActivity(intent);
//    }
}
