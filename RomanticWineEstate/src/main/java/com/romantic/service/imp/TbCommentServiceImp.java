package com.romantic.service.imp;

import com.romantic.dao.TbCommentDao;
import com.romantic.pojo.TbComment;
import com.romantic.service.TbCommentService;
import com.romantic.utils.GetNBitRandomNumber;
import com.romantic.utils.QiNiuYunFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/8
 * Time:19:48
 * ------------------------
 * 评论模块的实现类
 */
@Service
public class TbCommentServiceImp implements TbCommentService {

    @Autowired
    private TbCommentDao tbCommentDao;

    /**
     * 给一个商品添加一条评论
     * @param tbComment
     * @return 是否操作成功
     */
    @Override
    public Integer addGoodsComment(TbComment tbComment, List<File> fileList) {
        Integer ifsuccess=null;
        if (null!= tbComment) {
            //生成评论id：用户id+5位随机数
            tbComment.setCommentId(tbComment.getUserId()+GetNBitRandomNumber.generateRandomNumber(5));
            tbComment.setIsCommentReply("0");
            tbComment.setParentCommentId(null);
            //设置用户姓名（留空待补全）
            tbComment.setUserName("Tom");
            tbComment.setPicAddress("待补全");
            tbComment.setLikeNumber(0);
            tbComment.setPrefixMatch(null);
            tbComment.setCreateTime(new Date());
            tbComment.setIsAlive("1");



            for (File file : fileList) {
                String fileName =file.getName();
                String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
                System.out.println(suffix);

                File newFileName = new File("03163123"+GetNBitRandomNumber.generateRandomNumber(4)+"."+suffix);
                file.renameTo(newFileName);

                QiNiuYunFileUtils.fileUpload(file);



            }


            ifsuccess = tbCommentDao.insertGoodsComment(tbComment);

        } else {
            System.out.println("Error::给一个商品添加一条评论::Controller层传入Service层的数据为空");
        }

        return ifsuccess;
    }

    /**
     * 给一个商品评论增加回复
     * @param tbComment
     * @return 是否操作成功
     */
    @Override
    public Integer addCommentReply(TbComment tbComment) {
        Integer ifsuccess=null;
        if (null!= tbComment) {
            //生成评论id：用户id+5位随机数
            tbComment.setCommentId(tbComment.getUserId()+GetNBitRandomNumber.generateRandomNumber(5));

            //IsCommentReply和ParentCommentId等前端交互
            tbComment.setIsCommentReply("1");
            //comment.setParentCommentId("");
            //设置用户姓名（留空待补全）
            tbComment.setUserName("王五");
            tbComment.setPicAddress("待补全");
            tbComment.setLikeNumber(0);
            tbComment.setPrefixMatch(null);
            tbComment.setCreateTime(new Date());
            tbComment.setIsAlive("1");

            ifsuccess = tbCommentDao.insertCommentReply(tbComment);
        } else {
            System.out.println("Error::给一个商品评论增加回复::Controller层传入Service层的数据为空");
        }
        return ifsuccess;
    }

    /**
     * 用户删除自己的商品评论
     * @param tbComment
     * @return 是否操作成功
     */
    @Override
    public Integer deleteGoodsComment(TbComment tbComment) {
        Integer ifsuccess=null;
        if (null!= tbComment) {
            ifsuccess = tbCommentDao.deleteGoodsComment(tbComment);
        } else {
            System.out.println("Error::用户删除自己的商品评论::Controller层传入Service层的数据为空");
        }

        return ifsuccess;
    }

    /**
     * 用户删除自己商品评论下面的一条回复
     * @param tbComment
     * @return 是否操作成功
     */
    @Override
    public Integer deleteCommentReply(TbComment tbComment) {

        Integer ifsuccess=null;
        if (null!= tbComment) {
            ifsuccess = tbCommentDao.deleteCommentReply(tbComment);
        } else {
            System.out.println("Error::用户删除自己商品评论下面的一条回复::Controller层传入Service层的数据为空");
        }

        return ifsuccess;
    }

    /**
     * 查询一个商品下面的所有评论（不包括评论的回复）
     * @param goodsId 商品id
     * @return 返回一个商品下的所有评论
     */
    @Override
    public List<TbComment> queryGoodsAllComments(String goodsId) {

        List<TbComment> list = new ArrayList<>();
        if (null!=goodsId) {
            list = tbCommentDao.selectGoodsAllComments(goodsId);

            //对一个商品下面的所有评论进行排序，创建一个日期比较器
            Comparator<TbComment> commentComparator = new Comparator<TbComment>() {
                @Override
                public int compare(TbComment o1, TbComment o2) {
                    int a = o1.getCreateTime().compareTo(o2.getCreateTime());
                    //按评论创建时间排序
                    if (a>0) {
                        return -1;
                    } else if (a<0) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            };

            Collections.sort(list, commentComparator);


        } else {
            System.out.println("Error::查询一个商品下面的所有评论（不包括评论的回复）::Controller层传入Service层的数据为空");
        }

        return list;
    }

    /**
     * 查询一个商品评论下面的所有回复
     * @param tbComment
     * @return 返回一个评论下的所有回复
     */
    @Override
    public List<TbComment> queryCommentAllReply(TbComment tbComment) {

        List<TbComment> list = new ArrayList<>();
        if (null!= tbComment) {
            list = tbCommentDao.selectCommentAllReply(tbComment);
        } else {
            System.out.println("Error::查询一个商品评论下面的所有回复::Controller层传入Service层的数据为空");
        }

        return list;
    }

    /**
     * 用户给一个商品下面的一条商品评论点赞
     * @param commentId 评论id
     * @param goodsId 商品id
     * @return 是否点赞成功
     */
    @Override
    public Integer addLikeNum(String commentId, String goodsId) {

        Integer ifsuccess = tbCommentDao.addCommentLikeNum(commentId,goodsId);
        return ifsuccess;
    }
}
