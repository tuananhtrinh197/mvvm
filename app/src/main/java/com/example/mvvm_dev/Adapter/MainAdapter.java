package com.example.mvvm_dev.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm_dev.Model.Data_GetInfoCLPharmacy;
import com.example.mvvm_dev.databinding.ItemMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    Context context;
    List<Data_GetInfoCLPharmacy> detailist = new ArrayList<>();
    Delete delete_;
    public MainAdapter(Context context, List<Data_GetInfoCLPharmacy> detailist,Delete delete) {
        this.detailist = detailist;
        this.context = context;
        this.delete_ = delete;
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

        return new MyViewHolder(ItemMainBinding.inflate(LayoutInflater.from(context),parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
       // final Save_Phieu_YCDC_RotHang data = detailist.get(position);
        MyViewHolder vh = (MyViewHolder) myViewHolder;

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

        private final ItemMainBinding binding;
        public MyViewHolder(final ItemMainBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
            binding.executePendingBindings();
        }
    }
}


