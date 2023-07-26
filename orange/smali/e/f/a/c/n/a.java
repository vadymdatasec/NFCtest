public class e.f.a.c.n.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.google.android.material.card.MaterialCardView a;
	 public Integer b;
	 public Integer c;
	 /* # direct methods */
	 public e.f.a.c.n.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 5 */
		 /* .line 8 */
		 v0 = this.a;
		 v0 = 		 (( androidx.cardview.widget.CardView ) v0 ).getContentPaddingLeft ( ); // invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getContentPaddingLeft()I
		 /* iget v1, p0, Le/f/a/c/n/a;->c:I */
		 /* add-int/2addr v0, v1 */
		 /* .line 9 */
		 v1 = this.a;
		 v1 = 		 (( androidx.cardview.widget.CardView ) v1 ).getContentPaddingTop ( ); // invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getContentPaddingTop()I
		 /* iget v2, p0, Le/f/a/c/n/a;->c:I */
		 /* add-int/2addr v1, v2 */
		 /* .line 10 */
		 v2 = this.a;
		 v2 = 		 (( androidx.cardview.widget.CardView ) v2 ).getContentPaddingRight ( ); // invoke-virtual {v2}, Landroidx/cardview/widget/CardView;->getContentPaddingRight()I
		 /* iget v3, p0, Le/f/a/c/n/a;->c:I */
		 /* add-int/2addr v2, v3 */
		 /* .line 11 */
		 v3 = this.a;
		 v3 = 		 (( androidx.cardview.widget.CardView ) v3 ).getContentPaddingBottom ( ); // invoke-virtual {v3}, Landroidx/cardview/widget/CardView;->getContentPaddingBottom()I
		 /* iget v4, p0, Le/f/a/c/n/a;->c:I */
		 /* add-int/2addr v3, v4 */
		 /* .line 12 */
		 v4 = this.a;
		 (( androidx.cardview.widget.CardView ) v4 ).a ( v0, v1, v2, v3 ); // invoke-virtual {v4, v0, v1, v2, v3}, Landroidx/cardview/widget/CardView;->a(IIII)V
		 return;
	 } // .end method
	 public void a ( Integer p0 ) {
		 /* .locals 0 */
		 /* .line 6 */
		 /* iput p1, p0, Le/f/a/c/n/a;->b:I */
		 /* .line 7 */
		 (( e.f.a.c.n.a ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/c/n/a;->e()V
		 return;
	 } // .end method
	 public void a ( android.content.res.TypedArray p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 2 */
		 v0 = 		 (( android.content.res.TypedArray ) p1 ).getColor ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I
		 /* iput v0, p0, Le/f/a/c/n/a;->b:I */
		 /* .line 3 */
		 int v1 = 0; // const/4 v1, 0x0
		 p1 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 /* iput p1, p0, Le/f/a/c/n/a;->c:I */
		 /* .line 4 */
		 (( e.f.a.c.n.a ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/c/n/a;->e()V
		 /* .line 5 */
		 (( e.f.a.c.n.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/n/a;->a()V
		 return;
	 } // .end method
	 public final android.graphics.drawable.Drawable b ( ) {
		 /* .locals 3 */
		 /* .line 4 */
		 /* new-instance v0, Landroid/graphics/drawable/GradientDrawable; */
		 /* invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V */
		 /* .line 5 */
		 v1 = this.a;
		 v1 = 		 (( androidx.cardview.widget.CardView ) v1 ).getRadius ( ); // invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getRadius()F
		 (( android.graphics.drawable.GradientDrawable ) v0 ).setCornerRadius ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V
		 /* .line 6 */
		 /* iget v1, p0, Le/f/a/c/n/a;->b:I */
		 int v2 = -1; // const/4 v2, -0x1
		 /* if-eq v1, v2, :cond_0 */
		 /* .line 7 */
		 /* iget v2, p0, Le/f/a/c/n/a;->c:I */
		 (( android.graphics.drawable.GradientDrawable ) v0 ).setStroke ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V
	 } // :cond_0
} // .end method
public void b ( Integer p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* iput p1, p0, Le/f/a/c/n/a;->c:I */
	 /* .line 2 */
	 (( e.f.a.c.n.a ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/c/n/a;->e()V
	 /* .line 3 */
	 (( e.f.a.c.n.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/n/a;->a()V
	 return;
} // .end method
public Integer c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Le/f/a/c/n/a;->b:I */
} // .end method
public Integer d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Le/f/a/c/n/a;->c:I */
} // .end method
public void e ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.a;
	 (( e.f.a.c.n.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/n/a;->b()Landroid/graphics/drawable/Drawable;
	 (( android.widget.FrameLayout ) v0 ).setForeground ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V
	 return;
} // .end method
