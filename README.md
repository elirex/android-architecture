# TODO-DataBinding-RxJava

This sample is based on the [todo-mvp](https://github.com/googlesamples/android-architecture/tree/todo-mvp/todoapp) and combined other two samples, one is the [todo-datatbinding](https://github.com/googlesamples/android-architecture/tree/todo-databinding/) and onther is [todo-mvp-rxjava](https://github.com/googlesamples/android-architecture/tree/todo-mvp-rxjava/).
Using the Data Binding library to display data and bind UI elements to actions
and through the RxJava to communicate between the data model and presenter layer.

This sample doesn't follow a strict Model-View-ViewModel or a Model-View-Presenter
pattern, as it uses both View Models and Presenters.

## Feature components

### UI

The responsibility of each component in this sample is:

  * Activity: Object creation.
  * Fragment: Interaction with framework components.
  * Presenter: Receives user actions and retrieves the data from the repository.
  * ViewModel: Exposes data for a view.

### Data

Using RxJava streams as a way of retrieving task. The RxJava provides the easy
way to convert between threads.

## Additional dependencies

* [Data Binding Library](https://developer.android.com/topic/libraries/data-binding/index.html)
* [RxJava](https://github.com/ReactiveX/RxJava)
* [RxAndroid](https://github.com/ReactiveX/RxAndroid)
* [SqlBrite](https://github.com/square/sqlbrite)

## Features

### Complexity

Developers need to be familiar with RxJava and Data binding.

### Testability

#### Unit testing

Very high. Unit tests are easy to implement, because the Observable of RxJava is
highly unit testable.

#### UI testing

Similar with TODO-MVP.

### Code metrics

Compared to TODO-MVP, each page add ViewModel class but less UI code per Activity
and Fragment, and add some classes to encapsulate the Schedulers of RxJava.
```
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            54           1459           1554           3734 (3450 in MVP)
XML                             35            126            337            734
-------------------------------------------------------------------------------
SUM:                            89           1585           1891           4468
-------------------------------------------------------------------------------
```
### Maintainability

#### Ease of amending or adding a feature

Easier than MVP for small changes. A new feature might require some experience
with RxJava and Data Binding library.

#### Learning cost

The Data Binding library takes care of the communication between some
components, so developers need to understand what it does and doesn't before
making changes to the code.

The RxJava uses new concepts, so developers need to understand how it work.
