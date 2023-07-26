public abstract class c.b.q.g2 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.ThreadLocal a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal<", */
	 /* "Landroid/util/TypedValue;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final b;
public static final c;
public static final d;
public static final e;
public static final f;
public static final g;
/* # direct methods */
public static c.b.q.g2 ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* new-array v1, v0, [I */
/* const v2, -0x101009e */
int v3 = 0; // const/4 v3, 0x0
/* aput v2, v1, v3 */
/* .line 2 */
/* new-array v1, v0, [I */
/* const v2, 0x101009c */
/* aput v2, v1, v3 */
/* .line 3 */
/* new-array v1, v0, [I */
/* const v2, 0x10100a7 */
/* aput v2, v1, v3 */
/* .line 4 */
/* new-array v1, v0, [I */
/* const v2, 0x10100a0 */
/* aput v2, v1, v3 */
/* .line 5 */
/* new-array v1, v3, [I */
/* .line 6 */
/* new-array v0, v0, [I */
/* .line 7 */
return;
} // .end method
public static Integer a ( android.content.Context p0, Integer p1 ) {
/* .locals 4 */
/* .line 1 */
c.b.q.g2 .c ( p0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 v1 = 	 (( android.content.res.ColorStateList ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 p0 = c.b.q.g2.b;
		 p1 = 		 (( android.content.res.ColorStateList ) v0 ).getDefaultColor ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I
		 p0 = 		 (( android.content.res.ColorStateList ) v0 ).getColorForState ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/ColorStateList;->getColorForState([II)I
		 /* .line 4 */
	 } // :cond_0
	 c.b.q.g2 .a ( );
	 /* .line 5 */
	 (( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
	 /* const v2, 0x1010033 */
	 int v3 = 1; // const/4 v3, 0x1
	 (( android.content.res.Resources$Theme ) v1 ).resolveAttribute ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
	 /* .line 6 */
	 v0 = 	 (( android.util.TypedValue ) v0 ).getFloat ( ); // invoke-virtual {v0}, Landroid/util/TypedValue;->getFloat()F
	 /* .line 7 */
	 p0 = 	 c.b.q.g2 .a ( p0,p1,v0 );
} // .end method
public static Integer a ( android.content.Context p0, Integer p1, Float p2 ) {
	 /* .locals 0 */
	 /* .line 11 */
	 p0 = 	 c.b.q.g2 .b ( p0,p1 );
	 /* .line 12 */
	 p1 = 	 android.graphics.Color .alpha ( p0 );
	 /* int-to-float p1, p1 */
	 /* mul-float p1, p1, p2 */
	 /* .line 13 */
	 p1 = 	 java.lang.Math .round ( p1 );
	 p0 = 	 c.h.g.a .c ( p0,p1 );
} // .end method
public static android.util.TypedValue a ( ) {
	 /* .locals 2 */
	 /* .line 8 */
	 v0 = c.b.q.g2.a;
	 (( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
	 /* check-cast v0, Landroid/util/TypedValue; */
	 /* if-nez v0, :cond_0 */
	 /* .line 9 */
	 /* new-instance v0, Landroid/util/TypedValue; */
	 /* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
	 /* .line 10 */
	 v1 = c.b.q.g2.a;
	 (( java.lang.ThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
} // :cond_0
} // .end method
public static Integer b ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = c.b.q.g2.g;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
c.b.q.k2 .a ( p0,p1,v0 );
/* .line 3 */
try { // :try_start_0
	 p1 = 	 (( c.b.q.k2 ) p0 ).a ( v1, v1 ); // invoke-virtual {p0, v1, v1}, Lc/b/q/k2;->a(II)I
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 4 */
	 (( c.b.q.k2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/k2;->a()V
	 /* :catchall_0 */
	 /* move-exception p1 */
	 (( c.b.q.k2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/k2;->a()V
	 /* .line 5 */
	 /* throw p1 */
} // .end method
public static android.content.res.ColorStateList c ( android.content.Context p0, Integer p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = c.b.q.g2.g;
	 int v1 = 0; // const/4 v1, 0x0
	 /* aput p1, v0, v1 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 2 */
	 c.b.q.k2 .a ( p0,p1,v0 );
	 /* .line 3 */
	 try { // :try_start_0
		 (( c.b.q.k2 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 4 */
		 (( c.b.q.k2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/k2;->a()V
		 /* :catchall_0 */
		 /* move-exception p1 */
		 (( c.b.q.k2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/k2;->a()V
		 /* .line 5 */
		 /* throw p1 */
	 } // .end method
