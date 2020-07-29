---
title: "Java Gold资格认证:1Z0-809题解"
author: "hjpotter"
cover: "/img/java.png"
tags: ["java", "1Z0-809"]
date: 2020-07-01T01:42:34+09:00

---

近日考完1Z0-809-JPN Java SE 8 Programmer II，即Java Gold资格认证。分享一下参考题目以及部分题目的解法分析。希望能帮助到正在准备考试的朋友们。

<!--more-->

### 答案

```
答案改正：3 d 20 a 24 a 39 c 40 a 53 d 56 bc 60 d 69 d 70 d 76 a 77 a 87 c 102 ab 116 a 117 b 119 b 120 a 132 a 140 b 148 d 152 d 153 d 156 d 
```

参考题目链接: https://pan.baidu.com/s/1FDqDMDmZOr7_wRw7OYDzCA 提取码: sqwc  密码文件名里有



### Stream

| **操作**    | **类型**            | **返回类型**  | **使用的类型/函数式接口** | **函数描述符**   |
| ----------- | ------------------- | ------------- | ------------------------- | ---------------- |
| *filter*    | *中间*              | *Stream<T>*   | *Predicate<T>*            | *T -> boolean*   |
| *distinct*  | *中间(有状态-无界)* | *Stream<T>*   |                           |                  |
| *skip*      | *中间(有状态-有界)* | *Stream<T>*   | *long*                    |                  |
| *limit*     | *中间*              | *Strem<T>*    | *long*                    |                  |
| *map*       | *中间*              | *Stream<R>*   | *Function<T,R>*           | *T -> R*         |
| *flatMap*   | *中间(有状态-无界)* | *Stream<R>*   | *Function<T,Stream<R>>*   | *T -> Stream<R>* |
| *sorted*    | *终端*              | *Stream<T>*   | *Comparator<T>*           | *(T, T) -> int*  |
| *anyMatch*  | *终端*              | *boolean*     | *Predicate<T>*            | *T -> boolean*   |
| *noneMatch* | *终端*              | *boolean*     | *Predicate<T>*            | *T -> boolean*   |
| *allMatch*  | *终端*              | *boolean*     | *Predicate<T>*            | *T -> boolean*   |
| *findAny*   | *终端*              | *Optional<T>* |                           |                  |
| *findFirst* | *终端*              | *Optional<T>* |                           |                  |
| *forEach*   | *终端*              | *void*        | *Consumer<T>*             | *T -> void*      |
| *collect*   | *终端*              | *R*           | *Collector<T,A,R>*        |                  |
| *reduce*    | *终端(有状态-有界)* | *Optional<T>* | *BinaryOperator<T>*       | *(T, T) -> T*    |
| *count*     | *终端*              | *long*        |                           |                  |





| 接口              | 英文含义  | 函数描述符   | 示例                                                        |
| ----------------- | --------- | ------------ | ----------------------------------------------------------- |
| Predicate<T>      | 断言      | T -> boolean | Predicate<String> p=o -> o.isEmpty()                        |
| Consumer<T>       | 消费      | T -> void    | Consumer<String> consumer=s -> log();                       |
| Function<T>       | 功能/函数 | T -> R       | 转换成另一个对象:Function<String,File> f= s -> new File(s); |
| Supplier<T>       | 功能      | None -> T    | 供应者:Supplier<String> s=() -> “heihei”;                   |
| UnaryOperator<T>  | 一元运算  | T -> T       | UnaryOperator<String> s=s1 -> s1+”,” ;                      |
| BinaryOperator<T> | 二元运算  | T,T -> T     | BinaryOperator<String> a=(s, s2) -> s+s2;）                 |



### 函数式接口

| 1    | **BiConsumer<T,U>**代表了一个接受两个输入参数的操作，并且不返回任何结果 |
| ---- | ------------------------------------------------------------ |
| 2    | **BiFunction<T,U,R>**代表了一个接受两个输入参数的方法，并且返回一个结果 |
| 3    | **BinaryOperator<T>**代表了一个作用于于两个同类型操作符的操作，并且返回了操作符同类型的结果 |
| 4    | **BiPredicate<T,U>**代表了一个两个参数的boolean值方法        |
| 5    | **BooleanSupplier**代表了boolean值结果的提供方               |
| 6    | **Consumer<T>**代表了接受一个输入参数并且无返回的操作        |
| 7    | **DoubleBinaryOperator**代表了作用于两个double值操作符的操作，并且返回了一个double值的结果。 |
| 8    | **DoubleConsumer**代表一个接受double值参数的操作，并且不返回结果。 |
| 9    | **DoubleFunction<R>**代表接受一个double值参数的方法，并且返回结果 |
| 10   | **DoublePredicate**代表一个拥有double值参数的boolean值方法   |
| 11   | **DoubleSupplier**代表一个double值结构的提供方               |
| 12   | **DoubleToIntFunction**接受一个double类型输入，返回一个int类型结果。 |
| 13   | **DoubleToLongFunction**接受一个double类型输入，返回一个long类型结果 |
| 14   | **DoubleUnaryOperator**接受一个参数同为类型double,返回值类型也为double 。 |
| 15   | **Function<T,R>**接受一个输入参数，返回一个结果。            |
| 16   | **IntBinaryOperator**接受两个参数同为类型int,返回值类型也为int 。 |
| 17   | **IntConsumer**接受一个int类型的输入参数，无返回值 。        |
| 18   | **IntFunction<R>**接受一个int类型输入参数，返回一个结果 。   |
| 19   | **IntPredicate**：接受一个int输入参数，返回一个布尔值的结果。 |
| 20   | **IntSupplier**无参数，返回一个int类型结果。                 |
| 21   | **IntToDoubleFunction**接受一个int类型输入，返回一个double类型结果 。 |
| 22   | **IntToLongFunction**接受一个int类型输入，返回一个long类型结果。 |
| 23   | **IntUnaryOperator**接受一个参数同为类型int,返回值类型也为int 。 |
| 24   | **LongBinaryOperator**接受两个参数同为类型long,返回值类型也为long。 |
| 25   | **LongConsumer**接受一个long类型的输入参数，无返回值。       |
| 26   | **LongFunction<R>**接受一个long类型输入参数，返回一个结果。  |
| 27   | **LongPredicate**R接受一个long输入参数，返回一个布尔值类型结果。 |
| 28   | **LongSupplier**无参数，返回一个结果long类型的值。           |
| 29   | **LongToDoubleFunction**接受一个long类型输入，返回一个double类型结果。 |
| 30   | **LongToIntFunction**接受一个long类型输入，返回一个int类型结果。 |
| 31   | **LongUnaryOperator**接受一个参数同为类型long,返回值类型也为long。 |
| 32   | **ObjDoubleConsumer<T>**接受一个object类型和一个double类型的输入参数，无返回值。 |
| 33   | **ObjIntConsumer<T>**接受一个object类型和一个int类型的输入参数，无返回值。 |
| 34   | **ObjLongConsumer<T>**接受一个object类型和一个long类型的输入参数，无返回值。 |
| 35   | **Predicate<T>**接受一个输入参数，返回一个布尔值结果。       |
| 36   | **Supplier<T>**无参数，返回一个结果。                        |
| 37   | **ToDoubleBiFunction<T,U>**接受两个输入参数，返回一个double类型结果 |
| 38   | **ToDoubleFunction<T>**接受一个输入参数，返回一个double类型结果 |
| 39   | **ToIntBiFunction<T,U>**接受两个输入参数，返回一个int类型结果。 |
| 40   | **ToIntFunction<T>**接受一个输入参数，返回一个int类型结果。  |
| 41   | **ToLongBiFunction<T,U>**接受两个输入参数，返回一个long类型结果。 |
| 42   | **ToLongFunction<T>**接受一个输入参数，返回一个long类型结果。 |
| 43   | **UnaryOperator<T>**接受一个参数为类型T,返回值类型也为T。    |





##### 2

