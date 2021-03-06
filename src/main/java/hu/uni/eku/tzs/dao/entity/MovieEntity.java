package hu.uni.eku.tzs.dao.entity;

import hu.uni.eku.tzs.enums.IsEnglish;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "movies")
public class MovieEntity {

    @Id
    @Column(name = "movieid")
    private int movieId;

    @Column(name = "year")
    private int year;

    @Enumerated(EnumType.STRING)
    @Column(name = "isEnglish")
    private IsEnglish isEnglish;

    @Column(name = "country")
    private String country;

    @Column(name = "runningtime")
    private int runningTime;


}
