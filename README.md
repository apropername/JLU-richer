吉林大学《设计模式》陈伟老师班练习项目Java版本

目前进度对应文档03结构型模式+策略模式#11桥接模式
# 注意事项
* 尽量保持了类名、接口、变量名一致。
* 除了第一个单例的练习，后面原本用模板实现的单例 如果不需要被继承的话（比如Mgr） 都用enum实现
* 语言枚举的机制不同，导致某些用枚举值索引的数组或向量改用了映射
* 可能还残存一些todo是我在学习语言机制留下的疑问。
* 在“bugFix……”提交前 画的地图都画错了，如果你真的看了前面的提交，手动把createMap方法里b.setXY参数改为row.get(7), row.get(8)再运行
* 改动了一些修饰符比如protected -> private  、加final ,都是个人的理解
