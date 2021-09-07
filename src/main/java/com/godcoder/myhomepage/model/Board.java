package com.godcoder.myhomepage.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "board")
@Data
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(min = 2, max = 30)
    private String title;
    private String content;

}
