public abstract class c.b.q.p1 implements c.b.p.o.c0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.reflect.Method G;
	 public static java.lang.reflect.Method H;
	 public static java.lang.reflect.Method I;
	 /* # instance fields */
	 public final c.b.q.k1 A;
	 public final android.os.Handler B;
	 public final android.graphics.Rect C;
	 public android.graphics.Rect D;
	 public Boolean E;
	 public android.widget.PopupWindow F;
	 public android.content.Context b;
	 public android.widget.ListAdapter c;
	 public c.b.q.d1 d;
	 public Integer e;
	 public Integer f;
	 public Integer g;
	 public Integer h;
	 public Integer i;
	 public Boolean j;
	 public Boolean k;
	 public Boolean l;
	 public Integer m;
	 public Boolean n;
	 public Boolean o;
	 public Integer p;
	 public android.view.View q;
	 public Integer r;
	 public android.database.DataSetObserver s;
	 public android.view.View t;
	 public android.graphics.drawable.Drawable u;
	 public android.widget.AdapterView$OnItemClickListener v;
	 public android.widget.AdapterView$OnItemSelectedListener w;
	 public final c.b.q.o1 x;
	 public final c.b.q.n1 y;
	 public final c.b.q.m1 z;
	 /* # direct methods */
	 public static c.b.q.p1 ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 final String v3 = "ListPopupWindow"; // const-string v3, "ListPopupWindow"
		 /* const/16 v4, 0x1c */
		 /* if-gt v0, v4, :cond_0 */
		 /* .line 2 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/widget/PopupWindow; */
			 final String v4 = "setClipToScreenEnabled"; // const-string v4, "setClipToScreenEnabled"
			 /* new-array v5, v2, [Ljava/lang/Class; */
			 v6 = java.lang.Boolean.TYPE;
			 /* aput-object v6, v5, v1 */
			 (( java.lang.Class ) v0 ).getDeclaredMethod ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 final String v0 = "Could not find method setClipToScreenEnabled() on PopupWindow.Oh well."; // const-string v0, "Could not find method setClipToScreenEnabled() on PopupWindow.Oh well."
			 /* .line 3 */
			 android.util.Log .i ( v3,v0 );
			 /* .line 4 */
		 } // :goto_0
		 try { // :try_start_1
			 /* const-class v0, Landroid/widget/PopupWindow; */
			 final String v4 = "setEpicenterBounds"; // const-string v4, "setEpicenterBounds"
			 /* new-array v5, v2, [Ljava/lang/Class; */
			 /* const-class v6, Landroid/graphics/Rect; */
			 /* aput-object v6, v5, v1 */
			 (( java.lang.Class ) v0 ).getDeclaredMethod ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* :try_end_1 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* :catch_1 */
			 final String v0 = "Could not find method setEpicenterBounds(Rect) on PopupWindow.Oh well."; // const-string v0, "Could not find method setEpicenterBounds(Rect) on PopupWindow.Oh well."
			 /* .line 5 */
			 android.util.Log .i ( v3,v0 );
			 /* .line 6 */
		 } // :cond_0
	 } // :goto_1
	 /* const/16 v4, 0x17 */
	 /* if-gt v0, v4, :cond_1 */
	 /* .line 7 */
	 try { // :try_start_2
		 /* const-class v0, Landroid/widget/PopupWindow; */
		 final String v4 = "getMaxAvailableHeight"; // const-string v4, "getMaxAvailableHeight"
		 int v5 = 3; // const/4 v5, 0x3
		 /* new-array v5, v5, [Ljava/lang/Class; */
		 /* const-class v6, Landroid/view/View; */
		 /* aput-object v6, v5, v1 */
		 v1 = java.lang.Integer.TYPE;
		 /* aput-object v1, v5, v2 */
		 int v1 = 2; // const/4 v1, 0x2
		 v2 = java.lang.Boolean.TYPE;
		 /* aput-object v2, v5, v1 */
		 (( java.lang.Class ) v0 ).getDeclaredMethod ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* :try_end_2 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_2 ..:try_end_2} :catch_2 */
		 /* :catch_2 */
		 final String v0 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow.Oh well."; // const-string v0, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow.Oh well."
		 /* .line 8 */
		 android.util.Log .i ( v3,v0 );
	 } // :cond_1
} // :goto_2
return;
} // .end method
public c.b.q.p1 ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, p2, p3, v0}, Lc/b/q/p1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
return;
} // .end method
public c.b.q.p1 ( ) {
/* .locals 3 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = -2; // const/4 v0, -0x2
/* .line 3 */
/* iput v0, p0, Lc/b/q/p1;->e:I */
/* .line 4 */
/* iput v0, p0, Lc/b/q/p1;->f:I */
/* const/16 v0, 0x3ea */
/* .line 5 */
/* iput v0, p0, Lc/b/q/p1;->i:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput v0, p0, Lc/b/q/p1;->m:I */
/* .line 7 */
/* iput-boolean v0, p0, Lc/b/q/p1;->n:Z */
/* .line 8 */
/* iput-boolean v0, p0, Lc/b/q/p1;->o:Z */
/* const v1, 0x7fffffff */
/* .line 9 */
/* iput v1, p0, Lc/b/q/p1;->p:I */
/* .line 10 */
/* iput v0, p0, Lc/b/q/p1;->r:I */
/* .line 11 */
/* new-instance v1, Lc/b/q/o1; */
/* invoke-direct {v1, p0}, Lc/b/q/o1;-><init>(Lc/b/q/p1;)V */
this.x = v1;
/* .line 12 */
/* new-instance v1, Lc/b/q/n1; */
/* invoke-direct {v1, p0}, Lc/b/q/n1;-><init>(Lc/b/q/p1;)V */
this.y = v1;
/* .line 13 */
/* new-instance v1, Lc/b/q/m1; */
/* invoke-direct {v1, p0}, Lc/b/q/m1;-><init>(Lc/b/q/p1;)V */
this.z = v1;
/* .line 14 */
/* new-instance v1, Lc/b/q/k1; */
/* invoke-direct {v1, p0}, Lc/b/q/k1;-><init>(Lc/b/q/p1;)V */
this.A = v1;
/* .line 15 */
/* new-instance v1, Landroid/graphics/Rect; */
/* invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V */
this.C = v1;
/* .line 16 */
this.b = p1;
/* .line 17 */
/* new-instance v1, Landroid/os/Handler; */
(( android.content.Context ) p1 ).getMainLooper ( ); // invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
/* invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
this.B = v1;
/* .line 18 */
v1 = c.b.j.ListPopupWindow;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1, p3, p4 ); // invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 19 */
v2 = (( android.content.res.TypedArray ) v1 ).getDimensionPixelOffset ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
/* iput v2, p0, Lc/b/q/p1;->g:I */
/* .line 20 */
v0 = (( android.content.res.TypedArray ) v1 ).getDimensionPixelOffset ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
/* iput v0, p0, Lc/b/q/p1;->h:I */
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 21 */
	 /* iput-boolean v2, p0, Lc/b/q/p1;->j:Z */
	 /* .line 22 */
} // :cond_0
(( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
/* .line 23 */
/* new-instance v0, Lc/b/q/z; */
/* invoke-direct {v0, p1, p2, p3, p4}, Lc/b/q/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
this.F = v0;
/* .line 24 */
(( android.widget.PopupWindow ) v0 ).setInputMethodMode ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
return;
} // .end method
/* # virtual methods */
public final Integer a ( android.view.View p0, Integer p1, Boolean p2 ) {
/* .locals 5 */
/* .line 53 */
/* const/16 v1, 0x17 */
/* if-gt v0, v1, :cond_1 */
/* .line 54 */
v0 = c.b.q.p1.H;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 55 */
	 try { // :try_start_0
		 v1 = this.F;
		 int v2 = 3; // const/4 v2, 0x3
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object p1, v2, v3 */
		 int v3 = 1; // const/4 v3, 0x1
		 java.lang.Integer .valueOf ( p2 );
		 /* aput-object v4, v2, v3 */
		 int v3 = 2; // const/4 v3, 0x2
		 /* .line 56 */
		 java.lang.Boolean .valueOf ( p3 );
		 /* aput-object p3, v2, v3 */
		 /* .line 57 */
		 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast p3, Ljava/lang/Integer; */
		 p1 = 		 (( java.lang.Integer ) p3 ).intValue ( ); // invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 final String p3 = "ListPopupWindow"; // const-string p3, "ListPopupWindow"
		 final String v0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow.Using the public version."; // const-string v0, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow.Using the public version."
		 /* .line 58 */
		 android.util.Log .i ( p3,v0 );
		 /* .line 59 */
	 } // :cond_0
	 p3 = this.F;
	 p1 = 	 (( android.widget.PopupWindow ) p3 ).getMaxAvailableHeight ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I
	 /* .line 60 */
} // :cond_1
v0 = this.F;
p1 = (( android.widget.PopupWindow ) v0 ).getMaxAvailableHeight ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I
} // .end method
public c.b.q.d1 a ( android.content.Context p0, Boolean p1 ) {
/* .locals 1 */
/* .line 52 */
/* new-instance v0, Lc/b/q/d1; */
/* invoke-direct {v0, p1, p2}, Lc/b/q/d1;-><init>(Landroid/content/Context;Z)V */
} // .end method
public void a ( ) {
/* .locals 13 */
/* .line 16 */
v0 = (( c.b.q.p1 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/b/q/p1;->h()I
/* .line 17 */
v1 = (( c.b.q.p1 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/b/q/p1;->l()Z
/* .line 18 */
v2 = this.F;
/* iget v3, p0, Lc/b/q/p1;->i:I */
c.h.o.n .a ( v2,v3 );
/* .line 19 */
v2 = this.F;
v2 = (( android.widget.PopupWindow ) v2 ).isShowing ( ); // invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z
int v3 = 1; // const/4 v3, 0x1
int v4 = -2; // const/4 v4, -0x2
int v5 = 0; // const/4 v5, 0x0
int v6 = -1; // const/4 v6, -0x1
if ( v2 != null) { // if-eqz v2, :cond_c
	 /* .line 20 */
	 (( c.b.q.p1 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/p1;->j()Landroid/view/View;
	 v2 = 	 c.h.n.v0 .C ( v2 );
	 /* if-nez v2, :cond_0 */
	 return;
	 /* .line 21 */
} // :cond_0
/* iget v2, p0, Lc/b/q/p1;->f:I */
/* if-ne v2, v6, :cond_1 */
int v2 = -1; // const/4 v2, -0x1
} // :cond_1
/* if-ne v2, v4, :cond_2 */
/* .line 22 */
(( c.b.q.p1 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/p1;->j()Landroid/view/View;
v2 = (( android.view.View ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/view/View;->getWidth()I
/* .line 23 */
} // :cond_2
} // :goto_0
/* iget v7, p0, Lc/b/q/p1;->e:I */
/* if-ne v7, v6, :cond_7 */
if ( v1 != null) { // if-eqz v1, :cond_3
} // :cond_3
int v0 = -1; // const/4 v0, -0x1
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 24 */
v1 = this.F;
/* iget v4, p0, Lc/b/q/p1;->f:I */
/* if-ne v4, v6, :cond_4 */
int v4 = -1; // const/4 v4, -0x1
} // :cond_4
int v4 = 0; // const/4 v4, 0x0
} // :goto_2
(( android.widget.PopupWindow ) v1 ).setWidth ( v4 ); // invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setWidth(I)V
/* .line 25 */
v1 = this.F;
(( android.widget.PopupWindow ) v1 ).setHeight ( v5 ); // invoke-virtual {v1, v5}, Landroid/widget/PopupWindow;->setHeight(I)V
/* .line 26 */
} // :cond_5
v1 = this.F;
/* iget v4, p0, Lc/b/q/p1;->f:I */
/* if-ne v4, v6, :cond_6 */
int v4 = -1; // const/4 v4, -0x1
} // :cond_6
int v4 = 0; // const/4 v4, 0x0
} // :goto_3
(( android.widget.PopupWindow ) v1 ).setWidth ( v4 ); // invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setWidth(I)V
/* .line 27 */
v1 = this.F;
(( android.widget.PopupWindow ) v1 ).setHeight ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/PopupWindow;->setHeight(I)V
} // :cond_7
/* if-ne v7, v4, :cond_8 */
} // :cond_8
/* move v0, v7 */
/* .line 28 */
} // :goto_4
v1 = this.F;
/* iget-boolean v4, p0, Lc/b/q/p1;->o:Z */
/* if-nez v4, :cond_9 */
/* iget-boolean v4, p0, Lc/b/q/p1;->n:Z */
/* if-nez v4, :cond_9 */
} // :cond_9
int v3 = 0; // const/4 v3, 0x0
} // :goto_5
(( android.widget.PopupWindow ) v1 ).setOutsideTouchable ( v3 ); // invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
/* .line 29 */
v7 = this.F;
(( c.b.q.p1 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/p1;->j()Landroid/view/View;
/* iget v9, p0, Lc/b/q/p1;->g:I */
/* iget v10, p0, Lc/b/q/p1;->h:I */
/* if-gez v2, :cond_a */
int v11 = -1; // const/4 v11, -0x1
} // :cond_a
/* move v11, v2 */
} // :goto_6
/* if-gez v0, :cond_b */
int v12 = -1; // const/4 v12, -0x1
} // :cond_b
/* move v12, v0 */
} // :goto_7
/* invoke-virtual/range {v7 ..v12}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V */
/* goto/16 :goto_c */
/* .line 30 */
} // :cond_c
/* iget v1, p0, Lc/b/q/p1;->f:I */
/* if-ne v1, v6, :cond_d */
int v1 = -1; // const/4 v1, -0x1
} // :cond_d
/* if-ne v1, v4, :cond_e */
/* .line 31 */
(( c.b.q.p1 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/p1;->j()Landroid/view/View;
v1 = (( android.view.View ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getWidth()I
/* .line 32 */
} // :cond_e
} // :goto_8
/* iget v2, p0, Lc/b/q/p1;->e:I */
/* if-ne v2, v6, :cond_f */
int v0 = -1; // const/4 v0, -0x1
} // :cond_f
/* if-ne v2, v4, :cond_10 */
} // :cond_10
/* move v0, v2 */
/* .line 33 */
} // :goto_9
v2 = this.F;
(( android.widget.PopupWindow ) v2 ).setWidth ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setWidth(I)V
/* .line 34 */
v1 = this.F;
(( android.widget.PopupWindow ) v1 ).setHeight ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V
/* .line 35 */
(( c.b.q.p1 ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Lc/b/q/p1;->c(Z)V
/* .line 36 */
v0 = this.F;
/* iget-boolean v1, p0, Lc/b/q/p1;->o:Z */
/* if-nez v1, :cond_11 */
/* iget-boolean v1, p0, Lc/b/q/p1;->n:Z */
/* if-nez v1, :cond_11 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_11
int v1 = 0; // const/4 v1, 0x0
} // :goto_a
(( android.widget.PopupWindow ) v0 ).setOutsideTouchable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
/* .line 37 */
v0 = this.F;
v1 = this.y;
(( android.widget.PopupWindow ) v0 ).setTouchInterceptor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V
/* .line 38 */
/* iget-boolean v0, p0, Lc/b/q/p1;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_12
/* .line 39 */
v0 = this.F;
/* iget-boolean v1, p0, Lc/b/q/p1;->k:Z */
c.h.o.n .a ( v0,v1 );
/* .line 40 */
} // :cond_12
/* const/16 v1, 0x1c */
/* if-gt v0, v1, :cond_13 */
/* .line 41 */
v0 = c.b.q.p1.I;
if ( v0 != null) { // if-eqz v0, :cond_14
/* .line 42 */
try { // :try_start_0
v1 = this.F;
/* new-array v2, v3, [Ljava/lang/Object; */
v3 = this.D;
/* aput-object v3, v2, v5 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "ListPopupWindow"; // const-string v1, "ListPopupWindow"
final String v2 = "Could not invoke setEpicenterBounds on PopupWindow"; // const-string v2, "Could not invoke setEpicenterBounds on PopupWindow"
/* .line 43 */
android.util.Log .e ( v1,v2,v0 );
/* .line 44 */
} // :cond_13
v0 = this.F;
v1 = this.D;
(( android.widget.PopupWindow ) v0 ).setEpicenterBounds ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setEpicenterBounds(Landroid/graphics/Rect;)V
/* .line 45 */
} // :cond_14
} // :goto_b
v0 = this.F;
(( c.b.q.p1 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/p1;->j()Landroid/view/View;
/* iget v2, p0, Lc/b/q/p1;->g:I */
/* iget v3, p0, Lc/b/q/p1;->h:I */
/* iget v4, p0, Lc/b/q/p1;->m:I */
c.h.o.n .a ( v0,v1,v2,v3,v4 );
/* .line 46 */
v0 = this.d;
(( android.widget.ListView ) v0 ).setSelection ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/ListView;->setSelection(I)V
/* .line 47 */
/* iget-boolean v0, p0, Lc/b/q/p1;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_15
v0 = this.d;
v0 = (( c.b.q.d1 ) v0 ).isInTouchMode ( ); // invoke-virtual {v0}, Lc/b/q/d1;->isInTouchMode()Z
if ( v0 != null) { // if-eqz v0, :cond_16
/* .line 48 */
} // :cond_15
(( c.b.q.p1 ) p0 ).i ( ); // invoke-virtual {p0}, Lc/b/q/p1;->i()V
/* .line 49 */
} // :cond_16
/* iget-boolean v0, p0, Lc/b/q/p1;->E:Z */
/* if-nez v0, :cond_17 */
/* .line 50 */
v0 = this.B;
v1 = this.A;
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // :cond_17
} // :goto_c
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .line 13 */
/* iput p1, p0, Lc/b/q/p1;->g:I */
return;
} // .end method
public void a ( android.graphics.Rect p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 14 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
this.D = v0;
return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 11 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).setBackgroundDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 12 */
this.t = p1;
return;
} // .end method
public void a ( android.widget.AdapterView$OnItemClickListener p0 ) {
/* .locals 0 */
/* .line 15 */
this.v = p1;
return;
} // .end method
public void a ( android.widget.ListAdapter p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.s;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/b/q/l1; */
/* invoke-direct {v0, p0}, Lc/b/q/l1;-><init>(Lc/b/q/p1;)V */
this.s = v0;
/* .line 3 */
} // :cond_0
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
/* .line 5 */
} // :cond_1
} // :goto_0
this.c = p1;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
v0 = this.s;
/* .line 7 */
} // :cond_2
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 8 */
v0 = this.c;
(( android.widget.ListView ) p1 ).setAdapter ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
} // :cond_3
return;
} // .end method
public void a ( android.widget.PopupWindow$OnDismissListener p0 ) {
/* .locals 1 */
/* .line 51 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).setOnDismissListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 9 */
/* iput-boolean p1, p0, Lc/b/q/p1;->E:Z */
/* .line 10 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).setFocusable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/b/q/p1;->h:I */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Lc/b/q/p1;->j:Z */
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lc/b/q/p1;->l:Z */
/* .line 5 */
/* iput-boolean p1, p0, Lc/b/q/p1;->k:Z */
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.F;
v0 = (( android.widget.PopupWindow ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/p1;->g:I */
} // .end method
public final void c ( Boolean p0 ) {
/* .locals 4 */
/* .line 2 */
/* const/16 v1, 0x1c */
/* if-gt v0, v1, :cond_0 */
/* .line 3 */
v0 = c.b.q.p1.G;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
try { // :try_start_0
v1 = this.F;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.lang.Boolean .valueOf ( p1 );
/* aput-object p1, v2, v3 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p1 = "ListPopupWindow"; // const-string p1, "ListPopupWindow"
final String v0 = "Could not call setClipToScreenEnabled() on PopupWindow.Oh well."; // const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow.Oh well."
/* .line 5 */
android.util.Log .i ( p1,v0 );
/* .line 6 */
} // :cond_0
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).setIsClippedToScreen ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setIsClippedToScreen(Z)V
} // :cond_1
} // :goto_0
return;
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 2 */
/* iget-boolean v0, p0, Lc/b/q/p1;->j:Z */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
} // :cond_0
/* iget v0, p0, Lc/b/q/p1;->h:I */
} // .end method
public void d ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).setAnimationStyle ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V
return;
} // .end method
public void dismiss ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
/* .line 2 */
(( c.b.q.p1 ) p0 ).n ( ); // invoke-virtual {p0}, Lc/b/q/p1;->n()V
/* .line 3 */
v0 = this.F;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.PopupWindow ) v0 ).setContentView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
/* .line 4 */
this.d = v1;
/* .line 5 */
v0 = this.B;
v1 = this.x;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
return;
} // .end method
public android.graphics.drawable.Drawable e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
} // .end method
public void e ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v1 = this.C;
(( android.graphics.drawable.Drawable ) v0 ).getPadding ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 4 */
v0 = this.C;
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v1, v0 */
/* add-int/2addr v1, p1 */
/* iput v1, p0, Lc/b/q/p1;->f:I */
/* .line 5 */
} // :cond_0
(( c.b.q.p1 ) p0 ).j ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/p1;->j(I)V
} // :goto_0
return;
} // .end method
public void f ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/b/q/p1;->m:I */
return;
} // .end method
public android.widget.ListView g ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
} // .end method
public void g ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).setInputMethodMode ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
return;
} // .end method
public final Integer h ( ) {
/* .locals 12 */
/* .line 2 */
v0 = this.d;
/* const/high16 v1, -0x80000000 */
int v2 = -1; // const/4 v2, -0x1
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* if-nez v0, :cond_6 */
/* .line 3 */
v0 = this.b;
/* .line 4 */
/* new-instance v5, Lc/b/q/i1; */
/* invoke-direct {v5, p0}, Lc/b/q/i1;-><init>(Lc/b/q/p1;)V */
/* .line 5 */
/* iget-boolean v5, p0, Lc/b/q/p1;->E:Z */
/* xor-int/2addr v5, v3 */
(( c.b.q.p1 ) p0 ).a ( v0, v5 ); // invoke-virtual {p0, v0, v5}, Lc/b/q/p1;->a(Landroid/content/Context;Z)Lc/b/q/d1;
this.d = v5;
/* .line 6 */
v6 = this.u;
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 7 */
(( c.b.q.d1 ) v5 ).setSelector ( v6 ); // invoke-virtual {v5, v6}, Lc/b/q/d1;->setSelector(Landroid/graphics/drawable/Drawable;)V
/* .line 8 */
} // :cond_0
v5 = this.d;
v6 = this.c;
(( android.widget.ListView ) v5 ).setAdapter ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 9 */
v5 = this.d;
v6 = this.v;
(( android.widget.ListView ) v5 ).setOnItemClickListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 10 */
v5 = this.d;
(( android.widget.ListView ) v5 ).setFocusable ( v3 ); // invoke-virtual {v5, v3}, Landroid/widget/ListView;->setFocusable(Z)V
/* .line 11 */
v5 = this.d;
(( android.widget.ListView ) v5 ).setFocusableInTouchMode ( v3 ); // invoke-virtual {v5, v3}, Landroid/widget/ListView;->setFocusableInTouchMode(Z)V
/* .line 12 */
v5 = this.d;
/* new-instance v6, Lc/b/q/j1; */
/* invoke-direct {v6, p0}, Lc/b/q/j1;-><init>(Lc/b/q/p1;)V */
(( android.widget.ListView ) v5 ).setOnItemSelectedListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
/* .line 13 */
v5 = this.d;
v6 = this.z;
(( android.widget.ListView ) v5 ).setOnScrollListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
/* .line 14 */
v5 = this.w;
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 15 */
v6 = this.d;
(( android.widget.ListView ) v6 ).setOnItemSelectedListener ( v5 ); // invoke-virtual {v6, v5}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
/* .line 16 */
} // :cond_1
v5 = this.d;
/* .line 17 */
v6 = this.q;
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 18 */
/* new-instance v7, Landroid/widget/LinearLayout; */
/* invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 19 */
(( android.widget.LinearLayout ) v7 ).setOrientation ( v3 ); // invoke-virtual {v7, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 20 */
/* new-instance v0, Landroid/widget/LinearLayout$LayoutParams; */
/* const/high16 v8, 0x3f800000 # 1.0f */
/* invoke-direct {v0, v2, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
/* .line 21 */
/* iget v8, p0, Lc/b/q/p1;->r:I */
if ( v8 != null) { // if-eqz v8, :cond_3
/* if-eq v8, v3, :cond_2 */
/* .line 22 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Invalid hint position "; // const-string v5, "Invalid hint position "
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v5, p0, Lc/b/q/p1;->r:I */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v5 = "ListPopupWindow"; // const-string v5, "ListPopupWindow"
android.util.Log .e ( v5,v0 );
/* .line 23 */
} // :cond_2
(( android.widget.LinearLayout ) v7 ).addView ( v5, v0 ); // invoke-virtual {v7, v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 24 */
(( android.widget.LinearLayout ) v7 ).addView ( v6 ); // invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 25 */
} // :cond_3
(( android.widget.LinearLayout ) v7 ).addView ( v6 ); // invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 26 */
(( android.widget.LinearLayout ) v7 ).addView ( v5, v0 ); // invoke-virtual {v7, v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 27 */
} // :goto_0
/* iget v0, p0, Lc/b/q/p1;->f:I */
/* if-ltz v0, :cond_4 */
/* const/high16 v5, -0x80000000 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 28 */
} // :goto_1
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v5 );
/* .line 29 */
(( android.view.View ) v6 ).measure ( v0, v4 ); // invoke-virtual {v6, v0, v4}, Landroid/view/View;->measure(II)V
/* .line 30 */
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 31 */
v5 = (( android.view.View ) v6 ).getMeasuredHeight ( ); // invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I
/* iget v6, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v5, v6 */
/* iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v5, v0 */
/* move v0, v5 */
/* move-object v5, v7 */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
/* .line 32 */
} // :goto_2
v6 = this.F;
(( android.widget.PopupWindow ) v6 ).setContentView ( v5 ); // invoke-virtual {v6, v5}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
/* .line 33 */
} // :cond_6
v0 = this.F;
(( android.widget.PopupWindow ) v0 ).getContentView ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 34 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 35 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 36 */
v0 = (( android.view.View ) v0 ).getMeasuredHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
/* iget v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v6 */
/* iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v5 */
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
/* .line 37 */
} // :goto_3
v5 = this.F;
(( android.widget.PopupWindow ) v5 ).getBackground ( ); // invoke-virtual {v5}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 38 */
v6 = this.C;
(( android.graphics.drawable.Drawable ) v5 ).getPadding ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 39 */
v5 = this.C;
/* iget v6, v5, Landroid/graphics/Rect;->top:I */
/* iget v5, v5, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v5, v6 */
/* .line 40 */
/* iget-boolean v7, p0, Lc/b/q/p1;->j:Z */
/* if-nez v7, :cond_9 */
/* neg-int v6, v6 */
/* .line 41 */
/* iput v6, p0, Lc/b/q/p1;->h:I */
/* .line 42 */
} // :cond_8
v5 = this.C;
(( android.graphics.Rect ) v5 ).setEmpty ( ); // invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V
int v5 = 0; // const/4 v5, 0x0
/* .line 43 */
} // :cond_9
} // :goto_4
v6 = this.F;
/* .line 44 */
v6 = (( android.widget.PopupWindow ) v6 ).getInputMethodMode ( ); // invoke-virtual {v6}, Landroid/widget/PopupWindow;->getInputMethodMode()I
int v7 = 2; // const/4 v7, 0x2
/* if-ne v6, v7, :cond_a */
} // :cond_a
int v3 = 0; // const/4 v3, 0x0
/* .line 45 */
} // :goto_5
(( c.b.q.p1 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/b/q/p1;->j()Landroid/view/View;
/* iget v6, p0, Lc/b/q/p1;->h:I */
v3 = (( c.b.q.p1 ) p0 ).a ( v4, v6, v3 ); // invoke-virtual {p0, v4, v6, v3}, Lc/b/q/p1;->a(Landroid/view/View;IZ)I
/* .line 46 */
/* iget-boolean v4, p0, Lc/b/q/p1;->n:Z */
/* if-nez v4, :cond_f */
/* iget v4, p0, Lc/b/q/p1;->e:I */
/* if-ne v4, v2, :cond_b */
/* .line 47 */
} // :cond_b
/* iget v4, p0, Lc/b/q/p1;->f:I */
int v6 = -2; // const/4 v6, -0x2
/* if-eq v4, v6, :cond_d */
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-eq v4, v2, :cond_c */
/* .line 48 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v4,v1 );
/* .line 49 */
} // :cond_c
v2 = this.b;
/* .line 50 */
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I */
v4 = this.C;
/* iget v6, v4, Landroid/graphics/Rect;->left:I */
/* iget v4, v4, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v6, v4 */
/* sub-int/2addr v2, v6 */
/* .line 51 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v1 );
/* .line 52 */
} // :cond_d
v2 = this.b;
/* .line 53 */
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I */
v4 = this.C;
/* iget v6, v4, Landroid/graphics/Rect;->left:I */
/* iget v4, v4, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v6, v4 */
/* sub-int/2addr v2, v6 */
/* .line 54 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v1 );
} // :goto_6
/* move v7, v1 */
/* .line 55 */
v6 = this.d;
int v8 = 0; // const/4 v8, 0x0
int v9 = -1; // const/4 v9, -0x1
/* sub-int v10, v3, v0 */
int v11 = -1; // const/4 v11, -0x1
v1 = /* invoke-virtual/range {v6 ..v11}, Lc/b/q/d1;->a(IIIII)I */
/* if-lez v1, :cond_e */
/* .line 56 */
v2 = this.d;
v2 = (( android.widget.ListView ) v2 ).getPaddingTop ( ); // invoke-virtual {v2}, Landroid/widget/ListView;->getPaddingTop()I
v3 = this.d;
/* .line 57 */
v3 = (( android.widget.ListView ) v3 ).getPaddingBottom ( ); // invoke-virtual {v3}, Landroid/widget/ListView;->getPaddingBottom()I
/* add-int/2addr v2, v3 */
/* add-int/2addr v5, v2 */
/* add-int/2addr v0, v5 */
} // :cond_e
/* add-int/2addr v1, v0 */
} // :cond_f
} // :goto_7
/* add-int/2addr v3, v5 */
} // .end method
public void h ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/b/q/p1;->r:I */
return;
} // .end method
public void i ( ) {
/* .locals 2 */
/* .line 7 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 8 */
(( c.b.q.d1 ) v0 ).setListSelectionHidden ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/d1;->setListSelectionHidden(Z)V
/* .line 9 */
(( android.widget.ListView ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V
} // :cond_0
return;
} // .end method
public void i ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
/* .line 2 */
v1 = (( c.b.q.p1 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/p1;->b()Z
if ( v1 != null) { // if-eqz v1, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
(( c.b.q.d1 ) v0 ).setListSelectionHidden ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/d1;->setListSelectionHidden(Z)V
/* .line 4 */
(( android.widget.ListView ) v0 ).setSelection ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V
/* .line 5 */
v1 = (( android.widget.ListView ) v0 ).getChoiceMode ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getChoiceMode()I
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 6 */
(( android.widget.ListView ) v0 ).setItemChecked ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/widget/ListView;->setItemChecked(IZ)V
} // :cond_0
return;
} // .end method
public android.view.View j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
} // .end method
public void j ( Integer p0 ) {
/* .locals 0 */
/* .line 2 */
/* iput p1, p0, Lc/b/q/p1;->f:I */
return;
} // .end method
public Integer k ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/p1;->f:I */
} // .end method
public Boolean l ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.F;
v0 = (( android.widget.PopupWindow ) v0 ).getInputMethodMode ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean m ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/p1;->E:Z */
} // .end method
public final void n ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 3 */
/* instance-of v1, v0, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 5 */
v1 = this.q;
(( android.view.ViewGroup ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_0
return;
} // .end method
