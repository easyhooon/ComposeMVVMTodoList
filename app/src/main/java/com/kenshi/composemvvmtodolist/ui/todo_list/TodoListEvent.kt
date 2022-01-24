package com.kenshi.composemvvmtodolist.ui.todo_list

import com.kenshi.composemvvmtodolist.data.Todo

sealed class TodoListEvent {

    data class OnDeleteTodoClick(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    //restore
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
