public class androidx.appcompat.app.AlertController {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/app/AlertController$RecycleListView; */
	 /* } */
} // .end annotation
/* # instance fields */
public androidx.core.widget.NestedScrollView A;
public Integer B;
public android.graphics.drawable.Drawable C;
public android.widget.ImageView D;
public android.widget.TextView E;
public android.widget.TextView F;
public android.view.View G;
public android.widget.ListAdapter H;
public Integer I;
public Integer J;
public Integer K;
public Integer L;
public Integer M;
public Integer N;
public Integer O;
public Boolean P;
public Integer Q;
public android.os.Handler R;
public final android.view.View$OnClickListener S;
public final android.content.Context a;
public final c.b.k.p0 b;
public final android.view.Window c;
public final Integer d;
public java.lang.CharSequence e;
public java.lang.CharSequence f;
public android.widget.ListView g;
public android.view.View h;
public Integer i;
public Integer j;
public Integer k;
public Integer l;
public Integer m;
public Boolean n;
public android.widget.Button o;
public java.lang.CharSequence p;
public android.os.Message q;
public android.graphics.drawable.Drawable r;
public android.widget.Button s;
public java.lang.CharSequence t;
public android.os.Message u;
public android.graphics.drawable.Drawable v;
public android.widget.Button w;
public java.lang.CharSequence x;
public android.os.Message y;
public android.graphics.drawable.Drawable z;
/* # direct methods */
public androidx.appcompat.app.AlertController ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput-boolean v0, p0, Landroidx/appcompat/app/AlertController;->n:Z */
	 /* .line 3 */
	 /* iput v0, p0, Landroidx/appcompat/app/AlertController;->B:I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 4 */
	 /* iput v1, p0, Landroidx/appcompat/app/AlertController;->I:I */
	 /* .line 5 */
	 /* iput v0, p0, Landroidx/appcompat/app/AlertController;->Q:I */
	 /* .line 6 */
	 /* new-instance v1, Lc/b/k/c; */
	 /* invoke-direct {v1, p0}, Lc/b/k/c;-><init>(Landroidx/appcompat/app/AlertController;)V */
	 this.S = v1;
	 /* .line 7 */
	 this.a = p1;
	 /* .line 8 */
	 this.b = p2;
	 /* .line 9 */
	 this.c = p3;
	 /* .line 10 */
	 /* new-instance p3, Lc/b/k/n; */
	 /* invoke-direct {p3, p2}, Lc/b/k/n;-><init>(Landroid/content/DialogInterface;)V */
	 this.R = p3;
	 /* .line 11 */
	 p3 = c.b.j.AlertDialog;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( v2, p3, v1, v0 ); // invoke-virtual {p1, v2, p3, v1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 /* .line 12 */
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getResourceId ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* iput p3, p0, Landroidx/appcompat/app/AlertController;->J:I */
	 /* .line 13 */
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getResourceId ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* iput p3, p0, Landroidx/appcompat/app/AlertController;->K:I */
	 /* .line 14 */
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getResourceId ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* iput p3, p0, Landroidx/appcompat/app/AlertController;->L:I */
	 /* .line 15 */
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getResourceId ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* iput p3, p0, Landroidx/appcompat/app/AlertController;->M:I */
	 /* .line 16 */
	 /* .line 17 */
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getResourceId ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* iput p3, p0, Landroidx/appcompat/app/AlertController;->N:I */
	 /* .line 18 */
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getResourceId ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
	 /* iput p3, p0, Landroidx/appcompat/app/AlertController;->O:I */
	 /* .line 19 */
	 int v1 = 1; // const/4 v1, 0x1
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getBoolean ( p3, v1 ); // invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 /* iput-boolean p3, p0, Landroidx/appcompat/app/AlertController;->P:Z */
	 /* .line 20 */
	 p3 = 	 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
	 /* iput p3, p0, Landroidx/appcompat/app/AlertController;->d:I */
	 /* .line 21 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 /* .line 22 */
	 (( c.b.k.p0 ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Lc/b/k/p0;->a(I)Z
	 return;
} // .end method
public static void a ( android.view.View p0, android.view.View p1, android.view.View p2 ) {
	 /* .locals 3 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 4; // const/4 v1, 0x4
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 int v2 = -1; // const/4 v2, -0x1
		 /* .line 62 */
		 v2 = 		 (( android.view.View ) p0 ).canScrollVertically ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/View;->canScrollVertically(I)Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 int v2 = 0; // const/4 v2, 0x0
		 } // :cond_0
		 int v2 = 4; // const/4 v2, 0x4
		 /* .line 63 */
	 } // :goto_0
	 (( android.view.View ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_3
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 64 */
	 p0 = 	 (( android.view.View ) p0 ).canScrollVertically ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z
	 if ( p0 != null) { // if-eqz p0, :cond_2
	 } // :cond_2
	 int v0 = 4; // const/4 v0, 0x4
	 /* .line 65 */
} // :goto_1
(( android.view.View ) p2 ).setVisibility ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V
} // :cond_3
return;
} // .end method
public static Boolean a ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 2 */
(( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
int v2 = 1; // const/4 v2, 0x1
(( android.content.res.Resources$Theme ) p0 ).resolveAttribute ( v1, v0, v2 ); // invoke-virtual {p0, v1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 3 */
/* iget p0, v0, Landroid/util/TypedValue;->data:I */
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
} // .end method
public static Boolean c ( android.view.View p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.view.View ) p0 ).onCheckIsTextEditor ( ); // invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* instance-of v0, p0, Landroid/view/ViewGroup; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_1
/* check-cast p0, Landroid/view/ViewGroup; */
/* .line 4 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
} // :cond_2
/* if-lez v0, :cond_3 */
/* add-int/lit8 v0, v0, -0x1 */
/* .line 5 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 6 */
v3 = androidx.appcompat.app.AlertController .c ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_3
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 3 */
/* .line 32 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 33 */
v1 = this.a;
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
int v2 = 1; // const/4 v2, 0x1
(( android.content.res.Resources$Theme ) v1 ).resolveAttribute ( p1, v0, v2 ); // invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 34 */
/* iget p1, v0, Landroid/util/TypedValue;->resourceId:I */
} // .end method
public final android.view.ViewGroup a ( android.view.View p0, android.view.View p1 ) {
/* .locals 2 */
/* if-nez p1, :cond_1 */
/* .line 37 */
/* instance-of p1, p2, Landroid/view/ViewStub; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 38 */
/* check-cast p2, Landroid/view/ViewStub; */
(( android.view.ViewStub ) p2 ).inflate ( ); // invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;
/* .line 39 */
} // :cond_0
/* check-cast p2, Landroid/view/ViewGroup; */
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 40 */
(( android.view.View ) p2 ).getParent ( ); // invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 41 */
/* instance-of v1, v0, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 42 */
/* check-cast v0, Landroid/view/ViewGroup; */
(( android.view.ViewGroup ) v0 ).removeView ( p2 ); // invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 43 */
} // :cond_2
/* instance-of p2, p1, Landroid/view/ViewStub; */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 44 */
/* check-cast p1, Landroid/view/ViewStub; */
(( android.view.ViewStub ) p1 ).inflate ( ); // invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;
/* .line 45 */
} // :cond_3
/* check-cast p1, Landroid/view/ViewGroup; */
} // .end method
public android.widget.ListView a ( ) {
/* .locals 1 */
/* .line 35 */
v0 = this.g;
} // .end method
public void a ( Integer p0, java.lang.CharSequence p1, android.content.DialogInterface$OnClickListener p2, android.os.Message p3, android.graphics.drawable.Drawable p4 ) {
/* .locals 0 */
/* if-nez p4, :cond_0 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 15 */
p4 = this.R;
(( android.os.Handler ) p4 ).obtainMessage ( p1, p3 ); // invoke-virtual {p4, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
} // :cond_0
int p3 = -3; // const/4 p3, -0x3
/* if-eq p1, p3, :cond_3 */
int p3 = -2; // const/4 p3, -0x2
/* if-eq p1, p3, :cond_2 */
int p3 = -1; // const/4 p3, -0x1
/* if-ne p1, p3, :cond_1 */
/* .line 16 */
this.p = p2;
/* .line 17 */
this.q = p4;
/* .line 18 */
this.r = p5;
/* .line 19 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Button does not exist"; // const-string p2, "Button does not exist"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 20 */
} // :cond_2
this.t = p2;
/* .line 21 */
this.u = p4;
/* .line 22 */
this.v = p5;
/* .line 23 */
} // :cond_3
this.x = p2;
/* .line 24 */
this.y = p4;
/* .line 25 */
this.z = p5;
} // :goto_0
return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 26 */
this.C = p1;
int v0 = 0; // const/4 v0, 0x0
/* .line 27 */
/* iput v0, p0, Landroidx/appcompat/app/AlertController;->B:I */
/* .line 28 */
v1 = this.D;
if ( v1 != null) { // if-eqz v1, :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 29 */
(( android.widget.ImageView ) v1 ).setVisibility ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 30 */
v0 = this.D;
(( android.widget.ImageView ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
/* const/16 p1, 0x8 */
/* .line 31 */
(( android.widget.ImageView ) v1 ).setVisibility ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 4 */
this.G = p1;
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 8 */
this.h = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
/* iput p1, p0, Landroidx/appcompat/app/AlertController;->i:I */
int p1 = 1; // const/4 p1, 0x1
/* .line 10 */
/* iput-boolean p1, p0, Landroidx/appcompat/app/AlertController;->n:Z */
/* .line 11 */
/* iput p2, p0, Landroidx/appcompat/app/AlertController;->j:I */
/* .line 12 */
/* iput p3, p0, Landroidx/appcompat/app/AlertController;->k:I */
/* .line 13 */
/* iput p4, p0, Landroidx/appcompat/app/AlertController;->l:I */
/* .line 14 */
/* iput p5, p0, Landroidx/appcompat/app/AlertController;->m:I */
return;
} // .end method
public final void a ( android.view.ViewGroup p0 ) {
/* .locals 7 */
/* const v0, 0x1020019 */
/* .line 66 */
(( android.view.ViewGroup ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.o = v0;
/* .line 67 */
v1 = this.S;
(( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 68 */
v0 = this.p;
v0 = android.text.TextUtils .isEmpty ( v0 );
int v1 = 1; // const/4 v1, 0x1
/* const/16 v2, 0x8 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.r;
/* if-nez v0, :cond_0 */
/* .line 69 */
v0 = this.o;
(( android.widget.Button ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 70 */
} // :cond_0
v0 = this.o;
v5 = this.p;
(( android.widget.Button ) v0 ).setText ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 71 */
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 72 */
/* iget v5, p0, Landroidx/appcompat/app/AlertController;->d:I */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v4, v4, v5, v5 ); // invoke-virtual {v0, v4, v4, v5, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 73 */
v0 = this.o;
v5 = this.r;
(( android.widget.Button ) v0 ).setCompoundDrawables ( v5, v3, v3, v3 ); // invoke-virtual {v0, v5, v3, v3, v3}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* .line 74 */
} // :cond_1
v0 = this.o;
(( android.widget.Button ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* const v5, 0x102001a */
/* .line 75 */
(( android.view.ViewGroup ) p1 ).findViewById ( v5 ); // invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/Button; */
this.s = v5;
/* .line 76 */
v6 = this.S;
(( android.widget.Button ) v5 ).setOnClickListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 77 */
v5 = this.t;
v5 = android.text.TextUtils .isEmpty ( v5 );
if ( v5 != null) { // if-eqz v5, :cond_2
v5 = this.v;
/* if-nez v5, :cond_2 */
/* .line 78 */
v5 = this.s;
(( android.widget.Button ) v5 ).setVisibility ( v2 ); // invoke-virtual {v5, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 79 */
} // :cond_2
v5 = this.s;
v6 = this.t;
(( android.widget.Button ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 80 */
v5 = this.v;
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 81 */
/* iget v6, p0, Landroidx/appcompat/app/AlertController;->d:I */
(( android.graphics.drawable.Drawable ) v5 ).setBounds ( v4, v4, v6, v6 ); // invoke-virtual {v5, v4, v4, v6, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 82 */
v5 = this.s;
v6 = this.v;
(( android.widget.Button ) v5 ).setCompoundDrawables ( v6, v3, v3, v3 ); // invoke-virtual {v5, v6, v3, v3, v3}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* .line 83 */
} // :cond_3
v5 = this.s;
(( android.widget.Button ) v5 ).setVisibility ( v4 ); // invoke-virtual {v5, v4}, Landroid/widget/Button;->setVisibility(I)V
/* or-int/lit8 v0, v0, 0x2 */
} // :goto_1
/* const v5, 0x102001b */
/* .line 84 */
(( android.view.ViewGroup ) p1 ).findViewById ( v5 ); // invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/Button; */
this.w = v5;
/* .line 85 */
v6 = this.S;
(( android.widget.Button ) v5 ).setOnClickListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 86 */
v5 = this.x;
v5 = android.text.TextUtils .isEmpty ( v5 );
if ( v5 != null) { // if-eqz v5, :cond_4
v5 = this.z;
/* if-nez v5, :cond_4 */
/* .line 87 */
v3 = this.w;
(( android.widget.Button ) v3 ).setVisibility ( v2 ); // invoke-virtual {v3, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 88 */
} // :cond_4
v5 = this.w;
v6 = this.x;
(( android.widget.Button ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 89 */
v5 = this.r;
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 90 */
/* iget v6, p0, Landroidx/appcompat/app/AlertController;->d:I */
(( android.graphics.drawable.Drawable ) v5 ).setBounds ( v4, v4, v6, v6 ); // invoke-virtual {v5, v4, v4, v6, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 91 */
v5 = this.o;
v6 = this.r;
(( android.widget.Button ) v5 ).setCompoundDrawables ( v6, v3, v3, v3 ); // invoke-virtual {v5, v6, v3, v3, v3}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* .line 92 */
} // :cond_5
v3 = this.w;
(( android.widget.Button ) v3 ).setVisibility ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/Button;->setVisibility(I)V
/* or-int/lit8 v0, v0, 0x4 */
/* .line 93 */
} // :goto_2
v3 = this.a;
v3 = androidx.appcompat.app.AlertController .a ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_8
/* if-ne v0, v1, :cond_6 */
/* .line 94 */
v3 = this.o;
(( androidx.appcompat.app.AlertController ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Landroidx/appcompat/app/AlertController;->a(Landroid/widget/Button;)V
} // :cond_6
int v3 = 2; // const/4 v3, 0x2
/* if-ne v0, v3, :cond_7 */
/* .line 95 */
v3 = this.s;
(( androidx.appcompat.app.AlertController ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Landroidx/appcompat/app/AlertController;->a(Landroid/widget/Button;)V
} // :cond_7
int v3 = 4; // const/4 v3, 0x4
/* if-ne v0, v3, :cond_8 */
/* .line 96 */
v3 = this.w;
(( androidx.appcompat.app.AlertController ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Landroidx/appcompat/app/AlertController;->a(Landroid/widget/Button;)V
} // :cond_8
} // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_9
} // :cond_9
int v1 = 0; // const/4 v1, 0x0
} // :goto_4
/* if-nez v1, :cond_a */
/* .line 97 */
(( android.view.ViewGroup ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V
} // :cond_a
return;
} // .end method
public final void a ( android.view.ViewGroup p0, android.view.View p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .line 46 */
v0 = this.c;
(( android.view.Window ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* .line 47 */
v1 = this.c;
(( android.view.Window ) v1 ).findViewById ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* .line 48 */
/* const/16 v3, 0x17 */
/* if-lt v2, v3, :cond_1 */
/* .line 49 */
c.h.n.v0 .a ( p2,p3,p4 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 50 */
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 51 */
(( android.view.ViewGroup ) p1 ).removeView ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_1
int p2 = 0; // const/4 p2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* and-int/lit8 p4, p3, 0x1 */
/* if-nez p4, :cond_2 */
/* .line 52 */
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* move-object v0, p2 */
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
/* and-int/lit8 p3, p3, 0x2 */
/* if-nez p3, :cond_3 */
/* .line 53 */
(( android.view.ViewGroup ) p1 ).removeView ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* move-object v1, p2 */
} // :cond_3
/* if-nez v0, :cond_4 */
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 54 */
} // :cond_4
p2 = this.f;
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 55 */
p1 = this.A;
/* new-instance p2, Lc/b/k/d; */
/* invoke-direct {p2, p0, v0, v1}, Lc/b/k/d;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V */
(( androidx.core.widget.NestedScrollView ) p1 ).setOnScrollChangeListener ( p2 ); // invoke-virtual {p1, p2}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(Landroidx/core/widget/NestedScrollView$b;)V
/* .line 56 */
p1 = this.A;
/* new-instance p2, Lc/b/k/e; */
/* invoke-direct {p2, p0, v0, v1}, Lc/b/k/e;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V */
(( android.widget.FrameLayout ) p1 ).post ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z
/* .line 57 */
} // :cond_5
p2 = this.g;
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 58 */
/* new-instance p1, Lc/b/k/f; */
/* invoke-direct {p1, p0, v0, v1}, Lc/b/k/f;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V */
(( android.widget.ListView ) p2 ).setOnScrollListener ( p1 ); // invoke-virtual {p2, p1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
/* .line 59 */
p1 = this.g;
/* new-instance p2, Lc/b/k/g; */
/* invoke-direct {p2, p0, v0, v1}, Lc/b/k/g;-><init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V */
(( android.widget.ListView ) p1 ).post ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z
} // :cond_6
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 60 */
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_7
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 61 */
(( android.view.ViewGroup ) p1 ).removeView ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_8
} // :goto_0
return;
} // .end method
public final void a ( android.widget.Button p0 ) {
/* .locals 2 */
/* .line 98 */
(( android.widget.Button ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/LinearLayout$LayoutParams; */
int v1 = 1; // const/4 v1, 0x1
/* .line 99 */
/* iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* .line 100 */
/* iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F */
/* .line 101 */
(( android.widget.Button ) p1 ).setLayoutParams ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 5 */
this.f = p1;
/* .line 6 */
v0 = this.F;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_0
return;
} // .end method
public Boolean a ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 0 */
/* .line 36 */
p1 = this.A;
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( androidx.core.widget.NestedScrollView ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.appcompat.app.AlertController ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/appcompat/app/AlertController;->c()I
/* .line 2 */
v1 = this.b;
(( c.b.k.p0 ) v1 ).setContentView ( v0 ); // invoke-virtual {v1, v0}, Lc/b/k/p0;->setContentView(I)V
/* .line 3 */
(( androidx.appcompat.app.AlertController ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/appcompat/app/AlertController;->d()V
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
this.C = v0;
/* .line 11 */
/* iput p1, p0, Landroidx/appcompat/app/AlertController;->B:I */
/* .line 12 */
v0 = this.D;
if ( v0 != null) { // if-eqz v0, :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
(( android.widget.ImageView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 14 */
p1 = this.D;
/* iget v0, p0, Landroidx/appcompat/app/AlertController;->B:I */
(( android.widget.ImageView ) p1 ).setImageResource ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V
} // :cond_0
/* const/16 p1, 0x8 */
/* .line 15 */
(( android.widget.ImageView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void b ( android.view.View p0 ) {
/* .locals 0 */
/* .line 7 */
this.h = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
/* iput p1, p0, Landroidx/appcompat/app/AlertController;->i:I */
/* .line 9 */
/* iput-boolean p1, p0, Landroidx/appcompat/app/AlertController;->n:Z */
return;
} // .end method
public final void b ( android.view.ViewGroup p0 ) {
/* .locals 4 */
/* .line 17 */
v0 = this.c;
(( android.view.Window ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/core/widget/NestedScrollView; */
this.A = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 18 */
(( android.widget.FrameLayout ) v0 ).setFocusable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setFocusable(Z)V
/* .line 19 */
v0 = this.A;
(( androidx.core.widget.NestedScrollView ) v0 ).setNestedScrollingEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V
/* const v0, 0x102000b */
/* .line 20 */
(( android.view.ViewGroup ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.F = v0;
/* if-nez v0, :cond_0 */
return;
/* .line 21 */
} // :cond_0
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 22 */
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_1
/* const/16 v1, 0x8 */
/* .line 23 */
(( android.widget.TextView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 24 */
v0 = this.A;
v2 = this.F;
(( android.widget.FrameLayout ) v0 ).removeView ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
/* .line 25 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 26 */
p1 = this.A;
(( android.widget.FrameLayout ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;
/* check-cast p1, Landroid/view/ViewGroup; */
/* .line 27 */
v0 = this.A;
v0 = (( android.view.ViewGroup ) p1 ).indexOfChild ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
/* .line 28 */
(( android.view.ViewGroup ) p1 ).removeViewAt ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V
/* .line 29 */
v1 = this.g;
/* new-instance v2, Landroid/view/ViewGroup$LayoutParams; */
int v3 = -1; // const/4 v3, -0x1
/* invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.view.ViewGroup ) p1 ).addView ( v1, v0, v2 ); // invoke-virtual {p1, v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
/* .line 30 */
} // :cond_2
(( android.view.ViewGroup ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V
} // :goto_0
return;
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 4 */
this.e = p1;
/* .line 5 */
v0 = this.E;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_0
return;
} // .end method
public Boolean b ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 0 */
/* .line 16 */
p1 = this.A;
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( androidx.core.widget.NestedScrollView ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Integer c ( ) {
/* .locals 3 */
/* .line 7 */
/* iget v0, p0, Landroidx/appcompat/app/AlertController;->K:I */
/* if-nez v0, :cond_0 */
/* .line 8 */
/* iget v0, p0, Landroidx/appcompat/app/AlertController;->J:I */
/* .line 9 */
} // :cond_0
/* iget v1, p0, Landroidx/appcompat/app/AlertController;->Q:I */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_1 */
/* .line 10 */
} // :cond_1
/* iget v0, p0, Landroidx/appcompat/app/AlertController;->J:I */
} // .end method
public void c ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
this.h = v0;
/* .line 12 */
/* iput p1, p0, Landroidx/appcompat/app/AlertController;->i:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
/* iput-boolean p1, p0, Landroidx/appcompat/app/AlertController;->n:Z */
return;
} // .end method
public final void c ( android.view.ViewGroup p0 ) {
/* .locals 5 */
/* .line 14 */
v0 = this.h;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
} // :cond_0
/* iget v0, p0, Landroidx/appcompat/app/AlertController;->i:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 16 */
v0 = this.a;
android.view.LayoutInflater .from ( v0 );
/* .line 17 */
/* iget v2, p0, Landroidx/appcompat/app/AlertController;->i:I */
(( android.view.LayoutInflater ) v0 ).inflate ( v2, p1, v1 ); // invoke-virtual {v0, v2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 18 */
v2 = androidx.appcompat.app.AlertController .c ( v0 );
/* if-nez v2, :cond_4 */
/* .line 19 */
} // :cond_3
v2 = this.c;
/* const/high16 v3, 0x20000 */
(( android.view.Window ) v2 ).setFlags ( v3, v3 ); // invoke-virtual {v2, v3, v3}, Landroid/view/Window;->setFlags(II)V
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 20 */
v1 = this.c;
(( android.view.Window ) v1 ).findViewById ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/FrameLayout; */
/* .line 21 */
/* new-instance v2, Landroid/view/ViewGroup$LayoutParams; */
int v3 = -1; // const/4 v3, -0x1
/* invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.widget.FrameLayout ) v1 ).addView ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 22 */
/* iget-boolean v0, p0, Landroidx/appcompat/app/AlertController;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 23 */
/* iget v0, p0, Landroidx/appcompat/app/AlertController;->j:I */
/* iget v2, p0, Landroidx/appcompat/app/AlertController;->k:I */
/* iget v3, p0, Landroidx/appcompat/app/AlertController;->l:I */
/* iget v4, p0, Landroidx/appcompat/app/AlertController;->m:I */
(( android.widget.FrameLayout ) v1 ).setPadding ( v0, v2, v3, v4 ); // invoke-virtual {v1, v0, v2, v3, v4}, Landroid/widget/FrameLayout;->setPadding(IIII)V
/* .line 24 */
} // :cond_5
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 25 */
(( android.view.ViewGroup ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p1, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
} // :cond_6
/* const/16 v0, 0x8 */
/* .line 26 */
(( android.view.ViewGroup ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V
} // :cond_7
} // :goto_1
return;
} // .end method
public final void d ( ) {
/* .locals 9 */
/* .line 1 */
v0 = this.c;
(( android.view.Window ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* .line 2 */
(( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v0 ).findViewById ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 4 */
(( android.view.View ) v0 ).findViewById ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 5 */
(( android.view.View ) v0 ).findViewById ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 6 */
(( androidx.appcompat.app.AlertController ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/app/AlertController;->c(Landroid/view/ViewGroup;)V
/* .line 7 */
(( android.view.ViewGroup ) v0 ).findViewById ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* .line 8 */
(( android.view.ViewGroup ) v0 ).findViewById ( v5 ); // invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* .line 9 */
(( android.view.ViewGroup ) v0 ).findViewById ( v6 ); // invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* .line 10 */
(( androidx.appcompat.app.AlertController ) p0 ).a ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
/* .line 11 */
(( androidx.appcompat.app.AlertController ) p0 ).a ( v5, v2 ); // invoke-virtual {p0, v5, v2}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
/* .line 12 */
(( androidx.appcompat.app.AlertController ) p0 ).a ( v6, v3 ); // invoke-virtual {p0, v6, v3}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
/* .line 13 */
(( androidx.appcompat.app.AlertController ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Landroidx/appcompat/app/AlertController;->b(Landroid/view/ViewGroup;)V
/* .line 14 */
(( androidx.appcompat.app.AlertController ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/ViewGroup;)V
/* .line 15 */
(( androidx.appcompat.app.AlertController ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/app/AlertController;->d(Landroid/view/ViewGroup;)V
/* const/16 v4, 0x8 */
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
v0 = (( android.view.ViewGroup ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I
/* if-eq v0, v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 17 */
v7 = (( android.view.ViewGroup ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getVisibility()I
/* if-eq v7, v4, :cond_1 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_1
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 18 */
v3 = (( android.view.ViewGroup ) v3 ).getVisibility ( ); // invoke-virtual {v3}, Landroid/view/ViewGroup;->getVisibility()I
/* if-eq v3, v4, :cond_2 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* if-nez v3, :cond_3 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 19 */
(( android.view.ViewGroup ) v2 ).findViewById ( v4 ); // invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 20 */
(( android.view.View ) v4 ).setVisibility ( v6 ); // invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V
} // :cond_3
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 21 */
v4 = this.A;
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 22 */
(( android.widget.FrameLayout ) v4 ).setClipToPadding ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setClipToPadding(Z)V
} // :cond_4
int v4 = 0; // const/4 v4, 0x0
/* .line 23 */
v8 = this.f;
/* if-nez v8, :cond_5 */
v8 = this.g;
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 24 */
} // :cond_5
(( android.view.ViewGroup ) v1 ).findViewById ( v4 ); // invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
} // :cond_6
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 25 */
(( android.view.View ) v4 ).setVisibility ( v6 ); // invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V
} // :cond_7
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 26 */
(( android.view.ViewGroup ) v2 ).findViewById ( v1 ); // invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 27 */
(( android.view.View ) v1 ).setVisibility ( v6 ); // invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V
/* .line 28 */
} // :cond_8
} // :goto_3
v1 = this.g;
/* instance-of v4, v1, Landroidx/appcompat/app/AlertController$RecycleListView; */
if ( v4 != null) { // if-eqz v4, :cond_9
/* .line 29 */
/* check-cast v1, Landroidx/appcompat/app/AlertController$RecycleListView; */
(( androidx.appcompat.app.AlertController$RecycleListView ) v1 ).a ( v7, v3 ); // invoke-virtual {v1, v7, v3}, Landroidx/appcompat/app/AlertController$RecycleListView;->a(ZZ)V
} // :cond_9
/* if-nez v0, :cond_c */
/* .line 30 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_a
} // :cond_a
v0 = this.A;
} // :goto_4
if ( v0 != null) { // if-eqz v0, :cond_c
if ( v3 != null) { // if-eqz v3, :cond_b
int v6 = 2; // const/4 v6, 0x2
} // :cond_b
/* or-int v1, v7, v6 */
int v3 = 3; // const/4 v3, 0x3
/* .line 31 */
(( androidx.appcompat.app.AlertController ) p0 ).a ( v2, v0, v1, v3 ); // invoke-virtual {p0, v2, v0, v1, v3}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/ViewGroup;Landroid/view/View;II)V
/* .line 32 */
} // :cond_c
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 33 */
v1 = this.H;
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 34 */
(( android.widget.ListView ) v0 ).setAdapter ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 35 */
/* iget v1, p0, Landroidx/appcompat/app/AlertController;->I:I */
int v2 = -1; // const/4 v2, -0x1
/* if-le v1, v2, :cond_d */
/* .line 36 */
(( android.widget.ListView ) v0 ).setItemChecked ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/widget/ListView;->setItemChecked(IZ)V
/* .line 37 */
(( android.widget.ListView ) v0 ).setSelection ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V
} // :cond_d
return;
} // .end method
public final void d ( android.view.ViewGroup p0 ) {
/* .locals 5 */
/* .line 38 */
v0 = this.G;
/* const/16 v1, 0x8 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 39 */
/* new-instance v0, Landroid/view/ViewGroup$LayoutParams; */
int v2 = -1; // const/4 v2, -0x1
int v3 = -2; // const/4 v3, -0x2
/* invoke-direct {v0, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
/* .line 40 */
v2 = this.G;
int v3 = 0; // const/4 v3, 0x0
(( android.view.ViewGroup ) p1 ).addView ( v2, v3, v0 ); // invoke-virtual {p1, v2, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
/* .line 41 */
p1 = this.c;
(( android.view.Window ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* .line 42 */
(( android.view.View ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V
/* goto/16 :goto_0 */
/* .line 43 */
} // :cond_0
v0 = this.c;
/* const v2, 0x1020006 */
(( android.view.Window ) v0 ).findViewById ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
this.D = v0;
/* .line 44 */
v0 = this.e;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* xor-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 45 */
/* iget-boolean v0, p0, Landroidx/appcompat/app/AlertController;->P:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 46 */
p1 = this.c;
(( android.view.Window ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/TextView; */
this.E = p1;
/* .line 47 */
v0 = this.e;
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 48 */
/* iget p1, p0, Landroidx/appcompat/app/AlertController;->B:I */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 49 */
v0 = this.D;
(( android.widget.ImageView ) v0 ).setImageResource ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V
/* .line 50 */
} // :cond_1
p1 = this.C;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 51 */
v0 = this.D;
(( android.widget.ImageView ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 52 */
} // :cond_2
p1 = this.E;
v0 = this.D;
v0 = (( android.widget.ImageView ) v0 ).getPaddingLeft ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getPaddingLeft()I
v2 = this.D;
/* .line 53 */
v2 = (( android.widget.ImageView ) v2 ).getPaddingTop ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getPaddingTop()I
v3 = this.D;
/* .line 54 */
v3 = (( android.widget.ImageView ) v3 ).getPaddingRight ( ); // invoke-virtual {v3}, Landroid/widget/ImageView;->getPaddingRight()I
v4 = this.D;
/* .line 55 */
v4 = (( android.widget.ImageView ) v4 ).getPaddingBottom ( ); // invoke-virtual {v4}, Landroid/widget/ImageView;->getPaddingBottom()I
/* .line 56 */
(( android.widget.TextView ) p1 ).setPadding ( v0, v2, v3, v4 ); // invoke-virtual {p1, v0, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V
/* .line 57 */
p1 = this.D;
(( android.widget.ImageView ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 58 */
} // :cond_3
v0 = this.c;
(( android.view.Window ) v0 ).findViewById ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;
/* .line 59 */
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
/* .line 60 */
v0 = this.D;
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 61 */
(( android.view.ViewGroup ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V
} // :goto_0
return;
} // .end method
