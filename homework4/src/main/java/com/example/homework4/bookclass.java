package com.example.homework4;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
@Data
public class bookclass
{
    @TableId(value = "id" ,type=IdType.AUTO)
    public int id;

    public String name;
    public int date;
    public String author;
    public String publisher;
    public String photo;
    public int number;
    bookclass(int iden,String na,int d,String a,String p,String ph,int n)
    {
        id=iden;
        name=na;
        date=d;
        author=a;
        publisher=p;
        photo=ph;
        number=n;
    }
}
