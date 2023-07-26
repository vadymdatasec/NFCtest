public class androidx.appcompat.widget.DialogTitle extends c.b.q.v0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public androidx.appcompat.widget.DialogTitle ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1}, Lc/b/q/v0;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public androidx.appcompat.widget.DialogTitle ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Lc/b/q/v0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public androidx.appcompat.widget.DialogTitle ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lc/b/q/v0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* invoke-super {p0, p1, p2}, Lc/b/q/v0;->onMeasure(II)V */
		 /* .line 2 */
		 (( android.widget.TextView ) p0 ).getLayout ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 3 */
			 v1 = 			 (( android.text.Layout ) v0 ).getLineCount ( ); // invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I
			 /* if-lez v1, :cond_1 */
			 /* add-int/lit8 v1, v1, -0x1 */
			 /* .line 4 */
			 v0 = 			 (( android.text.Layout ) v0 ).getEllipsisCount ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I
			 /* if-lez v0, :cond_1 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 5 */
			 (( android.widget.TextView ) p0 ).setSingleLine ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/TextView;->setSingleLine(Z)V
			 int v1 = 2; // const/4 v1, 0x2
			 /* .line 6 */
			 (( android.widget.TextView ) p0 ).setMaxLines ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/TextView;->setMaxLines(I)V
			 /* .line 7 */
			 (( android.widget.TextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
			 int v2 = 0; // const/4 v2, 0x0
			 v3 = c.b.j.TextAppearance;
			 /* const v4, 0x1010041 */
			 /* const v5, 0x1030044 */
			 (( android.content.Context ) v1 ).obtainStyledAttributes ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
			 /* .line 8 */
			 v2 = 			 (( android.content.res.TypedArray ) v1 ).getDimensionPixelSize ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* int-to-float v2, v2 */
				 /* .line 9 */
				 (( c.b.q.v0 ) p0 ).setTextSize ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Lc/b/q/v0;->setTextSize(IF)V
				 /* .line 10 */
			 } // :cond_0
			 (( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
			 /* .line 11 */
			 /* invoke-super {p0, p1, p2}, Lc/b/q/v0;->onMeasure(II)V */
		 } // :cond_1
		 return;
	 } // .end method
