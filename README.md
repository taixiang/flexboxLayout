>原文链接：https://mp.weixin.qq.com/s/Mi3cK7xujmEMI_rc51-r4g

`RelativeLayout`、`LinearLayout`等常用布局相信大家早已耳熟能详，今天给大家介绍一款新的布局方式「弹性布局」--FlexboxLayout。  
`Flex`是Flexible Box的缩写，意为「弹性布局」，在前端css样式中应用甚为广泛，之前做过`React-Native`和微信小程序，页面布局大多使用flex弹性布局，可以在不同屏幕尺寸上提供一致的布局结构，可以简便、完整、响应式地实现各种页面布局，今天为大家打开`Android`移动端的flex布局大门--`FlexboxLayout`，在android中我们经常所见的标签、流式布局等都可以用`FlexboxLayout`来实现。
### 安装
build 依赖
```
dependencies {
    implementation 'com.google.android:flexbox:1.0.0'
}
```
### FlexboxLayout 属性介绍
#### flexDirection  

`flex-direction` 属性决定主轴的方向（即内部子元素的排列方向）。  
- `row`（默认值）：水平显示，起点在左端
- `row_reverse`：水平显示，起点在右端，与`row`相反的顺序
- `column`：垂直显示，起点在顶部
- `column_reverse`：垂直显示，起点在底部，与`column`相反的顺序     

xml中使用`app:flexDirection="row"`，代码中使用`flexboxLayout.setFlexDirection(FlexDirection.ROW)`  
>这里为了演示布局紧凑，不让元素撑满整个布局，xml里设置了`app:alignItems="flex_start"`，`app:alignContent="flex_start"`，后续有对`alignItems`和`alignContent`的属性介绍，读者可以去除这两个属性看看演示效果。

