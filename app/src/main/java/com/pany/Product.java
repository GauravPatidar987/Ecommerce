package com.pany;

import com.google.gson.annotations.SerializedName;


public class Product
{
	@SerializedName("title")
	String productName;
	@SerializedName("price")
	double productPrice;
	@SerializedName("image")
	String productImage;
	@SerializedName("description")
	String productDesc;
	@SerializedName("category")
	String productCategory;
	@SerializedName("rating")
	Rating productRating;
	@SerializedName("id")
	int productId;

	public void setProductCategory(String productCategory)
	{
		this.productCategory = productCategory;
	}

	public String getProductCategory()
	{
		return productCategory;
	}

	public void setProductRating(Rating productRating)
	{
		this.productRating = productRating;
	}

	public Rating getProductRating()
	{
		return productRating;
	}


	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductPrice(double productPrice)
	{
		this.productPrice = productPrice;
	}

	public double getProductPrice()
	{
		return productPrice;
	}

	public void setProductImage(String productImage)
	{
		this.productImage = productImage;
	}

	public String getProductImage()
	{
		return productImage;
	}

	public void setProductDesc(String productDesc)
	{
		this.productDesc = productDesc;
	}

	public String getProductDesc()
	{
		return productDesc;
	}

	

	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public int getProductId()
	{
		return productId;
	}}
