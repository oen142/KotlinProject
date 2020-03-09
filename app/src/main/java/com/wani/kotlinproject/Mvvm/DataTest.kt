package com.wani.kotlinproject.Mvvm

class DataTest {
    data class BrandResult (
        val result: List<BrandResults>

    )
    data class BrandResults(
        val brands_list: List<BrandArray>,
        val goods_lsist : List<GoodsArray>
    )
    data class BrandArray(
        val brandName : String,
        val category1Name : String,
        val brandIConImg : String,
        val brandCode : String

        )
    data class GoodsArray(
        val goodsCode : String,
        val goodsName : String,
        val brandName : String,
        val brandCode : String,
        val goodsImgS : String,
        val goodsImgB : String,
        val brandIconImg : String,
        val realPrice : String,
        val content : String
    )

    data class Notice(
        val response : String,
        val data : String




    )


}