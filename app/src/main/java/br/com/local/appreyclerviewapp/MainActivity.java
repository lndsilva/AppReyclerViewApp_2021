package br.com.local.appreyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Livros> lstLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstLivros = new ArrayList<>();

        lstLivros.add(new Livros("Ideias", "Auto ajuda", "Ideias para adiar o fim do mundo", R.drawable.ideias));
        lstLivros.add(new Livros("Mindset", "Auto Ajuda", "A nova psicologia do sucesso", R.drawable.mindset));
        lstLivros.add(new Livros("Orgulho", "História", "Orgulho e Preconceito - Jane Austen", R.drawable.orgulh_preconceito));
        lstLivros.add(new Livros("The Vegitarian ", "Categoria do livro", "Descrição do livro", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("The Vegitarian ", "Categoria do livro", "Descrição do livro", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("O sol é para todos", "Auto ajuda", "Um dos maiores clássicos da literatura mundial", R.drawable.osoleparatodos));


        RecyclerView mRecyclerView = findViewById(R.id.idRecyclerView);

        //Instanciando a classe adaptadora para colocar os objetos.
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstLivros);

        //Montando o layout para o modelo ser inserido
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //Carregando os objetos na RecyclerView
        mRecyclerView.setAdapter(mAdapter);
    }
}