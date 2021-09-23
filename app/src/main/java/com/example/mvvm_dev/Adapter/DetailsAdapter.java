package com.example.mvvm_dev.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;
import com.example.mvvm_dev.databinding.ItemDetailsBinding;
import com.example.mvvm_dev.databinding.ItemMainBinding;
import com.example.mvvm_dev.viewModel.ItemMainViewModel;

import java.util.ArrayList;
import java.util.List;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.MyViewHolder> {
    Context context;
    List<Data_GetInfoCLPharmacy> detailist = new ArrayList<>();
    // Delete delete_;
    public DetailsAdapter(Context context, List<Data_GetInfoCLPharmacy> detailist) {
        this.detailist = detailist;
        this.context = context;
    }

    public interface Delete{
        void _Delete(int Docentry, int position);
    }
    public interface OntickShowImage{
        void Ontick(int pos);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        return new MyViewHolder(ItemDetailsBinding.inflate(LayoutInflater.from(context),parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        MyViewHolder vh = (MyViewHolder) myViewHolder;
        vh.bindData(detailist.get(position));
//       if(position%2==0){
//           //vh.binding.relative.setBackgroundColor(Color.parseColor("#7c7b7b"));
//           vh.binding.relative.setBackgroundResource(R.drawable.background_chatcontent_user);
//       }else {
//           vh.binding.relative.setBackgroundColor(Color.parseColor("#96D5F8"));
//       }
    }

    @Override
    public int getItemCount() {
        return detailist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ItemDetailsBinding binding;
        public MyViewHolder(final ItemDetailsBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
            //binding.executePendingBindings();
        }
        public void bindData(Data_GetInfoCLPharmacy data) {
            if (binding.getItemViewModel() == null) {
                binding.setItemViewModel(new ItemMainViewModel(data,itemView.getContext()));
            } else {
                binding.getItemViewModel().setData(data);
            }
            binding.executePendingBindings();
        }
    }
}
