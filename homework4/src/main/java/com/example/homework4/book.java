package com.example.homework4;
import com.example.homework4.bookclass;
import java.util.List;
import java.util.ArrayList;

import com.example.homework4.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/book")
public class book {
    @Autowired
    ITodoService todoService;
    @GetMapping("")
    public String setUpUploadForm(HttpServletRequest request)
    {
        /*
        bookclass[] list=new bookclass[4];
        list[0]=new bookclass("c程序设计","2002.10","谭浩强","清华大学出版社","http://localhost:8080/book1.png",5);
        list[1]=new bookclass("c primer plus","2010.4","steve","人民邮电出版社","http://localhost:8080/book2.png",200);
        list[2]=new bookclass("c程序设计","2002.10","谭浩强","清华大学出版社","http://localhost:8080/book1.png",5);
        list[3]=new bookclass("c primer plus","2010.4","steve","人民邮电出版社","http://localhost:8080/book2.png",200);
         */
        /*List<bookclass> list=new ArrayList<bookclass>();
        list.add(list1[0]);
        list.add(list1[1]);
        list.add(list1[2]);
        list.add(list1[3]);*/
        //System.out.println("todeser:\n");
        //System.out.println(todoService);
        //System.out.println("\n");
        List<bookclass> list=todoService.list();
        request.getSession().setAttribute("list",list);
        System.out.println(list);
        return "book";
    }
}



