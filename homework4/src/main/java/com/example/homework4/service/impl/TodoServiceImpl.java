package com.example.homework4.service.impl;

import com.example.homework4.bookclass;
import com.example.homework4.mapper.TodoMapper;
import com.example.homework4.service.ITodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl extends ServiceImpl<TodoMapper, bookclass> implements ITodoService {
}
