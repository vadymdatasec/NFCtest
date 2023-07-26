public class inal extends com.google.android.material.snackbar.BaseTransientBottomBar {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/android/material/snackbar/Snackbar$SnackbarLayout; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/android/material/snackbar/BaseTransientBottomBar<", */
/* "Lcom/google/android/material/snackbar/Snackbar;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final o;
/* # instance fields */
public final android.view.accessibility.AccessibilityManager m;
public Boolean n;
/* # direct methods */
public static inal ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
/* .line 1 */
int v2 = 0; // const/4 v2, 0x0
/* aput v1, v0, v2 */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Le/f/a/c/s/q;)V */
/* .line 2 */
(( android.view.ViewGroup ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
final String p2 = "accessibility"; // const-string p2, "accessibility"
(( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/accessibility/AccessibilityManager; */
this.m = p1;
return;
} // .end method
public static android.view.ViewGroup a ( android.view.View p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* move-object v1, v0 */
/* .line 13 */
} // :cond_0
/* instance-of v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 14 */
/* check-cast p0, Landroid/view/ViewGroup; */
/* .line 15 */
} // :cond_1
/* instance-of v2, p0, Landroid/widget/FrameLayout; */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 16 */
v1 = (( android.view.View ) p0 ).getId ( ); // invoke-virtual {p0}, Landroid/view/View;->getId()I
/* const v2, 0x1020002 */
/* if-ne v1, v2, :cond_2 */
/* .line 17 */
/* check-cast p0, Landroid/view/ViewGroup; */
/* .line 18 */
} // :cond_2
/* move-object v1, p0 */
/* check-cast v1, Landroid/view/ViewGroup; */
} // :cond_3
if ( p0 != null) { // if-eqz p0, :cond_5
/* .line 19 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 20 */
/* instance-of v2, p0, Landroid/view/View; */
if ( v2 != null) { // if-eqz v2, :cond_4
/* check-cast p0, Landroid/view/View; */
} // :cond_4
/* move-object p0, v0 */
} // :cond_5
} // :goto_0
/* if-nez p0, :cond_0 */
} // .end method
public static com.google.android.material.snackbar.Snackbar a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 12 */
(( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
com.google.android.material.snackbar.Snackbar .a ( p0,p1,p2 );
} // .end method
public static com.google.android.material.snackbar.Snackbar a ( android.view.View p0, java.lang.CharSequence p1, Integer p2 ) {
/* .locals 3 */
/* .line 1 */
com.google.android.material.snackbar.Snackbar .a ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
android.view.LayoutInflater .from ( v0 );
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v1 = com.google.android.material.snackbar.Snackbar .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* .line 4 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast v0, Lcom/google/android/material/snackbar/SnackbarContentLayout; */
/* .line 5 */
/* new-instance v1, Lcom/google/android/material/snackbar/Snackbar; */
/* invoke-direct {v1, p0, v0, v0}, Lcom/google/android/material/snackbar/Snackbar;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Le/f/a/c/s/q;)V */
/* .line 6 */
(( com.google.android.material.snackbar.Snackbar ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/android/material/snackbar/Snackbar;->a(Ljava/lang/CharSequence;)Lcom/google/android/material/snackbar/Snackbar;
/* .line 7 */
(( com.google.android.material.snackbar.BaseTransientBottomBar ) v1 ).e ( p2 ); // invoke-virtual {v1, p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e(I)Lcom/google/android/material/snackbar/BaseTransientBottomBar;
/* .line 8 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "No suitable parent found from the given view.Please provide a valid view."; // const-string p1, "No suitable parent found from the given view.Please provide a valid view."
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean a ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 9 */
v0 = com.google.android.material.snackbar.Snackbar.o;
(( android.content.Context ) p0 ).obtainStyledAttributes ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
int v0 = -1; // const/4 v0, -0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 10 */
v2 = (( android.content.res.TypedArray ) p0 ).getResourceId ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 11 */
(( android.content.res.TypedArray ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
/* if-eq v2, v0, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
/* # virtual methods */
public com.google.android.material.snackbar.Snackbar a ( Integer p0, android.view.View$OnClickListener p1 ) {
/* .locals 1 */
/* .line 24 */
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( com.google.android.material.snackbar.Snackbar ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/snackbar/Snackbar;->a(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;
} // .end method
public com.google.android.material.snackbar.Snackbar a ( java.lang.CharSequence p0 ) {
/* .locals 2 */
/* .line 21 */
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.FrameLayout ) v0 ).getChildAt ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* check-cast v0, Lcom/google/android/material/snackbar/SnackbarContentLayout; */
/* .line 22 */
(( com.google.android.material.snackbar.SnackbarContentLayout ) v0 ).getMessageView ( ); // invoke-virtual {v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->getMessageView()Landroid/widget/TextView;
/* .line 23 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // .end method
public com.google.android.material.snackbar.Snackbar a ( java.lang.CharSequence p0, android.view.View$OnClickListener p1 ) {
/* .locals 3 */
/* .line 25 */
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.FrameLayout ) v0 ).getChildAt ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* check-cast v0, Lcom/google/android/material/snackbar/SnackbarContentLayout; */
/* .line 26 */
(( com.google.android.material.snackbar.SnackbarContentLayout ) v0 ).getActionView ( ); // invoke-virtual {v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->getActionView()Landroid/widget/Button;
/* .line 27 */
v2 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v2, :cond_1 */
/* if-nez p2, :cond_0 */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* .line 28 */
/* iput-boolean v2, p0, Lcom/google/android/material/snackbar/Snackbar;->n:Z */
/* .line 29 */
(( android.widget.TextView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 30 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 31 */
/* new-instance p1, Le/f/a/c/s/r; */
/* invoke-direct {p1, p0, p2}, Le/f/a/c/s/r;-><init>(Lcom/google/android/material/snackbar/Snackbar;Landroid/view/View$OnClickListener;)V */
(( android.widget.TextView ) v0 ).setOnClickListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :cond_1
} // :goto_0
/* const/16 p1, 0x8 */
/* .line 32 */
(( android.widget.TextView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V
int p1 = 0; // const/4 p1, 0x0
/* .line 33 */
(( android.widget.TextView ) v0 ).setOnClickListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 34 */
/* iput-boolean v1, p0, Lcom/google/android/material/snackbar/Snackbar;->n:Z */
} // :goto_1
} // .end method
public void b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b()V */
return;
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/google/android/material/snackbar/Snackbar;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.m;
v0 = (( android.view.accessibility.AccessibilityManager ) v0 ).isTouchExplorationEnabled ( ); // invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = -2; // const/4 v0, -0x2
/* .line 2 */
} // :cond_0
v0 = /* invoke-super {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d()I */
} // :goto_0
} // .end method
public void l ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->l()V */
return;
} // .end method
