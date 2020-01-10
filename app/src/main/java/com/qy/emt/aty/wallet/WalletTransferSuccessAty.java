package com.qy.emt.aty.wallet;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.qy.emt.R;
import com.qy.emt.aty.base.BaseAty;
import com.qy.emt.utils.StatusBarUtil;
import com.qy.emt.utils.Utils;
import com.qy.emt.view.group.NavigationLucencyLayout;
import com.qy.emt.view.group.TransactionLinearLayout;

import java.math.BigDecimal;
import java.math.RoundingMode;

import butterknife.BindView;

/**
 * Description:
 * Data：2019/5/10-4:53 PM
 *
 * @author
 */
public class WalletTransferSuccessAty extends BaseAty {
    @BindView(R.id.nll_transfer_success)
    NavigationLucencyLayout nllTransferSuccess;
    @BindView(R.id.tll_transfer_hash)
    TransactionLinearLayout tllTransferHash;
    @BindView(R.id.tll_transfer_block)
    TransactionLinearLayout tllTransferBlock;
    @BindView(R.id.tll_transfer_time)
    TransactionLinearLayout tllTransferTime;
    @BindView(R.id.tll_transfer_from)
    TransactionLinearLayout tllTransferFrom;
    @BindView(R.id.tll_transfer_to)
    TransactionLinearLayout tllTransferTo;
    @BindView(R.id.tll_transfer_price)
    TransactionLinearLayout tllTransferPrice;
    @BindView(R.id.tll_transfer_fee)
    TransactionLinearLayout tllTransferFee;
    @BindView(R.id.tv_transfer_success)
    TextView tvTransferSuccess;
    @BindView(R.id.tv_transfer_amount)
    TextView tvTransferAmount;
    @BindView(R.id.coin_name)
    TextView coin_name;
    private String hash;
    public static final int SHARE_REQUEST_CODE = 1003;

    @Override
    public int initView() {
        return R.layout.aty_wallet_transfer_success;
    }

    @Override
    public void setListener() {
        nllTransferSuccess.setOnBuyListener(new NavigationLucencyLayout.OnBuyTwoListener() {
            @Override
            public void OnClickListener() {
                onExportWallet(hash);
            }
        });
    }

    @Override
    public void fillData() {
        StatusBarUtil.setStatusColor(this, true, true, R.color.colorPrimary);
        nllTransferSuccess.setTitle("detail transfer");
        nllTransferSuccess.setBackground(R.color.color_ffffff);
        nllTransferSuccess.setIvTwo(R.mipmap.icon_share);

        initWidget();

    }

    private void initWidget() {
        Intent intent = getIntent();
        String tokenName = intent.getStringExtra("tokenName");
        hash = intent.getStringExtra("txhash");
        String time = intent.getStringExtra("time");
        String sendAddress = intent.getStringExtra("sendAddress");
        String receiveAddress = intent.getStringExtra("receiveAddress");
        String amount = intent.getStringExtra("amount");
        String fee = intent.getStringExtra("fee");
        String tokenAmount = intent.getStringExtra("tokenAmount");

        if (tokenName == null) {
            tokenName = "";
        }

        if (amount.contains("+")) {
            tvTransferSuccess.setText(amount );
            tvTransferAmount.setVisibility(View.INVISIBLE);
        } else if (amount.contains("-")) {
            tvTransferSuccess.setText(amount );
            tvTransferAmount.setVisibility(View.INVISIBLE);
        } else {

            tvTransferSuccess.setText("-" + amount);
            tvTransferAmount.setText("balance" + Utils.subZeroAndDot(new BigDecimal(tokenAmount).subtract(new BigDecimal(amount)).setScale(8, RoundingMode.HALF_UP).toPlainString()) + tokenName);
        }

        coin_name.setText(" " + tokenName);

        tllTransferHash.setTitle("hash:");
        tllTransferHash.setContext(hash);
        tllTransferBlock.setTitle("block:");
        tllTransferTime.setTitle("Timestamp:");
        tllTransferTime.setContext("2019-01-01 12:23:12（1分钟前）");
        tllTransferTime.setContext(time);
        tllTransferFrom.setTitle("from:");
        tllTransferFrom.setContext(sendAddress);
        tllTransferTo.setTitle("to:");
        tllTransferTo.setContext(receiveAddress);
        tllTransferPrice.setTitle("value:");
        tllTransferPrice.setContext(amount);
        tllTransferFee.setTitle("gas:");
        tllTransferFee.setContext(fee);

    }

//    public interface OnExportWalletListener {
//        void onExport(String tx);
//    }

    private void openShareDialog(String jsonData) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Keystore");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, jsonData);
        startActivityForResult(
                Intent.createChooser(sharingIntent, "Share via"),
                SHARE_REQUEST_CODE);
    }

    private void onExportWallet(String tx) {
        openShareDialog(tx);
    }
}
