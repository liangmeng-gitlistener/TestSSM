# 数据访问层（接口）
与数据打交道，可以是数据库操作，也可以是文件读写操作，甚至是redis缓存操作，总之与数据操作有关的都放在这里，也有人叫做dal或者数据持久层都差不多意思。为什么没有daoImpl，因为我们用的是mybatis，所以可以直接在配置文件中实现接口的每个方法。
