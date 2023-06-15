package com.pany;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductVH>
{
	Context context;
	List<Product> list;

	public ProductAdapter(Context context, List<Product> list)
	{
		this.context = context;
		this.list = list;
	}

	public ProductAdapter(List<Product> list)
	{
		this.list = list;
	}

	@Override
	public ProductAdapter.ProductVH onCreateViewHolder(ViewGroup p1, int p2)
	{
		View v=LayoutInflater.from(p1.getContext()).inflate(R.layout.layout_product_item,p1,false);	
		return new ProductVH(v);
	}

	@Override
	public void onBindViewHolder(ProductAdapter.ProductVH p1, int p2)
	{
		p1.txName.setText(list.get(p2).getProductName());
		p1.txPrice.setText(Double.toString(list.get(p2).getProductPrice()));
		Glide.with(context).load(list.get(p2).getProductImage()).into(p1.img);
	}

	@Override
	public int getItemCount()
	{
		return list.size();
	}
	
	class ProductVH extends RecyclerView.ViewHolder{
		ImageView img;
		TextView txName;
		TextView txPrice;
		public ProductVH(View v){
			super(v);
			img=v.findViewById(R.id.productImageView);
			txName=v.findViewById(R.id.product_NameTextView);
			txPrice=v.findViewById(R.id.product_PriceTextView);
		}
	}
}
