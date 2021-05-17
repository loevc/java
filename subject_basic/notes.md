注: 
> 了解----知道大概, 自己明白就好.  
> 理解----自己明白, 给别人能说明白.  
> 掌握----可以动手实践, 可以解决相关问题.  

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
## 计算机体系结构及组成原理

### 1. 了解计算机的基本体系结构. 计算机的组成部分及各个部分的作用.
现代计算机的基本体系结构都是基于Von Neumann体系结构的。主要的特点是CPU和内存是计算机的重要组成部分，内存中保管着数据和指令，CPU从内存中取指令执行，分别为做运算和读写数据， 
分为5大组件。  运算器、控制器、存储器、输入设备、输出设备
> 存储器 ： 用来存储数据和程序  
> 运算器 ： 主要进行算术运算和逻辑运算， 并将中间结构暂存在运算器中  
> 控制器 ： 主要用来控制和指挥程序的输入运行， 以及处理运算结果  
> 输入设备 ： 用来将人们熟悉的信息转换为机器能够识别的信息形式， 常见的有键盘，鼠标等  
> 输出设备 ： 可以将机器运算结果转换为人们熟悉的信息形式， 如打印输出， 显示输出等  

### 2. 掌握二进制的表示数. 给出一个任意的十进制数, 会算它的二进制数.
二进制数是用1和0两个数码表示的数， 它的基数是2， 进位规则是 逢2进1   借位规则是 借1当2  
整数部分： 除2取余，逆序排列  
小数部分： 乘2取整，顺序排列  

### 3. 掌握八进制数, 十六进制数, 掌握他们和二进制的转换关系.
八进制数 和 十六进制数 与 二进制数的对应关系是  3位  4位   

### 4. 了解程序编译运行的基本流程. 如何从源代码变为机器码, 最终在计算机上运行.
词法分析（词素、词法单元） >  语法分析（语法树） >  语义分析 >  

(临时发现一个好玩的东西，当我想切换两个页面的时候，尝试了几次，居然发现可以使用CTRL+tab的方式向后， 想到其他软件的快捷键一般的都是shift取反， 果然啊)  
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
## 操作系统部分

### 1. 理解计算机操作系统的概念. 操作系统的作用, 设计目标和具体功能.
概念  : 操作系统是指控制和管理整个计算机系统的硬件和软件资源，并合理的组织调度计算机的工作和资源的分配， 以提供用户和其他软件方便的接口和和环境，它是计算机系统中最基本的系统软件。
作用  :  为了使计算机系统能协调、高效和可靠地进行工作，同时也为了给用户一种方便友好地使用计算机的环境，在计算机操作系统中，通常都设有处理器管理、存储器管理、设备管理、文件管理、作业管理等功能模块，它们相互配合，共同完成操作系统既定的全部职能。
设计目标  :  操作系统之本意原为提供简单的工作排序能力，后为辅助更新更复杂的硬件设施而渐渐演化
具体功能  :  处理器管理、存储器管理、设备管理、文件管理、作业管理

### 2. 了解进程和线程的概念.
进程  :  进程（Process）是计算机中的程序关于某数据集合上的一次运行活动，是系统进行资源分配和调度的基本单位，是操作系统结构的基础。 在早期面向进程设计的计算机结构中，进程是程序的基本执行实体；在当代面向线程设计的计算机结构中，进程是线程的容器。 程序是指令、数据及其组织形式的描述，进程是程序的实体。
线程  :  线程（英語：thread）是操作系统能夠進行運算调度的最小單位。 大部分情况下，它被包含在进程之中，是进程中的實際運作單位。 一条线程指的是进程中一个单一顺序的控制流，一個进程中可以並行多個线程，每条线程并行执行不同的任务。

### 3. 了解计算机操作系统内存管理的概念. 要明白为什么要有内存管理.(有兴趣的同学请研究内存管理算法)
内存管理 概念 :  内存管理是指软件运行时对计算机内存资源的分配和使用的技术
为什么要有内存管理  :  确保程序定义的对象与数据结构有足够的存储空间（内存的分配、重新分配以及释放

