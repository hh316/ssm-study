package com.hh.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T>{
    //当前页码
    private  int currentPage;
    //每页显示的数据量
    private  int pageSize;
    //总数据条数
    private  long total;
    //当前页数据集合
    private List<T> data;
}
