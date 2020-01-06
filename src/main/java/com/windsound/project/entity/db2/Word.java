package com.windsound.project.entity.db2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 词条表 w_word
 * 
 * @author admin
 * @date 2019-12-30
 */
@Data
@Getter
@Setter
public class Word
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 词条内容 */
	private String wordContent;
	/**  */
	private Date creatTime;
	/** 删除标志 */
	private Integer isDelete;

}
