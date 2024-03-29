package com.xian.domain;

/**
 * 数据库相关表
 * 
 * @author liguoxian
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("config_table")
public class ConfigTable extends TenantEntity {
        
/**
     * 主键
     */
    @TableId
    private Long id;
        
/**
     * 所属数据库
     */
    private String tableSchema;
        
/**
     * 表名
     */
    private String tableName;
        
/**
     * 表类型
     */
    private String tableType;
        
/**
     * 表描述
     */
    private String tableComment;
        
/**
     * 唯一键值
     */
    private String tableKey;
        
/**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableLogic
    private String delFlag;

}

