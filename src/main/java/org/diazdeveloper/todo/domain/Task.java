package org.diazdeveloper.todo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Task {

  @Id
  @GeneratedValue(generator = "UUID")
  @UuidGenerator
  @JdbcTypeCode(SqlTypes.CHAR)
  @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
  private UUID id;

  @Version
  private Long version;

  @NotNull
  @NotBlank
  @Size(max = 50)
  @Column(length = 50, nullable = false)
  private String name;

  @Null
  @Size(max = 200)
  @Column(length = 200, nullable = true)
  private String description;

  @NotNull
  @NotNull
  @JdbcTypeCode(value = SqlTypes.SMALLINT)
  private TaskStatus status;

  @NotNull
  @NotBlank
  @Size(max = 25)
  @Column(length = 25, nullable = false)
  private String assignee;

  @NotNull
  @Min(1)
  @Max(10)
  private Integer priority;//scale from 1 to 10

  @Null
  private LocalDateTime dueDate;

  @CreationTimestamp
  @Column(updatable = false)
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;
}
