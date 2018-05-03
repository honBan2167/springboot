package com.springboot.api.entity;

import java.io.Serializable;
import lombok.Data;

@SuppressWarnings("serial")
@Data
public class UserTest implements Serializable {
	
    private int id;
    
    private String userName;
    
    private String userNum;

}