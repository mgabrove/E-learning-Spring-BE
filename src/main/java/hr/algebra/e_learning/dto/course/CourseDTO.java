package hr.algebra.e_learning.dto.course;

import hr.algebra.e_learning.dto.progress.ProgressDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    private Long id;
    private String title;
    private String description;
    private List<ProgressDTO> progressList;
}
