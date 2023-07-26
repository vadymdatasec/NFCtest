public class com.google.android.material.card.MaterialCardView extends androidx.cardview.widget.CardView {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.a.c.n.a k;
	 /* # direct methods */
	 public com.google.android.material.card.MaterialCardView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lcom/google/android/material/card/MaterialCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.google.android.material.card.MaterialCardView ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/card/MaterialCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public com.google.android.material.card.MaterialCardView ( ) {
		 /* .locals 6 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 4 */
		 v2 = e.f.a.c.i.MaterialCardView;
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v5, v0, [I */
		 /* move-object v0, p1 */
		 /* move-object v1, p2 */
		 /* move v3, p3 */
		 /* .line 5 */
		 /* invoke-static/range {v0 ..v5}, Le/f/a/c/p/c;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray; */
		 /* .line 6 */
		 /* new-instance p2, Le/f/a/c/n/a; */
		 /* invoke-direct {p2, p0}, Le/f/a/c/n/a;-><init>(Lcom/google/android/material/card/MaterialCardView;)V */
		 this.k = p2;
		 /* .line 7 */
		 (( e.f.a.c.n.a ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/f/a/c/n/a;->a(Landroid/content/res/TypedArray;)V
		 /* .line 8 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getStrokeColor ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.k;
		 v0 = 		 (( e.f.a.c.n.a ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/a/c/n/a;->c()I
	 } // .end method
	 public Integer getStrokeWidth ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.k;
		 v0 = 		 (( e.f.a.c.n.a ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/a/c/n/a;->d()I
	 } // .end method
	 public void setRadius ( Float p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Landroidx/cardview/widget/CardView;->setRadius(F)V */
		 /* .line 2 */
		 p1 = this.k;
		 (( e.f.a.c.n.a ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/c/n/a;->e()V
		 return;
	 } // .end method
	 public void setStrokeColor ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.k;
		 (( e.f.a.c.n.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/n/a;->a(I)V
		 return;
	 } // .end method
	 public void setStrokeWidth ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.k;
		 (( e.f.a.c.n.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/n/a;->b(I)V
		 return;
	 } // .end method
