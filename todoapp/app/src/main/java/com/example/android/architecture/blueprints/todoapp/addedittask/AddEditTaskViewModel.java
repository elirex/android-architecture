package com.example.android.architecture.blueprints.todoapp.addedittask;

import android.content.Context;
import android.databinding.ObservableField;

import com.example.android.architecture.blueprints.todoapp.data.Task;

/**
 * Created by Wang, Sheng-Yuan (Elirex) on 2017/1/15.
 */

public class AddEditTaskViewModel {

    private final AddEditTaskContract.Presenter mPresenter;

    public final ObservableField<String> title = new ObservableField<>();
    public final ObservableField<String> description = new ObservableField<>();

    public AddEditTaskViewModel(AddEditTaskContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public void setTask(Task task) {
        title.set(task.getTitle());
        description.set(task.getDescription());
    }

    public void saveTask() {
        mPresenter.saveTask(title.get(), description.get());
    }

}