```java
class MyClass  implements  AutoCloseable{
    int test;
    public  void close(){
    }
    public MyClass copyObject() {
        //return new MyClass(); 如果改成这样，结果是0
      return this;//把obj1的rest传给obj，结果是100
    }
}
    public static void main(String[] args) throws Exception {
        MyClass obj = null;
        try(MyClass obj1 = new MyClass()){
            obj1.test= 100;
            obj = obj1.copyObject();
        }
        System.out.println(obj.test);
```



###### 3

```java
public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/flystone";
          String name = "root";
          String password = "";
        try {

            Connection conn = DriverManager.getConnection(url, name, password);
            String query = "Select * FROM employees WHERE EMPLOYEE_ID = 110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
  /*          while (rs.next()) {
                System.out.println("ID:" + rs.getObject(1));//rs.getInt("Id")
            }*/
            System.out.println("ID:" + rs.getInt("EMPLOYEE_ID"));//rs.getInt("Id")//java.sql.SQLException: Before start of result set
        } catch (SQLException se) {
            System.out.println("Error");
        }
    }
```

se:java.sql.SQLException: Before start of result set

Error

这个是因为在查询出resultSet后未进行.next()，直接进行解析取值。
正确的操作是：


```java
while (resultSet.next()){
} //取值
```

###### 4

Course::Java

```java
public class Test_004 {
    public static void main(String[] args) {
        int i;
        char c;
        try (FileInputStream fis = new FileInputStream("/home/111.txt");
             InputStreamReader isr = new InputStreamReader(fis);) {
            while (isr.ready()) { //line n1
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

隔两位输出一次，结果是ueja 



###### 8

```java
public class Test7 {
    public static void main(String[] args) {
        Stream.of("Joe", "Paul", "Alice", "Tom").filter(s -> s.contains("a")).peek(s -> System.out.println("peek" + s)).findFirst();
    }
}
```

peek() は Stream を操作しない中間操作だ。

peek() に渡す Consumer では、要素を見られるだけで Stream に影響を与えることはない。
なんらかの実効性を持たせるためには副作用として外部に出力するしかないのは forEach() と同様だ。

peek() はデバックなどでパイプラインの途中に差し込んで、要素内容を確認する目的で用意されたもののようだ。
APIドキュメントにはデバッグ用だとはっきり書いてある。

findFirst()  .findAny()



###### 9

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Test009 {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print(i++ + " : ");
            return result;
        };
        str.stream()
                .filter(test)
                .findFirst()
                .ifPresent(System.out::print);
    }
}
```

程式第18行的filter方法只會保留包含「pen」子字串的字串元素。第14行的「i++」可以直接看成0，因為i是區域變數，所以每次取值都會是0。程式第19行使用了findFirst方法，會使得第18行的filter方法找到第一個符合「保留包含『pen』子字串的字串元素」後，就直接回傳結果。因此程式會找到索引1的「pen」，然後將「pen」字串物件包成Optional後回傳，此時程式輸出「0 : 0 :」。第19行的ifPresent方法，因為Optional物件中有「pen」字串的存在，因此會執行標準輸出串流物件的print方法，輸出「pen」。



###### 10

```java
public class Test010 {
    public static void main(String[] args) {
        Stream<Path> paths = Stream.of(Paths.get("data.doc"),
                Paths.get("data.txt"),
                Paths.get("data.xml"));
        paths.filter(s -> s.toString().endsWith("txt")).forEach(
                s -> {
                    try {
                        Files.readAllLines(s)
                                .stream()
                                .forEach(System.out::println); //line n1
                    } catch (IOException e) {
                        System.out.println("Exception");
                    }
                });
    }
}
```

程式第24行開始會保留路徑為「txt」結尾的Path物件，接著讀取剩下來的路徑所指到的檔案之所有的內容，並輸出至標準輸出串流中。paths變數參考到的串流物件中的Path物件，只有「data.txt」會被filter保留，因此只會讀取並輸出「data.txt」的檔案內容。



###### 11

```java
import java.io.IOException;



class Video {
    public void play() throws IOException {
        System.out.print("Video played.");
    }
}
class Game extends Video {
    public void play() throws Exception {
        super.play();//注释掉的话就不输出父类的play()
        System.out.print("Game played.");
    }
}
class Solution{
    public static void main(String[] args) {
        try {
            new Game() .play() ;
        }catch (Exception e) {
            System.out.print(e.getclass());
        }
    }
}
```

コンパイルエラー　IOException<Exception



###### 12

```java
Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
files.forEach(fName -> { //line n1
    try {
        Path aPath = fName.toAbsolutePath(); //line n2
        System.out.println(fName + ":"
                + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
    } catch (IOException ex) {
        ex.printStackTrace();
    }
});
```

「System.getProperty("user.home")」會取得使用者的家目錄路徑。Paths類別的get方法可以傳入路徑字串物件或是URI物件來產生Path物件。Files類別的walk方法可以產生串流物件，以深度優先走訪傳入的Path物件所代表的檔案目錄。



###### 13

```
public class Test013 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 8);
        System.out.println(nums.stream().max(Comparator.comparing(a -> a)).get());
    }
}
```

使用Comparator.comparing()中的静态方法进行排序



###### 14

```
Path file = Paths.get("courses.txt");
// line n1
```

Assume the courses.txt is accessible.

Which code fragment can be inserted at line n1 to enable the code to print the content of the courses.txt file?

A.

```java
List<String> fc = Files.list(file);
fc.stream().forEach (s -> System.out.println(s));
```

B.

```java
Stream<String> fc = Files.readAllLines(file);
fc.forEach (s -> System.out.println(s));
```

C.

```java
List<String> fc = readAllLines(file);//  List<String> fc = Files.readAllLines(file);
fc.stream().forEach (s -> System.out.println(s));
```

**D.**

```java
Stream<String> fc = Files.lines(file);
fc.forEach (s -> System.out.println(s));
```

題解

選項A，Files類別的list方法會回傳Stream物件，所以會編譯錯誤。

選項B，Files類別的readAllLines方法會回傳List物件，所以會編譯錯誤。

選項C，readAllLines方法前應該指定Files類別。

選項D，正確答案。



###### 15

