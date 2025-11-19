package np.com.bimalkafle.minispotify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.minispotify.modle.CategoryModel
import np.com.bimalkafle.minispotify.databinding.CategoryItemRecyclerRowBinding
import java.util.Locale

private val databinding: Any

class CategoryAdaptor(private val categoryList: List<CategoryModel> ) :
    RecyclerView.Adapter<CategoryAdaptor.MyviewHolder>() {
    class CategoryItemRecyclerRowBinding {

        val root: View
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyviewHolder {
       val binding = CategoryItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent: false )
        return MyviewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: MyviewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        categoryList.size
    }

    class MyviewHolder(private val binding : CategoryItemRecyclerRowBinding) :
            RecyclerView.ViewHolder(binding.root){
            }

}