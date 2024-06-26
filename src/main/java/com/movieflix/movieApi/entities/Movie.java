//package com.movieflix.movieApi.entities;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotBlank;
//import lombok.*;
//
//import java.util.Set;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//
//public class Movie {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer movieId;
//
//    @Column(nullable = false, length = 200)
//    @NotBlank(message = "Please provide movies title ! ")
//    private String title;
//
//
//    @Column(nullable = false)
//    @NotBlank(message = "Please provide movies director ! ")
//    private String director;
//
//
//    @Column(nullable = false)
//    @NotBlank(message = "Please provide movies studio ! ")
//    private String studio;
//
//    @ElementCollection
//    @CollectionTable(name = "movie_cast")
//    private Set<String> movieCast;
//
//
//
//    @Column(nullable = false)
//    @NotBlank(message = "Please provide movies release year ! ")
//    @Min(value = 1900, message = "Release year should not be less than 1900")
//    @Max(value = 2024, message = "Release year should not be greater than 2024")
//    private Integer releaseYear;
//
//
//    @Column(nullable = false)
//    @NotBlank(message = "Please provide movies poster ! ")
//    private String poster;
//
//}



package com.movieflix.movieApi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide movies title ! ")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movies director ! ")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movies studio ! ")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotNull(message = "Please provide movies release year ! ")
    @Min(value = 1900, message = "Release year should not be less than 1900")
    @Max(value = 2024, message = "Release year should not be greater than 2024")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movies poster ! ")
    private String poster;
}
