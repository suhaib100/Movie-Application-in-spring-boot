package com.movieflix.movieApi.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.movieflix.movieApi.dto.MovieDto;
import com.movieflix.movieApi.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


     @PostMapping("/addMovie")
    public ResponseEntity<MovieDto>  addMovieHandler(@RequestPart MultipartFile file,
                                                     @RequestPart String movieDto) throws IOException {

        MovieDto dto = convertToMovieDto(movieDto);
        return new ResponseEntity<>(movieService.addMovie(dto,file), HttpStatus.CREATED);



     }


    @GetMapping("/{movieId}")
    public ResponseEntity<MovieDto>  getMovieHandler(@PathVariable Integer movieId) {

        return  ResponseEntity.ok(movieService.getMovie(movieId));

    }


    @GetMapping("/all")
    public ResponseEntity<List<MovieDto>>  getAllMovieHandler() {

        return  ResponseEntity.ok(movieService.getAllMovies());

    }


     private MovieDto convertToMovieDto(String movieDtoObj) throws JsonProcessingException{
         ObjectMapper objectMapper = new ObjectMapper();
         return objectMapper.readValue(movieDtoObj,MovieDto.class);
     }
}
