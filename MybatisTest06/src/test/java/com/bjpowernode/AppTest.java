package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.MyStudent;
import com.bjpowernode.domain.Student;
import com.bjpowernode.utils.MyBatisUtils;
import com.bjpowernode.vo.QueryParam;
import com.bjpowernode.vo.ViewStudent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppTest {
    @Test
    public void selectStudentIf(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("韩梅梅");
        student.setAge(23);
        List<Student> studentList = dao.selectStudentIf(student);
        studentList.forEach(stu-> System.out.println(stu));
    }
    @Test
    public void selectStudentWhere(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("韩梅梅");
        student.setAge(23);
        List<Student> studentList = dao.selectStudentWhere(student);
        studentList.forEach(stu-> System.out.println(stu));
    }
    @Test
    public void testfor(){
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        //String sql = "select * from student where id in (1001,1002,1003)";
        String sql = "select * from student where id in ";
        StringBuilder builder = new StringBuilder(sql);
        builder.append("(");
       for(Integer i:list){
           builder.append(i).append(",");
       }
       builder.deleteCharAt(builder.length()-1);
       builder.append(")");
        System.out.println(builder);


    }
    @Test
    public void selectForeachOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        List<Student> students = dao.selectForeachOne(list);
        students.forEach(stu-> System.out.println(stu));
    }
    @Test
    public void selectForeachTwo(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1);
        Student student2 = new Student();
        student2.setId(2);
        List<Student> studentlist = new ArrayList<>();
        studentlist.add(student);
        studentlist.add(student2);
        List<Student> students = dao.selectForeachTwo(studentlist);
        students.forEach(stu-> System.out.println(stu));
    }
    @Test
    public void selectAll(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        //加入pageHelper的方法，分页
        //pageNum:第几页，从1开始
        //pageSize：一页中有多少行数据
        PageHelper.startPage(1,3);
        List<Student> students = dao.selectAll();
        students.forEach(stu-> System.out.println(stu));


    }
    @Test
    public void selectAllString(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        String strArr[] ={"1","2","10"};
        dao.selectAllString(strArr);

    }



}