class RateOfInterest {

```java
public static void main(String[] args) {
    int rateOfInterest = 0;
    String accountType = "LOAN";
    switch (accountType) {
        case "RD":
            rateOfInterest = 5;
            break;
        case "FD":
            rateOfInterest = 10;
            break;
        default:
            assert false : "No interest for this account"; //line n1
    }
    System.out.println("Rate of interest:" + rateOfInterest);
}
```

Java的assertion敘述通常用於private方法內，確保傳入方法的參數範圍。當assertion敘述的判斷式為false的時候，就會拋出AssertionError。在執行Java程式的時候，若要啟用assertion敘述的功能，必須要在「java」指令後加上「-ea」或是「-enableassertions」參數來啟用assertion。

在這題的程式中，accountType所參考到的字串均不符合swicth結構中的case項目，因此會執行第22行default的程式。所以第23行的assertion敘述執行的時候，就會拋出AssertionError。



###### 16

```java
class Employee {
    String dept, name;

    public Employee(String d, String n) {
        dept = d;
        name = n;
    }

    public String toString() {
        return getDept() + ":" + getName();
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee ("sales", "Ada"),
        new Employee ("sales", "Bob") ,
                new Employee ("hr","Bob"),
        new Employee ("hr", "Eva"));

        Stream<Employee> s = emps. stream()
                .sorted (Comparator.comparing( (Employee e) -> e .getDept ()).thenComparing( (Employee e) -> e.getName())) ;

        List<Employee> eSorted = s.collect (Collectors.toList());
        System.out.println(eSorted);

    }

}
```

comparing getDept / thenComparing  getName 按顺序排列，选D

[hr:Bob, hr:Eva, sales:Ada, sales:Bob]

###### 17

```java
public class Test017 {
    public static void main(String[] args) {
        Baz d = new Daze();
        d.b("hello");
    }
}


class Foo{
    public  void b(String s){
        System.out.println("F"+s);
    }
}

class Bar extends Foo{
    public  void b(String s){
        System.out.println("Bar"+s);
    }
}
class Baz extends Bar{
    public  void b(String s){
        System.out.println("baz"+s);
    }
}

class Daze extends Baz{
    private Bar bb= new Bar();
    public  void b(String s){
        bb.b(s);
        super.b(s);
    }
}
```

Barhello
bazhello



###### 20

```java
public class Test020 {
    public static void main(String[] args) {
        List<Person> sts = Arrays.asList(
                new Person("Jack", 30),
                new Person ("Mike Hill", 21),
                new Person ("Thomas Hill", 24)) ;
        Stream<Person> resList = sts.stream().filter(s -> s.getAge() >= 25) ;
        long count = resList. filter(s -> s.getName (). contains ("Hill")) .count() ;
        System.out.println(count);
    }
}
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
```

结果：0



###### 21

```java
import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
    CyclicBarrier cb;
    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }
    public void run() {
        try {
            cb.await();
            System.out.println("Worker...");
        } catch (Exception ex) {
        }
    }
}
class Master implements Runnable { //line n1
    public void run() {
        System.out.println("Master...");
    }
}
public class Test021 {
    public static void main(String[] args) {
        Master master = new Master();
        CyclicBarrier cb = new CyclicBarrier(1, master);
        Worker worker = new Worker(cb);
        worker.start();
    }
}
```

程式第42行，在Worker的建構子用到了cb變數作為引數傳入，所以line n2一定要定義cb變數是什麼東西。

CyclicBarrier是Java內建的類別，位於java.util.concurrent套件下，用來讓某個執行緒等待至指定數量的執行緒呼叫CyclicBarrier的await方法後才繼續執行。

選項A，此種CyclicBarrier物件實體化方式需要呼叫兩次CyclicBarrier的await方法後，await方法之後的程式才會被執行，但是在題目給的程式中，await只有在第11行被呼叫過，因此永遠執行不到第12行，而且也無法執行master這個Runnable物件。

選項B，應該要修改line n2才是正確的。

選項C，此種CyclicBarrier物件實體化方式只需要呼叫一次CyclicBarrier的await方法後，傳入CyclicBarrier建構子的master這個Runnable物件和await方法之後的程式都會被執行，所以這是正確答案。

選項D，CyclicBarrier類別沒有這種建構子。

###### 22

若要避免FileAlreadyExistsException，可以在Files類別的copy方法加入CopyOption至第三個參數中，如下：

```java
Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
```



###### 23

```java
public class Test023 {
}

interface Doable {

    public void doSomething(String s);
}

abstract class Task implements Doable {

    public void doSomethingElse(String s) {
    }
}

class Do implements Doable {

    public void doSomething(Integer i) {
    }

    public void doSomething(String s) {
    }

    public void doThat(String s) {
    }
}
```



題解

選項A，雖然Task類別沒有實作出Doable介面的doSomething方法，但是Task類別為抽象類別，因此允許未實作的方法。

選項B，抽象方法不能有程式實作區塊。抽象方法中没有方法体，包含抽象方法的类一定要为抽象类，它的作用是可以在继承时再具体实现这个方法。

選項C，Job類別的doSomething抽象方法傳入的參數和Doable介面的doSomething方法不同，將不被認為是實作Doable介面的doSomething方法，所以Job類別會因沒有實作Doable介面的doSomething方法而無法編譯。

選項D，錯誤理由同選項C。

選項E，有成功實作出Doable介面的doSomething方法。



###### 24

```java
public class Test024 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/software/././sys/readme.txt") ;
        Path path2 = path1.normalize() ;
        Path path3 =path2.relativize(path1);
        System.out.println(path1.getNameCount());///software/././sys/readme.txt
        System.out.println(path2.getNameCount());///software/sys/readme.txt
        System.out.println(path3.getNameCount());//../../././sys/readme.txt
    }//5:3:6
}
```

normalize()方法可以标准化路径，它会处理路径中的相对路径，去除“.”“..”

**`Path`を利用している状況で相対パスを求めたいという場合には`Path::relativize`を使用します。**

```java
public class Main {
    public static void main(String[] args) {
        var directory = Paths.get("/a/b/c/directory");
        var file = Paths.get("/a/b/c/directory/e/file");

        System.out.println(directory.relativize(file)); // => e\file
    }    
}
```



###### 26

```java
class  Person1 implements Comparable<Person1> {
    String name;
    Person1(String name){
        this.name=name;
    }
    @Override
    public int compareTo(Person1 p) {
        return this.name.compareTo(p.name);
    }
}
```

implements Comparable<> 

```java
public int compareTo(T o);
```

什么是Comparable接口

此接口强行对实现它的每个类的对象进行整体排序。此排序被称为该类的自然排序 ，类的 compareTo方法被称为它的自然比较方法 。实现此接口的对象列表（和数组）可以通过 Collections.sort（和 Arrays.sort ）进行自动排序。实现此接口的对象可以用作有序映射表中的键或有序集合中的元素，无需指定比较器。

实现什么方法

int compareTo(T o)

比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。

参数： o - 要比较的对象。

返回：负整数、零或正整数，根据此对象是小于、等于还是大于指定对象。

抛出：ClassCastException - 如果指定对象的类型不允许它与此对象进行比较。



###### 27

```java
List<Integer> list1 = Arrays.asList(10, 20);
List<Integer> list2 = Arrays.asList(15, 30);
	Stream.of(list1, list2)
.flatMap(list -> list.stream())
.forEach(s -> System.out.print(s + " "));
```

Stream物件的flatMap方法可以將串流物件中的元素展開成新的Stream物件。



###### 28

```java
public class Test028 {

    public static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.b("java");//b(java.lang.String)' has private access in 'Book1'
        Book1 b2 = new Ebook();
        b2.b("www.");//b(java.lang.String)' has private access in 'Book1'
    }
}


class Book1{
    private   String b(String s){//private
        return "F"+s;
    }
}

class Ebook extends Book1{
    public  String b(String url){
      return "view"+url;
    }
}
```

main函数报错，book1的方法不能为private

###### 29

```java
public class Test029 {
    public static void main(String[] args) {
        final Counter obj1 = new Counter();
        final Counter obj2 = new Counter();
        new Thread(new Runnable() {
            public void run() {
                obj1.display(obj2);
            }
            }) .start();
                new Thread(new Runnable() {
                    public void run() {
                        obj2.display(obj1);
                    }
                }) .start();
            }
        }
        class Counter extends Thread {
            int i = 10;
            public synchronized void display(Counter obj) {
                try {
                    System.out.println("sss");
                    Thread.sleep(5);
                    obj.increment(this);
                    System.out.println(i);
                } catch (InterruptedException e) {
                }
            }
            public synchronized void increment(Counter obj) {
                i++;
            }
        }
```

■デッドロックの発生要因

一般的にデッドロックの発生要因としては、以下の３点が考えられます。

- 1. 複数のスレッドが、複数の共有資源インスタンスにアクセスしている

  今回の場合でいくと、複数の共有資源インスタンスとしては、「左のお箸」と「右のお箸」が相当します。

- 2. スレッドが、ある共有資源インスタンスをロックした状態で、その他の共有資源インスタンスのロックを取得しようとする

  今回の場合でいくと、Ａさんが「左のお箸」を取得した状態（ロック）で、もう一方の「右のお箸」を取得しようとすることに相当します。

- 3. 共有資源インスタンスのロックを取得する順番が決まっていない

