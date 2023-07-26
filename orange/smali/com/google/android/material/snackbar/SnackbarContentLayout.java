public class com.google.android.material.snackbar.SnackbarContentLayout extends android.widget.LinearLayout implements e.f.a.c.s.q {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.widget.TextView b;
	 public android.widget.Button c;
	 public Integer d;
	 public Integer e;
	 /* # direct methods */
	 public com.google.android.material.snackbar.SnackbarContentLayout ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.google.android.material.snackbar.SnackbarContentLayout ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 3 */
		 v0 = e.f.a.c.i.SnackbarLayout;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
		 /* .line 4 */
		 int v0 = -1; // const/4 v0, -0x1
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 /* iput p2, p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;->d:I */
		 /* .line 5 */
		 /* .line 6 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 /* iput p2, p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;->e:I */
		 /* .line 7 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, Integer p1, Integer p2 ) {
		 /* .locals 2 */
		 /* .line 6 */
		 v0 = 		 c.h.n.v0 .F ( p0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 7 */
			 v0 = 			 c.h.n.v0 .s ( p0 );
			 /* .line 8 */
			 v1 = 			 c.h.n.v0 .r ( p0 );
			 /* .line 9 */
			 c.h.n.v0 .a ( p0,v0,p1,v1,p2 );
			 /* .line 10 */
		 } // :cond_0
		 v0 = 		 (( android.view.View ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I
		 v1 = 		 (( android.view.View ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I
		 (( android.view.View ) p0 ).setPadding ( v0, p1, v1, p2 ); // invoke-virtual {p0, v0, p1, v1, p2}, Landroid/view/View;->setPadding(IIII)V
	 } // :goto_0
	 return;
} // .end method
/* # virtual methods */
public void a ( Integer p0, Integer p1 ) {
	 /* .locals 7 */
	 /* .line 11 */
	 v0 = this.b;
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 (( android.widget.TextView ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V
	 /* .line 12 */
	 v0 = this.b;
	 (( android.widget.TextView ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->animate()Landroid/view/ViewPropertyAnimator;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.view.ViewPropertyAnimator ) v0 ).alpha ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;
	 /* int-to-long v3, p2 */
	 (( android.view.ViewPropertyAnimator ) v0 ).setDuration ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
	 /* int-to-long v5, p1 */
	 (( android.view.ViewPropertyAnimator ) p2 ).setStartDelay ( v5, v6 ); // invoke-virtual {p2, v5, v6}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V
	 /* .line 13 */
	 p1 = this.c;
	 p1 = 	 (( android.widget.Button ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/Button;->getVisibility()I
	 /* if-nez p1, :cond_0 */
	 /* .line 14 */
	 p1 = this.c;
	 (( android.widget.Button ) p1 ).setAlpha ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/Button;->setAlpha(F)V
	 /* .line 15 */
	 p1 = this.c;
	 (( android.widget.Button ) p1 ).animate ( ); // invoke-virtual {p1}, Landroid/widget/Button;->animate()Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) p1 ).alpha ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) p1 ).setDuration ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) p1 ).setStartDelay ( v5, v6 ); // invoke-virtual {p1, v5, v6}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V
} // :cond_0
return;
} // .end method
public final Boolean a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.widget.LinearLayout ) p0 ).getOrientation ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
(( android.widget.LinearLayout ) p0 ).setOrientation ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :goto_0
v0 = this.b;
v0 = (( android.widget.TextView ) v0 ).getPaddingTop ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingTop()I
/* if-ne v0, p2, :cond_2 */
v0 = this.b;
/* .line 4 */
v0 = (( android.widget.TextView ) v0 ).getPaddingBottom ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingBottom()I
/* if-eq v0, p3, :cond_1 */
} // :cond_1
/* move v1, p1 */
/* .line 5 */
} // :cond_2
} // :goto_1
p1 = this.b;
com.google.android.material.snackbar.SnackbarContentLayout .a ( p1,p2,p3 );
} // :goto_2
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.TextView ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V
/* .line 2 */
v0 = this.b;
(( android.widget.TextView ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->animate()Landroid/view/ViewPropertyAnimator;
/* const/high16 v2, 0x3f800000 # 1.0f */
(( android.view.ViewPropertyAnimator ) v0 ).alpha ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;
/* int-to-long v3, p2 */
(( android.view.ViewPropertyAnimator ) v0 ).setDuration ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
/* int-to-long v5, p1 */
(( android.view.ViewPropertyAnimator ) p2 ).setStartDelay ( v5, v6 ); // invoke-virtual {p2, v5, v6}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V
/* .line 3 */
p1 = this.c;
p1 = (( android.widget.Button ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/Button;->getVisibility()I
/* if-nez p1, :cond_0 */
/* .line 4 */
p1 = this.c;
(( android.widget.Button ) p1 ).setAlpha ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/Button;->setAlpha(F)V
/* .line 5 */
p1 = this.c;
(( android.widget.Button ) p1 ).animate ( ); // invoke-virtual {p1}, Landroid/widget/Button;->animate()Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) p1 ).alpha ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) p1 ).setDuration ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) p1 ).setStartDelay ( v5, v6 ); // invoke-virtual {p1, v5, v6}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V
} // :cond_0
return;
} // .end method
public android.widget.Button getActionView ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public android.widget.TextView getMessageView ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public void onFinishInflate ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V */
/* .line 2 */
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.b = v0;
/* .line 3 */
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.c = v0;
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
/* .line 2 */
/* iget v0, p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;->d:I */
/* if-lez v0, :cond_0 */
v0 = (( android.widget.LinearLayout ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
/* iget v1, p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;->d:I */
/* if-le v0, v1, :cond_0 */
/* const/high16 p1, 0x40000000 # 2.0f */
/* .line 3 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,p1 );
/* .line 4 */
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
/* .line 5 */
} // :cond_0
(( android.widget.LinearLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;
v0 = (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* .line 6 */
(( android.widget.LinearLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;
v1 = (( android.content.res.Resources ) v1 ).getDimensionPixelSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* .line 7 */
v2 = this.b;
(( android.widget.TextView ) v2 ).getLayout ( ); // invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;
v2 = (( android.text.Layout ) v2 ).getLineCount ( ); // invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* if-le v2, v4, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 8 */
/* iget v5, p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;->e:I */
/* if-lez v5, :cond_2 */
v5 = this.c;
/* .line 9 */
v5 = (( android.widget.Button ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/widget/Button;->getMeasuredWidth()I
/* iget v6, p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;->e:I */
/* if-le v5, v6, :cond_2 */
/* sub-int v1, v0, v1 */
/* .line 10 */
v0 = (( com.google.android.material.snackbar.SnackbarContentLayout ) p0 ).a ( v4, v0, v1 ); // invoke-virtual {p0, v4, v0, v1}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->a(III)Z
if ( v0 != null) { // if-eqz v0, :cond_4
} // :cond_2
if ( v2 != null) { // if-eqz v2, :cond_3
} // :cond_3
/* move v0, v1 */
/* .line 11 */
} // :goto_1
v0 = (( com.google.android.material.snackbar.SnackbarContentLayout ) p0 ).a ( v3, v0, v0 ); // invoke-virtual {p0, v3, v0, v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->a(III)Z
if ( v0 != null) { // if-eqz v0, :cond_4
} // :goto_2
int v3 = 1; // const/4 v3, 0x1
} // :cond_4
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 12 */
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
} // :cond_5
return;
} // .end method