### 4. 了解计算机文件系统的概念. 了解磁盘存储介质.
文件系统概念  :  文件系统是一种存储和组织计算机数据的方法，它使得对其访问和查找变得容易，文件系统使用文件和树形目录的抽象逻辑概念代替了硬盘和光盘等物理设备使用数据块的概念，用户使用文件系统来保存数据不必关心数据实际保存在硬盘（或者光盘）的地址为多少的数据块上，只需要记住这个文件的所属目录和文件名
磁盘存储介质  :  存储介质是指存储数据的载体。 比如软盘、光盘、DVD、硬盘、闪存、U盘、CF卡、SD卡、MMC卡、SM卡、记忆棒（Memory Stick）、xD卡等。 流行的存储介质是基于闪存（Nand flash）的，比如U盘、CF卡、SD卡、SDHC卡、MMC卡、SM卡、记忆棒、xD卡等。

### 5. 了解计算机IO管理主要的工作. 了解缓存及缓冲区的概念.
IO管理主要工作  :  
方便使用：方便用户使用外部设备，控制设备工作完成用户的输入输出要求。

提高效率：提高系统的并行工作能力，提高设备的使用效率。

方便控制：提高外围设备和系统的可靠性和安全性，以使系统能正常工作。

缓存 :  
在计算机系统中，CPU高速缓存（英語：CPU Cache，在本文中简称缓存）是用于减少处理器访问内存所需平均时间的部件。 在金字塔式存储体系中它位于自顶向下的第二层，仅次于CPU寄存器。 其容量远小于内存，但速度却可以接近处理器的频率。 当处理器发出内存访问请求时，会先查看缓存内是否有请求数据。

缓冲区 : 缓冲区(buffer)，它是内存空间的一部分。 也就是说，在内存空间中预留了一定的存储空间，这些存储空间用来缓冲输入或输出的数据，这部分预留的空间就叫做缓冲区，显然缓冲区是具有一定大小的。 缓冲区根据其对应的是输入设备还是输出设备，分为输入缓冲区和输出缓冲区。


++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
## java语言部分

了解Java语言的基本信息, 八一八发展历程等感兴趣的资料.

### 1. 学会配置Java开发环境(SDK + eclipse). 掌握Java SDK配置环境变量的意义.
JDK 1.8  
JAVA_HOME  
Path  

### 2. 会使用命令行编译运行Java程序.
编写 java 文件  
javac 对文件编译 
java  运行

### 3. 会使用eclipse编译运行java程序.
新建  运行  

### 4. 掌握java的基本数据类型, 掌握每种数据类型的表示的数据及范围.
Java基本类型共有八种，基本类型可以分为三类，字符类型char，布尔类型boolean以及数值类型byte、short、int、long、float、double。 数值类型又可以分为整数类型byte、short、int、long和浮点数类型float、double。
7  15  31  63  
32  64

### 5. 掌握Java的基本运算符的意义及用法. 如说出&和&& 的区别等.
算术运算符  
关系运算符  
位运算符  
逻辑运算符  
赋值运算符  
其他运算符  

& 位运算符  
&& 逻辑运算符

### 6. 掌握Java最基本的流程控制语句用法. 包括条件语句和循环语句. 
if   switch   
for  while

### 7. 掌握一维数组的创建及使用.
int[] a = new int

### 8. 理解类和对象的基本概念. 
类：具有相同特性（数据元素）和行为（功能）的对象的抽象就是类。   
因此，对象的抽象是类，类的具体化就是对象，也可以说类的实例是对象，类实际上就是一种数据类型。    
类具有属性，它是对象的状态的抽象，用数据结构来描述类的属性。 类具有操作，它是对象的行为的抽象，用操作名和实现该操作的方法来描述。


++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
## 数据结构部分

### 1. 线性表的概念.
有限的数据元素组成的有限序列


### 2. 掌握线性表的两种实现, 顺序实现及链式实现.
顺序实现  
```
#define maxSize 100
typedef struct {
    int data[maxSize];
    int length;
}Sqlist;
```
链式实现  
```
typedef struct DLNode 
{
    int data;
    struct LNode *next; 
}LNode;
```

### 3. 理解栈和队列的基本概念(深刻理解).
栈 : 栈（stack）又名堆栈，它是一种运算受限的线性表。 限定仅在表尾进行插入和删除操作的线性表。 这一端被称为栈顶，相对地，把另一端称为栈底。
队列 : 队列是一种特殊的线性表，特殊之处在于它只允许在表的前端（front）进行删除操作，而在表的后端（rear）进行插入操作，和栈一样，队列是一种操作受限制的线性表。 进行插入操作的端称为队尾，进行删除操作的端称为队头。

