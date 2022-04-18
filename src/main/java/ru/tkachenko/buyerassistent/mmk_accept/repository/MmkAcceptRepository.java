package ru.tkachenko.buyerassistent.mmk_accept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tkachenko.buyerassistent.mmk_accept.entity.MmkAcceptRowEntity;

import java.util.List;

@Repository
public interface MmkAcceptRepository extends JpaRepository<MmkAcceptRowEntity, Long> {

    MmkAcceptRowEntity findFirstBySpecAndPosition(String spec, int position);
    List<MmkAcceptRowEntity> findBySpecAndPosition(String spec, int position);//TODO maybe don't need
}
