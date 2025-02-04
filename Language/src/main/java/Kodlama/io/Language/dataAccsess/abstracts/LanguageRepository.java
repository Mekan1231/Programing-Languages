package Kodlama.io.Language.dataAccsess.abstracts;

import Kodlama.io.Language.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
  List<Language> getAll();
  void add(int id, String name);

  Language getById(int id);


  void delete(int id);

  void update(int id, String name);
}
