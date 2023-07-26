public abstract class c.v.o0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static c.v.k0 a;
	 public static java.lang.ThreadLocal b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal<", */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Lc/e/b<", */
	 /* "Landroid/view/ViewGroup;", */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/v/k0;", */
	 /* ">;>;>;>;" */
	 /* } */
} // .end annotation
} // .end field
public static java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/ViewGroup;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.v.o0 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/v/c; */
/* invoke-direct {v0}, Lc/v/c;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
return;
} // .end method
public static c.e.b a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/e/b<", */
/* "Landroid/view/ViewGroup;", */
/* "Ljava/util/ArrayList<", */
/* "Lc/v/k0;", */
/* ">;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = c.v.o0.b;
/* .line 2 */
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/ref/WeakReference; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lc/e/b; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
} // :cond_0
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
/* .line 5 */
/* new-instance v1, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
/* .line 6 */
v2 = c.v.o0.b;
(( java.lang.ThreadLocal ) v2 ).set ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
} // .end method
public static void a ( android.view.ViewGroup p0, c.v.k0 p1 ) {
/* .locals 1 */
/* .line 7 */
v0 = c.v.o0.c;
v0 = (( java.util.ArrayList ) v0 ).contains ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
v0 = c.h.n.v0 .D ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
v0 = c.v.o0.c;
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* if-nez p1, :cond_0 */
/* .line 9 */
p1 = c.v.o0.a;
/* .line 10 */
} // :cond_0
(( c.v.k0 ) p1 ).clone ( ); // invoke-virtual {p1}, Lc/v/k0;->clone()Lc/v/k0;
/* .line 11 */
c.v.o0 .c ( p0,p1 );
int v0 = 0; // const/4 v0, 0x0
/* .line 12 */
c.v.d0 .a ( p0,v0 );
/* .line 13 */
c.v.o0 .b ( p0,p1 );
} // :cond_1
return;
} // .end method
public static void b ( android.view.ViewGroup p0, c.v.k0 p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
/* new-instance v0, Lc/v/n0; */
/* invoke-direct {v0, p1, p0}, Lc/v/n0;-><init>(Lc/v/k0;Landroid/view/ViewGroup;)V */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).addOnAttachStateChangeListener ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
(( android.view.ViewTreeObserver ) p0 ).addOnPreDrawListener ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
} // :cond_0
return;
} // .end method
public static void c ( android.view.ViewGroup p0, c.v.k0 p1 ) {
/* .locals 2 */
/* .line 1 */
c.v.o0 .a ( );
(( c.e.i ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/ArrayList; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lez v1, :cond_0 */
/* .line 3 */
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lc/v/k0; */
/* .line 4 */
(( c.v.k0 ) v1 ).c ( p0 ); // invoke-virtual {v1, p0}, Lc/v/k0;->c(Landroid/view/View;)V
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
(( c.v.k0 ) p1 ).a ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Lc/v/k0;->a(Landroid/view/ViewGroup;Z)V
/* .line 6 */
} // :cond_1
c.v.d0 .a ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 7 */
(( c.v.d0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/d0;->a()V
} // :cond_2
return;
} // .end method
