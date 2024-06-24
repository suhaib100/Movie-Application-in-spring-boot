//package com.movieflix.movieApi.dto;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.Set;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class MovieDto  {
//
//
//    private Integer movieId;
//
//    @NotBlank(message = "Please provide movies title ! ")
//    private String title;
//
//
//    @NotBlank(message = "Please provide movies director ! ")
//    private String director;
//
//
//    @NotBlank(message = "Please provide movies studio ! ")
//    private String studio;
//
//    private Set<String> movieCast;
//
//
//
//    @NotBlank(message = "Please provide movies release year ! ")
//
//    @Min(value = 1900, message = "Release year should not be less than 1900")
//    @Max(value = 2024, message = "Release year should not be greater than 2024")
//    private Integer releaseYear;
//
//
//    @NotBlank(message = "Please provide movies poster ! ")
//    private String poster;
//
//
//    @NotBlank(message = "Please provide poster url ! ")
//    private String posterUrl;
//
//}


package com.movieflix.movieApi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Integer movieId;

    @NotBlank(message = "Please provide movies title ! ")
    private String title;

    @NotBlank(message = "Please provide movies director ! ")
    private String director;

    @NotBlank(message = "Please provide movies studio ! ")
    private String studio;

    private Set<String> movieCast;

    @NotNull(message = "Please provide movies release year ! ")
    @Min(value = 1900, message = "Release year should not be less than 1900")
    @Max(value = 2024, message = "Release year should not be greater than 2024")
    private Integer releaseYear;

    @NotBlank(message = "Please provide movies poster ! ")
    private String poster;

    @NotBlank(message = "Please provide poster url ! ")
    private String posterUrl;
}
