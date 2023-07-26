public abstract class c.v.j1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c.v.n1 a;
	 public static java.lang.reflect.Field b;
	 public static Boolean c;
	 public static final android.util.Property d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/util/Property<", */
	 /* "Landroid/view/View;", */
	 /* "Ljava/lang/Float;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.v.j1 ( ) {
/* .locals 3 */
/* .line 1 */
/* const/16 v1, 0x16 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/v/m1; */
/* invoke-direct {v0}, Lc/v/m1;-><init>()V */
} // :cond_0
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_1 */
/* .line 3 */
/* new-instance v0, Lc/v/l1; */
/* invoke-direct {v0}, Lc/v/l1;-><init>()V */
} // :cond_1
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_2 */
/* .line 4 */
/* new-instance v0, Lc/v/k1; */
/* invoke-direct {v0}, Lc/v/k1;-><init>()V */
/* .line 5 */
} // :cond_2
/* new-instance v0, Lc/v/n1; */
/* invoke-direct {v0}, Lc/v/n1;-><init>()V */
/* .line 6 */
} // :goto_0
/* new-instance v0, Lc/v/h1; */
/* const-class v1, Ljava/lang/Float; */
final String v2 = "translationAlpha"; // const-string v2, "translationAlpha"
/* invoke-direct {v0, v1, v2}, Lc/v/h1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 7 */
/* new-instance v0, Lc/v/i1; */
/* const-class v1, Landroid/graphics/Rect; */
final String v2 = "clipBounds"; // const-string v2, "clipBounds"
/* invoke-direct {v0, v1, v2}, Lc/v/i1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
return;
} // .end method
public static void a ( ) {
/* .locals 3 */
/* .line 9 */
/* sget-boolean v0, Lc/v/j1;->c:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 10 */
try { // :try_start_0
/* const-class v1, Landroid/view/View; */
final String v2 = "mViewFlags"; // const-string v2, "mViewFlags"
(( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 11 */
(( java.lang.reflect.Field ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String v1 = "ViewUtils"; // const-string v1, "ViewUtils"
final String v2 = "fetchViewFlagsField: "; // const-string v2, "fetchViewFlagsField: "
/* .line 12 */
android.util.Log .i ( v1,v2 );
/* .line 13 */
} // :goto_0
c.v.j1.c = (v0!= 0);
} // :cond_0
return;
} // .end method
public static void a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = c.v.j1.a;
(( c.v.n1 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/v/n1;->a(Landroid/view/View;)V
return;
} // .end method
public static void a ( android.view.View p0, Float p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.v.j1.a;
(( c.v.n1 ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lc/v/n1;->a(Landroid/view/View;F)V
return;
} // .end method
public static void a ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
/* .line 3 */
c.v.j1 .a ( );
/* .line 4 */
v0 = c.v.j1.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
try { // :try_start_0
v0 = (( java.lang.reflect.Field ) v0 ).getInt ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* .line 6 */
v1 = c.v.j1.b;
/* and-int/lit8 v0, v0, -0xd */
/* or-int/2addr p1, v0 */
(( java.lang.reflect.Field ) v1 ).setInt ( p0, p1 ); // invoke-virtual {v1, p0, p1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_0
return;
} // .end method
public static void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .line 8 */
v0 = c.v.j1.a;
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-virtual/range {v0 ..v5}, Lc/v/n1;->a(Landroid/view/View;IIII)V */
return;
} // .end method
public static void a ( android.view.View p0, android.graphics.Matrix p1 ) {
/* .locals 1 */
/* .line 7 */
v0 = c.v.j1.a;
(( c.v.n1 ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lc/v/n1;->a(Landroid/view/View;Landroid/graphics/Matrix;)V
return;
} // .end method
public static c.v.g1 b ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/v/f1; */
/* invoke-direct {v0, p0}, Lc/v/f1;-><init>(Landroid/view/View;)V */
/* .line 3 */
} // :cond_0
c.v.e1 .c ( p0 );
} // .end method
public static void b ( android.view.View p0, android.graphics.Matrix p1 ) {
/* .locals 1 */
/* .line 4 */
v0 = c.v.j1.a;
(( c.v.n1 ) v0 ).b ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lc/v/n1;->b(Landroid/view/View;Landroid/graphics/Matrix;)V
return;
} // .end method
public static Float c ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.v.j1.a;
p0 = (( c.v.n1 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/v/n1;->b(Landroid/view/View;)F
} // .end method
public static c.v.u1 d ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/v/t1; */
/* invoke-direct {v0, p0}, Lc/v/t1;-><init>(Landroid/view/View;)V */
/* .line 3 */
} // :cond_0
/* new-instance v0, Lc/v/s1; */
(( android.view.View ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
/* invoke-direct {v0, p0}, Lc/v/s1;-><init>(Landroid/os/IBinder;)V */
} // .end method
public static void e ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.v.j1.a;
(( c.v.n1 ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lc/v/n1;->c(Landroid/view/View;)V
return;
} // .end method
