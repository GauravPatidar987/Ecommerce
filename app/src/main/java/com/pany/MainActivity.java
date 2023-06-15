package com.pany;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import androidx.appcompat.app.*;

public class MainActivity extends AppCompatActivity
{
	RecyclerView rec;
	List<Product> list;
	GridLayoutManager glm;
	ProductAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		rec=findViewById(R.id.recycler_view);
		glm=new GridLayoutManager(this,2);
		rec.setLayoutManager(glm);
		getProducts();
    }
	public void getProducts(){
		GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<Product>> call = service.getAllProducts();
        call.enqueue(new Callback<List<Product>>() {

				@Override
				public void onResponse(Call<List<Product>> p1, Response<List<Product>> p2)
				{
					list=p2.body();
					adapter=new ProductAdapter(MainActivity.this,list);
					rec.setAdapter(adapter);
				}

				@Override
				public void onFailure(Call<List<Product>> p1, Throwable p2)
				{
					Toast.makeText(getBaseContext(),p2.getMessage(),Toast.LENGTH_LONG).show();
				}
				
				
			});
	}
}
