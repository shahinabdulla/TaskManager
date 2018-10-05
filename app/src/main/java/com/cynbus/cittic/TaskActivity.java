package com.cynbus.cittic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cynbus.cittic.adapters.TaskAdapter;
import com.cynbus.cittic.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TaskAdapter taskAdapter;
    private List<Task> taskList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        fetchData();
        recyclerView = findViewById(R.id.recyclerView);
        taskAdapter = new TaskAdapter(taskList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TaskActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(taskAdapter);

    }

    private void fetchData(){
        Task task1 = new Task("Appointment at 11 am");
        Task task2 = new Task("Meeting with Arun at 4 pm");
        Task task3 = new Task("Leanacademy class at CITTIC");
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
    }
}
