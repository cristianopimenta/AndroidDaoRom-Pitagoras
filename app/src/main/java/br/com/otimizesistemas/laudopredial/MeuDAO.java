package br.com.otimizesistemas.laudopredial;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MeuDAO {
  @Insert
  long InserirQuestao(Questoes questoes);

  @Query("select * from Questoes")
  List<Questoes> pesquisarTodasQuestoes();

  @Query("DELETE FROM Questoes")
    void apagarTabela();


}
