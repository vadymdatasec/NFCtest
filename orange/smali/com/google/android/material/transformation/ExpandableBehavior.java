public abstract class com.google.android.material.transformation.ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b<", */
	 /* "Landroid/view/View;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public Integer a;
/* # direct methods */
public com.google.android.material.transformation.ExpandableBehavior ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput v0, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->a:I */
	 return;
} // .end method
public com.google.android.material.transformation.ExpandableBehavior ( ) {
	 /* .locals 0 */
	 /* .line 3 */
	 /* invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 4 */
	 /* iput p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->a:I */
	 return;
} // .end method
public static Integer a ( com.google.android.material.transformation.ExpandableBehavior p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* iget p0, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->a:I */
} // .end method
/* # virtual methods */
public abstract Boolean a ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3 ) {
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 p3 = 	 c.h.n.v0 .D ( p2 );
	 /* if-nez p3, :cond_1 */
	 /* .line 3 */
	 (( com.google.android.material.transformation.ExpandableBehavior ) p0 ).e ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableBehavior;->e(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Le/f/a/c/o/b;
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 p3 = 		 /* .line 4 */
		 p3 = 		 (( com.google.android.material.transformation.ExpandableBehavior ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lcom/google/android/material/transformation/ExpandableBehavior;->a(Z)Z
		 if ( p3 != null) { // if-eqz p3, :cond_1
			 p3 = 			 /* .line 5 */
			 if ( p3 != null) { // if-eqz p3, :cond_0
				 int p3 = 1; // const/4 p3, 0x1
			 } // :cond_0
			 int p3 = 2; // const/4 p3, 0x2
		 } // :goto_0
		 /* iput p3, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->a:I */
		 /* .line 6 */
		 (( android.view.View ) p2 ).getViewTreeObserver ( ); // invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
		 /* new-instance v1, Lcom/google/android/material/transformation/ExpandableBehavior$a; */
		 /* invoke-direct {v1, p0, p2, p3, p1}, Lcom/google/android/material/transformation/ExpandableBehavior$a;-><init>(Lcom/google/android/material/transformation/ExpandableBehavior;Landroid/view/View;ILe/f/a/c/o/b;)V */
		 /* .line 7 */
		 (( android.view.ViewTreeObserver ) v0 ).addOnPreDrawListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
	 } // :cond_1
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean a ( Boolean p0 ) {
	 /* .locals 3 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 1; // const/4 v1, 0x1
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 8 */
		 /* iget p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->a:I */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int v2 = 2; // const/4 v2, 0x2
			 /* if-ne p1, v2, :cond_1 */
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_1
	 /* .line 9 */
} // :cond_2
/* iget p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->a:I */
/* if-ne p1, v1, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2 ) {
/* .locals 1 */
/* .line 1 */
/* check-cast p3, Le/f/a/c/o/b; */
p1 = /* .line 2 */
/* .line 3 */
p1 = (( com.google.android.material.transformation.ExpandableBehavior ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/transformation/ExpandableBehavior;->a(Z)Z
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = /* .line 4 */
int v0 = 1; // const/4 v0, 0x1
if ( p1 != null) { // if-eqz p1, :cond_0
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 2; // const/4 p1, 0x2
} // :goto_0
/* iput p1, p0, Lcom/google/android/material/transformation/ExpandableBehavior;->a:I */
/* .line 5 */
/* move-object p1, p3 */
p3 = /* check-cast p1, Landroid/view/View; */
p1 = (( com.google.android.material.transformation.ExpandableBehavior ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/material/transformation/ExpandableBehavior;->a(Landroid/view/View;Landroid/view/View;ZZ)Z
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public e.f.a.c.o.b e ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1 ) {
/* .locals 5 */
/* .line 1 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b(Landroid/view/View;)Ljava/util/List;
v1 = /* .line 2 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* .line 3 */
/* check-cast v3, Landroid/view/View; */
/* .line 4 */
v4 = (( androidx.coordinatorlayout.widget.CoordinatorLayout$b ) p0 ).a ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 5 */
/* check-cast v3, Le/f/a/c/o/b; */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