![](https://user-gold-cdn.xitu.io/2018/6/10/163e88060bd320ef?w=480&h=785&f=gif&s=864139)          

#### flexWrap
`flexWrap` 决定是否换行  
- `nowrap`（默认值）：不换行
- `wrap`：按正常方向换行，第一行在上方
- `wrap_reverse`：按反方向换行，第一行在下方  

xml中使用`app:flexWrap="nowrap"`，代码中使用`flexboxLayout.setFlexWrap(FlexWrap.NOWRAP)`  
![](https://user-gold-cdn.xitu.io/2018/6/10/163e889fcdc19cfb?w=480&h=784&f=gif&s=930772)  

#### justifyContent
`justifyContent`决定元素在**主轴**上的对齐方式  
- `flex_start`（默认值）：主轴方向起点对齐
- `flex_end`：主轴方向终点对齐
- `center`： 主轴方向居中对齐
- `space_between`：主轴方向两端对齐，元素之间的间隔都相等。
- `space-around`：每个元素两侧的间隔相等。所以，元素之间的间隔比元素与布局边框的间隔大一倍。

xml中使用`app:justifyContent="flex_start"`，代码中使用`flexboxLayout.setJustifyContent(JustifyContent.FLEX_START)`  
**注意**这里是 ***主轴方向*** 上的对齐方式即`flexDirection`属性，例如主轴如果是`row`水平方向的，那么`center`属性就是水平居中，如果是`column`，那么就是垂直方向居中。  

![](https://user-gold-cdn.xitu.io/2018/6/10/163e89320dd75095?w=480&h=782&f=gif&s=1087525)  

#### alignItems
`alignItems`决定元素在交叉轴方向上的对齐方式，「**交叉轴**」 我理解的就是 与主轴交叉垂直的方向，比如主轴是水平的，那么交叉轴就是垂直方向的  
- `stretch`（默认值）：交叉轴方向占满整个父布局。
- `flex_start`交叉轴的起点对齐
- `flex_end`交叉轴的终点对齐。
- `center`交叉轴的居中对齐
- `baseline`元素第一行文字的基线对齐  

默认值是`stretch`，不管元素布局设置的宽高多少，都会在交叉轴方向占满父布局，例如`flexDirection`是默认`row`水平方向，那么元素就会在垂直方向撑满父布局。  
一般会选择使用`flex_start`属性，可以自由控制元素的大小。  
![](https://user-gold-cdn.xitu.io/2018/6/10/163e8a5f6bcef194?w=480&h=782&f=gif&s=1235770)  
#### alignContent
`alignContent`决定了多根轴线的对齐方式。如果项目只有一根轴线，该属性不起作用。  
- `stretch`（默认值）：轴线占满整个交叉轴。
- `flex_start` 交叉轴方向起点对齐
- `flex_end` 交叉轴方向终点对齐
- `center` 交叉轴方向居中对齐
- `space_between` 交叉轴方向两端对齐，元素之间的间隔都相等
- `space_around` 每个元素两侧的间隔相等。所以，元素之间的间隔比元素与布局边框的间隔大一倍  

`alignContent`是在多行的情况下起作用。  
`justifyContent`设置主轴方向的对齐方式，`alignContent`是设置交叉轴方向的对齐方式。例如元素是水平方向换行，`justifyContent`设置`center`属性就是水平居中，`alignContent`设置`center`属性就是垂直居中。  
![](https://user-gold-cdn.xitu.io/2018/6/10/163e8b41da8b79c2?w=480&h=782&f=gif&s=1705914)  
#### divider属性
描述了元素间的分割线  
- `showDividerHorizontal`四个属性`none | beginning | middle | end`，beginning显示线条在布局的上面，end显示线条在布局的下面
- `dividerDrawableHorizontal` 水平分隔线放在伸缩线之间
- `showDividerVertical` beginning显示线条在布局的左边，end显示线条在布局的右边
- `dividerDrawableVertical` 垂直分隔线放在伸缩线之间
- `showDivider` 配合dividerDrawableHorizontal就是showDividerHorizontal的效果，配合dividerDrawableVertical就是showDividerVertical的效果，配合dividerDrawable就是显示水平和垂直方向的线条
- `dividerDrawable` drawable属性，配合showDivider可以显示水平和垂直方向的线条
```
app:alignContent="flex_start"
app:alignItems="flex_start"
app:flexWrap="wrap"
app:dividerDrawable="@drawable/divider"
app:showDivider="beginning|end|middle"
```
![](https://user-gold-cdn.xitu.io/2018/6/10/163e89898e671a4c?w=1152&h=740&f=jpeg&s=103043)
### 子元素属性
除了给`FlexboxLayout`自身设置属性，还可以给到子元素设置属性
#### layout_order
`layout_order`可以改变元素排列顺序，默认值是1，按顺序排列的，值越大，排列越靠后  
文字1的`textView`的属性`app:layout_order="2"`，其余为默认1
![](https://user-gold-cdn.xitu.io/2018/6/10/163e89c5d514f4ee?w=1136&h=384&f=jpeg&s=23188)  

#### layout_flexGrow
`layout_flexGrow`决定元素的放大比例，默认不放大，值为0。如果一个元素的`layout_flexGrow` 属性为2，其他元素为1，则前者占据的剩余空间将比其他的多一倍。属性类似于`LinearLayout`的`weight`属性。  
三个view的`app:layout_flexGrow`值分别为1、1、2   
![](https://user-gold-cdn.xitu.io/2018/6/10/163e8a2138ec7b7d?w=1152&h=376&f=jpeg&s=30355)  

#### layout_flexShrink
`layout_flexShrink` 决定元素的缩小比例，默认为1，即当空间不足是，该元素被缩小。值越大，缩小比例越大，0的话则不缩小。空间足够的情况，属性无效。  
三个view的`app:layout_flexShrink`值分别为2、1、1   
![](https://user-gold-cdn.xitu.io/2018/6/10/163e8a4f1063f84d?w=1152&h=306&f=jpeg&s=28955)  
#### layout_alignSelf
`layout_alignSelf`允许单个子元素有与其他子元素不一样的对齐方式，默认值为`auto`，继承父元素的`alignItems` 属性，其余属性值同`alignItems`属性  
第一个view`app:layout_alignSelf="center"`垂直居中  
![](https://user-gold-cdn.xitu.io/2018/6/10/163e8a853a2c976d?w=1152&h=574&f=jpeg&s=26637)  
#### layout_flexBasisPercent
`layout_flexBasisPercent` 决定了在分配多余空间之前，子元素占据的主轴空间的百分比。默认为自身大小  
第一个view`app:layout_flexBasisPercent="50%"`水平占比50%  
![](https://user-gold-cdn.xitu.io/2018/6/10/163e8aad2b39c5fe?w=1152&h=364&f=jpeg&s=26144)  

#### 与recyclerView搭配
FlexboxLayout的应用可谓广泛，主流的tag标签 流式布局就可以使用`FlexboxLayout`动态添加view去实现，例外还可以使用`RecyclerView`的布局管理器`FlexboxLayoutManager`来完成流式布局。
```
FlexboxLayoutManager manager = new FlexboxLayoutManager(this);
manager.setFlexDirection(FlexDirection.ROW);
manager.setFlexWrap(FlexWrap.WRAP);
recyclerView.setLayoutManager(manager);
```
同样图片的流式布局原理相通，这里就不一一列举。  
![](https://user-gold-cdn.xitu.io/2018/6/10/163e8ad1dcd08b28?w=1144&h=284&f=jpeg&s=104573)  

最后附上github地址：[https://github.com/taixiang/flexboxLayout](https://github.com/taixiang/flexboxLayout)  

欢迎关注我的博客：[https://blog.manjiexiang.cn/](http://blog.manjiexiang.cn/)  
欢迎关注微信号：春风十里不如认识你  
![image.png](https://upload-images.jianshu.io/upload_images/7569533-cfeb1f55473a2143.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
