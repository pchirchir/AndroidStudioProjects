package com.example.recycler;

import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("PostList");

        mRecyclerView=findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mFirebaseDatabase=FirebaseDatabase.getInstance();
        mRef=mFirebaseDatabase.getReference("Data");
    }

    //load data in recycler view onStart
    @Override
    protected  void onStart(){
        super.onStart();
        FirebaseRecyclerAdapter<Model,ViewHolder> firebaseRecyclerAdapter=new FirebaseRecyclerAdaper<Model,ViewHolder>(
                Model.class,
                R.layout.row,
                ViewHolder.class,
                mRef
        ){@Override
            protected  void  populateViewHolder(ViewHolder viewHolder, Model model,int position){
                viewHolder.setDetails(getApplicationContext(),model.getTitle(),model.getDescription(),model.getImage());
            }
        };

        mRecyclerView.setAdapter(firebaseRecyclerAdapter);

    }
}
