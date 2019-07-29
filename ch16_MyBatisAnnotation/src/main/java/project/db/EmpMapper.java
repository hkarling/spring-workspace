package project.db;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import project.dto.EmpDTO;

public interface EmpMapper {

    /* 전체검색 */
    @Select("select empno, ename, job, sal from emp")
    @Results(value = { @Result(column = "ename", property = "name"), @Result(column = "job", property = "job") })
    List<EmpDTO> selectAll();

    /* 등록 */
    @Insert("insert into emp(empno, ename, job, sal, hiredate) values(#{empNo},#{name},#{job},#{sal},sysdate)")
    int insert(EmpDTO dto);

    /* 삭제 */
    @Delete("delete from emp where empno=#{_parameter}")
    int delete(int empno);

    /* 수정 */
    @Update("update emp set ename=#{name}, job=#{job}, sal=#{sal} where empno=#{empNo}")
    int update(EmpDTO dto);

    /* 수정 2 */
    @Update("update emp set ename=#{dto.name}, job=#{dto.job}, sal=#{dto.sal} where upper(job)=upper(#{job})")
    int update2(Map<String, Object> map);

    /**
     * 동적 쿼리를 작성할 때는 전체 쿼리를 <script>동적쿼리</script>로 묶어야한다.
     */
    @Select("<script>select empno, ename as name, job, sal from emp "
	    + "<trim prefix=\"where\" prefixOverrides=\"and\">\n"
	    + "<if test=\"name!=null\">  ename=#{name} </if>\n"
	    + "<if test=\"job!=null\"> and job=#{job}</if>\n"
	    + "</trim></script>")
    List<EmpDTO> ifTest(EmpDTO empDTO);
}
