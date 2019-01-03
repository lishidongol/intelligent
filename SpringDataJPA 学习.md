# Spring Boot JPA 注解学习

#### 注解 `@ManyToOne` 的 `CascadeType` 类型说明
     > CascadeType.REMOVE
         Cascade remove operation，级联删除操作。删除当前实体时，与它有映射关系的实体也会跟着被删除。
     > CascadeType.MERGE
         Cascade merge operation，级联更新（合并）操作。当Student中的数据改变，会相应地更新Course中的数据。
     > CascadeType.DETACH
         Cascade detach operation，级联脱管/游离操作。如果你要删除一个实体，但是它有外键无法删除，你就需要这个级联权限了。它会撤销所有相关的外键关联。
     > CascadeType.REFRESH
         Cascade refresh operation，级联刷新操作。假设场景 有一个订单,订单里面关联了许多商品,这个订单可以被很多人操作,那么这个时候A对此订单和关联的商品进行了修改,与此同时,B也进行了相同的操作,但是B先一步比A保存了数据,那么当A保存数据的时候,就需要先刷新订单信息及关联的商品信息后,再将订单及商品保存。
     > CascadeType.ALL
         Cascade all operations，清晰明确，拥有以上所有级联操作权限。
#### 注解 `@Column` 属性说明
    name 属性定义了被标注字段在数据库表中所对应字段的名称；
    unique 属性表示该字段是否为唯一标识，默认为false。如果表中有一个字段需要唯一标识，则既可以使用该标记，也可以使用@Table标记中的@UniqueConstraint。
    nullable 属性表示该字段是否可以为null值，默认为true。
    insertable 属性表示在使用“INSERT”脚本插入数据时，是否需要插入该字段的值。
    updatable 属性表示在使用“UPDATE”脚本插入数据时，是否需要更新该字段的值。insertable和updatable属性一般多用于只读的属性，例如主键和外键等。这些字段的值通常是自动生成的。
    columnDefinition 属性表示创建表时，该字段创建的SQL语句，一般用于通过Entity生成表定义时使用。（也就是说，如果DB中表已经建好，该属性没有必要使用。）
    table 属性定义了包含当前字段的表名。
    length 属性表示字段的长度，当字段的类型为varchar时，该属性才有效，默认为255个字符。
    precision 属性和 scale 属性表示精度，当字段类型为double时，precision表示数值的总长度，scale表示小数点所占的位数。