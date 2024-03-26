//package learn.fpoly.restapi.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//import learn.fpoly.restapi.databinding.ItemProductBinding;
//import learn.fpoly.restapi.model.Product;
//
//public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
//    private ArrayList<D> list;
//    private Context context;
//    private ProductClick productClick;
//
//    public ProductAdapter(ArrayList<Product> list, Context context, ProductClick productClick) {
//        this.list = list;
//        this.context = context;
//        this.productClick = productClick;
//    }
//
//    public interface ProductClick {
//        void delete(Product product);
//        void edit(Product product);
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        ItemProductBinding binding = ItemProductBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
//        return new ViewHolder(binding);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        if (list != null && position < list.size()) {
//            Product product = list.get(position);
//            holder.binding.tvName.setText(product.getName());
//            holder.binding.tvPrice.setText(String.valueOf(product.getPrice()));
//            holder.binding.tvNamsx.setText(String.valueOf(product.getNamsx()));
//
//            holder.binding.btnEdit.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    productClick.edit(product);
//                }
//            });
//
//            holder.binding.btnDelete.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    productClick.delete(product);
//                }
//            });
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return list != null ? list.size() : 0;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        ItemProductBinding binding;
//
//        public ViewHolder(ItemProductBinding binding) {
//            super(binding.getRoot());
//            this.binding = binding;
//        }
//    }
//}
