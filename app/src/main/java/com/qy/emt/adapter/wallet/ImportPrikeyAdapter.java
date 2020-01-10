package com.qy.emt.adapter.wallet;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qy.emt.R;
import com.qy.emt.bean.other.database.WalletBean;

import java.util.List;

/**
 * Created by Zhaoqi
 * <p>
 */
public class ImportPrikeyAdapter extends RecyclerView.Adapter<ImportPrikeyAdapter.MviewHolder> implements View.OnClickListener {
    private List<WalletBean> walletBeans;
    private Context context;
    private CallBack mCallBack;

    public ImportPrikeyAdapter(Context context, List<WalletBean> walletBeans, CallBack callBack) {
        this.walletBeans = walletBeans;
        this.context = context;
        mCallBack = callBack;
    }

    public void setqOrgs(List<WalletBean> walletBeans) {
        this.walletBeans = walletBeans;
    }

    @Override
    public void onClick(View v) {
//        mCallBack.click(v,);
    }

    public interface CallBack {
        void click(View view, WalletBean pojo, int position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public MviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.import_pri_item, parent, false);
        MviewHolder mviewHolder = new MviewHolder(view);
        return mviewHolder;
    }

    @Override
    public void onBindViewHolder(MviewHolder holder, int position) {

        WalletBean pojo = walletBeans.get(position);

        holder.coin_desc.setText("导入" + pojo.getCoin() + "私钥");
        if (pojo.getTokenAddress() != null && !"".equals(pojo.getTokenAddress())) {
            holder.coin_address.setText(pojo.getTokenAddress());
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallBack.click(v, pojo, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (walletBeans == null)
            return 0;
        else
            return walletBeans.size();
    }

    public class MviewHolder extends RecyclerView.ViewHolder {

        public TextView coin_desc, coin_address;

        public MviewHolder(final View itemView) {
            super(itemView);

            this.coin_desc = itemView.findViewById(R.id.coin_desc);
            this.coin_address = itemView.findViewById(R.id.coin_address);

        }
    }
}
