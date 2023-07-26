public abstract class c.h.o.c implements android.view.View$OnTouchListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer s;
	 /* # instance fields */
	 public final c.h.o.a b;
	 public final android.view.animation.Interpolator c;
	 public final android.view.View d;
	 public java.lang.Runnable e;
	 public f;
	 public g;
	 public Integer h;
	 public Integer i;
	 public j;
	 public k;
	 public l;
	 public Boolean m;
	 public Boolean n;
	 public Boolean o;
	 public Boolean p;
	 public Boolean q;
	 public Boolean r;
	 /* # direct methods */
	 public static c.h.o.c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 android.view.ViewConfiguration .getTapTimeout ( );
		 return;
	 } // .end method
	 public c.h.o.c ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/h/o/a; */
		 /* invoke-direct {v0}, Lc/h/o/a;-><init>()V */
		 this.b = v0;
		 /* .line 3 */
		 /* new-instance v0, Landroid/view/animation/AccelerateInterpolator; */
		 /* invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V */
		 this.c = v0;
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v1, v0, [F */
		 /* .line 4 */
		 /* fill-array-data v1, :array_0 */
		 this.f = v1;
		 /* new-array v1, v0, [F */
		 /* .line 5 */
		 /* fill-array-data v1, :array_1 */
		 this.g = v1;
		 /* new-array v1, v0, [F */
		 /* .line 6 */
		 /* fill-array-data v1, :array_2 */
		 this.j = v1;
		 /* new-array v1, v0, [F */
		 /* .line 7 */
		 /* fill-array-data v1, :array_3 */
		 this.k = v1;
		 /* new-array v0, v0, [F */
		 /* .line 8 */
		 /* fill-array-data v0, :array_4 */
		 this.l = v0;
		 /* .line 9 */
		 this.d = p1;
		 /* .line 10 */
		 android.content.res.Resources .getSystem ( );
		 (( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 11 */
		 /* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
		 /* const v0, 0x44c4e000 # 1575.0f */
		 /* mul-float v0, v0, p1 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* add-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
		 /* const v2, 0x439d8000 # 315.0f */
		 /* mul-float p1, p1, v2 */
		 /* add-float/2addr p1, v1 */
		 /* float-to-int p1, p1 */
		 /* int-to-float v0, v0 */
		 /* .line 12 */
		 (( c.h.o.c ) p0 ).c ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Lc/h/o/c;->c(FF)Lc/h/o/c;
		 /* int-to-float p1, p1 */
		 /* .line 13 */
		 (( c.h.o.c ) p0 ).d ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lc/h/o/c;->d(FF)Lc/h/o/c;
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 14 */
		 (( c.h.o.c ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/h/o/c;->d(I)Lc/h/o/c;
		 /* const p1, 0x7f7fffff # Float.MAX_VALUE */
		 /* .line 15 */
		 (( c.h.o.c ) p0 ).b ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lc/h/o/c;->b(FF)Lc/h/o/c;
		 /* const p1, 0x3e4ccccd # 0.2f */
		 /* .line 16 */
		 (( c.h.o.c ) p0 ).e ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lc/h/o/c;->e(FF)Lc/h/o/c;
		 /* const/high16 p1, 0x3f800000 # 1.0f */
		 /* .line 17 */
		 (( c.h.o.c ) p0 ).f ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lc/h/o/c;->f(FF)Lc/h/o/c;
		 /* .line 18 */
		 (( c.h.o.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/h/o/c;->c(I)Lc/h/o/c;
		 /* const/16 p1, 0x1f4 */
		 /* .line 19 */
		 (( c.h.o.c ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lc/h/o/c;->f(I)Lc/h/o/c;
		 /* .line 20 */
		 (( c.h.o.c ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/h/o/c;->e(I)Lc/h/o/c;
		 return;
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x0 */
		 /* 0x0 */
	 } // .end array-data
	 /* :array_1 */
	 /* .array-data 4 */
	 /* 0x7f7fffff # Float.MAX_VALUE */
	 /* 0x7f7fffff # Float.MAX_VALUE */
} // .end array-data
/* :array_2 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
/* :array_3 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
/* :array_4 */
/* .array-data 4 */
/* 0x7f7fffff # Float.MAX_VALUE */
/* 0x7f7fffff # Float.MAX_VALUE */
} // .end array-data
} // .end method
public static Float a ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* cmpl-float v0, p0, p2 */
/* if-lez v0, :cond_0 */
} // :cond_0
/* cmpg-float p2, p0, p1 */
/* if-gez p2, :cond_1 */
} // :cond_1
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* if-le p0, p2, :cond_0 */
} // :cond_0
/* if-ge p0, p1, :cond_1 */
} // :cond_1
} // .end method
/* # virtual methods */
public final Float a ( Float p0, Float p1 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v1, p2, v0 */
/* if-nez v1, :cond_0 */
/* .line 18 */
} // :cond_0
/* iget v1, p0, Lc/h/o/c;->h:I */
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-eq v1, v2, :cond_2 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq v1, v2, :cond_1 */
} // :cond_1
/* cmpg-float v1, p1, v0 */
/* if-gez v1, :cond_4 */
/* neg-float p2, p2 */
/* div-float/2addr p1, p2 */
} // :cond_2
/* cmpg-float v1, p1, p2 */
/* if-gez v1, :cond_4 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v3, p1, v0 */
/* if-ltz v3, :cond_3 */
/* div-float/2addr p1, p2 */
/* sub-float/2addr v1, p1 */
/* .line 19 */
} // :cond_3
/* iget-boolean p1, p0, Lc/h/o/c;->p:Z */
if ( p1 != null) { // if-eqz p1, :cond_4
/* iget p1, p0, Lc/h/o/c;->h:I */
/* if-ne p1, v2, :cond_4 */
} // :cond_4
} // :goto_0
} // .end method
public final Float a ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 1 */
/* mul-float p1, p1, p2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 12 */
p1 = c.h.o.c .a ( p1,v0,p3 );
/* .line 13 */
p3 = (( c.h.o.c ) p0 ).a ( p4, p1 ); // invoke-virtual {p0, p4, p1}, Lc/h/o/c;->a(FF)F
/* sub-float/2addr p2, p4 */
/* .line 14 */
p1 = (( c.h.o.c ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lc/h/o/c;->a(FF)F
/* sub-float/2addr p1, p3 */
/* cmpg-float p2, p1, v0 */
/* if-gez p2, :cond_0 */
/* .line 15 */
p2 = this.c;
p1 = /* neg-float p1, p1 */
/* neg-float p1, p1 */
} // :cond_0
/* cmpl-float p2, p1, v0 */
/* if-lez p2, :cond_1 */
/* .line 16 */
p1 = p2 = this.c;
} // :goto_0
/* const/high16 p2, -0x40800000 # -1.0f */
/* const/high16 p3, 0x3f800000 # 1.0f */
/* .line 17 */
p1 = c.h.o.c .a ( p1,p2,p3 );
} // :cond_1
} // .end method
public final Float a ( Integer p0, Float p1, Float p2, Float p3 ) {
/* .locals 3 */
/* .line 4 */
v0 = this.f;
/* aget v0, v0, p1 */
/* .line 5 */
v1 = this.g;
/* aget v1, v1, p1 */
/* .line 6 */
p2 = (( c.h.o.c ) p0 ).a ( v0, p3, v1, p2 ); // invoke-virtual {p0, v0, p3, v1, p2}, Lc/h/o/c;->a(FFFF)F
int p3 = 0; // const/4 p3, 0x0
/* cmpl-float v0, p2, p3 */
/* if-nez v0, :cond_0 */
/* .line 7 */
} // :cond_0
p3 = this.j;
/* aget p3, p3, p1 */
/* .line 8 */
v1 = this.k;
/* aget v1, v1, p1 */
/* .line 9 */
v2 = this.l;
/* aget p1, v2, p1 */
/* mul-float p3, p3, p4 */
/* if-lez v0, :cond_1 */
/* mul-float p2, p2, p3 */
/* .line 10 */
p1 = c.h.o.c .a ( p2,v1,p1 );
} // :cond_1
/* neg-float p2, p2 */
/* mul-float p2, p2, p3 */
/* .line 11 */
p1 = c.h.o.c .a ( p2,v1,p1 );
/* neg-float p1, p1 */
} // .end method
public c.h.o.c a ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/h/o/c;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez p1, :cond_0 */
/* .line 2 */
(( c.h.o.c ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/o/c;->b()V
/* .line 3 */
} // :cond_0
/* iput-boolean p1, p0, Lc/h/o/c;->q:Z */
} // .end method
public void a ( ) {
/* .locals 8 */
/* .line 20 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v2 */
int v4 = 3; // const/4 v4, 0x3
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move-wide v0, v2 */
/* .line 21 */
/* invoke-static/range {v0 ..v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
/* .line 22 */
v1 = this.d;
(( android.view.View ) v1 ).onTouchEvent ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 23 */
(( android.view.MotionEvent ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V
return;
} // .end method
public abstract void a ( Integer p0, Integer p1 ) {
} // .end method
public abstract Boolean a ( Integer p0 ) {
} // .end method
public c.h.o.c b ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* aput p2, v0, p1 */
} // .end method
public final void b ( ) {
/* .locals 1 */
/* .line 3 */
/* iget-boolean v0, p0, Lc/h/o/c;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Lc/h/o/c;->p:Z */
/* .line 5 */
} // :cond_0
v0 = this.b;
(( c.h.o.a ) v0 ).g ( ); // invoke-virtual {v0}, Lc/h/o/a;->g()V
} // :goto_0
return;
} // .end method
public abstract Boolean b ( Integer p0 ) {
} // .end method
public c.h.o.c c ( Float p0, Float p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.l;
/* const/high16 v1, 0x447a0000 # 1000.0f */
/* div-float/2addr p1, v1 */
int v2 = 0; // const/4 v2, 0x0
/* aput p1, v0, v2 */
/* div-float/2addr p2, v1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* aput p2, v0, p1 */
} // .end method
public c.h.o.c c ( Integer p0 ) {
/* .locals 0 */
/* .line 3 */
/* iput p1, p0, Lc/h/o/c;->i:I */
} // .end method
public Boolean c ( ) {
/* .locals 2 */
/* .line 4 */
v0 = this.b;
/* .line 5 */
v1 = (( c.h.o.a ) v0 ).e ( ); // invoke-virtual {v0}, Lc/h/o/a;->e()I
/* .line 6 */
v0 = (( c.h.o.a ) v0 ).d ( ); // invoke-virtual {v0}, Lc/h/o/a;->d()I
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
v1 = (( c.h.o.c ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lc/h/o/c;->b(I)Z
/* if-nez v1, :cond_1 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
v0 = (( c.h.o.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/o/c;->a(I)Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public c.h.o.c d ( Float p0, Float p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.k;
/* const/high16 v1, 0x447a0000 # 1000.0f */
/* div-float/2addr p1, v1 */
int v2 = 0; // const/4 v2, 0x0
/* aput p1, v0, v2 */
/* div-float/2addr p2, v1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* aput p2, v0, p1 */
} // .end method
public c.h.o.c d ( Integer p0 ) {
/* .locals 0 */
/* .line 3 */
/* iput p1, p0, Lc/h/o/c;->h:I */
} // .end method
public final void d ( ) {
/* .locals 6 */
/* .line 4 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 5 */
/* new-instance v0, Lc/h/o/b; */
/* invoke-direct {v0, p0}, Lc/h/o/b;-><init>(Lc/h/o/c;)V */
this.e = v0;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
/* iput-boolean v0, p0, Lc/h/o/c;->p:Z */
/* .line 7 */
/* iput-boolean v0, p0, Lc/h/o/c;->n:Z */
/* .line 8 */
/* iget-boolean v1, p0, Lc/h/o/c;->m:Z */
/* if-nez v1, :cond_1 */
/* iget v1, p0, Lc/h/o/c;->i:I */
/* if-lez v1, :cond_1 */
/* .line 9 */
v2 = this.d;
v3 = this.e;
/* int-to-long v4, v1 */
c.h.n.v0 .a ( v2,v3,v4,v5 );
/* .line 10 */
} // :cond_1
v1 = this.e;
/* .line 11 */
} // :goto_0
/* iput-boolean v0, p0, Lc/h/o/c;->m:Z */
return;
} // .end method
public c.h.o.c e ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* aput p2, v0, p1 */
} // .end method
public c.h.o.c e ( Integer p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.b;
(( c.h.o.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/h/o/a;->a(I)V
} // .end method
public c.h.o.c f ( Float p0, Float p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.j;
/* const/high16 v1, 0x447a0000 # 1000.0f */
/* div-float/2addr p1, v1 */
int v2 = 0; // const/4 v2, 0x0
/* aput p1, v0, v2 */
/* div-float/2addr p2, v1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* aput p2, v0, p1 */
} // .end method
public c.h.o.c f ( Integer p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.b;
(( c.h.o.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/h/o/a;->b(I)V
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 5 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/h/o/c;->q:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p2 ).getActionMasked ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-eq v0, v2, :cond_1 */
int v3 = 2; // const/4 v3, 0x2
/* if-eq v0, v3, :cond_3 */
int p1 = 3; // const/4 p1, 0x3
/* if-eq v0, p1, :cond_1 */
/* .line 3 */
} // :cond_1
(( c.h.o.c ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/o/c;->b()V
/* .line 4 */
} // :cond_2
/* iput-boolean v2, p0, Lc/h/o/c;->o:Z */
/* .line 5 */
/* iput-boolean v1, p0, Lc/h/o/c;->m:Z */
/* .line 6 */
} // :cond_3
v0 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
v3 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* int-to-float v3, v3 */
v4 = this.d;
v4 = (( android.view.View ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getWidth()I
/* int-to-float v4, v4 */
/* .line 7 */
v0 = (( c.h.o.c ) p0 ).a ( v1, v0, v3, v4 ); // invoke-virtual {p0, v1, v0, v3, v4}, Lc/h/o/c;->a(IFFF)F
/* .line 8 */
p2 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
p1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* int-to-float p1, p1 */
v3 = this.d;
v3 = (( android.view.View ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getHeight()I
/* int-to-float v3, v3 */
/* .line 9 */
p1 = (( c.h.o.c ) p0 ).a ( v2, p2, p1, v3 ); // invoke-virtual {p0, v2, p2, p1, v3}, Lc/h/o/c;->a(IFFF)F
/* .line 10 */
p2 = this.b;
(( c.h.o.a ) p2 ).a ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lc/h/o/a;->a(FF)V
/* .line 11 */
/* iget-boolean p1, p0, Lc/h/o/c;->p:Z */
/* if-nez p1, :cond_4 */
p1 = (( c.h.o.c ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/o/c;->c()Z
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 12 */
(( c.h.o.c ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/o/c;->d()V
/* .line 13 */
} // :cond_4
} // :goto_0
/* iget-boolean p1, p0, Lc/h/o/c;->r:Z */
if ( p1 != null) { // if-eqz p1, :cond_5
/* iget-boolean p1, p0, Lc/h/o/c;->p:Z */
if ( p1 != null) { // if-eqz p1, :cond_5
int v1 = 1; // const/4 v1, 0x1
} // :cond_5
} // .end method
