public class com.google.android.material.transformation.FabTransformationSheetBehavior extends com.google.android.material.transformation.FabTransformationBehavior {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.Map g;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Landroid/view/View;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.android.material.transformation.FabTransformationSheetBehavior ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lcom/google/android/material/transformation/FabTransformationBehavior;-><init>()V */
return;
} // .end method
public com.google.android.material.transformation.FabTransformationSheetBehavior ( ) {
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/FabTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
/* # virtual methods */
public com.google.android.material.transformation.FabTransformationBehavior$b a ( android.content.Context p0, Boolean p1 ) {
/* .locals 2 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 1 */
	 /* .line 2 */
} // :cond_0
/* .line 3 */
} // :goto_0
/* new-instance v0, Lcom/google/android/material/transformation/FabTransformationBehavior$b; */
/* invoke-direct {v0}, Lcom/google/android/material/transformation/FabTransformationBehavior$b;-><init>()V */
/* .line 4 */
e.f.a.c.j.d .a ( p1,p2 );
this.a = p1;
/* .line 5 */
/* new-instance p1, Le/f/a/c/j/f; */
/* const/16 p2, 0x11 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p1, p2, v1, v1}, Le/f/a/c/j/f;-><init>(IFF)V */
this.b = p1;
} // .end method
public final void a ( android.view.View p0, Boolean p1 ) {
/* .locals 8 */
/* .line 8 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 9 */
/* instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
/* if-nez v1, :cond_0 */
return;
/* .line 10 */
} // :cond_0
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
/* .line 11 */
v1 = (( android.view.ViewGroup ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
/* .line 12 */
/* const/16 v3, 0x10 */
/* if-lt v2, v3, :cond_1 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 13 */
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V */
this.g = v2;
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v1, :cond_7 */
/* .line 14 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 15 */
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* instance-of v6, v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 16 */
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) v6 ).d ( ); // invoke-virtual {v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d()Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;
/* instance-of v6, v6, Lcom/google/android/material/transformation/FabTransformationScrimBehavior; */
if ( v6 != null) { // if-eqz v6, :cond_2
int v6 = 1; // const/4 v6, 0x1
} // :cond_2
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
/* if-eq v5, p1, :cond_6 */
if ( v6 != null) { // if-eqz v6, :cond_3
} // :cond_3
/* if-nez p2, :cond_4 */
/* .line 17 */
v6 = this.g;
if ( v6 != null) { // if-eqz v6, :cond_6
v6 = /* .line 18 */
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 19 */
v6 = this.g;
/* check-cast v6, Ljava/lang/Integer; */
v6 = (( java.lang.Integer ) v6 ).intValue ( ); // invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I
c.h.n.v0 .g ( v5,v6 );
/* .line 20 */
} // :cond_4
/* if-lt v6, v3, :cond_5 */
/* .line 21 */
v6 = this.g;
v7 = (( android.view.View ) v5 ).getImportantForAccessibility ( ); // invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I
java.lang.Integer .valueOf ( v7 );
} // :cond_5
int v6 = 4; // const/4 v6, 0x4
/* .line 22 */
c.h.n.v0 .g ( v5,v6 );
} // :cond_6
} // :goto_2
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_7
/* if-nez p2, :cond_8 */
int p1 = 0; // const/4 p1, 0x0
/* .line 23 */
this.g = p1;
} // :cond_8
return;
} // .end method
public Boolean a ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3 ) {
/* .locals 0 */
/* .line 6 */
(( com.google.android.material.transformation.FabTransformationSheetBehavior ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lcom/google/android/material/transformation/FabTransformationSheetBehavior;->a(Landroid/view/View;Z)V
/* .line 7 */
p1 = /* invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;ZZ)Z */
} // .end method
