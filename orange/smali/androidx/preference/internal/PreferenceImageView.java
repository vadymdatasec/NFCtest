public class androidx.preference.internal.PreferenceImageView extends android.widget.ImageView {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 public Integer c;
	 /* # direct methods */
	 public androidx.preference.internal.PreferenceImageView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Landroidx/preference/internal/PreferenceImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public androidx.preference.internal.PreferenceImageView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/internal/PreferenceImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.internal.PreferenceImageView ( ) {
		 /* .locals 3 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* const v0, 0x7fffffff */
		 /* .line 4 */
		 /* iput v0, p0, Landroidx/preference/internal/PreferenceImageView;->b:I */
		 /* .line 5 */
		 /* iput v0, p0, Landroidx/preference/internal/PreferenceImageView;->c:I */
		 /* .line 6 */
		 v1 = c.q.f.PreferenceImageView;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1, p3, v2 ); // invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 7 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 (( androidx.preference.internal.PreferenceImageView ) p0 ).setMaxWidth ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/internal/PreferenceImageView;->setMaxWidth(I)V
		 /* .line 8 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 (( androidx.preference.internal.PreferenceImageView ) p0 ).setMaxHeight ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/internal/PreferenceImageView;->setMaxHeight(I)V
		 /* .line 9 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getMaxHeight ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Landroidx/preference/internal/PreferenceImageView;->c:I */
	 } // .end method
	 public Integer getMaxWidth ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Landroidx/preference/internal/PreferenceImageView;->b:I */
	 } // .end method
	 public void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = 		 android.view.View$MeasureSpec .getMode ( p1 );
		 /* const v1, 0x7fffffff */
		 /* const/high16 v2, -0x80000000 */
		 /* if-eq v0, v2, :cond_0 */
		 /* if-nez v0, :cond_2 */
		 /* .line 2 */
	 } // :cond_0
	 v3 = 	 android.view.View$MeasureSpec .getSize ( p1 );
	 /* .line 3 */
	 v4 = 	 (( androidx.preference.internal.PreferenceImageView ) p0 ).getMaxWidth ( ); // invoke-virtual {p0}, Landroidx/preference/internal/PreferenceImageView;->getMaxWidth()I
	 /* if-eq v4, v1, :cond_2 */
	 /* if-lt v4, v3, :cond_1 */
	 /* if-nez v0, :cond_2 */
	 /* .line 4 */
} // :cond_1
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( v4,v2 );
/* .line 5 */
} // :cond_2
v0 = android.view.View$MeasureSpec .getMode ( p2 );
/* if-eq v0, v2, :cond_3 */
/* if-nez v0, :cond_5 */
/* .line 6 */
} // :cond_3
v3 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 7 */
v4 = (( androidx.preference.internal.PreferenceImageView ) p0 ).getMaxHeight ( ); // invoke-virtual {p0}, Landroidx/preference/internal/PreferenceImageView;->getMaxHeight()I
/* if-eq v4, v1, :cond_5 */
/* if-lt v4, v3, :cond_4 */
/* if-nez v0, :cond_5 */
/* .line 8 */
} // :cond_4
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( v4,v2 );
/* .line 9 */
} // :cond_5
/* invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V */
return;
} // .end method
public void setMaxHeight ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/preference/internal/PreferenceImageView;->c:I */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/ImageView;->setMaxHeight(I)V */
return;
} // .end method
public void setMaxWidth ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/preference/internal/PreferenceImageView;->b:I */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/ImageView;->setMaxWidth(I)V */
return;
} // .end method
