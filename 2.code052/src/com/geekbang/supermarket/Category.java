package com.geekbang.supermarket;

// >> TODO 使用enum而非class声明
public enum Category {

    // >> TODO 必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(1, "00"),
   // >> TODO 不可以重名
//   FOOD(1),
    COOK(3, "11"),
    SNACK(5, "22"),
    CLOTHES(7, "33"),
    ELECTRIC(9, "44");

    // 可以有属性
    private int id;
    private String name;

    // >> TODO 构造方法必须是private的，不写也是private的
    Category(int id, String name){
        this.id = id;
        this.name = name;
    }

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Category{" +
                "id=" + id + "}" +
                "{" + "name=" + name + "}";
    }

//    public String toString1(){
//        return "Category{" +
//                "name=" + name + "}";
//    }

}
