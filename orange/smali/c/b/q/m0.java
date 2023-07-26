public class c.b.q.m0 extends c.b.q.p1 implements c.b.q.p0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.CharSequence J;
	 public android.widget.ListAdapter K;
	 public final android.graphics.Rect L;
	 public Integer M;
	 public final c.b.q.q0 N; //synthetic
	 /* # direct methods */
	 public c.b.q.m0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.N = p1;
		 /* .line 2 */
		 /* invoke-direct {p0, p2, p3, p4}, Lc/b/q/p1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p2, Landroid/graphics/Rect; */
		 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
		 this.L = p2;
		 /* .line 4 */
		 (( c.b.q.p1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/p1;->a(Landroid/view/View;)V
		 int p2 = 1; // const/4 p2, 0x1
		 /* .line 5 */
		 (( c.b.q.p1 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/p1;->a(Z)V
		 int p2 = 0; // const/4 p2, 0x0
		 /* .line 6 */
		 (( c.b.q.p1 ) p0 ).h ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/p1;->h(I)V
		 /* .line 7 */
		 /* new-instance p2, Lc/b/q/j0; */
		 /* invoke-direct {p2, p0, p1}, Lc/b/q/j0;-><init>(Lc/b/q/m0;Lc/b/q/q0;)V */
		 (( c.b.q.p1 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/p1;->a(Landroid/widget/AdapterView$OnItemClickListener;)V
		 return;
	 } // .end method
	 public static void a ( c.b.q.m0 p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-super {p0}, Lc/b/q/p1;->a()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0, Integer p1 ) {
		 /* .locals 4 */
		 /* .line 5 */
		 v0 = 		 (( c.b.q.p1 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/p1;->b()Z
		 /* .line 6 */
		 (( c.b.q.m0 ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/q/m0;->o()V
		 int v1 = 2; // const/4 v1, 0x2
		 /* .line 7 */
		 (( c.b.q.p1 ) p0 ).g ( v1 ); // invoke-virtual {p0, v1}, Lc/b/q/p1;->g(I)V
		 /* .line 8 */
		 /* invoke-super {p0}, Lc/b/q/p1;->a()V */
		 /* .line 9 */
		 (( c.b.q.p1 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/b/q/p1;->g()Landroid/widget/ListView;
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 10 */
		 (( android.widget.ListView ) v1 ).setChoiceMode ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ListView;->setChoiceMode(I)V
		 /* .line 11 */
		 /* const/16 v3, 0x11 */
		 /* if-lt v2, v3, :cond_0 */
		 /* .line 12 */
		 (( android.widget.ListView ) v1 ).setTextDirection ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/ListView;->setTextDirection(I)V
		 /* .line 13 */
		 (( android.widget.ListView ) v1 ).setTextAlignment ( p2 ); // invoke-virtual {v1, p2}, Landroid/widget/ListView;->setTextAlignment(I)V
		 /* .line 14 */
	 } // :cond_0
	 p1 = this.N;
	 p1 = 	 (( android.widget.Spinner ) p1 ).getSelectedItemPosition ( ); // invoke-virtual {p1}, Landroid/widget/Spinner;->getSelectedItemPosition()I
	 (( c.b.q.p1 ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/p1;->i(I)V
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 return;
		 /* .line 15 */
	 } // :cond_1
	 p1 = this.N;
	 (( android.widget.Spinner ) p1 ).getViewTreeObserver ( ); // invoke-virtual {p1}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 16 */
		 /* new-instance p2, Lc/b/q/k0; */
		 /* invoke-direct {p2, p0}, Lc/b/q/k0;-><init>(Lc/b/q/m0;)V */
		 /* .line 17 */
		 (( android.view.ViewTreeObserver ) p1 ).addOnGlobalLayoutListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
		 /* .line 18 */
		 /* new-instance p1, Lc/b/q/l0; */
		 /* invoke-direct {p1, p0, p2}, Lc/b/q/l0;-><init>(Lc/b/q/m0;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V */
		 (( c.b.q.p1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/p1;->a(Landroid/widget/PopupWindow$OnDismissListener;)V
	 } // :cond_2
	 return;
} // .end method
public void a ( android.widget.ListAdapter p0 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 /* invoke-super {p0, p1}, Lc/b/q/p1;->a(Landroid/widget/ListAdapter;)V */
	 /* .line 3 */
	 this.K = p1;
	 return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
	 /* .locals 0 */
	 /* .line 4 */
	 this.J = p1;
	 return;
} // .end method
public Boolean b ( android.view.View p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 c.h.n.v0 .C ( p1 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.L;
		 p1 = 		 (( android.view.View ) p1 ).getGlobalVisibleRect ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
} // .end method
public void c ( Integer p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* iput p1, p0, Lc/b/q/m0;->M:I */
	 return;
} // .end method
public java.lang.CharSequence f ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.J;
} // .end method
public void o ( ) {
	 /* .locals 8 */
	 /* .line 1 */
	 (( c.b.q.p1 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/q/p1;->e()Landroid/graphics/drawable/Drawable;
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 2 */
		 v1 = this.N;
		 v1 = this.i;
		 (( android.graphics.drawable.Drawable ) v0 ).getPadding ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
		 /* .line 3 */
		 v0 = this.N;
		 v0 = 		 c.b.q.v2 .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.N;
			 v0 = this.i;
			 /* iget v0, v0, Landroid/graphics/Rect;->right:I */
		 } // :cond_0
		 v0 = this.N;
		 v0 = this.i;
		 /* iget v0, v0, Landroid/graphics/Rect;->left:I */
		 /* neg-int v0, v0 */
	 } // :goto_0
	 /* move v1, v0 */
	 /* .line 4 */
} // :cond_1
v0 = this.N;
v0 = this.i;
/* iput v1, v0, Landroid/graphics/Rect;->right:I */
/* iput v1, v0, Landroid/graphics/Rect;->left:I */
/* .line 5 */
} // :goto_1
v0 = this.N;
v0 = (( android.widget.Spinner ) v0 ).getPaddingLeft ( ); // invoke-virtual {v0}, Landroid/widget/Spinner;->getPaddingLeft()I
/* .line 6 */
v2 = this.N;
v2 = (( android.widget.Spinner ) v2 ).getPaddingRight ( ); // invoke-virtual {v2}, Landroid/widget/Spinner;->getPaddingRight()I
/* .line 7 */
v3 = this.N;
v3 = (( android.widget.Spinner ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/widget/Spinner;->getWidth()I
/* .line 8 */
v4 = this.N;
/* iget v5, v4, Lc/b/q/q0;->h:I */
int v6 = -2; // const/4 v6, -0x2
/* if-ne v5, v6, :cond_3 */
/* .line 9 */
v5 = this.K;
/* check-cast v5, Landroid/widget/SpinnerAdapter; */
/* .line 10 */
(( c.b.q.p1 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/q/p1;->e()Landroid/graphics/drawable/Drawable;
/* .line 11 */
v4 = (( c.b.q.q0 ) v4 ).a ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lc/b/q/q0;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
/* .line 12 */
v5 = this.N;
(( android.widget.Spinner ) v5 ).getContext ( ); // invoke-virtual {v5}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;
(( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 13 */
(( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I */
v6 = this.N;
v6 = this.i;
/* iget v7, v6, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v5, v7 */
/* iget v6, v6, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v5, v6 */
/* if-le v4, v5, :cond_2 */
/* move v4, v5 */
} // :cond_2
/* sub-int v5, v3, v0 */
/* sub-int/2addr v5, v2 */
/* .line 14 */
v4 = java.lang.Math .max ( v4,v5 );
(( c.b.q.p1 ) p0 ).e ( v4 ); // invoke-virtual {p0, v4}, Lc/b/q/p1;->e(I)V
} // :cond_3
int v4 = -1; // const/4 v4, -0x1
/* if-ne v5, v4, :cond_4 */
/* sub-int v4, v3, v0 */
/* sub-int/2addr v4, v2 */
/* .line 15 */
(( c.b.q.p1 ) p0 ).e ( v4 ); // invoke-virtual {p0, v4}, Lc/b/q/p1;->e(I)V
/* .line 16 */
} // :cond_4
(( c.b.q.p1 ) p0 ).e ( v5 ); // invoke-virtual {p0, v5}, Lc/b/q/p1;->e(I)V
/* .line 17 */
} // :goto_2
v4 = this.N;
v4 = c.b.q.v2 .a ( v4 );
if ( v4 != null) { // if-eqz v4, :cond_5
/* sub-int/2addr v3, v2 */
/* .line 18 */
v0 = (( c.b.q.p1 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/q/p1;->k()I
/* sub-int/2addr v3, v0 */
/* .line 19 */
v0 = (( c.b.q.m0 ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/q/m0;->p()I
/* sub-int/2addr v3, v0 */
/* add-int/2addr v1, v3 */
/* .line 20 */
} // :cond_5
v2 = (( c.b.q.m0 ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/q/m0;->p()I
/* add-int/2addr v0, v2 */
/* add-int/2addr v1, v0 */
/* .line 21 */
} // :goto_3
(( c.b.q.p1 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/b/q/p1;->a(I)V
return;
} // .end method
public Integer p ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/m0;->M:I */
} // .end method
