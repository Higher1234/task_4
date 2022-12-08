package com.example.homework4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.homework4.service.ITodoService;


@Controller
@RequestMapping("/newbook")
public class newbook {
    @Autowired
    ITodoService todoService;
    @GetMapping("")
    public String setUpUploadForm() {
        return "newbook";
    }
    @PostMapping("")
    public String handleFormUpload(@RequestParam("bookname") String bookname, @RequestParam("author") String author,
                                 @RequestParam("publishdate") int publishdate,@RequestParam("publisher") String publisher,
                                    @RequestParam("num") int num)
    {
        System.out.println("bookname:"+bookname+"\nauthor:"+author+"\npublishdate:"+publishdate+"\npublisher:"+publisher
        +"\nnum:"+num);
        bookclass addbook=new bookclass(0,bookname,publishdate,author,publisher,"http://localhost:8080/book3.png",num);
        System.out.println("new book:");
        System.out.println(addbook);
        todoService.save(addbook);
        System.out.println("new book:");
        System.out.println(addbook);
        return "redirect:/book";
    }
}


