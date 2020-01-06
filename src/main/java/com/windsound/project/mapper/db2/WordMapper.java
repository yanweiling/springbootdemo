package com.windsound.project.mapper.db2;

import com.windsound.project.entity.db2.Word;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 词条 数据层
 *
 * @author admin
 * @date 2019-12-30
 */
@Repository
public interface WordMapper
{
	/**
     * 查询词条信息
     *
     * @param id 词条ID
     * @return 词条信息
     */
	public Word selectWordById(Long id);

	/**
     * 查询词条列表
     *
     * @param word 词条信息
     * @return 词条集合
     */
	public List<Word> selectWordList(Word word);

	/**
     * 新增词条
     *
     * @param word 词条信息
     * @return 结果
     */
	public int insertWord(Word word);

	/**
     * 修改词条
     *
     * @param word 词条信息
     * @return 结果
     */
	public int updateWord(Word word);

	/**
     * 删除词条
     *
     * @param id 词条ID
     * @return 结果
     */
	public int deleteWordById(Long id);

	/**
     * 批量删除词条
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteWordByIds(String[] ids);

}