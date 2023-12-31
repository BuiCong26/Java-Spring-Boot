package com.globits.da.dto;

import com.globits.da.domain.District;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProvinceDTO {
    private Integer id;
    private String name;
    private String code;
    private String type;
    private List<DistrictDTO> districts;
}
