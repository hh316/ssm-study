package com.hh.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName teacher
 */
@Data
public class Teacher implements Serializable {
    private Long tId;

    private String tName;

    private Integer tAge;

    private String tGender;

    private static final long serialVersionUID = 1L;
}