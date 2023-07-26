public abstract class e.f.a.c.p.b extends androidx.appcompat.widget.LinearLayoutCompat {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.graphics.drawable.Drawable q;
	 public final android.graphics.Rect r;
	 public final android.graphics.Rect s;
	 public Integer t;
	 public Boolean u;
	 public Boolean v;
	 /* # direct methods */
	 public e.f.a.c.p.b ( ) {
		 /* .locals 8 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 2 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.r = v0;
		 /* .line 3 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.s = v0;
		 /* const/16 v0, 0x77 */
		 /* .line 4 */
		 /* iput v0, p0, Le/f/a/c/p/b;->t:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 5 */
		 /* iput-boolean v0, p0, Le/f/a/c/p/b;->u:Z */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 6 */
		 /* iput-boolean v1, p0, Le/f/a/c/p/b;->v:Z */
		 /* .line 7 */
		 v4 = e.f.a.c.i.ForegroundLinearLayout;
		 /* new-array v7, v1, [I */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v2, p1 */
		 /* move-object v3, p2 */
		 /* move v5, p3 */
		 /* .line 8 */
		 /* invoke-static/range {v2 ..v7}, Le/f/a/c/p/c;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray; */
		 /* .line 9 */
		 /* iget p3, p0, Le/f/a/c/p/b;->t:I */
		 /* .line 10 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I
		 /* iput p2, p0, Le/f/a/c/p/b;->t:I */
		 /* .line 11 */
		 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 12 */
			 (( e.f.a.c.p.b ) p0 ).setForeground ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/p/b;->setForeground(Landroid/graphics/drawable/Drawable;)V
			 /* .line 13 */
		 } // :cond_0
		 /* .line 14 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 /* iput-boolean p2, p0, Le/f/a/c/p/b;->u:Z */
		 /* .line 15 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void draw ( android.graphics.Canvas p0 ) {
		 /* .locals 8 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V */
		 /* .line 2 */
		 v0 = this.q;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 3 */
			 /* iget-boolean v1, p0, Le/f/a/c/p/b;->v:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 int v1 = 0; // const/4 v1, 0x0
				 /* .line 4 */
				 /* iput-boolean v1, p0, Le/f/a/c/p/b;->v:Z */
				 /* .line 5 */
				 v2 = this.r;
				 /* .line 6 */
				 v3 = this.s;
				 /* .line 7 */
				 v4 = 				 (( android.view.ViewGroup ) p0 ).getRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getRight()I
				 v5 = 				 (( android.view.ViewGroup ) p0 ).getLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getLeft()I
				 /* sub-int/2addr v4, v5 */
				 /* .line 8 */
				 v5 = 				 (( android.view.ViewGroup ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getBottom()I
				 v6 = 				 (( android.view.ViewGroup ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getTop()I
				 /* sub-int/2addr v5, v6 */
				 /* .line 9 */
				 /* iget-boolean v6, p0, Le/f/a/c/p/b;->u:Z */
				 if ( v6 != null) { // if-eqz v6, :cond_0
					 /* .line 10 */
					 (( android.graphics.Rect ) v2 ).set ( v1, v1, v4, v5 ); // invoke-virtual {v2, v1, v1, v4, v5}, Landroid/graphics/Rect;->set(IIII)V
					 /* .line 11 */
				 } // :cond_0
				 v1 = 				 (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
				 v6 = 				 (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
				 v7 = 				 (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
				 /* sub-int/2addr v4, v7 */
				 v7 = 				 (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
				 /* sub-int/2addr v5, v7 */
				 /* .line 12 */
				 (( android.graphics.Rect ) v2 ).set ( v1, v6, v4, v5 ); // invoke-virtual {v2, v1, v6, v4, v5}, Landroid/graphics/Rect;->set(IIII)V
				 /* .line 13 */
			 } // :goto_0
			 /* iget v1, p0, Le/f/a/c/p/b;->t:I */
			 /* .line 14 */
			 v4 = 			 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
			 /* .line 15 */
			 v5 = 			 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
			 /* .line 16 */
			 android.view.Gravity .apply ( v1,v4,v5,v2,v3 );
			 /* .line 17 */
			 (( android.graphics.drawable.Drawable ) v0 ).setBounds ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
			 /* .line 18 */
		 } // :cond_1
		 (( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
	 } // :cond_2
	 return;
} // .end method
public void drawableHotspotChanged ( Float p0, Float p1 ) {
	 /* .locals 1 */
	 /* .annotation build Landroid/annotation/TargetApi; */
	 /* value = 0x15 */
} // .end annotation
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->drawableHotspotChanged(FF)V */
/* .line 2 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 (( android.graphics.drawable.Drawable ) v0 ).setHotspot ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V
} // :cond_0
return;
} // .end method
public void drawableStateChanged ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V */
/* .line 2 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 v0 = this.q;
		 (( android.view.ViewGroup ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getDrawableState()[I
		 (( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
	 } // :cond_0
	 return;
} // .end method
public android.graphics.drawable.Drawable getForeground ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.q;
} // .end method
public Integer getForegroundGravity ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Le/f/a/c/p/b;->t:I */
} // .end method
public void jumpDrawablesToCurrentState ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-super {p0}, Landroid/view/ViewGroup;->jumpDrawablesToCurrentState()V */
	 /* .line 2 */
	 v0 = this.q;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 (( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
	 } // :cond_0
	 return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super/range {p0 ..p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V */
	 /* .line 2 */
	 /* iget-boolean p2, p0, Le/f/a/c/p/b;->v:Z */
	 /* or-int/2addr p1, p2 */
	 /* iput-boolean p1, p0, Le/f/a/c/p/b;->v:Z */
	 return;
} // .end method
public void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V */
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 2 */
	 /* iput-boolean p1, p0, Le/f/a/c/p/b;->v:Z */
	 return;
} // .end method
public void setForeground ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.q;
	 /* if-eq v0, p1, :cond_4 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 2 */
		 (( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
		 /* .line 3 */
		 v0 = this.q;
		 (( android.view.ViewGroup ) p0 ).unscheduleDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 4 */
	 } // :cond_0
	 this.q = p1;
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 (( android.view.ViewGroup ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V
		 /* .line 6 */
		 (( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
		 /* .line 7 */
		 v0 = 		 (( android.graphics.drawable.Drawable ) p1 ).isStateful ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 8 */
			 (( android.view.ViewGroup ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getDrawableState()[I
			 (( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
			 /* .line 9 */
		 } // :cond_1
		 /* iget v0, p0, Le/f/a/c/p/b;->t:I */
		 /* const/16 v1, 0x77 */
		 /* if-ne v0, v1, :cond_3 */
		 /* .line 10 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 /* .line 11 */
		 (( android.graphics.drawable.Drawable ) p1 ).getPadding ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
	 } // :cond_2
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 12 */
	 (( android.view.ViewGroup ) p0 ).setWillNotDraw ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V
	 /* .line 13 */
} // :cond_3
} // :goto_0
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
/* .line 14 */
(( android.view.ViewGroup ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V
} // :cond_4
return;
} // .end method
public void setForegroundGravity ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/p/b;->t:I */
/* if-eq v0, p1, :cond_3 */
/* const v0, 0x800007 */
/* and-int/2addr v0, p1 */
/* if-nez v0, :cond_0 */
/* const v0, 0x800003 */
/* or-int/2addr p1, v0 */
} // :cond_0
/* and-int/lit8 v0, p1, 0x70 */
/* if-nez v0, :cond_1 */
/* or-int/lit8 p1, p1, 0x30 */
/* .line 2 */
} // :cond_1
/* iput p1, p0, Le/f/a/c/p/b;->t:I */
/* const/16 v0, 0x77 */
/* if-ne p1, v0, :cond_2 */
/* .line 3 */
p1 = this.q;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 4 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
/* .line 5 */
v0 = this.q;
(( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 6 */
} // :cond_2
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_3
return;
} // .end method
public Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
/* if-nez v0, :cond_1 */
v0 = this.q;
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
