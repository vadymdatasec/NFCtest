public abstract class c.b.l.a.b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "RestrictedAPI" */
	 /* } */
} // .end annotation
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
public static final java.util.WeakHashMap b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Landroid/content/Context;", */
/* "Landroid/util/SparseArray<", */
/* "Lc/b/l/a/a;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public static final java.lang.Object c;
/* # direct methods */
public static c.b.l.a.b ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/WeakHashMap; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V */
/* .line 3 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static android.content.res.ColorStateList a ( android.content.Context p0, Integer p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = c.b.l.a.b.c;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = c.b.l.a.b.b;
(( java.util.WeakHashMap ) v1 ).get ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/util/SparseArray; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
v2 = (( android.util.SparseArray ) v1 ).size ( ); // invoke-virtual {v1}, Landroid/util/SparseArray;->size()I
/* if-lez v2, :cond_1 */
/* .line 4 */
(( android.util.SparseArray ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/b/l/a/a; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
v3 = this.b;
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p0 ).getConfiguration ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
p0 = (( android.content.res.Configuration ) v3 ).equals ( p0 ); // invoke-virtual {v3, p0}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 6 */
	 p0 = this.a;
	 /* monitor-exit v0 */
	 /* .line 7 */
} // :cond_0
(( android.util.SparseArray ) v1 ).remove ( p1 ); // invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V
/* .line 8 */
} // :cond_1
/* monitor-exit v0 */
int p0 = 0; // const/4 p0, 0x0
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static android.util.TypedValue a ( ) {
/* .locals 2 */
/* .line 17 */
v0 = c.b.l.a.b.a;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/util/TypedValue; */
/* if-nez v0, :cond_0 */
/* .line 18 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 19 */
v1 = c.b.l.a.b.a;
(( java.lang.ThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
} // :cond_0
} // .end method
public static void a ( android.content.Context p0, Integer p1, android.content.res.ColorStateList p2 ) {
/* .locals 3 */
/* .line 9 */
v0 = c.b.l.a.b.c;
/* monitor-enter v0 */
/* .line 10 */
try { // :try_start_0
v1 = c.b.l.a.b.b;
(( java.util.WeakHashMap ) v1 ).get ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/util/SparseArray; */
/* if-nez v1, :cond_0 */
/* .line 11 */
/* new-instance v1, Landroid/util/SparseArray; */
/* invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V */
/* .line 12 */
v2 = c.b.l.a.b.b;
(( java.util.WeakHashMap ) v2 ).put ( p0, v1 ); // invoke-virtual {v2, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 13 */
} // :cond_0
/* new-instance v2, Lc/b/l/a/a; */
/* .line 14 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p0 ).getConfiguration ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* invoke-direct {v2, p2, p0}, Lc/b/l/a/a;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;)V */
/* .line 15 */
(( android.util.SparseArray ) v1 ).append ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V
/* .line 16 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static android.content.res.ColorStateList b ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.content.Context ) p0 ).getColorStateList ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;
/* .line 3 */
} // :cond_0
c.b.l.a.b .a ( p0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
c.b.l.a.b .d ( p0,p1 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
c.b.l.a.b .a ( p0,p1,v0 );
/* .line 6 */
} // :cond_2
c.h.f.f .b ( p0,p1 );
} // .end method
public static android.graphics.drawable.Drawable c ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
c.b.q.z1 .a ( );
(( c.b.q.z1 ) v0 ).b ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lc/b/q/z1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
} // .end method
public static android.content.res.ColorStateList d ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = c.b.l.a.b .e ( p0,p1 );
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 3 */
(( android.content.res.Resources ) v0 ).getXml ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
/* .line 4 */
try { // :try_start_0
(( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
c.h.f.i.c .a ( v0,p1,p0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
final String p1 = "AppCompatResources"; // const-string p1, "AppCompatResources"
final String v0 = "Failed to inflate ColorStateList, leaving it to the framework"; // const-string v0, "Failed to inflate ColorStateList, leaving it to the framework"
/* .line 5 */
android.util.Log .e ( p1,v0,p0 );
} // .end method
public static Boolean e ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2 */
c.b.l.a.b .a ( );
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
(( android.content.res.Resources ) p0 ).getValue ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
/* .line 4 */
/* iget p0, v0, Landroid/util/TypedValue;->type:I */
/* const/16 p1, 0x1c */
/* if-lt p0, p1, :cond_0 */
/* const/16 p1, 0x1f */
/* if-gt p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
