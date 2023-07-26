public class c.b.q.d1 extends android.widget.ListView {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.graphics.Rect b;
	 public Integer c;
	 public Integer d;
	 public Integer e;
	 public Integer f;
	 public Integer g;
	 public java.lang.reflect.Field h;
	 public c.b.q.b1 i;
	 public Boolean j;
	 public Boolean k;
	 public Boolean l;
	 public c.h.n.c1 m;
	 public c.h.o.i n;
	 public c.b.q.c1 o;
	 /* # direct methods */
	 public c.b.q.d1 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1, v1, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 2 */
		 /* new-instance p1, Landroid/graphics/Rect; */
		 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
		 this.b = p1;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 3 */
		 /* iput p1, p0, Lc/b/q/d1;->c:I */
		 /* .line 4 */
		 /* iput p1, p0, Lc/b/q/d1;->d:I */
		 /* .line 5 */
		 /* iput p1, p0, Lc/b/q/d1;->e:I */
		 /* .line 6 */
		 /* iput p1, p0, Lc/b/q/d1;->f:I */
		 /* .line 7 */
		 /* iput-boolean p2, p0, Lc/b/q/d1;->k:Z */
		 /* .line 8 */
		 (( android.widget.ListView ) p0 ).setCacheColorHint ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ListView;->setCacheColorHint(I)V
		 /* .line 9 */
		 try { // :try_start_0
			 /* const-class p1, Landroid/widget/AbsListView; */
			 final String p2 = "mIsChildViewEnabled"; // const-string p2, "mIsChildViewEnabled"
			 (( java.lang.Class ) p1 ).getDeclaredField ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 this.h = p1;
			 int p2 = 1; // const/4 p2, 0x1
			 /* .line 10 */
			 (( java.lang.reflect.Field ) p1 ).setAccessible ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 11 */
			 (( java.lang.NoSuchFieldException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/NoSuchFieldException;->printStackTrace()V
		 } // :goto_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 10 */
		 /* .line 1 */
		 p2 = 		 (( android.widget.ListView ) p0 ).getListPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingTop()I
		 /* .line 2 */
		 p3 = 		 (( android.widget.ListView ) p0 ).getListPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingBottom()I
		 /* .line 3 */
		 (( android.widget.ListView ) p0 ).getListPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingLeft()I
		 /* .line 4 */
		 (( android.widget.ListView ) p0 ).getListPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingRight()I
		 /* .line 5 */
		 v0 = 		 (( android.widget.ListView ) p0 ).getDividerHeight ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getDividerHeight()I
		 /* .line 6 */
		 (( android.widget.ListView ) p0 ).getDivider ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getDivider()Landroid/graphics/drawable/Drawable;
		 /* .line 7 */
		 (( android.widget.ListView ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
		 /* if-nez v2, :cond_0 */
		 /* add-int/2addr p2, p3 */
	 } // :cond_0
	 /* add-int/2addr p2, p3 */
	 int p3 = 0; // const/4 p3, 0x0
	 /* if-lez v0, :cond_1 */
	 if ( v1 != null) { // if-eqz v1, :cond_1
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 8 */
v1 = } // :goto_0
int v3 = 0; // const/4 v3, 0x0
/* move-object v6, v3 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
/* if-ge v4, v1, :cond_9 */
v8 = /* .line 9 */
/* if-eq v8, v5, :cond_2 */
/* move-object v6, v3 */
/* move v5, v8 */
/* .line 10 */
} // :cond_2
/* .line 11 */
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v8, :cond_3 */
/* .line 12 */
(( android.widget.ListView ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 13 */
(( android.view.View ) v6 ).setLayoutParams ( v8 ); // invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 14 */
} // :cond_3
/* iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-lez v8, :cond_4 */
/* const/high16 v9, 0x40000000 # 2.0f */
/* .line 15 */
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( v8,v9 );
/* .line 16 */
} // :cond_4
v8 = android.view.View$MeasureSpec .makeMeasureSpec ( p3,p3 );
/* .line 17 */
} // :goto_2
(( android.view.View ) v6 ).measure ( p1, v8 ); // invoke-virtual {v6, p1, v8}, Landroid/view/View;->measure(II)V
/* .line 18 */
(( android.view.View ) v6 ).forceLayout ( ); // invoke-virtual {v6}, Landroid/view/View;->forceLayout()V
/* if-lez v4, :cond_5 */
/* add-int/2addr p2, v0 */
/* .line 19 */
} // :cond_5
v8 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr p2, v8 */
/* if-lt p2, p4, :cond_7 */
/* if-ltz p5, :cond_6 */
/* if-le v4, p5, :cond_6 */
/* if-lez v7, :cond_6 */
/* if-eq p2, p4, :cond_6 */
/* move p4, v7 */
} // :cond_6
} // :cond_7
/* if-ltz p5, :cond_8 */
/* if-lt v4, p5, :cond_8 */
/* move v7, p2 */
} // :cond_8
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_9
} // .end method
public final void a ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 57 */
/* iput-boolean v0, p0, Lc/b/q/d1;->l:Z */
/* .line 58 */
(( android.widget.ListView ) p0 ).setPressed ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/ListView;->setPressed(Z)V
/* .line 59 */
(( c.b.q.d1 ) p0 ).drawableStateChanged ( ); // invoke-virtual {p0}, Lc/b/q/d1;->drawableStateChanged()V
/* .line 60 */
/* iget v1, p0, Lc/b/q/d1;->g:I */
v2 = (( android.widget.ListView ) p0 ).getFirstVisiblePosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
/* sub-int/2addr v1, v2 */
(( android.widget.ListView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 61 */
(( android.view.View ) v1 ).setPressed ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->setPressed(Z)V
/* .line 62 */
} // :cond_0
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 63 */
(( c.h.n.c1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/n/c1;->a()V
int v0 = 0; // const/4 v0, 0x0
/* .line 64 */
this.m = v0;
} // :cond_1
return;
} // .end method
public final void a ( Integer p0, android.view.View p1 ) {
/* .locals 5 */
/* .line 46 */
v0 = this.b;
/* .line 47 */
v1 = (( android.view.View ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/view/View;->getLeft()I
v2 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
v3 = (( android.view.View ) p2 ).getRight ( ); // invoke-virtual {p2}, Landroid/view/View;->getRight()I
v4 = (( android.view.View ) p2 ).getBottom ( ); // invoke-virtual {p2}, Landroid/view/View;->getBottom()I
(( android.graphics.Rect ) v0 ).set ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V
/* .line 48 */
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* iget v2, p0, Lc/b/q/d1;->c:I */
/* sub-int/2addr v1, v2 */
/* iput v1, v0, Landroid/graphics/Rect;->left:I */
/* .line 49 */
/* iget v1, v0, Landroid/graphics/Rect;->top:I */
/* iget v2, p0, Lc/b/q/d1;->d:I */
/* sub-int/2addr v1, v2 */
/* iput v1, v0, Landroid/graphics/Rect;->top:I */
/* .line 50 */
/* iget v1, v0, Landroid/graphics/Rect;->right:I */
/* iget v2, p0, Lc/b/q/d1;->e:I */
/* add-int/2addr v1, v2 */
/* iput v1, v0, Landroid/graphics/Rect;->right:I */
/* .line 51 */
/* iget v1, v0, Landroid/graphics/Rect;->bottom:I */
/* iget v2, p0, Lc/b/q/d1;->f:I */
/* add-int/2addr v1, v2 */
/* iput v1, v0, Landroid/graphics/Rect;->bottom:I */
/* .line 52 */
try { // :try_start_0
v0 = this.h;
v0 = (( java.lang.reflect.Field ) v0 ).getBoolean ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
/* .line 53 */
p2 = (( android.view.View ) p2 ).isEnabled ( ); // invoke-virtual {p2}, Landroid/view/View;->isEnabled()Z
/* if-eq p2, v0, :cond_1 */
/* .line 54 */
p2 = this.h;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
java.lang.Boolean .valueOf ( v0 );
(( java.lang.reflect.Field ) p2 ).set ( p0, v0 ); // invoke-virtual {p2, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
int p2 = -1; // const/4 p2, -0x1
/* if-eq p1, p2, :cond_1 */
/* .line 55 */
(( android.widget.ListView ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->refreshDrawableState()V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 56 */
(( java.lang.IllegalAccessException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->printStackTrace()V
} // :cond_1
} // :goto_1
return;
} // .end method
public final void a ( Integer p0, android.view.View p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .line 43 */
(( c.b.q.d1 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/q/d1;->b(ILandroid/view/View;)V
/* .line 44 */
(( android.widget.ListView ) p0 ).getSelector ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_0
int v0 = -1; // const/4 v0, -0x1
/* if-eq p1, v0, :cond_0 */
/* .line 45 */
c.h.g.r.a .a ( p2,p3,p4 );
} // :cond_0
return;
} // .end method
public final void a ( android.graphics.Canvas p0 ) {
/* .locals 2 */
/* .line 39 */
v0 = this.b;
v0 = (( android.graphics.Rect ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 40 */
(( android.widget.ListView ) p0 ).getSelector ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 41 */
v1 = this.b;
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
/* .line 42 */
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_0
return;
} // .end method
public final void a ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
/* .line 37 */
(( android.widget.ListView ) p0 ).getItemIdAtPosition ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/ListView;->getItemIdAtPosition(I)J
/* move-result-wide v0 */
/* .line 38 */
(( android.widget.ListView ) p0 ).performItemClick ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Landroid/widget/ListView;->performItemClick(Landroid/view/View;IJ)Z
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Float p2, Float p3 ) {
/* .locals 6 */
int v0 = 1; // const/4 v0, 0x1
/* .line 65 */
/* iput-boolean v0, p0, Lc/b/q/d1;->l:Z */
/* .line 66 */
/* const/16 v2, 0x15 */
/* if-lt v1, v2, :cond_0 */
/* .line 67 */
(( android.widget.ListView ) p0 ).drawableHotspotChanged ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Landroid/widget/ListView;->drawableHotspotChanged(FF)V
/* .line 68 */
} // :cond_0
v1 = (( android.widget.ListView ) p0 ).isPressed ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->isPressed()Z
/* if-nez v1, :cond_1 */
/* .line 69 */
(( android.widget.ListView ) p0 ).setPressed ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/ListView;->setPressed(Z)V
/* .line 70 */
} // :cond_1
(( android.widget.ListView ) p0 ).layoutChildren ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->layoutChildren()V
/* .line 71 */
/* iget v1, p0, Lc/b/q/d1;->g:I */
int v3 = -1; // const/4 v3, -0x1
int v4 = 0; // const/4 v4, 0x0
/* if-eq v1, v3, :cond_2 */
/* .line 72 */
v3 = (( android.widget.ListView ) p0 ).getFirstVisiblePosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
/* sub-int/2addr v1, v3 */
(( android.widget.ListView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-eq v1, p1, :cond_2 */
/* .line 73 */
v3 = (( android.view.View ) v1 ).isPressed ( ); // invoke-virtual {v1}, Landroid/view/View;->isPressed()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 74 */
(( android.view.View ) v1 ).setPressed ( v4 ); // invoke-virtual {v1, v4}, Landroid/view/View;->setPressed(Z)V
/* .line 75 */
} // :cond_2
/* iput p2, p0, Lc/b/q/d1;->g:I */
/* .line 76 */
v1 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* int-to-float v1, v1 */
/* sub-float v1, p3, v1 */
/* .line 77 */
v3 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* int-to-float v3, v3 */
/* sub-float v3, p4, v3 */
/* .line 78 */
/* if-lt v5, v2, :cond_3 */
/* .line 79 */
(( android.view.View ) p1 ).drawableHotspotChanged ( v1, v3 ); // invoke-virtual {p1, v1, v3}, Landroid/view/View;->drawableHotspotChanged(FF)V
/* .line 80 */
} // :cond_3
v1 = (( android.view.View ) p1 ).isPressed ( ); // invoke-virtual {p1}, Landroid/view/View;->isPressed()Z
/* if-nez v1, :cond_4 */
/* .line 81 */
(( android.view.View ) p1 ).setPressed ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V
/* .line 82 */
} // :cond_4
(( c.b.q.d1 ) p0 ).a ( p2, p1, p3, p4 ); // invoke-virtual {p0, p2, p1, p3, p4}, Lc/b/q/d1;->a(ILandroid/view/View;FF)V
/* .line 83 */
(( c.b.q.d1 ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Lc/b/q/d1;->a(Z)V
/* .line 84 */
(( android.widget.ListView ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->refreshDrawableState()V
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 20 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 21 */
(( c.b.q.b1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/b1;->a(Z)V
} // :cond_0
return;
} // .end method
public Boolean a ( android.view.MotionEvent p0, Integer p1 ) {
/* .locals 7 */
/* .line 22 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, v2, :cond_3 */
int v3 = 2; // const/4 v3, 0x2
/* if-eq v0, v3, :cond_2 */
int p2 = 3; // const/4 p2, 0x3
/* if-eq v0, p2, :cond_1 */
} // :cond_0
} // :goto_0
int p2 = 0; // const/4 p2, 0x0
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
} // :goto_1
int p2 = 0; // const/4 p2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :cond_2
int v3 = 1; // const/4 v3, 0x1
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
/* .line 23 */
} // :goto_2
p2 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez p2, :cond_4 */
/* .line 24 */
} // :cond_4
v4 = (( android.view.MotionEvent ) p1 ).getX ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F
/* float-to-int v4, v4 */
/* .line 25 */
p2 = (( android.view.MotionEvent ) p1 ).getY ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int p2, p2 */
/* .line 26 */
v5 = (( android.widget.ListView ) p0 ).pointToPosition ( v4, p2 ); // invoke-virtual {p0, v4, p2}, Landroid/widget/ListView;->pointToPosition(II)I
int v6 = -1; // const/4 v6, -0x1
/* if-ne v5, v6, :cond_5 */
int p2 = 1; // const/4 p2, 0x1
/* .line 27 */
} // :cond_5
v3 = (( android.widget.ListView ) p0 ).getFirstVisiblePosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
/* sub-int v3, v5, v3 */
(( android.widget.ListView ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
/* int-to-float v4, v4 */
/* int-to-float p2, p2 */
/* .line 28 */
(( c.b.q.d1 ) p0 ).a ( v3, v5, v4, p2 ); // invoke-virtual {p0, v3, v5, v4, p2}, Lc/b/q/d1;->a(Landroid/view/View;IFF)V
/* if-ne v0, v2, :cond_0 */
/* .line 29 */
(( c.b.q.d1 ) p0 ).a ( v3, v5 ); // invoke-virtual {p0, v3, v5}, Lc/b/q/d1;->a(Landroid/view/View;I)V
} // :goto_3
if ( v3 != null) { // if-eqz v3, :cond_6
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 30 */
} // :cond_6
(( c.b.q.d1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/d1;->a()V
} // :cond_7
if ( v3 != null) { // if-eqz v3, :cond_9
/* .line 31 */
p2 = this.n;
/* if-nez p2, :cond_8 */
/* .line 32 */
/* new-instance p2, Lc/h/o/i; */
/* invoke-direct {p2, p0}, Lc/h/o/i;-><init>(Landroid/widget/ListView;)V */
this.n = p2;
/* .line 33 */
} // :cond_8
p2 = this.n;
(( c.h.o.c ) p2 ).a ( v2 ); // invoke-virtual {p2, v2}, Lc/h/o/c;->a(Z)Lc/h/o/c;
/* .line 34 */
p2 = this.n;
(( c.h.o.c ) p2 ).onTouch ( p0, p1 ); // invoke-virtual {p2, p0, p1}, Lc/h/o/c;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
/* .line 35 */
} // :cond_9
p1 = this.n;
if ( p1 != null) { // if-eqz p1, :cond_a
/* .line 36 */
(( c.h.o.c ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/h/o/c;->a(Z)Lc/h/o/c;
} // :cond_a
} // :goto_4
} // .end method
public final void b ( Integer p0, android.view.View p1 ) {
/* .locals 4 */
/* .line 1 */
(( android.widget.ListView ) p0 ).getSelector ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
int v3 = -1; // const/4 v3, -0x1
/* if-eq p1, v3, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setVisible ( v2, v2 ); // invoke-virtual {v0, v2, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 3 */
} // :cond_1
(( c.b.q.d1 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/q/d1;->a(ILandroid/view/View;)V
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 4 */
p1 = this.b;
/* .line 5 */
p2 = (( android.graphics.Rect ) p1 ).exactCenterX ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterX()F
/* .line 6 */
p1 = (( android.graphics.Rect ) p1 ).exactCenterY ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterY()F
/* .line 7 */
v3 = (( android.widget.ListView ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getVisibility()I
/* if-nez v3, :cond_2 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
(( android.graphics.drawable.Drawable ) v0 ).setVisible ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 8 */
c.h.g.r.a .a ( v0,p2,p1 );
} // :cond_3
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
/* .line 9 */
/* iget-boolean v0, p0, Lc/b/q/d1;->l:Z */
} // .end method
public final void c ( ) {
/* .locals 2 */
/* .line 1 */
(( android.widget.ListView ) p0 ).getSelector ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = (( c.b.q.d1 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/d1;->b()Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( android.widget.ListView ) p0 ).isPressed ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->isPressed()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( android.widget.ListView ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_0
return;
} // .end method
public void dispatchDraw ( android.graphics.Canvas p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.b.q.d1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/d1;->a(Landroid/graphics/Canvas;)V
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V */
return;
} // .end method
public void drawableStateChanged ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
(( c.b.q.d1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/d1;->a(Z)V
/* .line 4 */
(( c.b.q.d1 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/d1;->c()V
return;
} // .end method
public Boolean hasFocus ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/d1;->k:Z */
/* if-nez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean hasWindowFocus ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/d1;->k:Z */
/* if-nez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean isFocused ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/d1;->k:Z */
/* if-nez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean isInTouchMode ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/d1;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lc/b/q/d1;->j:Z */
/* if-nez v0, :cond_1 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z */
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.o = v0;
/* .line 2 */
/* invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V */
return;
} // .end method
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
/* .line 1 */
/* const/16 v1, 0x1a */
/* if-ge v0, v1, :cond_0 */
/* .line 2 */
p1 = /* invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z */
/* .line 3 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_1 */
/* .line 4 */
v1 = this.o;
/* if-nez v1, :cond_1 */
/* .line 5 */
/* new-instance v1, Lc/b/q/c1; */
/* invoke-direct {v1, p0}, Lc/b/q/c1;-><init>(Lc/b/q/d1;)V */
this.o = v1;
/* .line 6 */
(( c.b.q.c1 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/b/q/c1;->b()V
/* .line 7 */
} // :cond_1
v1 = /* invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z */
/* const/16 v2, 0x9 */
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v2, :cond_3 */
int v2 = 7; // const/4 v2, 0x7
/* if-ne v0, v2, :cond_2 */
/* .line 8 */
} // :cond_2
(( android.widget.ListView ) p0 ).setSelection ( v3 ); // invoke-virtual {p0, v3}, Landroid/widget/ListView;->setSelection(I)V
/* .line 9 */
} // :cond_3
} // :goto_0
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int p1, p1 */
p1 = (( android.widget.ListView ) p0 ).pointToPosition ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/widget/ListView;->pointToPosition(II)I
/* if-eq p1, v3, :cond_5 */
/* .line 10 */
v0 = (( android.widget.ListView ) p0 ).getSelectedItemPosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelectedItemPosition()I
/* if-eq p1, v0, :cond_5 */
/* .line 11 */
v0 = (( android.widget.ListView ) p0 ).getFirstVisiblePosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
/* sub-int v0, p1, v0 */
(( android.widget.ListView ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
/* .line 12 */
v2 = (( android.view.View ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 13 */
v0 = (( android.view.View ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/view/View;->getTop()I
v2 = (( android.widget.ListView ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getTop()I
/* sub-int/2addr v0, v2 */
(( android.widget.ListView ) p0 ).setSelectionFromTop ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/widget/ListView;->setSelectionFromTop(II)V
/* .line 14 */
} // :cond_4
(( c.b.q.d1 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/d1;->c()V
} // :cond_5
} // :goto_1
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v1, v1 */
v0 = (( android.widget.ListView ) p0 ).pointToPosition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/widget/ListView;->pointToPosition(II)I
/* iput v0, p0, Lc/b/q/d1;->g:I */
/* .line 3 */
} // :goto_0
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( c.b.q.c1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/c1;->a()V
/* .line 5 */
} // :cond_1
p1 = /* invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setListSelectionHidden ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lc/b/q/d1;->j:Z */
return;
} // .end method
public void setSelector ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
/* new-instance v0, Lc/b/q/b1; */
/* invoke-direct {v0, p1}, Lc/b/q/b1;-><init>(Landroid/graphics/drawable/Drawable;)V */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
this.i = v0;
/* .line 2 */
/* invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V */
/* .line 3 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.graphics.drawable.Drawable ) p1 ).getPadding ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 5 */
} // :cond_1
/* iget p1, v0, Landroid/graphics/Rect;->left:I */
/* iput p1, p0, Lc/b/q/d1;->c:I */
/* .line 6 */
/* iget p1, v0, Landroid/graphics/Rect;->top:I */
/* iput p1, p0, Lc/b/q/d1;->d:I */
/* .line 7 */
/* iget p1, v0, Landroid/graphics/Rect;->right:I */
/* iput p1, p0, Lc/b/q/d1;->e:I */
/* .line 8 */
/* iget p1, v0, Landroid/graphics/Rect;->bottom:I */
/* iput p1, p0, Lc/b/q/d1;->f:I */
return;
} // .end method
