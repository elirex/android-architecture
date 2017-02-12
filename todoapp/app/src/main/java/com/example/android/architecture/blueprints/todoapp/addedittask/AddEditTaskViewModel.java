package com.example.android.architecture.blueprints.todoapp.addedittask;

import android.content.Context;
import android.databinding.ObservableField;

import com.example.android.architecture.blueprints.todoapp.data.Task;

/**
 * Created by Wang, Sheng-Yuan (Elirex) on 2017/1/15.
 */

public class AddEditTaskViewModel {

    private final AddEditTaskContract.Presenter mPresenter;


    public ObservableField<String> title;
    public ObservableField<String> description;

    public AddEditTaskViewModel(AddEditTaskContract.Presenter presenter) {
        mPresenter = presenter;
        title = new ObservableField<String>();
        description = new ObservableField<String>();
    }

    public void setTask(Task task) {
        title.set(task.getTitle());
        description.set(task.getDescription());
    }

    public void saveTask() {
        mPresenter.saveTask(title.get(), description.get());
    }

    public void onTitleChanged(CharSequence s, int start, int before, int count) {
        String text = title.get();
        if (text == null || !text.equals(s.toString())) {
            title.set(s.toString());
        }
    }

    public void onDescriptionChanged(CharSequence s, int start, int before, int count) {
        String text = description.get();
        if (text == null || !text.equals(s.toString())) {
            description.set(s.toString());
        }
    }

}
