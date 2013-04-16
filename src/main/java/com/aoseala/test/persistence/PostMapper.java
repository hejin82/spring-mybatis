package com.aoseala.test.persistence;

import com.aoseala.test.domain.Post;
import com.aoseala.test.domain.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int countByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int deleteByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int insertSelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    List<Post> selectByExampleWithBLOBs(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    List<Post> selectByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    Post selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int updateByExampleWithBLOBs(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int updateByPrimaryKeyWithBLOBs(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Tue Apr 16 11:09:59 CST 2013
     */
    int updateByPrimaryKey(Post record);
}