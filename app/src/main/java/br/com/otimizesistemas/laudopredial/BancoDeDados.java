package br.com.otimizesistemas.laudopredial;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.vo.Database;

@Database(entities = {Questoes.class}, version = 1)
public abstract class BancoDeDados extends RoomDatabase {
    //recuperando objeto DAO
    public abstract MeuDAO meuDao();

    private static BancoDeDados INSTANCE;

    //Modelo Singletom

    public static BancoDeDados getBancoDeDados(final Context context) {
        if (INSTANCE == null) {
            synchronized (BancoDeDados.class) {
                if (INSTANCE == null) {
                    //cria db
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            BancoDeDados.class, "db_questoes").allowMainThreadQueries().build();

                }
            }
        }
        return INSTANCE;
    }
}
