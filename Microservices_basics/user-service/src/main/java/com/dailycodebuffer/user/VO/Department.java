

package com.dailycodebuffer.user.VO;// under the package of valueObject(VO)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// create the getter and setter
@AllArgsConstructor
@NoArgsConstructor           // we dont need entity we need only simple pojo
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}