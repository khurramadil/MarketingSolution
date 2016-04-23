package androidapp.fyp.com.marketingsolution;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<brands> brands;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        brands= new ArrayList<>();
        brands.add(new brands("Testing", "Testing", R.drawable.puma));
        brands.add(new brands("Testing", "Testing", R.drawable.puma));
        brands.add(new brands("Testing", "Testing", R.drawable.puma));
        brands.add(new brands("Testing", "Testing", R.drawable.puma));
        brands.add(new brands("Testing", "Testing", R.drawable.puma));
        brands.add(new brands("Testing", "Testing", R.drawable.puma));

    }

    private void initializeAdapter(){
        adapter adapter = new adapter(brands);
        rv.setAdapter(adapter);
    }
}