### 4. 理解栈和队列的顺序存储实现和链式存储实现.
顺序栈 
```
#define STACK_INIT_SIZE 10 /* 存储空间初始分配量 */
#define STACK_INCREMENT 2 /* 存储空间分配增量 */

typedef struct SqStack
{
	SElemType *base; /* 在栈构造之前和销毁之后，base的值为NULL */
	SElemType *top; /* 栈顶指针 */
	int stacksize; /* 当前已分配的存储空间，以元素为单位 */
}SqStack; /* 顺序栈 */
```
链栈
```
typedef SElemType ElemType; /* 栈结点类型和链表结点类型一致 */
#include"c2-2.h" /* 单链表存储结构 */
typedef LinkList LinkStack; /* LinkStack是指向栈结点的指针类型 */
#define InitStack InitList /* InitStack()与InitList()作用相同，下同 */
#define DestroyStack DestroyList
#define ClearStack ClearList
#define StackEmpty ListEmpty
#define StackLength ListLength
#include"bo2-8.c" /* 无头结点单链表的基本操作 */

Status GetTop(LinkStack S,SElemType *e)
{	/* 若栈不空，则用e返回S的栈顶元素，并返回OK；否则返回ERROR */
	return GetElem(S,1,e);
}

Status Push(LinkStack *S,SElemType e)
{	/* 插入元素e为新的栈顶元素 */
	return ListInsert(S,1,e);
}

Status Pop(LinkStack *S,SElemType *e)
{	/* 若栈不空，则删除S的栈顶元素，用e返回其值，并返回OK；否则返回ERROR */
	return ListDelete(S,1,e);
}

void StackTraverse(LinkStack S,void(*visit)(SElemType))
{	/* 从栈底到栈顶依次对栈中每个元素调用函数visit() */
	LinkStack temp,p=S; /* p指向栈顶元素 */
	InitStack(&temp); /* 初始化临时栈temp */
	while(p)
	{
		Push(&temp,p->data); /* 由S栈顶到栈底，依次将栈元素入栈到temp栈 */
		p=p->next;
	}
	ListTraverse(temp,visit); /* 遍历temp线性表 */
}
```
顺序队列  
```
typedef struct 
{
    int data[maxSize];
    int front;
    int rear;
    
}SqQueue;
```
链队
```
typedef struct QNode 
{
    int data;
    struct QNode *next; 
}QNode;
```
### 5. 理解数组和矩阵的概念.
数组 : 数组是在程序设计中，为了处理方便， 把具有相同类型的若干元素按有序的形式组织起来的一种形式。 这些有序排列的同类数据元素的集合称为数组。 数组是用于储存多个相同类型数据的集合。

矩阵 : 在数学中，矩阵（Matrix）是一个按照长方阵列排列的复数或实数集合

### 6. 掌握常见的内部排序方法(插入排序, 冒泡排序, 选择排序, 快速排序, 堆排序, 希尔排序, 归并排序, 基数排序等).
插入排序 :
```
public static void insertionSort(int[] arr){
    for (int i=1; i<arr.length; ++i){
        int value = arr[i];
        int position=i;
        while (position>0 && arr[position-1]>value){
            arr[position] = arr[position-1];
            position--;
        }
        arr[position] = value;
    }//loop i
}
```
冒泡排序 : 
```public static void bubbleSort(int[] arr) {
    int temp = 0;
    for (int i = arr.length - 1; i > 0; i--) { // 每次需要排序的长度
        for (int j = 0; j < i; j++) { // 从第一个元素到第i个元素
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }//loop j
    }//loop i
}// method bubbleSort
```
选择排序 : 
```
public static void selectionSort(int[] arr) {
    int temp, min = 0;
    for (int i = 0; i < arr.length - 1; i++) {
        min = i;
        // 循环查找最小值
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
        if (min != i) {
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
```  
快速排序 : 
```
public static void quickSort(int[] arr){
    qsort(arr, 0, arr.length-1);
}
private static void qsort(int[] arr, int low, int high){
    if (low >= high)
        return;
    int pivot = partition(arr, low, high);        //将数组分为两部分
    qsort(arr, low, pivot-1);                   //递归排序左子数组
    qsort(arr, pivot+1, high);                  //递归排序右子数组
}
private static int partition(int[] arr, int low, int high){
    int pivot = arr[low];     //基准
    while (low < high){
        while (low < high && arr[high] >= pivot) --high;
        arr[low]=arr[high];             //交换比基准大的记录到左端
        while (low < high && arr[low] <= pivot) ++low;
        arr[high] = arr[low];           //交换比基准小的记录到右端
    }
    //扫描完成，基准到位
    arr[low] = pivot;
    //返回的是基准的位置
    return low;
}
```

