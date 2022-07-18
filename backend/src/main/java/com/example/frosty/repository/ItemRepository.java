package com.example.frosty.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.frosty.model.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}

