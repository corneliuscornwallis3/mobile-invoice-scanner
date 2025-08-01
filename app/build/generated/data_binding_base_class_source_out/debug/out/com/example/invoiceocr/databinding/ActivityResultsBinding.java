// Generated by view binder compiler. Do not edit!
package com.example.invoiceocr.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.invoiceocr.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView dateText;

  @NonNull
  public final TextView totalText;

  @NonNull
  public final TextView vendorText;

  private ActivityResultsBinding(@NonNull LinearLayout rootView, @NonNull TextView dateText,
      @NonNull TextView totalText, @NonNull TextView vendorText) {
    this.rootView = rootView;
    this.dateText = dateText;
    this.totalText = totalText;
    this.vendorText = vendorText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_results, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dateText;
      TextView dateText = ViewBindings.findChildViewById(rootView, id);
      if (dateText == null) {
        break missingId;
      }

      id = R.id.totalText;
      TextView totalText = ViewBindings.findChildViewById(rootView, id);
      if (totalText == null) {
        break missingId;
      }

      id = R.id.vendorText;
      TextView vendorText = ViewBindings.findChildViewById(rootView, id);
      if (vendorText == null) {
        break missingId;
      }

      return new ActivityResultsBinding((LinearLayout) rootView, dateText, totalText, vendorText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
