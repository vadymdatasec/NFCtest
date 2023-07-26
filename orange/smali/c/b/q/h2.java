public class c.b.q.h2 extends android.content.ContextWrapper {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object c;
	 public static java.util.ArrayList d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Lc/b/q/h2;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.content.res.Resources a;
public final android.content.res.Resources$Theme b;
/* # direct methods */
public static c.b.q.h2 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public c.b.q.h2 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V */
/* .line 2 */
v0 = c.b.q.u2 .b ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 /* new-instance v0, Lc/b/q/u2; */
	 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 /* invoke-direct {v0, p0, v1}, Lc/b/q/u2;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V */
	 this.a = v0;
	 /* .line 4 */
	 (( android.content.res.Resources ) v0 ).newTheme ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;
	 this.b = v0;
	 /* .line 5 */
	 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
	 (( android.content.res.Resources$Theme ) v0 ).setTo ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
	 /* .line 6 */
} // :cond_0
/* new-instance v0, Lc/b/q/j2; */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* invoke-direct {v0, p0, p1}, Lc/b/q/j2;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V */
this.a = v0;
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
this.b = p1;
} // :goto_0
return;
} // .end method
public static Boolean a ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 1 */
/* instance-of v0, p0, Lc/b/q/h2; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_2 */
/* .line 2 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* instance-of v0, v0, Lc/b/q/j2; */
/* if-nez v0, :cond_2 */
/* .line 3 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* instance-of p0, p0, Lc/b/q/u2; */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 4 */
} // :cond_0
/* const/16 v0, 0x15 */
/* if-lt p0, v0, :cond_1 */
p0 = c.b.q.u2 .b ( );
if ( p0 != null) { // if-eqz p0, :cond_2
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
} // :goto_0
} // .end method
public static android.content.Context b ( android.content.Context p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = c.b.q.h2 .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 2 */
v0 = c.b.q.h2.c;
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
v1 = c.b.q.h2.d;
/* if-nez v1, :cond_0 */
/* .line 4 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 5 */
} // :cond_0
v1 = c.b.q.h2.d;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
/* if-ltz v1, :cond_3 */
/* .line 6 */
v2 = c.b.q.h2.d;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/ref/WeakReference; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
(( java.lang.ref.WeakReference ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* if-nez v2, :cond_2 */
/* .line 8 */
} // :cond_1
v2 = c.b.q.h2.d;
(( java.util.ArrayList ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
} // :cond_2
/* add-int/lit8 v1, v1, -0x1 */
/* .line 9 */
} // :cond_3
v1 = c.b.q.h2.d;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_1
/* if-ltz v1, :cond_6 */
/* .line 10 */
v2 = c.b.q.h2.d;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/ref/WeakReference; */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 11 */
(( java.lang.ref.WeakReference ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v2, Lc/b/q/h2; */
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 12 */
(( android.content.ContextWrapper ) v2 ).getBaseContext ( ); // invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
/* if-ne v3, p0, :cond_5 */
/* .line 13 */
/* monitor-exit v0 */
} // :cond_5
/* add-int/lit8 v1, v1, -0x1 */
/* .line 14 */
} // :cond_6
} // :goto_3
/* new-instance v1, Lc/b/q/h2; */
/* invoke-direct {v1, p0}, Lc/b/q/h2;-><init>(Landroid/content/Context;)V */
/* .line 15 */
p0 = c.b.q.h2.d;
/* new-instance v2, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
(( java.util.ArrayList ) p0 ).add ( v2 ); // invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 16 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 17 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // :cond_7
} // .end method
/* # virtual methods */
public android.content.res.AssetManager getAssets ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.content.res.Resources ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
} // .end method
public android.content.res.Resources getResources ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public android.content.res.Resources$Theme getTheme ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Landroid/content/ContextWrapper;->getTheme()Landroid/content/res/Resources$Theme; */
} // :cond_0
} // .end method
public void setTheme ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/content/ContextWrapper;->setTheme(I)V */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
(( android.content.res.Resources$Theme ) v0 ).applyStyle ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V
} // :goto_0
return;
} // .end method
