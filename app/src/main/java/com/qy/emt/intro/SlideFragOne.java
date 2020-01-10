package com.qy.emt.intro;

import android.content.Intent;
import android.widget.TextView;

import com.qy.emt.R;
import com.qy.emt.aty.wallet.CreateImportAty;
import com.qy.emt.fragment.base.BaseFrag;

import java.util.Objects;

import butterknife.BindView;

public class SlideFragOne extends BaseFrag {

    @BindView(R.id.skip_intro_id)
    TextView skip_intro_id;

    @Override
    public int initView() {
        return R.layout.slide_page_one;
    }

    @Override
    public void setListener() {
        skip_intro_id.setOnClickListener(v -> {
            Intent intent3 = new Intent(this.getContext(), CreateImportAty.class);
            startActivity(intent3);
            Objects.requireNonNull(this.getActivity()).finish();
        });
    }

    @Override
    public void fillData() {

    }
}
