// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreateImportAty_ViewBinding implements Unbinder {
  private CreateImportAty target;

  private View view2131296380;

  private View view2131296408;

  private View view2131296497;

  private View view2131296839;

  @UiThread
  public CreateImportAty_ViewBinding(CreateImportAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreateImportAty_ViewBinding(final CreateImportAty target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.change_language_id, "field 'change_language_id' and method 'onClick'");
    target.change_language_id = Utils.castView(view, R.id.change_language_id, "field 'change_language_id'", ImageView.class);
    view2131296380 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.create_wallet_id, "field 'create_wallet_id' and method 'onClick'");
    target.create_wallet_id = Utils.castView(view, R.id.create_wallet_id, "field 'create_wallet_id'", TextView.class);
    view2131296408 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.import_wallet_id, "field 'import_wallet_id' and method 'onClick'");
    target.import_wallet_id = Utils.castView(view, R.id.import_wallet_id, "field 'import_wallet_id'", TextView.class);
    view2131296497 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ttt, "field 'ttt' and method 'onClick'");
    target.ttt = Utils.castView(view, R.id.ttt, "field 'ttt'", TextView.class);
    view2131296839 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.checkBox = Utils.findRequiredViewAsType(source, R.id.checkBox, "field 'checkBox'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateImportAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.change_language_id = null;
    target.create_wallet_id = null;
    target.import_wallet_id = null;
    target.ttt = null;
    target.checkBox = null;

    view2131296380.setOnClickListener(null);
    view2131296380 = null;
    view2131296408.setOnClickListener(null);
    view2131296408 = null;
    view2131296497.setOnClickListener(null);
    view2131296497 = null;
    view2131296839.setOnClickListener(null);
    view2131296839 = null;
  }
}
