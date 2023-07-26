public class c.v.n0 implements android.view.ViewTreeObserver$OnPreDrawListener implements android.view.View$OnAttachStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.v.k0 b;
	 public android.view.ViewGroup c;
	 /* # direct methods */
	 public c.v.n0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 this.c = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 (( android.view.ViewGroup ) v0 ).getViewTreeObserver ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
		 (( android.view.ViewTreeObserver ) v0 ).removeOnPreDrawListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
		 /* .line 2 */
		 v0 = this.c;
		 (( android.view.ViewGroup ) v0 ).removeOnAttachStateChangeListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
		 return;
	 } // .end method
	 public Boolean onPreDraw ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 (( c.v.n0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/n0;->a()V
		 /* .line 2 */
		 v0 = c.v.o0.c;
		 v1 = this.c;
		 v0 = 		 (( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
	 } // :cond_0
	 c.v.o0 .a ( );
	 /* .line 4 */
	 v2 = this.c;
	 (( c.e.i ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v2, Ljava/util/ArrayList; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* if-nez v2, :cond_1 */
	 /* .line 5 */
	 /* new-instance v2, Ljava/util/ArrayList; */
	 /* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
	 /* .line 6 */
	 v4 = this.c;
	 (( c.e.i ) v0 ).put ( v4, v2 ); // invoke-virtual {v0, v4, v2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 7 */
} // :cond_1
v4 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* if-lez v4, :cond_2 */
/* .line 8 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 9 */
} // :cond_2
} // :goto_0
v4 = this.b;
(( java.util.ArrayList ) v2 ).add ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 10 */
v2 = this.b;
/* new-instance v4, Lc/v/m0; */
/* invoke-direct {v4, p0, v0}, Lc/v/m0;-><init>(Lc/v/n0;Lc/e/b;)V */
(( c.v.k0 ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;
/* .line 11 */
v0 = this.b;
v2 = this.c;
int v4 = 0; // const/4 v4, 0x0
(( c.v.k0 ) v0 ).a ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Lc/v/k0;->a(Landroid/view/ViewGroup;Z)V
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 12 */
(( java.util.ArrayList ) v3 ).iterator ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Lc/v/k0; */
/* .line 13 */
v3 = this.c;
(( c.v.k0 ) v2 ).e ( v3 ); // invoke-virtual {v2, v3}, Lc/v/k0;->e(Landroid/view/View;)V
/* .line 14 */
} // :cond_3
v0 = this.b;
v2 = this.c;
(( c.v.k0 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/v/k0;->a(Landroid/view/ViewGroup;)V
} // .end method
public void onViewAttachedToWindow ( android.view.View p0 ) {
/* .locals 0 */
return;
} // .end method
public void onViewDetachedFromWindow ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
(( c.v.n0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/n0;->a()V
/* .line 2 */
p1 = c.v.o0.c;
v0 = this.c;
(( java.util.ArrayList ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 3 */
c.v.o0 .a ( );
v0 = this.c;
(( c.e.i ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/util/ArrayList; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
v0 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_0 */
/* .line 5 */
(( java.util.ArrayList ) p1 ).iterator ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lc/v/k0; */
/* .line 6 */
v1 = this.c;
(( c.v.k0 ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Lc/v/k0;->e(Landroid/view/View;)V
/* .line 7 */
} // :cond_0
p1 = this.b;
int v0 = 1; // const/4 v0, 0x1
(( c.v.k0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/v/k0;->a(Z)V
return;
} // .end method