  ロックを取得する順番が対象になっている。 ※ロックを取得する順番が対象とは、今回の場合でいくと、「左のお箸を取得してから右のお箸を取得する」という場合と「右のお箸を取得してから左のお箸を取得する」という場合の両方があることに相当します。

###### 31.

```java
public class Test031 {
    public static void main(String[] args) {
        List<String> nums = Arrays.asList("ee", "se");
        String ans = nums.parallelStream()
                .reduce("java", (a, b) -> a.concat(b));
        System.out.println(ans);
    }
}
```

在并行计算的时候，每个线程的初始累加

identity=java,累加两次

如果我们用0作为identity,则stream和parallelStream计算出的结果是一样的。这就是identity的真正意图。

###### 33

```java
 final class IceCream {
    public void prepare() {
    }
}

 class Cake {
    public final void bake(int min, int temp) {//final不能重写
    }
    public void mix() {
    }
}

 class Shop {
    private Cake c = new Cake();
    private final double discount = 0.25;
    public void makeReady() {
        c.bake(10, 120);
    }
}
 class Bread extends Cake {
    public void bake(int minutes, int temperature) {//报错 bake(int, int)' cannot override 'bake(int, int)' in 'Cake'; overridden method is final
    }
    public void addToppings() {
    }
}
```



###### 35

```java
public class Test035 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/flystone";
        String name = "root";
        String password = "";
        try {
            Properties prop = new Properties();
            prop.put("user", name);
            prop.put("password", password);

            Connection conn = DriverManager.getConnection(url, prop);
            Statement st = conn.createStatement();
            String query = "DELETE  FROM employees WHERE EMPLOYEE_ID = 109";
            System.out.println("s" + st.execute(query));//while(rs.next()) 就是 将rs全部进行读取 不用会报错
/*            String query = "Select * FROM employees WHERE EMPLOYEE_ID = 110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID:" + rs.getObject(1));//rs.getInt("Id")
            }
            // System.out.println("ID:" + rs.getInt("EMPLOYEE_ID"));//rs.getInt("Id")*/
        } catch (SQLException se) {
            System.out.println("Error");
        }
    }
}
```

###### 37

```java
public class Test037 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new Caller("Call"));
        Future f2 = es.submit(new Runner("Run"));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get();//line n1
        System.out.println(str1 + " : " + str2);
    }
}

class Caller implements Callable<String> {
    String str;
    public Caller(String s) {
        this.str = s;
    }
    public String call() throws Exception {
        return str.concat(" Caller");
    }
}

class Runner implements Runnable {
    String str;
    public Runner(String s) {
        this.str = s;
    }
    public void run() {
        System.out.println(str.concat(" Runner"));
    }
}
```

Callable与Runnable的功能大致相似，Callable中有一个call()函数，**但是call()函数有返回值**，而Runnable的run()函数不能将结果返回给客户程序



###### 38

```java
 Future<String>f1=es.submit(c1);
Future<String>f2= (Future<String>) es.submit(r1);
//报错Callable不能直接execute
 es.execute(c1);
 Future<String>f1=es.execute(c1);
```

abc都有execute

###### 39

Function<T,R>接收一个参数并返回结果的函数  .apply

IntFunction<R>**接受一个int类型输入参数，返回一个结果 R apply(int value);

ToIntFunction<T> 接收一个参数并返回int结果的函数   .applyAsInt

1. Function<String, String> function = a -> a + " Jack!";
2. System.out.println(function.apply("Hello")); // Hello Jack!

```java
public class Test039 {
    public static void main(String[] args) {
        IntConsumer consumer = e -> System.out.println(e);
        Integer value = 90;
        //a 
        //Function<Integer> funRef = e->e+10;
        //b
        //IntFunction funRef = e->e+10;
        //Integer result = (Integer) funRef.apply(10);//20 改成value的话是100
      	//c
        ToIntFunction<Integer>  funRef = e->e + 10;
        int result = (Integer) funRef.applyAsInt(value);//100
        consumer.accept(result);//100
    }
}
```

```java
Function<Integer,Integer> funRef = e -> e + 10;//ok
```



###### 40

```java
public class Test040 {
    public static void main(String[] args) {

        List<Emp> emp = Arrays.asList(
                new Emp("John", "Smith"),
                new Emp("Peter", "Sam"),
                new Emp("Thomas", "Wale"));
        List<Emp> list = emp.stream().sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)).collect(Collectors.toList());//a
        List<Emp> listb = emp.stream()
                .sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
                .collect(Collectors.toList());//a
        listb.stream().map(s->s.getfName()).forEach(System.out::print);

    }
}
```

選項C，用map方法會替換掉原本的元素，所以會只剩下遞減排序的fName。 A



###### 43

```java
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Test043 {
    public static void main(String[] args) {

        IntStream stream = IntStream.of(1, 2, 3);
        IntFunction<Integer> inFu = x -> y -> x * y; // line n1
      IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;//b
        IntStream newStream = stream.map(inFu.apply(10)); // line n2
        newStream.forEach(System.out::print);
    }
}
```

inFu需要IntUnaryOperator做回传值



###### 44

```java
public class Test044 {
    public static void main(String[] args) {
        for(Course a:Course.values()){
            System.out.println(a+"f"+a.getCost());
        }
    }
}

enum Course{
    Java(100),J2me(150);
    private  int cost;

     Course(int i) {
        this.cost=i;
        }
     int getCost(){//d 不可以static
        return cost;
    }
}
```

```
枚举被设计成是单例模式，即枚举类型会由JVM在加载的时候，实例化枚举对象，你在枚举类中定义了多少个就会实例化多少个，JVM为了保证每一个枚举类元素的唯一实例，是不会允许外部进行new的，所以会把构造函数设计成private，防止用户生成实例，破坏唯一性。不可以public。
```

47

```java
public class Test047 {
    public static void main(String[] args) {
        double d = 15;
        Locale l = new Locale("en","US");
        NumberFormat format = NumberFormat.getCurrencyInstance(l);
        System.out.println(format.format((d)));
    }
}
```

$15.00



###### 52

jdbc连接方式

1.获取数据库连接对象

```java
private static String url = "jdbc:mysql://localhost:3306/javabeantest";
private static String name = "root";
private static String password = "123456";
private static Connection conn = null;
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");	
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
public static Connection getConnection() {
	try {
		conn = DriverManager.getConnection(url,name,password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return conn;
}
```


2.进行查询

```java
	public static void main(String[] args) {
		Connection conn = DBUtils.getConnection();
		try {
			Statement sttm = conn.createStatement();
			ResultSet rs = sttm.executeQuery("select * from person");
			while(rs.next()) {
				System.out.println(rs.getObject(1)+".."+rs.getObject(2)+".."+rs.getObject(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
```





###### 53

```java
    public static void main(String[] args) throws SQLException {
             final  String str1 = "Java";
             StringBuffer strBuf = new StringBuffer("Course");
        UnaryOperator<String> u = (str2)-> str1.concat(str2);
                   UnaryOperator<String> c = (str3)-> str3.toLowerCase();
        //System.out.println(u.apply(c.apply(strBuf)));//d

    }
```

apply接收string,StringBuffer不行

###### 55

TreeMap繼承SortedMap，會自動排序元素的key

###### 56

从JDK1.7开始，Java提供Fork/Join框架用于并行执行任务。它的思想就是讲一个大任务分割成若干小任务，最终汇总每个小任务的结果得到这个大任务的结果。

java 的ForkJoinTask 抽象类中提供compute方法给我们实现这种思想。java又提供两个抽象类继承ForkJoinTask ，分别是RecursiveAction和RecursiveTask.他们的区别在于：RecursiveTask有返回值，RecursiveAction无返回值。
bc

###### 58

```java
    String url="jdbc:mysql://localhost:3306/1713_day03";
    Properties properties =new Properties();
    properties.put("user", "root");
    properties.put("password", "123");
    Connection connection = DriverManager.getConnection(url, properties);
    //3.获得statement对象
    Statement statement = connection.createStatement();
    //4.定义sql语句
    String sql="insert into user (name,passwod) values('木子','123')";
    //5. 执行
    int  rowCount = statement.executeUpdate(sql);
    if (rowCount>0) {
        System.out.println("����ɹ�");
    }else {
        System.out.println("����ʧ��");
    }
    //6.关闭
    statement.close();
    connection.close();
}
```


###### 60

```java
public static void main(String[] args) {
    Predicate<String> test1 = w ->{
        System.out.println("111");
        return w.equals("do");
    };
    Predicate test2 = (String w) ->w.length() >3;//编译出错
}
```

Error:(13, 27) java: incompatible types: incompatible parameter types in lambda expression

**Predicate<T>**接受一个输入参数，返回一个布尔值结果。



###### 62

```java
public static void main(String[] args) {
    List<Integer> li = Arrays.asList(10,20,30);
    Function<Integer,Integer> fn =f1->f1+f1;
    Consumer<Integer> conVal = s -> System.out.println(s);
    li.stream().map(fn).forEach(conVal);
}
```

20,40,60



###### 63

```java
public class Test063 {

    public static void main(String[] args) {

        List<Product> products = new ArrayList(Arrays.asList(new Product(1, 10),
                new Product(2, 30),
                new Product(2, 30)));
        Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
            p1.price += p2.price;
            return new Product(p1.id, p1.price);
        });
        products.add(p);
        products.stream().parallel()
                .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
                .ifPresent(System.out::println);
    }
}

class Product {
    int id;
    int price;
    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }
    public String toString() {
        return id + " : " + price;
    }
}
```

reduce方法會將串流中的所有Product物件元素的price欄位進行加總，10+20+30=6	0，最後得到的Product物件為「4 : 60」。

reduce方法會保留最後price欄位數值最大的Product物件，因此會把「4 : 60」留下。

輸出「4 : 60」。



64

```java
public class Test064 {
    public static void main(String[] args) {
        try (ImageScanner ir = new ImageScanner();
             ImagePrinter iw = new ImagePrinter()) {
            ir.scanImage();
            iw.printImage();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}

class ImageScanner implements AutoCloseable {
    public void close() throws Exception {
        System.out.print("Scanner closed. ");
    }
    public void scanImage() throws Exception {
        System.out.print("Scan.");
        throw new Exception("Unable to scan. ");
    }
}

class ImagePrinter implements AutoCloseable {
    public void close() throws Exception {
        System.out.print("Printer closed. ");
    }
    public void printImage() {
        System.out.print("Print.");
    }
}
```

Scan.Printer closed. Scanner closed. Unable to scan. 

因為ImageScanner物件比ImagePrinter物件還要早宣告與實體化出來，基於try-with-resources結構中的資源為先進後出的特性，ImagePrinter物件會比ImageScanner物件還要早被關閉。



###### 66

```java
public class Test066 {
    public static void main(String[] args) {
        Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);
        Foo<String, String> pair = Foo.twice ("Hello World!");
        //Foo<?, ?> percentage = new Foo<?, ?>(97, 32);//new Foo<?, ?>(97, 32) error
        Foo<?, ?> percentage = new Foo<>(97, 32);// right
        Foo<?, ?> percentage2 = new Foo<Integer, Integer>(97, 32);//right
        Foo<String, String> grade = new Foo<>("John", "A");
        System.out.println(pair.getValue());
    }
}
class Foo<K, V> {

    private K key;
    private V value;

    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo<T, T> twice(T value) {
        return new Foo<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
```

###### 68

```java
Predicate<String> test = n -> {
    System.out.println("Searching...");
    return n.contains("red");
};
colors.stream()
        .filter(c -> c.length() > 3)
        .allMatch(test);
        List<String> colors = Arrays.asList("red", "green", "yellow");
```



程式第6行的filter方法只會保留包含字串長度大於3的字串元素。只有「green」和「yellow」符合條件。

程式第7行利用allMatch方法來判斷串流中的字串元素是否都包含「red」子字串，若找到一個不符合條件的字串元素，就會立即回傳false。因此在這個題目中，只會輸出一次「Searching...」。



70

```java
public class Test {
    public static void main(String[] args) {

        List<String> cs = Arrays.asList("Java","Java se");
        boolean b1 = cs.stream().anyMatch(w ->w.equals("Java"));
        boolean b2 = cs.stream().allMatch(w ->w.equals("Java"));
        System.out.println(b);

    }
}
```

allMatch anyMatch返回boolean 要false就只能是不是所有匹配就错的allMatch



###### 72

```java
class FileThread implements Runnable {

    String fName;

    public FileThread(String fName) {
        this.fName = fName;
    }

    public void run() {
        System.out.println(fName);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("Java Projects"));
        listOfFiles.forEach(line -> {
            executor.execute(new FileThread(line.getFileName().toString())); //line n1
        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.DAYS); //line n2
    }
}
```

Files類別的walk方法可以使用深度優先(depth-first)來走訪傳入的檔案路徑。

ExecutorService物件的execute方法可以使用新的執行緒來執行傳入的Runnable物件。shutdown方法可以關閉ExecutorService物件使其不再接受新的執行物件(Runnable或是Callable)，但並不會等待目前正在執行和正在排隊的工作執行完畢。awaitTermination方法可以指定一個上限時間來等待ExecutorService物件將所有的工作處理完成。

###### 73

1.jdk1.8以前接口中都要是抽象方法，从jdk1.8开始允许。接口可以有实体方法 加上defalut或者static ，default 修饰的默认实体方法，static修饰的静态实体方法

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

```java
//计算器
interface calc{
    //抽象方法
    //int sum(int x,int y);
    //实体方法 加上default 方法就变成了实体方法
    public default int sum(int x,int y,int z)
    {
        return x+y+z;
    }
    //加上static可以实现实体方法
    public static int mul(int x,int y) {
        return x*y;
    }
    int max(int x,int y);
}
```

[![复制代码](https://common.cnblogs.com/images/copycode.gif)](javascript:void(0);)

default修饰的接口实体方法可以重写 ，static 不能重写

2.Lambda表达式-----去重写接口中的抽象方法，这样就不用具体类实现接口了，他是针对接口中只有一个抽象方法，可以有多个实体方法

而一个接口只有一个抽象方法 有注解FunctionalInterface

函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。

函数式接口可以被隐式转换为lambda表达式。

函数式接口可以现有的函数友好地支持 lambda。



######76

```java
public class Test076 {
    public static void main(String[] args) {

        Map<Integer,Integer> mVal = new HashMap<>();
        mVal.put(1,10);
        mVal.put(2,20);
        //BiConsumer<Integer,Integer> a //right
        BiFunction<Integer,Integer,String>c = (i,j)->{//wrong BiFunction not have accept()
            System.out.println(i +"," +j+";");
        };
        c.accept(1,2);
        mVal.forEach(c);
    }
}
```

BiConsumer+accept() **BiConsumer<T,U>**代表了一个接受两个输入参数的操作，并且不返回任何结果

BiFunction +apply()



###### 77

resultSetType為TYPE_SCROLL_INSENSITIVE，因此除了可以用next來移動欄位指標之外，也可以使用afterLast、previous、absolute和relative等方法。TYPE_SCROLL_INSENSITIVE會保留原始從資料庫取得的資料，TYPE_SCROLL_SENSITIVE才會使用後來更動的資料。

由於resultSetType為TYPE_SCROLL_INSENSITIVE，會保留一開始的結果



###### 79

interface CourseFilter extends Predicate<String> {

```java
public default boolean test(String str) {
    return str.equals("Java");
}
List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
Predicate<String> cf1 = s -> s.length() > 3;
Predicate cf2 = new CourseFilter() { //line n1
    public boolean test(String s) {
        return s.contains("Java");
    }
};
long c = strs.stream()
        .filter(cf1)
        .filter(cf2) //line n2
        .count();
System.out.println(c);//3
```



###### 80

```java
try {
Connection conn = DriverManager.getConnection(dbURL, username, password);
String query = "Select * FROM Item WHERE ID = 110";
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(query);
while (rs.next()) {
    System.out.println("ID:" + rs.getInt("Id"));
    System.out.println("Description:" + rs.getString("Descrip"));
    System.out.println("Price:" + rs.getDouble("Price"));
    System.out.println("Quantity:" + rs.getInt("Quantity"));
}
} catch (SQLException se) {
    System.out.println("Error");
}
```

ResultSet物件的getX方法所傳入的欄位名稱參數是不區分大小寫的，所以如果ID = 110的Item資料列存在的話，就會輸出該列的資訊。



######81

```java
Console console = System.console();//console null
char[]pass = console.readPassword("Enter");
String password = new String(pass);
```

使用Eclipse等IDE运行以上代码时Console中将会为null。 
　　表示Java程序无法获得Console实例，是因为JVM不是在命令行中被调用的，或者输入输出被重定向了。在Eclipse诸如类似的IDE工具中运行Console类。如果没有对Console实例判空操作，结果使用了该实例会抛出java.lang.NullPointerException异常。 

###### 83

```java
public static void main(String[] args) {
    List<Student> stds = Arrays.asList(
            new Student("Jessy", "Java ME", "Chicago"),
            new Student("Helen", "Java EE", "Houston"),
            new Student("Mark", "Java ME", "Chicago"));
    stds.stream()
            .collect(Collectors.groupingBy(Student::getCourse))
            .forEach((src, res) -> System.out.println(src));
}
```

元素在Map物件中的順序，愈先建立群組的項目會排在愈後面，所以「Java ME」會排在「Java EE」之後。元素在List物件中的順序就是原先集合物件的走訪順序，所以「Java ME:Jessy:Chicago」在「Java ME:Mark:Chicago」之前。



###### 85

```java
Path source = Paths.get("/green.txt");
Path target = Paths.get("/colors/yellow.txt");
Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
Files.delete(source);
```

通过在执行Files.copy或Files.move时使用REPLACE_EXISTING选项,您不再需要编写删除原始文件的多个步骤

由於「/colors/yellow.txt」已經存在，也沒使用StandardCopyOption.REPLACE_EXISTING這個CopyOption，因此會在移動檔案之前拋出FileAlreadyExistsException。檔案並不會被移動。



###### 89

```java
public static void main(String[] args) throws Exception {
    try {
        doStuff();
    } catch (ArithmeticException | NumberFormatException | Exception e) {//error
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

}
static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
    if (Math.random() > -1) throw new Exception ("Try again");
}
```

ArithmeticException和NumberFormatException均為Exception的子類別，重複包含了



###### 90

```java
    public static void main(String[] args) throws Exception {
        /*Moveable<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);*/ a right
      /*  Moveable<Integer> animal = n -> n + 10;
        animal.run(100);
        animal.walk(20);*/ Moveable没有返回值
  /*      Moveable animal = (Integer n) -> System.out.println(n);
        animal.run(100);
        Moveable.walk(20);*/
    }
}

interface Moveable<Integer> {
    public default void walk(Integer distance) {
        System.out.println("Walking");
    }
    public void run(Integer distance);
}
```



Moveable介面需要實作的方法為僅接受傳入一個整數參數，且沒有回傳值的的run方法。walk方法是Moveable介面的預設方法，只能在實體化出Moveable介面的物件後才能使用，無法直接使用Moveable介面來呼叫。

java8中为接口新增了一项功能：定义一个或者更多个静态方法。用法和普通的static方法一样。

在接口中，增加default方法， 是为了既有的成千上万的Java类库的类增加新的功能， 且不必对这些类重新进行设计。 比如， 只需在Collection接口中
增加default Stream stream(), 相应的Set和List接口以及它们的子类都包含此的方法， 不必为每个子类都重新copy这个方法。

```java
public interface InterfaceA {

    /**
     * 静态方法
     */
    static void showStatic() {
        System.out.println("InterfaceA++showStatic");
    }

    /**
     * 默认方法
     */
    default void showDefault() {
        System.out.println("InterfaceA ++showDefault");
    }

}
```



###### 91

```java
public class Test091 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList (new Product ( "MotherBoard", 5),
                new Product (" Speaker", 20)) ;
        products.stream ().filter (Product.ProductFilter::isAvailable) .forEach(p -> System. out. println(p)) ;//error
    }
}
class Product {
    String name;
    int qty;
    public String toString() {
        return name;
    }
    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
    static class ProductFilter {
        public boolean isAvailable(Product p) {//static is needed
            return p.qty >= 10;
        }
    }
}
```

静态类内部不可以访问外部类的实例成员，只能访问外部类的类成员，即使是静态内部类的实例方法也不能访问外部类的实例成员，只能访问外部类的静态成员

外部类如何调用静态内部类中的属性和方法

　　　1）外部类可以通过创建静态内部类实例的方法来调用静态内部类的非静态属性和方法

　　　2）外部类可以直接通过“ 外部类.内部类.属性（方法）” 的方式直接调用静态内部类中的静态属性和方法



###### 93

```java
abstract class Shape {
    Shape() { System.out.println("Shape"); }
    protected void area() { System.out.println("Shape"); }
}

class Square extends Shape {
    int side;
    Square(int side) {
        /* insert code here */
        this.side = side;
    }
    public void area() { System.out.println("Square"); }
}
class Rectangle extends Square {
    int len, br;
    Rectangle(int x, int y) {//error super(x);
        /* insert code here */
        len = x; br = y;
    }
    void area() { System.out.println("Rectangle"); }//error
}
```

原先題目的程式會在第16行和第20行編譯錯誤，原因在於Rectangle類別的建構子沒有指定要先呼叫哪個建構子，因此會自動加上「super();」去呼叫Square類別沒有參數的建構子，但這個建構子並不存在。而Rectangle類別中的area方法，覆寫了Square類別中的area方法，但是可見度卻從public降到default，這是不被允許的。



###### 96

list()方法是返回某个目录下的所有文件和目录的文件名，返回的是String数组

listFiles()方法是返回某个目录下所有文件和目录的绝对路径，返回的是File数组

如果您需要按属性过滤掉文件/目录 – 使用Files.find(),如果您不需要按文件属性过滤 – 请使用Files.walk().

File.find(Path, int, BiPredicate, FileVisitOption... ): 查找相应的文件。



###### 97

```java
Stream<String> fc = Files.lines(file);
fc.forEach (s -> System.out.println(s));
```

Files.lines() 这个方法很简单，从`path`对应的文件中读取所有内容，并按行分割，返回一个 Stream<String>。



###### 99

```java
String techName;
 
TechName(String techName) {
    this.techName = techName;
}
}
List<TechName> tech = Arrays.asList(
        new TechName("Java-"),
        new TechName("Oracle DB-"),
        new TechName("J2EE-")
);
Stream<TechName> stre = tech.stream();
stre.map(a -> a.techName).forEach(System.out::print);
```

由於TechName類別沒有覆寫toString方法，因此無法直接輸出techName欄位的值，而是輸出最上層Object類別的toString方法所產生出來的字串。

利用Stream物件的map方法去替換Stream物件的元素為TechName物件的techName欄位值，之後再使用forEach方法將techName欄位值輸出，可得到題目要的輸出結果。



###### 100

```java
class Computer {
    private Card sCard = new SCard();

    private abstract class Card {
    }

    private class SCard extends Card {
    }
}
```

b正确，继承抽象类可以实例化

```java
class Block{
    int bno;
    static class Counter{
        int lo;
        Counter(){
        lo = bno;
        }
    }
}
```

c错误，bno不是static不能在静态内部类中用



######102

```java
Locale c = new Locale("de","DE");
Locale deLocale = Locale.GERMAN;
Locale deLocale = new Locale.Builder().setLanguage("de").setRegion("DE").build();
     System.out.println("Default language name (default): "
                      + deLocale.getDisplayLanguage());
       System.out.println("German language name (German): "
                      + deLocale.getDisplayLanguage(deLocale));
      System.out.println("German language name (French): "
                  + deLocale.getDisplayLanguage(c));
//Default language name (default): 德文
//German language name (German): Deutsch
//German language name (French): Deutsch
```

Locale c = new Locale("de","DE");

Locale deLocale = new Locale.Builder().setLanguage("de").setRegion("DE").build();

locale没有set，没有instance



###### 106

```java
Stream<List<String>> strs = Stream.of(Arrays.asList("text1","text2"),Arrays.asList("text2","text3"));
Stream<String>bs2 = strs.filter(b->b.contains("text1")).flatMap(rs->rs.stream());
bs2.forEach(b-> System.out.println(b));
```

text1
text2

map:只能返回一个值

flatmap:返回多个值

new ArrayList<String>().stream().map(x -> x);//返回一个
new ArrayList<String>().stream().flatMap(x -> Arrays.asList(x.split(" ")).stream());//返回一个流,也就是多个值

###### 110

```java
Deque<String> queue = new ArrayDeque<>();
queue.add("suana");
queue.add("duana");
queue.add("wuana");
System.out.println(queue.pop());
System.out.println(queue.remove());
System.out.println(queue);
```

**pop():** 弹出栈中元素，也就是返回并移除队头元素，等价于`removeFirst()`，如果队列无元素，则发生*NoSuchElementException*

java.util.ArrayDeque.remove() 此方法检索并删除此双端队列代表的队列的头部。



###### 113

```java
UnaryOperator<Integer> uo1 = s -> s * 2; //line n1
List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
loanValues.stream()
        .filter(lv -> lv >= 1500)
        .map(lv -> uo1.apply(lv)) //line n2
        .forEach(s -> System.out.print(s + " "));''
```

程式第10行會編譯錯誤，原因在於List的泛型型態為Double，而UnaryOperator卻是使用Integer，兩者不同所以編譯錯誤。



###### 114

```java
class Vehicle implements Comparable{
    int vno;
    String name;
    public Vehicle(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }
    public String toString() {
        return vno + ":" + name;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

    public static void main(String[] args) throws IOException {
        Set<Vehicle> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle(10123, "Ford"));
        vehicles.add(new Vehicle(10124, "BMW"));
        System.out.println(vehicles);
    }
```

TreeSet是一个排序的、无重复元素的集合。

如果创建自定义对象，并且TreeSet创建时调用的是无参的构造函数，那么必须要实现comparable接口。必須要Comparable，才可以進行自動排序。



###### 115

```java
public class Test115 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(new Runner());
        Future<String> f1 = es.submit(new Caller());
        System.out.println(f1.get());//run call
        es.shutdown();
    }
}

class Caller implements Callable<String> {
    public String call() throws Exception {
        return "call";
    }
}
class Runner implements Runnable {
    public void run() {
        System.out.println( "Runner");
    }
}
```

es.execute(new Runner()) es.submit(new Caller())



###### 116

```java
    public static void main(String[] args) {
       Product1 p = new Product1();
        double newP = p.aDouble(0);
        System.out.println(newP);
/*        int a = 10;
        int b = -1;
        assert (b >= 1) : "Invalid Denominator";
        int c = a / b;
        System.out.println(c);*/
    }
}
 class Product1 {
    public double aDouble(double price){
        assert (price>0);
        return  price*0.5;
    }
```

Exception in thread "main" java.lang.AssertionError

Java的assertion敘述通常用於private方法內，確保傳入方法的參數範圍。當assertion敘述的判斷式為false的時候，就會拋出AssertionError。在執行Java程式的時候，若要啟用assertion敘述的功能，必須要在「java」指令後加上「-ea」或是「-enableassertions」參數來啟用assertion。



###### 117

```java
public class Test116 {
    public static void main(String[] args) {
       Product1 p = new Product1(null);
        //double newP = p.aDouble(0);
        DoubleSupplier js1 = p.getCost();
        System.out.println(js1);
    }
}
 class Product1 {
    Integer cost;
     Product1(Integer cost){
        this.cost=cost;
     }
     int getCost(){
        return cost;
     }
}
```

  DoubleSupplier不支持Integer



###### 119

long count方法用于统计Stream流中元素的个数，这是个终结方法，使用后无法使用其他Stream流

```java
List<String> codes = Arrays.asList("", "11","","22","33");
Long a = codes.stream().filter(x->!x.isEmpty()).count();
System.out.println(a);
```



###### 120

Deque 

双向队列，指该队列两端的元素既能入队(offer)也能出队(poll),如果将Deque限制为只能从一端入队和出队，则可实现栈的数据结构。对于栈而言，有入栈(push)和出栈(pop)，遵循先进后出原则

  常用方法如下： 
  void push(E e):将给定元素”压入”栈中。存入的元素会在栈首。即:栈的第一个元素 
  E pop():将栈首元素删除并返回。

add 加在末尾

```java
Deque<Integer> queue = new ArrayDeque<>();
queue.add(1000);
queue.push(2000);
queue.add(3000);
queue.push(4000);
System.out.println(queue);//[4000, 2000, 1000, 3000]
Integer i1 = queue.remove();
System.out.println(queue);//[2000, 1000, 3000]
Integer i2= queue.pop();
System.out.println(i1+":"+i2);//4000:2000
```



###### 123

```java
 class Demo {
    public static void main(String[] args) throws Exception {
        String s ="ABCDE";
        StringReader sr = null;
        BufferedReader br = null;

        try {
            sr = new StringReader(s);

            // create new buffered reader
            br = new BufferedReader(sr);

            // reads and prints BufferedReader
            System.out.println((char)br.read());
            System.out.println((char)br.read());

            // mark invoked at this position
            br.mark(0);
            System.out.println("mark() invoked");
            System.out.println((char)br.read());
            System.out.println((char)br.read());

            // reset() repositioned the stream to the mark
            br.reset();
            System.out.println("reset() invoked");
            System.out.println((char)br.read());
            System.out.println((char)br.read());

        } catch (Exception e) {
            // exception occurred.
            e.printStackTrace();
        } finally {
            // releases any system resources associated with the stream
            if(sr!=null)
                sr.close();
            if(br!=null)
                br.close();
        }
    }
}
```

A
B
mark() invoked
C
D
reset() invoked
C
D

reset的作用就是回到mark的部位



###### 124

```java
public class Test124 {
    public static void main(String[] args) throws Exception {
        Resouse res1 = new Resouse();
        try {
            res1.open();
            res1.close();
        }catch (Exception e){
            System.out.println("e1");
        }
        try(res1 = new Resouse()){//报错，res1已经被关闭
            res1.open();
        }catch (Exception e){
            System.out.println("e2");
        }
    }
}

class Resouse implements AutoCloseable{

    public void close() throws Exception {
        System.out.println("close");
    }
    public  void open(){
        System.out.println("open");
    }
}
```

要把物件當作try-with-resources的資源，該物件類別必須要實作AutoCloseable介面的close方法。

AutoCloseable.java
public interface AutoCloseable {
    void close() throws Exception;
}



###### 125

```java
public class Test125 {
    public static void main(String[] args) throws FuelNotAvailException, Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}


class FuelNotAvailException extends Exception {
}

class Vehicle {

     void ride() throws FuelNotAvailException { //line n1 protected void ride() throws Exception
        System.out.println("Happy Journey!");
    }
}

class SolarVehicle extends Vehicle {

    public void ride() throws Exception { //line n2
        super.ride();
    }
}
```

FuelNotAvailException繼承Exception，屬於checked exception。

題目原先的程式會在line n2編譯失敗，因為SolarVehicle的ride方法覆寫了Vehicle的ride方法，Vehicle的ride方法會拋出FuelNotAvailException，所以SolarVehicle的ride方法只能不拋出例外、拋出unchecked exception或是拋出FuelNotAvailException或其子例外。

n2的Exception大于n1的FuelNotAvailException

子类重写父类方法，修饰符权限要大于等于父类，返回类型可以是父类方法返回类型的子类，如果方法有异常，抛出的异常类型要小于等于父类的异常。



###### 127

使用字符流对资源进行操作的时候，如果不使用close()方法，则读取的数据将保存在缓冲区中，要清空缓冲区中的数据有两种办法：

- `public abstract void close() throws IOException` 
  关闭流的同时将清空缓冲区中的数据，该抽象方法由具体的子类实现

- `public abstract void flush() throws IOException` 
  不关闭流的话，使用此方法可以清空缓冲区中的数据，但要注意的是，**此方法只有Writer类或其子类拥有，而在Reader类中并没有提供**。此方法同样是在具体的子类中进行实现 。

  

###### 131

```java
Stream<List<String>> iStr = Stream.of(
        Arrays.asList("1", "John"),
        Arrays.asList("2", null));
IntStream nInSt = iStr.flatMapToInt((x) -> x.stream());//Bad return type in lambda expression: Stream<String> cannot be converted to IntStream
IntStream nInSt = iStr.flatMapToInt((x) -> x.stream().mapToInt(Integer::valueOf));//正确但執行時會拋出NumberFormatException，因為「John」字串不能轉成整數
IntStream nInSt = iStr.mapToInt((x) -> Integer.parseInt(x.get(0)));//正确
nInSt.forEach(System.out::print);
```



###### 132

```java
public static void main(String[] args) throws Exception {
    try(Car dc = new Car()) {//n1 下面不加AutoCloseable就报错，因为try需要关闭资源
        dc.copy();
    }
  
  class Car implements AutoCloseable{//
    public  void copy(){
    }
    public void close() throws Exception{
        throw new RuntimeException();
    }
}
```



###### 134

```java
Path path1 = Paths.get("/app/./sys/");
Path res1 = path1.resolve("log");
Path path2 = Paths.get("/server/exe/");
Path res2 = path2.resolve("/readme/");
System.out.println(res1);
System.out.println(res2);
```

Path物件的resolve方法類似Paths類別的get方法，可以產生新的Path物件。但與Paths類別的get方法不同的地方在於，Path物件的resolve方法會與目前的Path物件有關，resolve方法可傳入相對路徑或是絕對路徑。

第13行，為相對路徑的使用方式，路徑會在「/app/./sys」之後加上一層「log」，變成「/app/./sys/log」

第15行，為絕對路徑的使用方式，路徑為「/readme」。



###### 135

使用串流物件的reduce方法，可以將串列的所有元素縮減成一個元素，在這裡縮減的方式為直接串接字串，會串接成「MPEGJPEG」。最後使用get方法來取得字串物件。



###### 138

```java
enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    private int value;

    private USCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
    public static void main(String[] args) throws Exception {
        USCurrency usCoin =  USCurrency.DIME;
        System.out.println(usCoin.getValue());
```

enum建構子的可見度只能使用default或是private。使用enum預先列舉好的常數不需要使用new運算子



###### 140

```java
Predicate<Integer> predicate = x -> x >  0;
System.out.println(predicate.test(100));
```

boolean test(T t);

```undefined
用来处理参数T,看起是否满足要求,可以理解为  条件A
```

```java
BiPredicate<String, String> bp = (String s1, String s2) -> s1.contains("SG") && s2.contains("java");
BiFunction<String, String, Integer> bf = (String s1, String s2) -> {
    int fee = 0;
    if (bp.test(s1, s2)) {
        fee = 100;
    }
    return fee;
};
int fee1 = bf.apply("SGf", "java aa");//如果只有一个参数满足，结果是0
System.out.println(fee1);//100
```

```java
        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };
```



###### 141

```java
public int compare(Book b1, Book b2) {
    return b1.name.compareTo(b2.name);
}
```

方法：int compare 返回：compareTo

###### 144

```java
public class Test144 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread[] ta = {thread1, thread2, thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }
}
class MyThread implements Runnable {

    private static AtomicInteger count = new AtomicInteger(0);

    public void run() {
        int x = count.incrementAndGet();
        System.out.print(x + " ");
    }
}
```

AtomicInteger的incrementAndGet方法，可以使AtomicInteger所表示的整數值加一後，同時回傳整數結果，在操作AtomicInteger物件的數值時，同一時間永遠只有一個執行緒可以存取，所以可以達成thread-safe。

程式第8行的x區域變數，在每個執行緒中的數值都不一樣，排序後為1、2、3。但是執行緒執行第9行的順序不同，因此輸出結果會是1、2、3的任意排列組合。



###### 148

```java
List<Double> nums = Arrays.asList(10.12, 20.12);
DoubleFunction funD = d-> d+100.0;
nums.stream().forEach(funD);//error Required type:


```

need :Consumer<? super java.lang.Double>
Provided: DoubleFunction

参考43 inFu需要IntUnaryOperator做回传值



###### 150

```java
 class Test1<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
    public static void main(String args[]) {
        Test1<String> type = new Test1<>();
        Test1 type1 = new Test1(); //line n1
        type.set("Java");
        type1.set(100); //line n2
        System.out.print(type.get() + " " + type1.get());
    }
}
```

type變數有使用到泛型，指定的型態為String，所以T為String。type1變數則沒有指定泛型，所以T可當作是Object。

type1物件的get方法，可以傳入型態為Object的參數，因此所有型態的資料都可以傳入，當然也包括整數物件(Integer)了。

「+」運算子若其中一個的運算元為字串(物件)時，作為字串連接的功用。物件會使用其「toString」方法來取得字串。所以這題會輸出「Java 100」。



###### 152

```java
public class Test152 {
    public static void main(String[] args) {
        e3 eee = new e3();
        eee.op();
    }
}

abstract class e1 {
    protected void to() {
    }
}

class e2 extends e1 {
    public final void to() {
        System.out.println("111");
    }
}

class e3 {
    e1 m = new e2();
    public void op() {
        m.to();
    }
}
```

输出：111



###### 153

CyclicBarrier是Java內建的類別，位於java.util.concurrent套件下，用來讓某個執行緒等待至指定數量的執行緒呼叫CyclicBarrier的await方法後才繼續執行。

CyclicBarrier cb = new CyclicBarrier(2, master);

此種CyclicBarrier物件實體化方式需要呼叫兩次CyclicBarrier的await方法後，await方法之後的程式才會被執行

```java
public static void main(String[] args) {

    final List<String> list = new CopyOnWriteArrayList<>() ;
    final AtomicInteger ai = new AtomicInteger (0) ;
    final CyclicBarrier barrier = new CyclicBarrier (2, new Runnable () {
    public void run() {System. out.println(list) ; }
});
    Runnable r = new Runnable() {
        public void run() {
            try {
                Thread.sleep(1000 * ai.incrementAndGet());
                list.add("X");
                barrier.await();
            } catch (Exception ex) {
            }
        }
    };
    new Thread(r) .start() ;
    new Thread(r) .start() ;
    new Thread(r) .start() ;
    new Thread(r) .start() ;

}
```

[X, X]
[X, X, X, X]

一开始list为[X, X]，CyclicBarrier为2，所以要执行两次await，增加到

[X, X, X, X]

如果修改成 final CyclicBarrier barrier = new CyclicBarrier (1, new Runnable () {

则结果为

[X]
[X, X]
[X, X, X]
[X, X, X, X]



###### 154

ResourceBundle是使用「key=value」的結構來存放資料。

menu1 = File Menu
menu2 = View Menu

```java
 ResourceBundle resourceBundle=ResourceBundle.getBundle("project");
System.out.println(resourceBundle.getString("projectName"));//rignt
System.out.println(resourceBundle.getObject(1));//wrong 必须是string
```

  getObject(String key);
  getString(String key);
  getStringArray(String key);
  还可以通过keySet()方法获取所有的key。Set keys = bundle.keySet();
  其它ResourceBundle 方法可以通过查看文档获得。



###### 156

```java
private static void method_03() throws Exception{
        File file = new File("C:\\Users\\10167\\Desktop\\test.txt");
        Path path = file.toPath();
        FileChannel fileChannel = FileChannel.open(path,StandardOpenOption.APPEND);
        fileChannel.write(ByteBuffer.wrap("你好".getBytes()));
        fileChannel.close();
        //源文件：abcde,执行后：abcde你好
  List<String> list = new ArrayList<String>();
  
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("第一行");
        list.add("第二行");
        list.add("第三行");
        Path path = Paths.get("/Users/gaoyunhu/2.txt");
        //Files.write(path, list, StandardCharsets.UTF_8);
      Files.write(path, list, StandardOpenOption.APPEND);//再执行一次，又会把这三行重新追加一遍
    }
```

追加内容到文件
Files.write(path,content.getBytes(charset),StandardOpenOption.APPEND);

###### 157

```java
public class Test157 {
    public static void main(String[] args) {
        ProductCode <Number, Integer> c1 = new ProductCode <Number, Integer>();

        ProductCode <Number, String> c2 = new ProductCode <Number, String> () ;
      
    }
}
 class ProductCode<T,S extends T>{
     T c1;
     S c2;
        }
```

type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number

//ProductCode <Number, Long> c2 = new ProductCode <Number, Long> () ; 改成这样就能识别



###### 159

```java
String str = "Java is a programming language";
ToIntFunction<String> indexVal = str::indexOf; //line n1
int x = indexVal.applyAsInt("Java"); //line n2 = int x = str.indexOf("Java");
System.out.println(x);//0
```



###### 163

```java
List<Integer> pieces = Arrays.asList(3,4,5);
pieces.stream().filter(e->e>4).
        peek(e-> System.out.println("p"+e))
        .map(n->n-1)

        .peek(n-> System.out.println("n"+n));//.count()
//.forEach(n-> System.out.println("n"+n)); d right
```

peek用于测试，无法终结。改成forEach，或者最后加上.count()都可以正常输出



