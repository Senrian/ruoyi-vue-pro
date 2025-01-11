package cn.iocoder.yudao.module.system.controller.admin.student.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import cn.iocoder.yudao.module.system.dal.dataobject.studentcourse.StudentCourseDO;
import cn.iocoder.yudao.module.system.dal.dataobject.studentgrade.StudentGradeDO;

@Schema(description = "管理后台 - 学生新增/修改 Request VO")
@Data
public class StudentSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27845")
    private Long id;

    @Schema(description = "名字", requiredMode = Schema.RequiredMode.REQUIRED, example = "赵六")
    @NotEmpty(message = "名字不能为空")
    private String name;

    @Schema(description = "出生日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "出生日期不能为空")
    private LocalDateTime birthday;

    @Schema(description = "简介", requiredMode = Schema.RequiredMode.REQUIRED, example = "你说的对")
    @NotEmpty(message = "简介不能为空")
    private String description;

    @Schema(description = "学生课程列表")
    private List<StudentCourseDO> studentCourses;

    @Schema(description = "学生班级")
    private StudentGradeDO studentGrade;

}