package com.acme.todolist.application.port.in;

import java.util.List;

import com.acme.todolist.domain.TodoItem;

public interface AddTodoItems {
	
	/**
	 * 
	 *  Ajoute un item
	 */
	
	void addTodoItem (TodoItem item);

}
