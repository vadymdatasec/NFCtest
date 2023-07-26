public class com.google.android.material.transformation.ExpandableBehavior$a implements android.view.ViewTreeObserver$OnPreDrawListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/android/material/transformation/ExpandableBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final android.view.View b; //synthetic
public final Integer c; //synthetic
public final e.f.a.c.o.b d; //synthetic
public final com.google.android.material.transformation.ExpandableBehavior e; //synthetic
/* # direct methods */
public com.google.android.material.transformation.ExpandableBehavior$a ( ) {
/* .locals 0 */
/* .line 1 */
this.e = p1;
this.b = p2;
/* iput p3, p0, Lcom/google/android/material/transformation/ExpandableBehavior$a;->c:I */
this.d = p4;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onPreDraw ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.b;
(( android.view.View ) v0 ).getViewTreeObserver ( ); // invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
(( android.view.ViewTreeObserver ) v0 ).removeOnPreDrawListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
/* .line 2 */
v0 = this.e;
v0 = com.google.android.material.transformation.ExpandableBehavior .a ( v0 );
/* iget v1, p0, Lcom/google/android/material/transformation/ExpandableBehavior$a;->c:I */
int v2 = 0; // const/4 v2, 0x0
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
v0 = this.e;
v1 = this.d;
/* move-object v3, v1 */
/* check-cast v3, Landroid/view/View; */
v1 = v4 = this.b;
(( com.google.android.material.transformation.ExpandableBehavior ) v0 ).a ( v3, v4, v1, v2 ); // invoke-virtual {v0, v3, v4, v1, v2}, Lcom/google/android/material/transformation/ExpandableBehavior;->a(Landroid/view/View;Landroid/view/View;ZZ)Z
} // :cond_0
} // .end method
