package com.namankhurpia.tictactoeData.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.namankhurpia.tictactoeData.model.Dataset;

@Repository
public interface repository extends CrudRepository <Dataset, Integer> {

}