堆排序 : 
```
public class ArrayHeap {
    private int[] arr;
    public ArrayHeap(int[] arr) {
        this.arr = arr;
    }
    private int getParentIndex(int child) {
        return (child - 1) / 2;
    }
    private int getLeftChildIndex(int parent) {
        return 2 * parent + 1;
    }
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * 调整堆。
     */
    private void adjustHeap(int i, int len) {
        int left, right, j;
        left = getLeftChildIndex(i);
        while (left <= len) {
            right = left + 1;
            j = left;
            if (j < len && arr[left] < arr[right]) {
                j++;
            }
            if (arr[i] < arr[j]) {
                swap(array, i, j);
                i = j;
                left = getLeftChildIndex(i);
            } else {
                break; // 停止筛选
            }
        }
    }
    /**
     * 堆排序。
     * */
    public void sort() {
        int last = arr.length - 1;
        // 初始化最大堆
        for (int i = getParentIndex(last); i >= 0; --i) {
            adjustHeap(i, last);
        }
        // 堆调整
        while (last >= 0) {
            swap(0, last--);
            adjustHeap(0, last);
        }
    }

}
```

希尔排序  : 
```
public static void shellSort(int[] arr){
    int temp;
    for (int delta = arr.length/2; delta>=1; delta/=2){                              //对每个增量进行一次排序
        for (int i=delta; i<arr.length; i++){              
            for (int j=i; j>=delta && arr[j]<arr[j-delta]; j-=delta){ //注意每个地方增量和差值都是delta
                temp = arr[j-delta];
                arr[j-delta] = arr[j];
                arr[j] = temp;
            }
        }//loop i
    }//loop delta
}
```

归并排序 :  
```
public static void mergeSort(int[] arr){
    int[] temp =new int[arr.length];
    internalMergeSort(arr, temp, 0, arr.length-1);
}
private static void internalMergeSort(int[] arr, int[] temp, int left, int right){
    //当left==right的时，已经不需要再划分了
    if (left<right){
        int middle = (left+right)/2;
        internalMergeSort(arr, temp, left, middle);          //左子数组
        internalMergeSort(arr, temp, middle+1, right);       //右子数组
        mergeSortedArray(arr, temp, left, middle, right);    //合并两个子数组
    }
}
// 合并两个有序子序列
private static void mergeSortedArray(int arr[], int temp[], int left, int middle, int right){
    int i=left;      
    int j=middle+1;
    int k=0;
    while (i<=middle && j<=right){
        temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
    }
    while (i <=middle){
        temp[k++] = arr[i++];
    }
    while ( j<=right){
        temp[k++] = arr[j++];
    }
    //把数据复制回原数组
    for (i=0; i<k; ++i){
        arr[left+i] = temp[i];
    }
}
```

基数排序 : 
```
public static void countSort(int[] a, int max, int min) {
     int[] b = new int[a.length];//存储数组
     int[] count = new int[max - min + 1];//计数数组

     for (int num = min; num <= max; num++) {
        //初始化各元素值为0，数组下标从0开始因此减min
        count[num - min] = 0;
     }

     for (int i = 0; i < a.length; i++) {
        int num = a[i];
        count[num - min]++;//每出现一个值，计数数组对应元素的值+1
     }

     for (int num = min + 1; num <= max; num++) {
        //加总数组元素的值为计数数组对应元素及左边所有元素的值的总和
        count[num - min] += sum[num - min - 1]
     }

     for (int i = 0; i < a.length; i++) {
          int num = a[i];//源数组第i位的值
          int index = count[num - min] - 1;//加总数组中对应元素的下标
          b[index] = num;//将该值存入存储数组对应下标中
          count[num - min]--;//加总数组中，该值的总和减少1。
     }

     //将存储数组的值一一替换给源数组
     for(int i=0;i<a.length;i++){
         a[i] = b[i];
     }
}
```


### 7. 了解算法时间复杂度的概念. 了解每种排序算法的时间复杂度.
![排序算法时间复杂度](https://github.com/loevc/java/blob/master/img/time_complicate.png)  

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
