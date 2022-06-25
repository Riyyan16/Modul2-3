package com.example.cetakfoto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KatalogFotoListAdapter extends RecyclerView.Adapter<KatalogFotoListAdapter.KatalogFotoViewHolder> {

    private final LayoutInflater minflater;

    public KatalogFotoListAdapter(Context context){
        minflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public KatalogFotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = minflater.inflate(R.layout.katalog_foto,parent);
        return new KatalogFotoViewHolder(itemView,  this);
    }

    @Override
    public void onBindViewHolder(@NonNull KatalogFotoViewHolder holder, int position) {
        KatalogFoto katalogFoto = KatalogFotoHelper.getKatalogFotoAt(position);
        holder.ivKatalogFoto.setImageResource(katalogFoto.getResId());
        holder.tvFilename.setText((katalogFoto.getFilename()));


    }

    @Override
    public int getItemCount() {
        return KatalogFotoHelper.getKatalogFotoList().size();
    }

    class KatalogFotoViewHolder extends RecyclerView.ViewHolder {
        final Button btnCetak;
        final Button[] btnUkuranArray;
        final ImageView ivKatalogFoto;
        final TextView tvFilename;
        private final KatalogFotoListAdapter mAdapter;

        private final int[] resBtnUkuranArray = {
                R.id.btn_ukuran3r,
                R.id.btn_ukuran4r,
                R.id.btn_ukuran8r,
                R.id.btn_ukuran10r
        };

        public KatalogFotoViewHolder(@NonNull View itemView, KatalogFotoListAdapter _mAdapter) {
            super(itemView);
            mAdapter = _mAdapter;

            btnCetak = itemView.findViewById(R.id.btn_cetak);
            ivKatalogFoto = itemView.findViewById(R.id.iv_foto);
            tvFilename = itemView.findViewById(R.id.textView3);

            btnUkuranArray = new Button[resBtnUkuranArray.length];

            for (int i=0;i< resBtnUkuranArray.length; i++){
                btnUkuranArray[i] = itemView.findViewById(resBtnUkuranArray[i]);
            }


        }
    }
}
