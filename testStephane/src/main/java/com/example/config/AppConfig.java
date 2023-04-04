package com.example.config;

import com.example.dao.DonateurDao;
import com.example.dao.impl.DonateurDaoImpl;
import com.example.dao.impl.DonateurRepository;
import com.example.dao.impl.DonateurRepositoryImpl;
import com.example.teststephane.Donateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
@ComponentScan(basePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example.dao.impl")
public class AppConfig {

    @Autowired
    private DonateurRepository donateurRepository;

    @Bean
    @Primary
    public DonateurDao donateurRepositoryImpl() {
        return new DonateurRepositoryImpl() {
            @Override
            public List<Donateur> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Donateur> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Donateur> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Donateur> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Donateur> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public List<Donateur> findAll() {
                return null;
            }

            @Override
            public List<Donateur> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Donateur entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Donateur> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Donateur> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Donateur> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Donateur> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Donateur getOne(Long aLong) {
                return null;
            }

            @Override
            public Donateur getById(Long aLong) {
                return null;
            }

            @Override
            public Donateur getReferenceById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Donateur> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Donateur> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Donateur> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Donateur> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Donateur> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Donateur> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Donateur, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }

}
